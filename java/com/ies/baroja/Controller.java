package com.ies.baroja;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.model.Revision;
import com.model.Vehiculos;
import com.model.clientes;
import com.model.contrato;
import com.model.reserva;
import com.model.proveedores;
import com.bbdd.ConexionBBDD;

public class Controller {
	
	// --------------------------------  LISTAS
		// CLIENTES--------------------------------------------
	private static String sConsultaClientes = "SELECT codigocliente, nombrecliente,apellidocliente,telefono,direccion,localidad,provincia,codigopostal,email FROM clientes;";

	/**
	 * Devolver lista de clientes
	 * 
	 * @return
	 */
	public static LinkedList<clientes> getclientes() {
		// Objeto con la lista de jugadores
		LinkedList<clientes> listaClientes= new LinkedList<clientes>();
		// Primero conectamos a la BBDD
		ConexionBBDD miConexion = new ConexionBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado = miConexion.ejecutarConsulta(sConsultaClientes);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCH de un CURSOR)
				while (rsResultado.next()) {
					// Creamos un objeto jugador por cada fila de la tabla (cada cliente)
					clientes cliente = new clientes(
							String.valueOf(rsResultado.getInt("codigocliente")),
							
							rsResultado.getString("nombrecliente"), 
							rsResultado.getString("apellidocliente"),
							String.valueOf(rsResultado.getInt("telefono")),
							rsResultado.getString("direccion"),
							rsResultado.getString("localidad"), 
							rsResultado.getString("provincia"), 
							String.valueOf(rsResultado.getInt("codigopostal")),
							rsResultado.getString("email"));
					// Lo insertamos en la lista
					listaClientes.add(cliente);
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			System.out.println("N�mero de clientes=" + listaClientes.size());
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		} finally {
			miConexion.desconectar();
		}
		return listaClientes;
	}
	// --------------------------------  LISTAS
	// VEHICULOS--------------------------------------------
private static String sConsultaVehiculos = "SELECT codigovehiculo,  matricula ,modelo,marca,  color ,precio ,foto ,codigocliente FROM vehiculos;";

/**
 * Devolver lista de VEHICULOS
 * 
 * @return
 */
public static LinkedList<Vehiculos> getVehiculos() {
	// Objeto con la lista de jugadores
	LinkedList<Vehiculos> listaVehiculos= new LinkedList<Vehiculos>();
	// Primero conectamos a la BBDD
	ConexionBBDD miConexion = new ConexionBBDD();
	try {
		miConexion.conectar();
		// Lanzamos la consulta
		ResultSet rsResultado = miConexion.ejecutarConsulta(sConsultaVehiculos);
		if (rsResultado != null) {
			// Si hay resultado recuperamos los datos (como un FETCH de un CURSOR)
			while (rsResultado.next()) {
				// Creamos un objeto jugador por cada fila de la tabla (cada cliente)
				Vehiculos vehiculo = new Vehiculos(
						rsResultado.getString("codigovehiculo"),
						rsResultado.getString("matricula"), 
						rsResultado.getString("modelo"),
						rsResultado.getString("marca"), 
						rsResultado.getString("color"),
						rsResultado.getString("precio"), 
						rsResultado.getString("foto"), 
						rsResultado.getString("codigocliente"));
				// Lo insertamos en la lista
				listaVehiculos.add(vehiculo);
			}
		} else {
			System.out.println("La consulta no devuelve resultados");
		}
		System.out.println("N�mero de vehiculos=" + listaVehiculos.size());
	} catch (SQLException sqlex) {
		System.out.println("Error: " + sqlex.getMessage());
		sqlex.printStackTrace();
	} finally {
		miConexion.desconectar();
	}
	return listaVehiculos;
}
	
// --------------------------------  LISTAS
// CONTRATOS--------------------------------------------
private static String sConsultaContrato = "SELECT codigocontrato,  valor_contrato,  fecha,  cod_proveedor, cod_reserva FROM contrato;";

