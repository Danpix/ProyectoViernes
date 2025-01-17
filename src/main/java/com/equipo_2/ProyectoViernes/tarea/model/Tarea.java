package com.equipo_2.ProyectoViernes.tarea.model;

import com.equipo_2.ProyectoViernes.estadotarea.model.EstadoTarea;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tareas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "fecha_finalizacion", nullable = false)
    private LocalDate fechaFinalizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado_tarea", nullable = false)
    private EstadoTarea estadoTarea;

    // Constructores

}
