package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Order;
import id.ac.ui.cs.advprog.eshop.model.Payment;
import id.ac.ui.cs.advprog.eshop.repository.PaymentRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment addPayment(Order order, String method, Map<String, String> paymentData) {
    }

    public Payment setStatus(Payment payment, String status) {
    }

    public Payment getPayment(String paymentId) {
    }

    public List<Payment> getAllPayments() {
    }
}