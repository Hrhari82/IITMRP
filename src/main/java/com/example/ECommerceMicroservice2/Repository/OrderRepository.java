package com.example.ECommerceMicroservice2.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ECommerceMicroservice2.Domain.Order;



@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}