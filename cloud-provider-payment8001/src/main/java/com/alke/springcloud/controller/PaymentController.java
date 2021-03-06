package com.alke.springcloud.controller;

import com.alke.springcloud.entities.CommonResult;
import com.alke.springcloud.entities.Payment;
import com.alke.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * :
 * Alke
 * 2021-06-28 20:52
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果："+result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功", result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果："+payment);

        if (payment != null){
            return new CommonResult(200,"查询成功", payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询id="+id,null);
        }
    }
}
