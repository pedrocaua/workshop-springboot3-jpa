package com.pedrocaua.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocaua.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
