package com.tally.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tally.backend.model.VoucherEntity;

public interface VoucherRepository extends JpaRepository<VoucherEntity, Long> {
}
