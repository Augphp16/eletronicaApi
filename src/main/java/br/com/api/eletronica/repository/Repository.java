package br.com.api.eletronica.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.api.eletronica.models.Cliente;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Cliente, Integer> {
    List<Cliente> findAll();
}
