/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *本类是初始化时间类，用于对JLable显示框时间的动态更新 
 * @author LiuZeming
 */
public class DateThread {

    private JLabel jLable;

    public DateThread() {
    }

    public DateThread(JLabel jLable) {
        this.jLable = jLable;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        jLable.setText(sdf.format(new Date()));

    }
}
