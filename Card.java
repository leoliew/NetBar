/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

import java.io.Serializable;

/**
 *本类是用于上网的上网卡，具有对用户计费的作用
 * @author Zeming
 */
public class Card implements Serializable{
    private String id;//上网卡的编号
    private boolean state;//上网卡的状态 false代表在用，true代表空闲
    private String  cardPwd;//上网卡的密码
    private double money;//上网卡的余额

    public Card() {
    }

    public Card(String id, boolean state, String cardPwd, double money) {
        this.id = id;
        this.state = state;
        this.cardPwd = cardPwd;
        this.money = money;
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

    /**
     * @return the cardPwd
     */
    public String getCardPwd() {
        return cardPwd;
    }

    /**
     * @param cardPwd the cardPwd to set
     */
    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(double money) {
        this.money = money;
    }
    
    
    

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", state=" + state + ", cardPwd=" + cardPwd + ", money=" + money + '}';
    }

  
    
    
    
    
}
