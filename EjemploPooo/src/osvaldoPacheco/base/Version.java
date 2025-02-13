/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osvaldoPacheco.base;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Osvaldo
 */
public class Version {
    
    //Propieties
     private  Date fecha;
     private  String descripcion;
     private  File archivo;
     private  Documento documento;
     
     // Constructores
     public Version(){
         
     }
     public Version(Date fecha, String d){
             this.fecha = fecha;
             descripcion = d;
     }
}
