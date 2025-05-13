package cl.farmacia.productos.controller;

import cl.farmacia.productos.model.Producto;
import cl.farmacia.productos.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return repo.save(producto);
    }

    @GetMapping
    public List<Producto> listarTodos() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}