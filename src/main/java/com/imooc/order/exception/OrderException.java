package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @ClassName OrderException
 * @Description TODO
 * @Author hxh
 * @Date 2020/5/11 10:47 下午
 * @Version 1.0
 */
public class OrderException extends RuntimeException{
    private Integer code;

    public OrderException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
