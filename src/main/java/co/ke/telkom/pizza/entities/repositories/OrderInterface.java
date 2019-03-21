/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ke.telkom.pizza.entities.repositories;

import co.ke.telkom.pizza.entities.Orders;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author toblair
 */

// Interface class create queries automatically, so you avoid manual querrying
public interface OrderInterface extends JpaRepository<Orders, Integer>{
    
    // Orders findByType(String type);
    Orders findById(int id);
    // Orders findByType_of_exras(String type_of_extras);
    List<Orders>findByType(String type);
    List<Orders>findByTypeOfExtras(String typeOfExtras);
    List<Orders>findAll();
    
    
}
