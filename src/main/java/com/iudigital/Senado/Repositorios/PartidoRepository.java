package com.iudigital.Senado.Repositorios;

import com.iudigital.Senado.Entidades.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido, Long> {
    void deleteById(Long id);

    Partido save(Partido partido);

    List<Partido> findAll();
}
