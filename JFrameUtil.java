/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *本类是JFrame窗体的工具类
 * @author LiuZeming
 */
public class JFrameUtil {
    /**
     * 在中间位置显示窗体
     * @param frame  要显示的窗体
     */
    public static void centerShowJFrame(JFrame frame) {
        //定义工具包:Toolkit.getDefaultToolkit()
        //获取屏幕的尺寸  Dimension screenSize 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();//窗口的尺寸
        //获得窗口高frameSize.height
        //获取屏幕的高screenSize.height
        //如果窗口的高度大于屏幕的高度，则以屏幕的高度为准
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        //获得窗口宽frameSize.width
        //获取屏幕的宽screenSize.width
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        //设置中间位置
        frame.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        //设置窗口可见
        frame.setVisible(true);
    }
}
