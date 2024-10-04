package com.pedrocaua.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrocaua.course.entities.Payment;
import com.pedrocaua.course.repositories.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repository;
	
	public List<Payment> findAll() {
		return repository.findAll();
	}
	
	public Payment findById(Long id) {
		Optional<Payment> obj = repository.findById(id);
		return obj.get();
	}
}