/**
* Devolver lista de CONTRATOS
* 
* @return
*/
public static LinkedList<contrato> getContrato() {
// Objeto con la lista de jugadores
LinkedList<contrato> listaContrato= new LinkedList<contrato>();
// Primero conectamos a la BBDD
ConexionBBDD miConexion = new ConexionBBDD();
try {
	miConexion.conectar();
	// Lanzamos la consulta
	ResultSet rsResultado = miConexion.ejecutarConsulta(sConsultaContrato);
	if (rsResultado != null) {
		// Si hay resultado recuperamos los datos (como un FETCH de un CURSOR)
		while (rsResultado.next()) {
			
			// Creamos un objeto jugador por cada fila de la tabla (cada cliente)
			contrato contratos = new contrato(
					rsResultado.getString("codigocontrato"),
					rsResultado.getString("valor_contrato"), 
					rsResultado.getString("fecha"),
					rsResultado.getString("cod_proveedor"),
					rsResultado.getString("cod_reserva"));
			// Lo insertamos en la lista
			listaContrato.add(contratos);
		}
	} else {
		System.out.println("La consulta no devuelve resultados");
	}
	System.out.println("N�mero de contratos=" + listaContrato.size());
} catch (SQLException sqlex) {
	System.out.println("Error: " + sqlex.getMessage());
	sqlex.printStackTrace();
} finally {
	miConexion.desconectar();
}
return listaContrato;
}
// --------------------------------  LISTAS
// RESERVA--------------------------------------------
private static String sConsultaReserva = "SELECT codigoreserva, fecha_inicio, fecha_fin, fecha_entrega, codigovehiculo, cod_cliente FROM reserva;";

/**
* Devolver lista de RESERVA
* 
* @return
*/
public static LinkedList<reserva> getReserva() {
// Objeto con la lista de jugadores
LinkedList<reserva> listaReserva= new LinkedList<reserva>();
// Primero conectamos a la BBDD
ConexionBBDD miConexion = new ConexionBBDD();
try {
	miConexion.conectar();
	// Lanzamos la consulta
	ResultSet rsResultado = miConexion.ejecutarConsulta(sConsultaReserva);
	if (rsResultado != null) {
		// Si hay resultado recuperamos los datos (como un FETCH de un CURSOR)
		while (rsResultado.next()) {
			// Creamos un objeto jugador por cada fila de la tabla (cada cliente)
			reserva reservas = new reserva(rsResultado.getString("codigoreserva"),
					rsResultado.getString("fecha_inicio"), rsResultado.getString("fecha_fin"),
					rsResultado.getString("fecha_entrega"), rsResultado.getInt("codigovehiculo"),
					rsResultado.getInt("cod_cliente"));
			// Lo insertamos en la lista
			listaReserva.add(reservas);
		}
	} else {
		System.out.println("La consulta no devuelve resultados");
	}
	System.out.println("N�mero de reservas=" + listaReserva.size());
} catch (SQLException sqlex) {
	System.out.println("Error: " + sqlex.getMessage());
	sqlex.printStackTrace();
} finally {
	miConexion.desconectar();
}
return listaReserva;
}
// --------------------------------  LISTAS
// REVISION--------------------------------------------
private static String sConsultaRevision= "SELECT codigorevision,  cod_vehiculo, cambio_filtro, cambio_aceite,cambio_frenos FROM revision;";

/**
* Devolver lista de VEHICULOS
* 
* @return
*/
public static LinkedList<Revision> getRevision() {
// Objeto con la lista de jugadores
LinkedList<Revision> listaRevision= new LinkedList<Revision>();
// Primero conectamos a la BBDD
ConexionBBDD miConexion = new ConexionBBDD();
try {
	miConexion.conectar();
	// Lanzamos la consulta
	ResultSet rsResultado = miConexion.ejecutarConsulta(sConsultaRevision);
	if (rsResultado != null) {
		// Si hay resultado recuperamos los datos (como un FETCH de un CURSOR)
		while (rsResultado.next()) {
			// Creamos un objeto jugador por cada fila de la tabla (cada cliente)
			Revision revision = new Revision(
					rsResultado.getString("codigorevision"),
					rsResultado.getString("cod_vehiculo"), 
					rsResultado.getString("cambio_filtro"),
					rsResultado.getString("cambio_aceite"), 
					rsResultado.getString("cambio_frenos"));
					
			// Lo insertamos en la lista
			listaRevision.add(revision);
		}
	} else {
		System.out.println("La consulta no devuelve resultados");
	}
	System.out.println("N�mero de revisiones=" + listaRevision.size());
} catch (SQLException sqlex) {
	System.out.println("Error: " + sqlex.getMessage());
	sqlex.printStackTrace();
} finally {
	miConexion.desconectar();
}
return listaRevision;
}
// --------------------------------  LISTAS
// PROVEEDORES--------------------------------------------
private static String sConsultaProveedores = "SELECT cod_proveedor, nombre,  direccion,  telefono,  comision,	 num_ventas FROM proveedores;";

