package com.imooc.order.utils;

import java.util.Random;

/**
 * @ClassName KeyUtil
 * @Description TODO
 * @Author hxh
 * @Date 2020/5/7 11:14 下午
 * @Version 1.0
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     */
    public static synchronized String genUniquekey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+ String.valueOf(number);
    }

}
