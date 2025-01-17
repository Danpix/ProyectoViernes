package com.equipo_2.ProyectoViernes.estadotarea.repository;

import com.equipo_2.ProyectoViernes.estadotarea.model.EstadoTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoTareaRepository extends JpaRepository<EstadoTarea,Long> {
    //encuentra un estado por nombre
    EstadoTarea findByNombre(String nombre);


}
