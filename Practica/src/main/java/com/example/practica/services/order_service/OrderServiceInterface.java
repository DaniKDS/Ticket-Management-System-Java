package com.example.practica.services.order_service;

import com.example.practica.models.Order;
import com.example.practica.models.dto.OrderDto;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAllOrders();

    List<Order> getOrdersByCustomer(Long idCustomer);

    Order saveOrder(OrderDto newOrder, Long customerId);

    Order getOrderById(Long orderId);
}