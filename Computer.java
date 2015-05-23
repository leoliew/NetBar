/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

import java.io.Serializable;

/**
 *本类是电脑类，代表网吧中所有的电脑
 * @author Zeming
 */
public class Computer implements Serializable{

    private String id;//电脑的编号
    private boolean state;//电脑的状态 false代表在用，true代表空闲
    

    public Computer() {
    }

    public Computer(String id, boolean state) {
        this.id = id;
        this.state = state;
     
    }

    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the state
     */
    public boolean isState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    }

    
    
    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", state=" + state + '}';
    }

  
}
