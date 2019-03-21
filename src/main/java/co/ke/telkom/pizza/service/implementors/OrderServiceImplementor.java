/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ke.telkom.pizza.service.implementors;

import co.ke.telkom.pizza.entities.Orders;
import co.ke.telkom.pizza.entities.repositories.OrderInterface;
import co.ke.telkom.pizza.service.OrdersServices;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author toblair
 */
@Service
@Transactional
public class OrderServiceImplementor implements OrdersServices{
    
    private OrderInterface orderInterface;

    public OrderServiceImplementor(OrderInterface orderInterface) {
        this.orderInterface = orderInterface;
    }
    @Override
    public Orders searchById(int id) {
        return orderInterface.findById(id);     
    }

    @Override
    public List<Orders> searchByType(String Type) {
        return orderInterface.findByType(Type);
    }

    @Override
    public Orders createOrder(Orders orderObject) {
        return orderInterface.save(orderObject);
    }

    @Override
    public List<Orders> allOrders() {
        return orderInterface.findAll();
    }

    
    
}
