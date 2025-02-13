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
public class Promotor extends Empleado {
    private List<Proyecto> listaDeProyectos;
    
    // CONSTRUCTORES
    public Promotor(){
        super(); //llama al construcor de Empleado
    }
    
    public Promotor(String n, String a){
        super(n,a);
    }
}
