package com.gabriel.controlefinanceiro.repository;

import com.gabriel.controlefinanceiro.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Integer> {
    Integer id(int id);
    // Ao herdar de JpaRepository<Despesa, Integer>, o Spring te dá
    // automaticamente métodos como: save(), findAll(), findById(), deleteById(), etc.
}