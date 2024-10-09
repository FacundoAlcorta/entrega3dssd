package com.example.demo.repository;

import com.example.demo.models.ComunalDeposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComunalDepositRepository extends JpaRepository<ComunalDeposit, Long> {


}