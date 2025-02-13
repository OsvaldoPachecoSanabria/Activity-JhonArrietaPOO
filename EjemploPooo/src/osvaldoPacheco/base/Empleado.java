/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osvaldoPacheco.base;

import java.util.Date;
import java.util.List;
/**
 *
 * @author Osvaldo
 */
public class Empleado {
    /// Propiedades
      protected String  DNI;
      protected String nombre;
      protected String apellidos;
      protected String direccion;
      protected String telefono;
      protected String email;
      protected Date fechaContrato;
      protected Empresa empresa;
      protected List<Proyecto> listaDeProyectos;
      protected List<Tarea> listaDeTareas;
}
