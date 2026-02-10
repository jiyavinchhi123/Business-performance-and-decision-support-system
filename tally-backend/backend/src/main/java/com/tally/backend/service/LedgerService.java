package com.tally.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tally.backend.model.LedgerEntity;
import com.tally.backend.repository.LedgerRepository;

@Service
public class LedgerService {

    @Autowired
    private LedgerRepository ledgerRepository;

    // Create new ledger
    public LedgerEntity createLedger(LedgerEntity ledger) {
        return ledgerRepository.save(ledger);
    }

    // Get all ledgers
    public List<LedgerEntity> getAllLedgers() {
        return ledgerRepository.findAll();
    }

    // Get ledger by name
    public LedgerEntity getLedgerByName(String name) {
        return ledgerRepository.findByName(name);
    }

    // Update ledger balance
    public LedgerEntity updateBalance(String name, double newBalance) {
        LedgerEntity ledger = ledgerRepository.findByName(name);

        if (ledger != null) {
            ledger.setBalance(newBalance);
            return ledgerRepository.save(ledger);
        }
        return null;
    }
}
