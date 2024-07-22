package com.iudigital.Senado.Controller;

import com.iudigital.Senado.Entidades.Voto;
import com.iudigital.Senado.Entidades.VotoId;
import com.iudigital.Senado.Servicios.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/votos")
public class VotoController {
    @Autowired
    private VotoService votoService;

    @GetMapping
    public List<Voto> getAllVotos() {
        return votoService.findAll();
    }

    @PostMapping
    public Voto createVoto(@RequestBody Voto voto) {
        return votoService.save(voto);
    }

    @DeleteMapping("/{senadorId}/{proyectoId}")
    public void deleteVoto(@PathVariable Long senadorId, @PathVariable Long proyectoId) {
        VotoId id = new VotoId(senadorId, proyectoId);
        votoService.delete(id);
    }
}
