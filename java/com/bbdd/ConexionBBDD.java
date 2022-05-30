package com.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.clientes;
import com.model.contrato;
import com.model.proveedores;
import com.model.reserva;
import com.model.Vehiculos;
import com.model.Revision;

/**
 * Clase que centraliza los métodos de acceso a BBDD
 * 
 * @author JAGD
 * @since 27/05/2021
 */

public class ConexionBBDD {

	Connection conexion; 
	int port = 3306;
	String host= "localhost";
	String db  = "vehiculos3";
	String user="root";
	String password="";

	String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", host, port, db);

	public void conectar() throws SQLException {
		conexion =  DriverManager.getConnection(url, user, password);
	}	
	 

	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
		}
	}
	
	/**
	 * 
	 * @param sentencia
	 * @return
	 */
	public ResultSet ejecutarConsulta(String sentencia) {
		ResultSet rsResultado = null;
		try {
			System.out.println("Ejecutando: " + sentencia);
			PreparedStatement prepStatement = conexion.prepareStatement(sentencia);
			rsResultado = prepStatement.executeQuery();
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
		}
		return rsResultado;
	}
	
	/**
	 * INSERTAR EN LA TABLA CLIENTES
	 * @param 
	 * @return
	 */
	public int borrarClientes(String codigoCliente){
		int ires=0;
		String sborrar="Delete from clientes where codigocliente='"+codigoCliente+"';";
		try {
			System.out.println("ejecutamos:"+sborrar);
			PreparedStatement ps = conexion.prepareStatement(sborrar);
			ires = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error"+e.getMessage());
			e.printStackTrace();
			
		}
		return ires;
		
	}
	public int insertarClientes(clientes cliente) {
		int iRes = 0;
		
		/** CONSULTA */
		String sInsert = "Insert into clientes (codigocliente, nombrecliente,apellidocliente,telefono,direccion,localidad,provincia,codigopostal,email) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
		try {
			System.out.println("Ejecutando "+sInsert);
			System.out.println("Datos"+cliente);
			
			/** PARA INSERTAR DATOS */
			PreparedStatement ps = conexion.prepareStatement(sInsert);
			
			/** SUSTITUIMOS LAS '?' POR LOS DATOS */
			ps.setInt(1, Integer.parseInt(cliente.getCodigocliente()));
			ps.setString(2, cliente.getNombrecliente());
			ps.setString(3, cliente.getApellidocliente());
			ps.setInt(4, Integer.parseInt(cliente.getTelefono()));
			ps.setString(5,cliente.getDireccion());
			ps.setString(6, cliente.getLocalidad());
			ps.setString(7, cliente.getProvincia());
			ps.setInt(8, Integer.parseInt(cliente.getCodigopostal()));
			ps.setString(9, cliente.getEmail());
			
			iRes = ps.executeUpdate();
			
		} catch (SQLException sqlex) {
			System.out.println("Error: "+sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}
	
	
	/**
	 * INSERTAR A TABLA CONTRATOS
	 * @param 
	 * @return
	 */
	public int insertarContratos(contrato contratos) {
		int iRes = 0;
		
		/** CONSULTA */
		String sInsert = "Insert into contrato() "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
		try {
			System.out.println("Ejecutando "+sInsert);
			System.out.println("Datos"+contratos);
			
			/** PARA INSERTAR DATOS */
			PreparedStatement ps = conexion.prepareStatement(sInsert);
			
			/** SUSTITUIMOS LAS '?' POR LOS DATOS */
		
			
			
			iRes = ps.executeUpdate();
			
		} catch (SQLException sqlex) {
			System.out.println("Error: "+sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}
	public int insertarVehiculos(Vehiculos vehiculo) {
		int iRes = 0;
		
		/** CONSULTA */
		String sInsert = "Insert into vehiculos(codigovehiculo,  matricula ,modelo,marca,  color ,precio ,foto ,codigocliente) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
		try {
			System.out.println("Ejecutando "+sInsert);
			System.out.println("Datos"+vehiculo);
			
			/** PARA INSERTAR DATOS */
			PreparedStatement ps = conexion.prepareStatement(sInsert);
			
			/** SUSTITUIMOS LAS '?' POR LOS DATOS */
			ps.setInt(1,Integer.parseInt(vehiculo.getCodigovehiculo()));
			ps.setString(2, vehiculo.getMatricula());
			ps.setString(3, vehiculo.getModelo());
			ps.setString(4, vehiculo.getMarca());
			ps.setString(5,vehiculo.getColor());
			ps.setFloat(6, Float.parseFloat(vehiculo.getPrecio()));
			ps.setString(7, vehiculo.getFoto());
			ps.setInt(8, Integer.parseInt(vehiculo.getCodigocliente()));
			
			
			iRes = ps.executeUpdate();
			
		} catch (SQLException sqlex) {
			System.out.println("Error: "+sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}
	public int insertarReserva(reserva reservas) {
		int iRes = 0;
		
		/** CONSULTA */
		String sInsert = "Insert into vehiculos(codigovehiculo,  matricula ,modelo,marca,  color ,precio ,foto ,codigocliente) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
		try {
			System.out.println("Ejecutando "+sInsert);
			System.out.println("Datos"+reservas);
			
			/** PARA INSERTAR DATOS */
			PreparedStatement ps = conexion.prepareStatement(sInsert);
			

			
			iRes = ps.executeUpdate();
			
		} catch (SQLException sqlex) {
			System.out.println("Error: "+sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}
	public int insertarRevision(Revision revision) {
		int iRes = 0;
		
		/** CONSULTA */
		String sInsert = "Insert into vehiculos(codigovehiculo,  matricula ,modelo,marca,  color ,precio ,foto ,codigocliente) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
		try {
			System.out.println("Ejecutando "+sInsert);
			System.out.println("Datos"+revision);
			
			/** PARA INSERTAR DATOS */
			PreparedStatement ps = conexion.prepareStatement(sInsert);
			
	
			
			iRes = ps.executeUpdate();
			
		} catch (SQLException sqlex) {
			System.out.println("Error: "+sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}
	public int insertarProveedores(proveedores proveedor) {
		int iRes = 0;
		
		/** CONSULTA */
		String sInsert = "Insert into vehiculos(codigovehiculo,  matricula ,modelo,marca,  color ,precio ,foto ,codigocliente) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
		try {
			System.out.println("Ejecutando "+sInsert);
			System.out.println("Datos"+proveedor);
			
			/** PARA INSERTAR DATOS */
			PreparedStatement ps = conexion.prepareStatement(sInsert);
			
 			/** SUSTITUIMOS LAS '?' POR LOS DATOS */
			
			
			
			iRes = ps.executeUpdate();
			
		} catch (SQLException sqlex) {
			System.out.println("Error: "+sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}

}