package com.alke.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * :
 * Alke
 * 2021-07-01 17:31
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
