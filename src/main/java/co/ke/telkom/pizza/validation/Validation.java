/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ke.telkom.pizza.validation;

import co.ke.telkom.pizza.constants.Constants;
import co.ke.telkom.pizza.entities.Orders;
import co.ke.telkom.pizza.response.ResponseWrapper;
import org.springframework.http.HttpStatus;

/**
 *
 * @author toblair
 */
public class Validation {
    
    private boolean valid = false;
    public ResponseWrapper validateRequest(Orders order, String method)
            {
                ResponseWrapper response = new ResponseWrapper();
                if(!order.getType().equalsIgnoreCase(Constants.TYPE))
                {
                    // set the value 
                  response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
                  
                  // set the actual HttpStatus
                  response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
                  
                  // set message defined in the constants
                  response.setResponseMessage(Constants.EXPECTATION_FAILED_TYPE);
                  
                  // return response immediately if the conditions are not met
                  return response;
                  
                  
                }
                
<<<<<<< HEAD
<<<<<<< HEAD
                if(!(order.getPrice() > Constants.MIN_PRICE && order.getPrice() < Constants.MAX_PRICE))
=======
                if(order.getPrice() >= Constants.PRICE && order.getPrice() <= Constants.PRICE)
>>>>>>> develop
=======
                if(!(order.getPrice() >= Constants.MIN_PRICE && order.getPrice() <= Constants.MAX_PRICE))
>>>>>>> develop
                {
                    // set the value 
                  response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
                  
                  // set the actual HttpStatus
                  response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
                  
                  // set message defined in the constants
                  response.setResponseMessage(Constants.EXPECTATION_FAILED_PRICE);
                  
                  // return response immediately if the conditions are not met
                  return response;
                  
                  
                }
                
                 if(!(order.getQuantity() >= Constants.MIN_QUANTITY && order.getQuantity() <= Constants.MAX_QUANTITY))
                {
                    // set the value 
                  response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
                  
                  // set the actual HttpStatus
                  response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
                  
                  // set message defined in the constants
                  response.setResponseMessage(Constants.EXPECTATION_FAILED_QUANTITY);
                  
                  // return response immediately if the conditions are not met
                  return response;
                  
                  
                }
                 
                 if(!order.isExtra() == Constants.EXTRA)
                {
                    // set the value 
                  response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
                  
                  // set the actual HttpStatus
                  response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
                  
                  // set message defined in the constants
                  response.setResponseMessage(Constants.EXPECTATION_FAILED_EXTRA);
                  
                  // return response immediately if the conditions are not met
                  return response;
                  
                  
                }
                //ResponseWrapper response = new ResponseWrapper();
                
                // set valid to true and return the respons object to true if any of the above conditions are met
                setValid (true);
                return response;
               
            }

            public boolean isValid() {
                return valid;
            }

            public void setValid(boolean valid) {
                this.valid = valid;
            }
    
}
