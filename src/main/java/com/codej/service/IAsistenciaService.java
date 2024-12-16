package com.codej.service;

import com.codej.model.Asistencia;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAsistenciaService {
    public List<Asistencia> findAll();
    public Asistencia findById(Long id);
    public  ResponseEntity<?> save (List<Asistencia> asistencias);
    public Asistencia update(Asistencia asistencia, Long id);
    public void delete(Long id);
}
