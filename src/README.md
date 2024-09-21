# Lab 3

____

*_NOTA:_* Al finalizar este laboratorio las búsquedas de clientes aun no estarán programadas.
____

#### Objetivo:
Aplicar conceptos de OO

#### Descripción general del proyecto:

Realizar la búsqueda de clientes de acuerdo a diferentes criterios


#### Instrucciones:

#### Parte 0: Configuración de dependencias
1. Incluya las dependencias de las librerias para la **generación de logs**
2. Adicione un logger a la clase ApplicationRunner
3. Adiccione un log al método run de la clase ApplicationRunner. Este log solo notifica que la aplicación ha sido ejecutada exitosamente.
4. Incluya las dependencias de las librerias para **pruebas**
5. Cree un caso de pruebas para el método run de la clase ApplicationRunner
6. Ejecute el caso de prueba y confirme que el mensaje del log se muestra correctamente


#### Parte 1: Estructura de datos para clientes con los siguientes atributos
1. Numero de cedula
2. Nombres
3. Apellidos
4. Fecha de nacimiento
5. Direccion
6. Cupo maximo

#### Parte 2: Cree excepciones para los siguientes eventos
1. no se encontraron clientes que correspondan a nombres y apellidos
2. no se encontraron clientes con cupos máximos al valor ingresado
3. no se encontró al cliente identificado con la cédula indicada

#### Parte 3: Interface para el repositorio de clientes con los metodos para
1. buscar clientes por nombres y apellidos
2. buscar clientes con cupo maximo mayor o igual a un valor ingresado
3. buscar al cliente segun el número de identificación

# Lab 4

#### Parte 4: Implementación de Interface para el repositorio de clientes
1. copie el archivo clientes.txt dentro de una carpeta data en la raiz del proyecto
2. copie la clase ClienteRepositoryFileBased dentro de una paquete impl el cual debe ser creado dentro del paquete donde se creo la interface para clientes. Esta clase contiene el codigo para leer un archivo de clientes y cargarlos en una lista
3. copie la clase de prueba ClienteRepositoryTest dentro del proyecto
4. actualice la clase para que implemente la interface creada en el parte 3. Implemente los 3 métodos de búsqueda
5. ejecute los 2 casos de prueba. Ambos deben pasar exitosamente
6. adicione un logger ClienteRepositoryFileBased y registre dos mensajes de información al momento de leer los clientes desde el archivo plano. El primer mensaje debe indicar que el proceso de lectura inicio, y el segundo que ha terminado e indicando el número de clientes que fueron leidos desde el archivo

#### Parte 5: Uso de excepciones
1. TBD
