/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ke.telkom.pizza.controllers;

import co.ke.telkom.pizza.entities.Orders;
import co.ke.telkom.pizza.entities.repositories.OrderInterface;
import co.ke.telkom.pizza.service.OrdersServices;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author toblair
 */
@RestController
@RequestMapping(value = "/pizza")
public class OrdersController {

    @Autowired
    private OrdersServices orderServices;
    // private OrderInterface orderInterface;

    public OrdersController(OrdersServices orderServices) {
        this.orderServices = orderServices;
    }

    @PostMapping(value = "/order")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
        Orders savedOrder = orderServices.createOrder(order);
        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
    }

    @PutMapping(value = "/order/update")
    public ResponseEntity<Orders> updateOrder(@RequestBody Orders order) {
        Orders foundOrder = orderServices.searchById(order.getId());
        if (foundOrder == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Orders updatedOrder = orderServices.createOrder(order);
        return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
    }

    @GetMapping("/orders")
    public List<Orders> getOrders() {
        return orderServices.allOrders();
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Orders> getOrderById(@PathVariable(value = "id") int id) {
        Orders order = orderServices.searchById(id);

        if (order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
    
    @GetMapping("/order/{type}")
    public List<Orders> getOrderByType(@PathVariable(value = "type") String type) {
        return orderServices.searchByType(type);
    }
    

}
