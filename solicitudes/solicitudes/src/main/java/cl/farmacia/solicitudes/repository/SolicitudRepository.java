package cl.farmacia.solicitudes.repository;

import cl.farmacia.solicitudes.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
}