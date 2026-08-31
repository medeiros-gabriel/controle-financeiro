package com.gabriel.controlefinanceiro.controller;

import com.gabriel.controlefinanceiro.model.Despesa;
import com.gabriel.controlefinanceiro.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
/*--- Jogue na web "http://localhost:8080/despesas" ---*/

public class DespesaController {

    @Autowired
    private DespesaRepository despesaRepository;


    /*== GET - Listar Despesas ==*/
    @GetMapping
    public List<Despesa> listarTodas() {
        return despesaRepository.findAll();
    }

    @PostMapping
    public Despesa adicionar (@RequestBody Despesa despesa) {
        return despesaRepository.save(despesa);
    }

    @PutMapping("/{id}")
    public Despesa alterar (@PathVariable int id, @RequestBody Despesa despesa) {
        despesa.setId(id);
        return despesaRepository.save(despesa);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable int id) {
        despesaRepository.deleteById(id);
    }
}