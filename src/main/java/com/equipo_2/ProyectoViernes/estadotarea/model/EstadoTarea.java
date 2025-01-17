package com.equipo_2.ProyectoViernes.estadotarea.model;

import com.equipo_2.ProyectoViernes.tarea.model.Tarea;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "estado_tareas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadoTarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "estadoTarea", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarea> tareas;


}
