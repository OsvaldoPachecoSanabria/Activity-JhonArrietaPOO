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
public class Proyecto {
     private  String IdDelProyecto;
     private  String nombreClave;
     private  String denominacion;
     private  Date fechaInicio;
     private  Date fechaFin;
     private  String estado;
     private  Empresa empresa;
     private   List<Empleado> listaDeEmpleados;
     private   Promotor empleadoPromotor;
     private   List<Tarea> listaDeTareas;
}
