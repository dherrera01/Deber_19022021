/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author david herrera
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear Objeto Para Pelicula/Categoria
        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matix");
        Categoria categoria = new Categoria();
        categoria.setId(0);
        categoria.setNombre("Acción");
        categoria.setDescripcion("Full armas y");
        categoria.setEstado(true);
        matrix.setCategoria(categoria);
        
        // Crear Objeto Para Persona/Cliente
        Persona person1= new Persona();
        person1.setNombres("David");
        person1.setApellidos("Herrera");
        Cliente clie1= new Cliente();
        clie1.setIdCliente(1);
        clie1.setEstado(true);
        person1.setCliente(clie1);
    }
    
}
