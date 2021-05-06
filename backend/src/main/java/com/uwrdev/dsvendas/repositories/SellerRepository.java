package com.uwrdev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uwrdev.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
