package com.tally.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tally.backend.model.LedgerEntity;
import com.tally.backend.service.LedgerService;

@RestController
@RequestMapping("/api/ledgers")
@CrossOrigin(origins = "*")   // allows frontend to call backend
public class LedgerController {

    @Autowired
    private LedgerService ledgerService;

    // Create a ledger
    @PostMapping
    public LedgerEntity createLedger(@RequestBody LedgerEntity ledger) {
        return ledgerService.createLedger(ledger);
    }

    // Get all ledgers
    @GetMapping
    public List<LedgerEntity> getAllLedgers() {
        return ledgerService.getAllLedgers();
    }

    // Get ledger by name
    @GetMapping("/{name}")
    public LedgerEntity getLedgerByName(@PathVariable String name) {
        return ledgerService.getLedgerByName(name);
    }

    // Update ledger balance
    @PutMapping("/{name}/balance")
    public LedgerEntity updateBalance(
            @PathVariable String name,
            @RequestParam double balance) {
        return ledgerService.updateBalance(name, balance);
    }
}
