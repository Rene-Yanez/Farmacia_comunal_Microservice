package cl.farmacia.solicitudes.controller;

import cl.farmacia.solicitudes.model.Solicitud;
import cl.farmacia.solicitudes.repository.SolicitudRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    private final SolicitudRepository repo;

    public SolicitudController(SolicitudRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Solicitud crear(@RequestBody Solicitud solicitud) {
        return repo.save(solicitud);
    }

    @GetMapping
    public List<Solicitud> listarTodos() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Solicitud obtenerPorId(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}