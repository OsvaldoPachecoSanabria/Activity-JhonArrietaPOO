/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osvaldoPacheco.base;

import java.util.List;

/**
 *
 * @author Osvaldo
 */
public class Documento {
    
    //propiedades
     private  String codigo;
     private   String descripcion;
     private  String tipo;
     private  Tarea tarea;
     private  List<Version> listaDeVersiones;
     
     //CONSTRUCTORES
     
    public Documento(){
        
    }
    
    // CONSTRUCTORES CON PARAMETRO
    public Documento(String codigo, String desc){
        this.codigo = codigo;
        this.descripcion = desc;
    }
}
