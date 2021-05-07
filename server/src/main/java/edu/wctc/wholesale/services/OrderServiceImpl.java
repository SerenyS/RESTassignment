package edu.wctc.wholesale.services;


import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getMember(int orderId) {
        List<Order> orderList = new ArrayList<>();
        orderRepository.findAll().forEach(orderList::add);
        return (Order) orderList;
    }
}
