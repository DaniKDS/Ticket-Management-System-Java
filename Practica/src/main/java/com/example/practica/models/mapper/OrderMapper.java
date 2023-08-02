package com.example.practica.models.mapper;

import com.example.practica.models.Order;
import com.example.practica.models.dto.OrderDto;

public class OrderMapper {
    public static OrderDto convertModelToDto(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setEventId(order.getTicketCategory().getEventId().getEventId());
        orderDto.setTicketCategoryId(orderDto.getTicketCategoryId());
        orderDto.setNumberOfTickets(order.getNumberOfTickets());
        return orderDto;
    }
}
