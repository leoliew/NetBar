/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operate;

import com.util.SeriableUtil;
import com.vo.Computer;
import com.vo.ExpenseLog;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *消费记录操作类
 * @author Zeming
 */
public class ExpenseLogOperate {

    /**
     * 添加消费记录
     * @param expense 传入参数为消费记录的实例 
     */
    public static void addLog(ExpenseLog expense) {
        String expensePath = "dataFolder\\ExpenseLog.obj";
        Map expenseMap = SeriableUtil.deserializeFile2Obj(new File(expensePath));
        expenseMap.put(expense.getId(), expense);
        SeriableUtil.seriableObj2File(expenseMap, new File(expensePath));
    }

    /**
     * 根据电脑编号查找消费记录
     * @param ComNo 电脑编号
     * @return  此电脑编号的消费记录Map集合
     */
    public static Map getLogByComNo(String ComNo) {
        File file = new File("dataFolder\\ExpenseLog.obj");
        Map expenseMap = SeriableUtil.deserializeFile2Obj(file);
        Map tempMap = new HashMap();
        Iterator itor = expenseMap.values().iterator();
        while (itor.hasNext()) {
            ExpenseLog expense = (ExpenseLog) itor.next();
            if (expense.getComputerNo().equals(ComNo)) {
                tempMap.put(expense.getId(), expense);
            }
        }
        return tempMap;
    }

    /**
     * 根据卡号查找消费记录
     * @param CardNo  传入参数为卡号
     * @return  返回此卡的消费记录的Map集合
     */
    public static Map getLogByCardNo(String CardNo) {
        File file = new File("dataFolder\\ExpenseLog.obj");
        Map expenseMap = SeriableUtil.deserializeFile2Obj(file);
        Map tempMap = new HashMap();
        Iterator itor = expenseMap.values().iterator();
        while (itor.hasNext()) {
            ExpenseLog expense = (ExpenseLog) itor.next();
            if (expense.getCardNo().equals(CardNo)) {
                tempMap.put(expense.getId(), expense);
            }
        }
        return tempMap;
    }

 
}
