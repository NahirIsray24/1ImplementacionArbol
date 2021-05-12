/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.Vector;
public class clsPila {
  //creamos atributos el tamaño de la pila, la cima, y el puntero
    private static final int TAMANIO=19;
    private int cima;
    private Vector listaPila; //vector es como un arraylist
    //constructor 
    public clsPila (){
        cima= -1; //-1 indica q la pila esta vacia 
        listaPila= new Vector(TAMANIO);
    }
    //metodo insertar y quitar 
    public void insertar (Object elemento){
        cima++; //aumenta la cima
        listaPila.addElement(elemento); //hace algo similar al arraylis, sobre esa lista pila agrego el elemento q pase 
        
    }
    public Object quitar(){
        Object aux; //declaro esta variable aux para reservar el enlace entre la pila
        if (pilaVacia()==true){
            System.out.println("LA PILA ESTA VACIA POR LO TANTO NO HAY NADA PARA QUITAR");
        }
        
             aux=listaPila.elementAt(cima);
             cima--;
             return aux;  
        
    }
    public boolean pilaVacia(){
        return  true; //true verdadera    
       }
    
    
}
