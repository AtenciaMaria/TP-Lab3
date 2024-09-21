package org.tp24.repository;

import org.tp24.model.Cliente;

import java.math.BigDecimal;
import java.util.List;

public interface ClienteRepository {
    List<Cliente> buscar(String nombres, String apellidos);

    List<Cliente> buscar(Double cupoMaximo);

    Cliente buscar(Integer cedula);
}
