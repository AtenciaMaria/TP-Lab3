package org.tp24.repository;

import org.junit.jupiter.api.Test;
import org.tp24.repository.impl.ClienteRepositoryFileBased;

import static org.junit.jupiter.api.Assertions.*;

class ClienteRepositoryTest {

	ClienteRepository clienteRepository = new ClienteRepositoryFileBased();;//TODO reemplazar el null por lo siguiente new ClienteRepositoryFileBased();

	@org.junit.jupiter.api.Test
	void cuando_se_buscan_clientes_por_nombres_y_apellidos_se_devuelven_resultados_exitosamente() {
		var clientes =  clienteRepository.buscar( "Pepe","Sierra" );
		assertNotNull( clientes );
		assertFalse( clientes.isEmpty() );
		assertEquals( 2, clientes.size() );
	}

	@org.junit.jupiter.api.Test
	void cuando_se_buscan_clientes_con_cupo_mayor_igual_se_devuelven_resultados_exitosamente() {
		var clientes =  clienteRepository.buscar( 4500D );
		assertNotNull( clientes );
		assertFalse( clientes.isEmpty() );
	}
}
