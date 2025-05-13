package cl.farmacia.solicitudes.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String runCliente;
    private LocalDate fecha;
    private String estado; // pendiente, despachada, rechazada

    // Getters y Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRunCliente() { return runCliente; }
    public void setRunCliente(String runCliente) { this.runCliente = runCliente; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}