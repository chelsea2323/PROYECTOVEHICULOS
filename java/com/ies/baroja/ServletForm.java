
package com.ies.baroja;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.clientes;
import com.model.contrato;
import com.model.proveedores;
import com.model.Vehiculos;

import com.model.Revision;


/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("inicio dopost");
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("UTF-8");
			if (request.getParameter("email") != null) {
				System.out.println("login usuario");
				loginUsuario(request, response);
			
			} else if (request.getParameter("nombrecliente") != null) {
				System.out.println("insertar usuario");
				insertarCliente(request, response);
				
			}else if (request.getParameter("codigovehiculo") != null) {
				System.out.println("insertarvehiculo");
				insertarVehiculo(request, response);
			} /*else if (request.getParameter("codigocontrato") != null) {
				insertarContrato(request, response);
			} else if (request.getParameter("") != null) {
				insertarReserva(request, response);*/
		

				/** ERROR */
			 else {
				System.out.println("Error, opción no válida");
			}

		} catch (Exception ex) {
			System.out.println("Error en servlet");
			ex.printStackTrace();
			mostrarError(response, "Error en servlet");
		}
	}

				

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	private static void loginUsuario(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession sesion = request.getSession();
		String sEmail = request.getParameter("email");
		String sPwd = request.getParameter("password");
		//
		sesion.setAttribute("email", null);
		if (sEmail.equalsIgnoreCase("mario@gmail.com") && sPwd.equals("mario") && sesion.getAttribute("usuario")== null ) {
			sesion.setAttribute("email", sEmail);
			response.sendRedirect("perfilAdmin.jsp");
		} else if (sEmail.equalsIgnoreCase("laura@gmail.com") && sPwd.equals("laura")&& sesion.getAttribute("usuario")== null) {
			sesion.setAttribute("email", sEmail);
			response.sendRedirect("perfilUser.html");
		} else {
			// l�gica para login inv�lido
			mostrarError(response, "Error en el login del usuario");
		}
	}

	// ------------------------------------- INSERTAR// ------------------------------------
	
	private static void insertarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		/** 1- recogida de datos */
		clientes cliente = new clientes(
				request.getParameter("codigocliente"), 
				request.getParameter("nombrecliente"),
				request.getParameter("apellidocliente"),
				request.getParameter("telefono"),
				request.getParameter("direccion"),
				request.getParameter("localidad"), 
				request.getParameter("provincia"),
				request.getParameter("codigopostal"),
				request.getParameter("emailInsertar"));
		/** 2- Insertar cliente en la base de datos */
		boolean bRes = Controller.insertarCliente(cliente);
		/** 3- Mostrar resultado por pantalla */
		if (bRes) {
			response.sendRedirect("exito.jsp");
		

		} else {
			// Mostramos que se ha producido un error
			mostrarError(response, "Error al dar de alta el cliente");

		}
	}
	/**
	 * @param request
	 * @param response
	 * @throws Exception
	 */

	private static void insertarVehiculo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		/** 1- recogida de datos */
		Vehiculos vehiculo = new Vehiculos(
				request.getParameter("codigovehiculo"), 
				request.getParameter("matricula"),
				request.getParameter("modelo"), 
				request.getParameter("color"), 
				request.getParameter("precio"),
				request.getParameter("foto"), 
				request.getParameter("codigocliente"), null);
		/** 2- Insertar cliente en la base de datos */
		boolean bRes = Controller.insertarVehiculos(vehiculo);
		/** 3- Mostrar resultado por pantalla */
		if (bRes) {
			response.sendRedirect("exito.jsp");
		

		} else {
			// Mostramos que se ha producido un error
			mostrarError(response, "Error al dar de alta el vehiculo");

		}
	}
	private static void insertarContrato(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		/** 1- recogida de datos */
		contrato contratos = new contrato(
				request.getParameter("codigocontrato"),
				request.getParameter("valor_contrato"),
			
				request.getParameter("fecha"),
				request.getParameter("cod_proveedor"),
               request.getParameter("cod_reserva"));

		/** 2- Insertar cliente en la base de datos */
		boolean bRes = Controller.insertarContrato(contratos);
		/** 3- Mostrar resultado por pantalla */
		if (bRes) {
			response.sendRedirect("exito.jsp");
		

		} else {
			// Mostramos que se ha producido un error
			mostrarError(response, "Error al dar de alta el contrato");

		}
	}
	private static void insertarReserva(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		/** 1- recogida de datos */
		Vehiculos vehiculo = new Vehiculos(
				request.getParameter("codigovehiculo"), 
				request.getParameter("matricula"),
				request.getParameter("modelo"), 
				request.getParameter("color"), 
				request.getParameter("precio"),
				request.getParameter("foto"), 
				request.getParameter("codigocliente"), null);
		/** 2- Insertar cliente en la base de datos */
		boolean bRes = Controller.insertarVehiculos(vehiculo);
		/** 3- Mostrar resultado por pantalla */
		if (bRes) {
			response.sendRedirect("exito.jsp");
		

		} else {
			// Mostramos que se ha producido un error
			mostrarError(response, "Error al dar de alta el vehiculo");

		}
	}

	
	



	private static void mostrarError(HttpServletResponse response, String sMensaje) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>\n" + "<HEAD><TITLE>P�gina de JAGD</TITLE>" + "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</HEAD>\n" + "<BODY>\n" + "<div class=\"container mt-3\">\n"
				+ "<h1 class=\"text-danger\">Error interno<h1>\n"
				+ "<h2 class=\"text-danger\">"+sMensaje+"<h2>\n"
				+ "<img src=\"img/error.jpg\" class=\"rounded\" alt=\"error interno\">" + "</div></BODY></HTML>");
		out.close();
	}

}