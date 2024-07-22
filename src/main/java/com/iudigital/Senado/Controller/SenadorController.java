package com.iudigital.Senado.Controller;

import com.iudigital.Senado.Entidades.Senador;
import com.iudigital.Senado.Servicios.SenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/senadores")
public class SenadorController {
    @Autowired
    private SenadorService senadorService;

    @GetMapping
    public List<Senador> getAllSenadores() {
        return senadorService.findAll();
    }

    @PostMapping
    public Senador createSenador(@RequestBody Senador senador) {
        return senadorService.save(senador);
    }

    @DeleteMapping("/{id}")
    public void deleteSenador(@PathVariable Long id) {
        senadorService.delete(id);
    }
}
