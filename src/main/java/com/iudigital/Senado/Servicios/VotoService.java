package com.iudigital.Senado.Servicios;

import com.iudigital.Senado.Entidades.Voto;
import com.iudigital.Senado.Entidades.VotoId;
import com.iudigital.Senado.Repositorios.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotoService {
    @Autowired
    private VotoRepository votoRepository;

    public List<Voto> findAll() {
        return votoRepository.findAll();
    }

    public Voto save(Voto voto) {
        return votoRepository.save(voto);
    }

    public void delete(VotoId id) {
        votoRepository.deleteById(id);
    }
}
