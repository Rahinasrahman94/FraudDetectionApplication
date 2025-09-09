package org.launchcode.FraudDetection.controllers;

import org.launchcode.FraudDetection.models.Transaction;
import org.launchcode.FraudDetection.models.data.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/transactions")
    public List<Transaction> getTransactions()
    {
        return (List<Transaction>) transactionRepository.findAll();
    }

    @PostMapping("/transaction/add")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }


}
