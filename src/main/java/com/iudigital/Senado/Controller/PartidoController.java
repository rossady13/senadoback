package com.iudigital.Senado.Controller;

import com.iudigital.Senado.Entidades.Partido;
import com.iudigital.Senado.Servicios.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partidos")
public class PartidoController {
    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> getAllPartidos() {
        return partidoService.findAll();
    }

    @PostMapping
    public Partido createPartido(@RequestBody Partido partido) {
        return partidoService.save(partido);
    }

    @DeleteMapping("/{id}")
    public void deletePartido(@PathVariable Long id) {
        partidoService.delete(id);
    }
}