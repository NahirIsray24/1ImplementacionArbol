/*
Para crear el árbol binario de la , se utiliza un esquema secuencial y con una
Pila 
 */

public class clsMain {
    public static void main(String[] args){ 
    clsArbolBinario objArbol;//variable
    clsNodo a1, a2, a;
    int op=0;

    clsPila objPila = new clsPila();
   
     
        System.out.println("INSERCCION 1;");
    a1 = clsArbolBinario.nuevoArbol(null,"Maria",null); //maria dato sin ramas 
    a2 = clsArbolBinario.nuevoArbol(null,"Rodrigo",null);
    a = clsArbolBinario.nuevoArbol(a1,"Esperanza",a2); //esperanza a su izquiere tiene a a1 q es maria y a la der rodrigo
     objPila.insertar(a);
     
   
    System.out.println("INSERCCION 2;"+a);
    a1 = clsArbolBinario.nuevoArbol(null,"Anyora",null);
    a2 = clsArbolBinario.nuevoArbol(null,"Abel",null);
    a = clsArbolBinario.nuevoArbol(a1,"M Jesus",a2);
    objPila.insertar(a);
  
    //las prox lineas quita lo q fui metiendo en las lineas anteriores 
    a2 = (clsNodo) objPila.quitar();
    a1 = (clsNodo) objPila.quitar();
    a = clsArbolBinario.nuevoArbol(a1,"Esperanza",a2);
    //ahora construimos formalemnte el arbol binario, si bien existe pero creo un obj de arbol binario q me guarde todo
    //que es obArbol
    objArbol = new clsArbolBinario(a); //las quita para crear un nuevo arbol de nuevo en la variable a 
    
        
     System.out.println("RECORRIDO PREORDEN;");
     clsArbolBinario.preOrden(a);//mi raiz es a 
      System.out.println("RECORRIDO POSORDEN;");
       clsArbolBinario.posOrden(a);
      System.out.println("RECORRIDO INORDEN;");
    clsArbolBinario.inOrden(a);
   
    
    
}
    }

