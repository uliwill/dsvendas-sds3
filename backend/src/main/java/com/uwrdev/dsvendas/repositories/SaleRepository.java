package com.uwrdev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uwrdev.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
