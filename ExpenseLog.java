/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

import java.io.Serializable;
import java.util.Date;

/**
 *本类用于消费记录
 * @author Zeming
 */
public class ExpenseLog implements Serializable{
        private int id;//消费记录的编号
        private String computerNo;//消费的电脑编号
        private String cardNo;//消费的卡号
        private Date startTime;//开始上网时间
        private Date endTime;//上网结束时间
        private double money;
        

    public ExpenseLog() {
    }

  

    //四个参数的构造方法用于存放数据

    public ExpenseLog(int id, String computerNo, String cardNo, Date startTime, Date endTime, double money) {
        this.id = id;
        this.computerNo = computerNo;
        this.cardNo = cardNo;
        this.startTime = startTime;
        this.endTime = endTime;
        this.money = money;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the computerNo
     */
    public String getComputerNo() {
        return computerNo;
    }

    /**
     * @param computerNo the computerNo to set
     */
    public void setComputerNo(String computerNo) {
        this.computerNo = computerNo;
    }

    /**
     * @return the cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        return "ExpenseLog{" + "id=" + id + ", computerNo=" + computerNo + ", cardNo=" + cardNo + ", startTime=" + startTime + ", endTime=" + endTime + ", money=" + money + '}';
    }

   
    
        
    
        
}
