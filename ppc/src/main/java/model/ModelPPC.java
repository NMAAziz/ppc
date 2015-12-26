/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Abdel Aziz NGOUH
 */
public class ModelPPC {
   
    protected String name;    
    protected String cout;
    static protected ArrayList<String> Lcouts = new ArrayList<String>();

    static{       
        Lcouts.add("pierre");
        Lcouts.add("papier");
        Lcouts.add("ciseau");
    } 
    
    public ModelPPC(String name, String cout) {
        this.name = name;
        this.cout = cout;
    }
    
     public static ArrayList<String> getLcouts() {
        return Lcouts;
    }
            
}
