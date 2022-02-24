/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author johanacosta19
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo Java");
        Persona per1 = new Persona();
        per1.setNombre("Johan AD");
        System.out.println("Nombre:" +per1.getNombre() );
        per1.comer("Hamburguesa hawaiana");
        
        Persona per2=new Persona();
        per2.comer("Pizza hawaiana");
        per2.setNombre("Felipe");
        System.out.println("Nombre per 2:" + per2.getNombre());
        per2.comer("Pizza Hawaiana");
        
        Automovil vocho=new Automovil();
        vocho.setMarca("VM");
        System.out.println("Marca:" + vocho.getMarca());
        vocho.setSubMarca("Sedan");
        System.out.println("subMarca:" + vocho.getSubMarca());
        vocho.setModelo(1970);
        System.out.println("Modelo:" + vocho.getModelo());
        vocho.setColor(Color.blue);
        System.out.println("Color:" + vocho.getColor());
        
        Automovil mustang=new Automovil();
        mustang.setMarca("Ford");
        System.out.println("Marca:" + mustang.getMarca());
        mustang.setSubMarca("Mustang");
        System.out.println("subMarca:" + mustang.getSubMarca());
        mustang.setModelo(2010);
        System.out.println("Modelo:" + mustang.getModelo());
        mustang.setColor(Color.yellow);
        System.out.println("Color:" + mustang.getColor());
        
        Automovil akura=new Automovil();
        akura.setMarca("Akura");
        System.out.println("Marca:" + akura.getMarca());
        akura.setSubMarca("NSX");
        System.out.println("subMarca:" + akura.getSubMarca());
        akura.setModelo(2013);
        System.out.println("Modelo:" + akura.getModelo());
        akura.setColor(Color.gray);
        System.out.println("Color:" + akura.getColor());
        
    }
    
}
