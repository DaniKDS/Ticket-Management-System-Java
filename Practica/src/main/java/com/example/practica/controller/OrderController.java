package com.example.practica.controller;

import com.example.practica.models.Order;
import com.example.practica.models.dto.OrderDto;
import com.example.practica.services.order_service.OrderService;
import com.example.practica.services.order_service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    private OrderServiceInterface orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders/{orderId}")
    public Order getOrderById(@PathVariable Long orderId) {
        return this.orderService.getOrderById(orderId);
    }

    @GetMapping("/api/orders")
    public List<Order> getOrdersByCustomerId(@RequestParam(required = false) Long customerId) {
        if(customerId == null) {
            return this.orderService.getAllOrders();
        }
        List<Order> listOfOrders = new ArrayList<>();
        this.orderService.getOrdersByCustomer(customerId).forEach(order -> listOfOrders.add(order));
        return listOfOrders;
    }

    @PostMapping("/api/orders")
    public Order saveOrder(
            @RequestParam Long customerId,
            @RequestBody OrderDto ordersDto){
        return orderService.saveOrder(ordersDto, customerId);
    }
}