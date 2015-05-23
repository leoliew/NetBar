/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *本类是序列化以及反序列化的工具类
 * @author Zeming
 */
public class SeriableUtil {

    /**
     * @param map 要序列化的map文件
     * @param file  文件存放的路径
     * @return 判断是否序列化成功
     */
    public static boolean seriableObj2File(Map map, File file) {
        try {
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(file));
            objOut.writeObject(map);
            objOut.flush();
            objOut.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeriableUtil.class.getName()).log(Level.SEVERE, "找不到文件", ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(SeriableUtil.class.getName()).log(Level.SEVERE, "传输错误", ex);
            return false;
        }
    }

    /**
     * 反序列化 把文件转化成对象
     * @param file  要反序列化的文件
     * @return 反序列化后返回的对象
     */
    public static Map deserializeFile2Obj(File file) {
        try {
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(file));
            Map map=(Map) objIn.readObject();
            objIn.close();
            return map;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SeriableUtil.class.getName()).log(Level.SEVERE, "找不到类文件", ex);
            return null;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeriableUtil.class.getName()).log(Level.SEVERE, "找不到文件", ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(SeriableUtil.class.getName()).log(Level.SEVERE, "传输错误", ex);
            return null;
        }
    }
    
}
