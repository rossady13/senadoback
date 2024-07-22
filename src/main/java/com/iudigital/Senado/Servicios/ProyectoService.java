package com.iudigital.Senado.Servicios;

import com.iudigital.Senado.Entidades.Proyecto;
import com.iudigital.Senado.Repositorios.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;

    public List<Proyecto> findAll() {
        return proyectoRepository.findAll();
    }

    public Proyecto save(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public void delete(Long id) {
        proyectoRepository.deleteById(id);
    }
}