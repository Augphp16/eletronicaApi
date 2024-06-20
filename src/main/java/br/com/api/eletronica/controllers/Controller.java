package br.com.api.eletronica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.eletronica.models.Cliente;
import br.com.api.eletronica.repository.Repository;

@RestController
public class Controller {

    @Autowired
    private Repository acao;

    @PostMapping("/clientes/cad")
    Cliente cliente (@RequestBody Cliente p) {
        return acao.save(p);
    }

    @GetMapping("/clientes")
    public List<Cliente> selecionar() {
        return acao.findAll();
    }

    @GetMapping("/clientes/{codigo}")
    public Cliente selecionarPorCodigo (@PathVariable int codigo) {
        return acao.findByCodigo(codigo);
    }
}   
