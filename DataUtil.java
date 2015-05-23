/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.vo.Card;
import com.vo.Computer;
import com.vo.User;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *本类是初始化数据类，用于处理电脑以及卡的数据初始化操作
 * @author Zeming
 */
public class DataUtil {

 
    /**
     * 如果文件不存在，初始化电脑数据并序列化到文件中
     */
    public static void initComputerData() {
        String path = "dataFolder\\ComputerMap.obj";
        File file = new File(path);
        if (!file.exists()) {
            Map computerMap = new HashMap();
            computerMap.put("1001", new Computer("1001", true));
            computerMap.put("1002", new Computer("1002", true));
            computerMap.put("1003", new Computer("1003", true));
            computerMap.put("1004", new Computer("1004", true));
            computerMap.put("1005", new Computer("1005", true));
            computerMap.put("1006", new Computer("1006", true));
            SeriableUtil.seriableObj2File(computerMap, file);
        }
    }

    /**
     * 如果文件不存在，初始化上网卡的数据并序列化到文件中
     */
    public static void initCardData() {
        String path = "dataFolder\\CardMap.obj";
        File file = new File(path);
        if (!file.exists()) {
            Map cardMap = new HashMap();
            cardMap.put("9001", new Card("9001", true, "9001", 100));
            cardMap.put("9002", new Card("9002", true, "9002", 100));
            cardMap.put("9003", new Card("9003", true, "9003", 100));
            cardMap.put("9004", new Card("9004", true, "9004", 1));
            cardMap.put("9005", new Card("9005", true, "9005", 100));
            SeriableUtil.seriableObj2File(cardMap, file);
        }
    }
    
   /**
     * 初始化消费记录，序列化写入文件中
     * 如果文件不存在 创建序列化文件
     * 如果文件存在 ，则添加记录
     */
    public static void initExpense( ){
       // System.out.println("computerNo>>>>"+computerNo+"cardNo>>>>>"+cardNo);
        String path= "dataFolder\\ExpenseLog.obj";
        File file =new File(path);
        if(!file.exists()){
            Map expenseMap=new HashMap();
            int expenseId=expenseMap.size();
            //expenseMap.put(0, new ExpenseLog(0,  "1001",  "9001",  new Date(),  null, 0));
            SeriableUtil.seriableObj2File(expenseMap, file);
        }
    }
    
    /**
     * 初始化管理员的数据
     */
    public static void initUser(){
        String path="dataFolder\\User.obj";
        File file=new File(path);
        if(!file.exists()){
            Map userMap=new HashMap();
            userMap.put("100", new User("100", "admin", "admin"));
            SeriableUtil.seriableObj2File(userMap, file);
        }
    }
    
}
