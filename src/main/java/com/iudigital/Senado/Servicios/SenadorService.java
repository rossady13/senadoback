package com.iudigital.Senado.Servicios;

import com.iudigital.Senado.Entidades.Senador;
import com.iudigital.Senado.Repositorios.SenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenadorService {
    @Autowired
    private SenadorRepository senadorRepository;

    public List<Senador> findAll() {
        return senadorRepository.findAll();
    }

    public Senador save(Senador senador) {
        return senadorRepository.save(senador);
    }

    public void delete(Long id) {
        senadorRepository.deleteById(id);
    }
}