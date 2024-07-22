package com.iudigital.Senado.Repositorios;


import com.iudigital.Senado.Entidades.Voto;
import com.iudigital.Senado.Entidades.VotoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<Voto, Long> {
    void deleteById(VotoId id);
}
