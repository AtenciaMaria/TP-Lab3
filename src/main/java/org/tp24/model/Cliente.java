package org.tp24.model;
import java.time.LocalDate;


public record Cliente(
        Integer numeroCedula,
        String nombres,
        String apellidos,
        LocalDate fechaNacimiento,
        String direccion,
        Double cupoMaximo
        ) {
}
