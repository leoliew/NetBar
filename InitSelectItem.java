/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.vo.Card;
import com.vo.Computer;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JComboBox;

/**
 *本类用于初始化下拉框的值
 * @author LiuZeming
 */
public class InitSelectItem {

    /**
     * 根据需要的状态显示电脑编号的下拉框
     * @param combox 要显示的下拉框
     * @param state 要显示的电脑状态
     */
    public static void initComputerNo(JComboBox combox, boolean state) {
        Map map = SeriableUtil.deserializeFile2Obj(new File("dataFolder\\ComputerMap.obj"));
        Map treeMap = new TreeMap(map);
        Iterator itor = treeMap.keySet().iterator();
        while (itor.hasNext()) {
            String key = (String) itor.next();
            Computer computer = (Computer) treeMap.get(key);
            //如果电脑状态为空闲，添加到下拉框中
            if (computer.isState() == state) {
                combox.addItem(key);
            }
        }
    }

    /**
     * 初始化显示所有卡数据的下拉框
     * @param combox  要显示的下拉框
     */
    public static void initAllComNo(JComboBox combox) {
        Map map = SeriableUtil.deserializeFile2Obj(new File("dataFolder\\ComputerMap.obj"));
        Map treeMap = new TreeMap(map);
        Iterator itor = treeMap.keySet().iterator();
        while (itor.hasNext()) {
            String key = (String) itor.next();
            Computer computer = (Computer) treeMap.get(key);
            combox.addItem(key);
        }
    }

    /**
     * 根据需要卡的状态显示下拉框
     * @param combox 要显示的下拉框
     * @param state  要显示卡的状态
     */
    public static void initCardNo(JComboBox combox, boolean state) {
        Map map = SeriableUtil.deserializeFile2Obj(new File("dataFolder\\CardMap.obj"));
        Map treeMap = new TreeMap(map);
        Iterator itor = treeMap.keySet().iterator();
        while (itor.hasNext()) {
            String key = (String) itor.next();
            Card card = (Card) treeMap.get(key);
            //如果电脑状态为空闲，添加到下拉框中
            if (card.isState() == state) {
                combox.addItem(key);
            }
        }
    }

    public static void initAllCacdNo(JComboBox jComboBox4) {
         Map map = SeriableUtil.deserializeFile2Obj(new File("dataFolder\\CardMap.obj"));
        Map treeMap = new TreeMap(map);
        Iterator itor = treeMap.keySet().iterator();
        while (itor.hasNext()) {
            String key = (String) itor.next();
            Card card = (Card) treeMap.get(key);
            jComboBox4.addItem(key);
        }
    }
}