/**
* Devolver lista de VEHICULOS
* 
* @return
*/
public static LinkedList<proveedores> getProveedores() {
// Objeto con la lista de jugadores
LinkedList<proveedores> listaProveedor= new LinkedList<proveedores>();
// Primero conectamos a la BBDD
ConexionBBDD miConexion = new ConexionBBDD();
try {
	miConexion.conectar();
	// Lanzamos la consulta
	ResultSet rsResultado = miConexion.ejecutarConsulta(sConsultaProveedores);
	if (rsResultado != null) {
		// Si hay resultado recuperamos los datos (como un FETCH de un CURSOR)
		while (rsResultado.next()) {
			// Creamos un objeto jugador por cada fila de la tabla (cada cliente)
			proveedores proveedor = new proveedores(rsResultado.getInt("cod_proveedor"),
					rsResultado.getString("nombre"), rsResultado.getString("direccion"),
					rsResultado.getInt("telefono"), rsResultado.getFloat(" comision"),
					rsResultado.getInt("num_ventas"));
			// Lo insertamos en la lista
			listaProveedor.add(proveedor);
		}
	} else {
		System.out.println("La consulta no devuelve resultados");
	}
	System.out.println("N�mero de proveedores=" + listaProveedor.size());
} catch (SQLException sqlex) {
	System.out.println("Error: " + sqlex.getMessage());
	sqlex.printStackTrace();
} finally {
	miConexion.desconectar();
}
return listaProveedor;
}

	
	/**-------------------------METODOS--------------------------------------**/
	

	// --------------------------------METODO PARA INSERTAR
   // clientes--------------------------------------------
	public static boolean insertarCliente(clientes cliente) {
		boolean bRes = true;

		// Primero conextamos a la BBDD
		ConexionBBDD miConexion = new ConexionBBDD();
		try {
			miConexion.conectar();
			
			int iRes = miConexion.insertarClientes(cliente);
			System.out.println("Resultado = " + iRes);

		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		} finally {
			miConexion.desconectar();
		}
		return bRes;

	}
	// --------------------------------METODO PARA INSERTAR
		// VEHICULO--------------------------------------------
		public static boolean insertarVehiculos(Vehiculos vehiculo) {
			boolean bRes = true;

			// Primero conextamos a la BBDD
			ConexionBBDD miConexion = new ConexionBBDD();
			try {
				miConexion.conectar();
				int iRes = miConexion.insertarVehiculos(vehiculo);
				System.out.println("Resultado = " + iRes);

			} catch (SQLException sqlex) {
				System.out.println("Error: " + sqlex.getMessage());
				sqlex.printStackTrace();
			} finally {
				miConexion.desconectar();
			}
			return bRes;

		}
		// --------------------------------METODO PARA INSERTAR
		// VEHICULO--------------------------------------------
		public static boolean insertarContrato(contrato contratos) {
			boolean bRes = true;

			// Primero conextamos a la BBDD
			ConexionBBDD miConexion = new ConexionBBDD();
			try {
				miConexion.conectar();
				int iRes = miConexion.insertarContratos(contratos);
				System.out.println("Resultado = " + iRes);

			} catch (SQLException sqlex) {
				System.out.println("Error: " + sqlex.getMessage());
				sqlex.printStackTrace();
			} finally {
				miConexion.desconectar();
			}
			return bRes;

		}
		// --------------------------------METODO PARA INSERTAR
		// VEHICULO--------------------------------------------
		public static boolean insertarReserva(Vehiculos vehiculo) {
			boolean bRes = true;

			// Primero conextamos a la BBDD
			ConexionBBDD miConexion = new ConexionBBDD();
			try {
				miConexion.conectar();
				int iRes = miConexion.insertarVehiculos(vehiculo);
				System.out.println("Resultado = " + iRes);

			} catch (SQLException sqlex) {
				System.out.println("Error: " + sqlex.getMessage());
				sqlex.printStackTrace();
			} finally {
				miConexion.desconectar();
			}
			return bRes;

		}
		// --------------------------------METODO PARA INSERTAR
		// VEHICULO--------------------------------------------
		public static boolean insertarRevision(Vehiculos vehiculo) {
			boolean bRes = true;

			// Primero conextamos a la BBDD
			ConexionBBDD miConexion = new ConexionBBDD();
			try {
				miConexion.conectar();
				int iRes = miConexion.insertarVehiculos(vehiculo);
				System.out.println("Resultado = " + iRes);

			} catch (SQLException sqlex) {
				System.out.println("Error: " + sqlex.getMessage());
				sqlex.printStackTrace();
			} finally {
				miConexion.desconectar();
			}
			return bRes;

		}
		// --------------------------------METODO PARA INSERTAR
		// VEHICULO--------------------------------------------
		public static boolean insertarProveedores(proveedores proveedor) {
			boolean bRes = true;

			// Primero conextamos a la BBDD
			ConexionBBDD miConexion = new ConexionBBDD();
			try {
				miConexion.conectar();
				int iRes = miConexion.insertarProveedores(proveedor);
				System.out.println("Resultado = " + iRes);

			} catch (SQLException sqlex) {
				System.out.println("Error: " + sqlex.getMessage());
				sqlex.printStackTrace();
			} finally {
				miConexion.desconectar();
			}
			return bRes;

		}



}