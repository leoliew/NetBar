/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operate;

import com.util.SeriableUtil;
import com.vo.Card;
import java.io.File;
import java.util.Map;

/**
 *本类是卡的操作类
 * @author Zeming
 */
public class CardOperate {

    /**
     * 添加卡号
     * @param card  传入卡的实例
     */
    public static  void addCard(Card card) {
        String path = "dataFolder\\CardMap.obj";
        File file = new File(path);
        Map cardMap = SeriableUtil.deserializeFile2Obj(file);
        cardMap.put(card.getId(), card);
        SeriableUtil.seriableObj2File(cardMap, file);
    }

    /**
     * 删除卡号
     * @param cardNo 通过卡号查找卡，然后执行删除
     */
    public static  void delCard(String cardNo) {
        String path = "dataFolder\\CardMap.obj";
        File file = new File(path);
        Map cardMap = SeriableUtil.deserializeFile2Obj(file);
        cardMap.remove(cardNo);
        SeriableUtil.seriableObj2File(cardMap, file);
    }
    
    /**
     * 根据卡号进行充值
     * @param CardNo 要充值的卡号
     * @param rechargeMoney  要充值的金额
     * @return  充值后的金额 
     */
    public static double recharge(String  CardNo, double rechargeMoney){
         String path = "dataFolder\\CardMap.obj";
        File file = new File(path);
        Map cardMap = SeriableUtil.deserializeFile2Obj(file);
        Card card =(Card) cardMap.get(CardNo);
        double finalMoney= card.getMoney()+rechargeMoney;
        card.setMoney(finalMoney);
        cardMap.put(CardNo, card);
         SeriableUtil.seriableObj2File(cardMap, file);
         return finalMoney;
    }
    
}
