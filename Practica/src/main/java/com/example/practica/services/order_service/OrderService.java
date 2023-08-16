package com.example.practica.services.order_service;

import com.example.practica.models.Customer;
import com.example.practica.models.Order;
import com.example.practica.models.TicketCategory;
import com.example.practica.models.dto.OrderDto;
import com.example.practica.repositories.CustomerRepository;
import com.example.practica.repositories.OrderRepository;
import com.example.practica.repositories.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements OrderServiceInterface {
    final Long CUSTOMER_ID = 5L;
    private OrderRepository orderRepository;
    private TicketCategoryRepository ticketCategoryRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, TicketCategoryRepository ticketCategoryRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> listOfOrders = new ArrayList<>();
        this.orderRepository.findAll().forEach(order -> listOfOrders.add(order));
        return listOfOrders;
    }

    @Override
    public List<Order> getOrdersByCustomer(Long idCustomer) {
        List<Order> listOfOrders = new ArrayList<>();
        this.orderRepository.getOrdersByCustomerCustomerId(idCustomer).forEach(order -> listOfOrders.add(order));
        return listOfOrders;
    }

    @Override
    public Order saveOrder(OrderDto newOrder, Long customerId) {
        TicketCategory ticketCategory = this.ticketCategoryRepository.getTicketCategoryByTicketCategoryId(newOrder.getTicketCategoryId());
        Customer customer = this.customerRepository.getCustomerByCustomerId(customerId);
        Order order = new Order();
        order.setOrderedAt(java.time.LocalDateTime.now());
        order.setNumberOfTickets(newOrder.getNumberOfTickets());
        order.setTotalPrice(newOrder.getNumberOfTickets() * ticketCategory.getPrice());
        order.setCustomer(customer);
        order.setTicketCategory(ticketCategory);
        return this.orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long orderId) {
        return this.orderRepository.getOrdersByOrderId(orderId);
    }
}