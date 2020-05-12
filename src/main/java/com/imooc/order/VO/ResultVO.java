package com.imooc.order.VO;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description TODO
 * @Author hxh
 * @Date 2020/5/11 11:33 下午
 * @Version 1.0
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;
}
