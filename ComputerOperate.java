/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operate;

import com.util.SeriableUtil;
import com.vo.Computer;
import java.io.File;
import java.util.Map;

/**
 *本类是电脑的操作类
 * @author Zeming
 */
public class ComputerOperate {

    /**
     * 添加电脑
     * @param computer 传入电脑的实例
     */
    public static void addComputer(Computer computer) {
        String path = "dataFolder\\ComputerMap.obj";
        File file = new File(path);
        Map computerMap = SeriableUtil.deserializeFile2Obj(file);
        computerMap.put(computer.getId(), computer);
        SeriableUtil.seriableObj2File(computerMap, file);
    }

    /**
     * 根据电脑编号删除电脑
     * @param computerNo 电脑编号 
     */
    public static void delComputer(String computerNo) {
        String computerPath = "dataFolder\\ComputerMap.obj";
        File file = new File(computerPath);
        Map computerMap = SeriableUtil.deserializeFile2Obj(file);
        computerMap.remove(computerNo);
        SeriableUtil.seriableObj2File(computerMap, file);
    }
}
