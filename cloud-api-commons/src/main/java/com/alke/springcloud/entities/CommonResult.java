package com.alke.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * :
 * Alke
 * 2021-06-28 16:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
