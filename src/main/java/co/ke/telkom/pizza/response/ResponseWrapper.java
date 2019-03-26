/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ke.telkom.pizza.response;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;

/**
 *
 * @author toblair
 */

/*  
These are the default parameters for the response.
Any other response to be catered for in the Validation class.
@params HttpStatus;
*/

public class ResponseWrapper {
    private int status;  // i.e 200, 404, 500
    private String responseMessage;
    private HttpStatus httpStatus;
    private Object object;
    private String name;
    private LocalDateTime date;

    public ResponseWrapper() {
        this.status = 200;
        this.responseMessage = "Accepted by Server";
        this.httpStatus = HttpStatus.OK;
        this.object = "{}";
        this.name = "Tony Blair";
        this.date = LocalDateTime.now();
        
        
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
    
   
}
