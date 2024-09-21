package org.tp24.repository.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import org.tp24.ApplicationRunner;
import org.tp24.model.Cliente;
import org.tp24.repository.ClienteRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClienteRepositoryFileBased implements ClienteRepository{
	protected static final Logger logger= LoggerFactory.getLogger(ClienteRepositoryFileBased.class);

	private List<Cliente> clientes = null;
	public ClienteRepositoryFileBased(){
		clientes =  leerClientes();
	}

	private List<Cliente> leerClientes(){
		logger.info("El proceso de lectura ha iniciado");

		Path rutaArchivo = Paths.get( "./data/clientes.txt" );
		int cantidadClientes = 0;
		try (BufferedReader reader = Files.newBufferedReader( rutaArchivo )) {
			List<Cliente> clientes = reader.lines().map( this::build ).toList();
			cantidadClientes = clientes.size();
			logger.info("Proceso de lectura finalizado: Hay un total de {} clientes",cantidadClientes);
			return clientes;

		}catch (IOException e) {
			throw new RuntimeException( e );
		}

    }

	private Cliente build(String text){
		/*TODO Este metodo debe ser actualizado de acuerdo con la estructura del la clase Cliente*/
		String[] clienteArray = text.split( "," );
		return new Cliente( Integer.parseInt(clienteArray[0].trim()) ,
							clienteArray[1].trim(),
							clienteArray[2].trim(),
							LocalDate.parse(clienteArray[3].trim()),
							clienteArray[4].trim(),
							Double.parseDouble( clienteArray[5].trim()) );
	}


	@Override
	public List<Cliente> buscar(String nombres, String apellidos) {
		List<Cliente> resultado = clientes.stream()
				.filter(cliente -> cliente.nombres().equalsIgnoreCase(nombres) && cliente.apellidos().equalsIgnoreCase(apellidos))
				.toList();
		if (resultado.isEmpty()){
			System.out.println("Lista vacía");
		}
		return resultado;
	}

	@Override
	public List<Cliente> buscar(Double cupoMaximo) {
		List<Cliente> resultado = clientes.stream()
				.filter(cliente -> cliente.cupoMaximo().compareTo(cupoMaximo) >= 0)
				.toList();
		if (resultado.isEmpty()){
			System.out.println("No se encontraron clientes con un cupo máximo mayor o igual al proporcionado.");
		}
		return resultado;
	}

	@Override
	public Cliente buscar(Integer cedula) {
		return clientes.stream()
				.filter(cliente -> cliente.numeroCedula().equals(cedula))
				.findFirst()
				.orElseThrow();
	}
}
