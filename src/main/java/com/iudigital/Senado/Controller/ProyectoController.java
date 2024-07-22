package com.iudigital.Senado.Controller;

import com.iudigital.Senado.Entidades.Proyecto;
import com.iudigital.Senado.Servicios.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {
    @Autowired
    private ProyectoService proyectoService;

    @GetMapping
    public List<Proyecto> getAllProyectos() {
        return proyectoService.findAll();
    }

    @PostMapping
    public Proyecto createProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.save(proyecto);
    }

    @DeleteMapping("/{id}")
    public void deleteProyecto(@PathVariable Long id) {
        proyectoService.delete(id);
    }
}

