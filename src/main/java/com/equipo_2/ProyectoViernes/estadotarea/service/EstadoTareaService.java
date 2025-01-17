package com.equipo_2.ProyectoViernes.estadotarea.service;

import com.equipo_2.ProyectoViernes.estadotarea.model.EstadoTarea;
import com.equipo_2.ProyectoViernes.estadotarea.repository.EstadoTareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoTareaService {
    @Autowired
    private EstadoTareaRepository estadoTareaRepository;

    public EstadoTarea crearEstadoTarea(EstadoTarea estadoTarea){
        return estadoTareaRepository.save(estadoTarea);
    }

    public List<EstadoTarea> listarEstadoTarea(){
        return estadoTareaRepository.findAll();
    }

    public EstadoTarea buscarPorId(Long id){
        return estadoTareaRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Estado de tarea no encontrado"));
    }

    public void eliminarEstadoTarea(Long id){
        estadoTareaRepository.deleteById(id);
    }
}
