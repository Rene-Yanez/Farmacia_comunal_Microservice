package cl.farmacia.clientes.controller;

import cl.farmacia.clientes.model.Cliente;
import cl.farmacia.clientes.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repo;

    public ClienteController(ClienteRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) {
        return repo.save(cliente);
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Cliente obtenerPorId(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}