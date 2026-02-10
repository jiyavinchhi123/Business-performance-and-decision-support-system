package com.tally.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tally.backend.model.LedgerEntity;

@Repository
public interface LedgerRepository extends JpaRepository<LedgerEntity, Long> {

    // Find a ledger by its name (Cash, Bank, Sales, Capital, etc.)
    LedgerEntity findByName(String name);
}
