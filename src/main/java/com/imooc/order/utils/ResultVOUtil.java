package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Description TODO
 * @Author hxh
 * @Date 2020/5/11 11:34 下午
 * @Version 1.0
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
