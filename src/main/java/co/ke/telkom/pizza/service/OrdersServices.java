/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ke.telkom.pizza.service;

import co.ke.telkom.pizza.entities.Orders;
import java.util.List;

/**
 *
 * @author toblair
 */
public interface OrdersServices {
   Orders searchById(int id);
   List<Orders> searchByType(String Type);
   Orders createOrder(Orders orderObject);
   List<Orders> allOrders();
    
}
