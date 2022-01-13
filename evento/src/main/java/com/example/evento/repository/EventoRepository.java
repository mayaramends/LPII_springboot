package com.example.evento.repository;

import com.example.evento.models.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String> {
    Evento findByCodigo(long codigo);
}
