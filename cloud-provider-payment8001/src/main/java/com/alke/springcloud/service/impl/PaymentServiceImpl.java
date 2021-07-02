package com.alke.springcloud.service.impl;

import com.alke.springcloud.dao.PaymentDao;
import com.alke.springcloud.entities.Payment;
import com.alke.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * :
 * Alke
 * 2021-06-28 20:49
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
