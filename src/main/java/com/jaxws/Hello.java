/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dinesh
 */

package com.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "Hello")
public class Hello {

    /**
     * Web service operation
     * @param name
     * @return 
     */
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name = "name") String name) {
        return "Hello, " + name;
    }
    
}
