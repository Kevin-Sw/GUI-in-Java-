/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava.Function;

import latihanformjava.Model.ModelProgram;

/**
 *
 * @author ADMIN
 */
public class NameLogic {
    
    public String returnName (ModelProgram modelProgram){
        return "Hello, you must be " + modelProgram.getName ();
    }
    
    
}
