package com.iudigital.Senado.Servicios;

import com.iudigital.Senado.Entidades.Partido;
import com.iudigital.Senado.Repositorios.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {
    @Autowired
    private PartidoRepository partidoRepository;

    public List<Partido> findAll() {
        return partidoRepository.findAll();
    }

    public Partido save(Partido partido) {
        return partidoRepository.save(partido);
    }

    public void delete(Long id) {
        partidoRepository.deleteById(id);
    }
}
