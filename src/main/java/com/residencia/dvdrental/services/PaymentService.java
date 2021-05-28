package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Payment;
import com.residencia.dvdrental.repositories.PaymentRepository;
import com.residencia.dvdrental.entities.Payment;
import com.residencia.dvdrental.repositories.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	public PaymentRepository paymentRepository;

	public Payment findById(Integer id) {
		return paymentRepository.findById(id).get();
	}

	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}

	public Long count() {
		return paymentRepository.count();
	}

	public Payment save(Payment payment) {
		Payment newPayment = paymentRepository.save(payment);
		return newPayment;
	}

}
