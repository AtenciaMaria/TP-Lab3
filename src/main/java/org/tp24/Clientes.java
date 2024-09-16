package org.tp24;
import java.time.LocalDate;
import java.util.Date;


public record Clientes(
        int num_cedula,
        String nombres,
        String apellidos,
        LocalDate fecha_nacimiento,
        String direccion,
        int cupo_maximo
        ) {
}
