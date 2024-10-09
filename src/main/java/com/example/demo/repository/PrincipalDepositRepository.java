package com.example.demo.repository;


import com.example.demo.models.PrincipalDeposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PrincipalDepositRepository extends JpaRepository<PrincipalDeposit, Long> {


}