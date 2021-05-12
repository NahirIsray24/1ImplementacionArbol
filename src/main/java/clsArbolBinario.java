/*
 Creación de un árbol binario que va hacer usos de esos nodos
La clase ArbolBinario tiene
el campo raiz, un constructor que inicializa raiz y métodos para implementar las operaciones.
 */
public class clsArbolBinario {
    protected clsNodo raiz; //declaro la raiz del tipo de la CLASE NODO
    
    //constructor para arbol vacio
    public clsArbolBinario(){
      raiz = null;
    }
    //constructor para arbol con nodos 
    public clsArbolBinario(clsNodo raiz) {
     this.raiz = raiz; //raiz apunta a un nodo q contiene dato, izq, y der
    }
    public clsNodo raizArbol() {
        return raiz;
    }
    // metodo para comprobar si la raiz sea o no null en caso q lo sea es xq esta vacio
    boolean esVacio(){
        return raiz == null;
    }
    //método nuevoArbol() crea un árbol de raíz ,un nodo con el campo dato, rama izquierda y derecha pasadas en los argumentos.
    public static clsNodo nuevoArbol(clsNodo ramaIzqda, Object dato, clsNodo ramaDrcha){
        //metodos estaticos lo llamamos con la clase NO con la istancia de la clase --> clsArbolBinario.nuevoArbol
        return new clsNodo(ramaIzqda, dato, ramaDrcha);
        //construye arbon con raiz nodo izq y der
    }
//RECORRIDOS
    public static void preOrden(clsNodo raiz){
        if (raiz != null){
            raiz.visitar();
            preOrden (raiz.izdo);
            preOrden (raiz.dcho);

        }
    }
     public static void inOrden(clsNodo raiz){
        if (raiz != null){
           
            preOrden (raiz.izdo);
             raiz.visitar();
            preOrden (raiz.dcho);

        }
    }
      public static void posOrden(clsNodo raiz){
        if (raiz != null){
            
            preOrden (raiz.izdo);
            preOrden (raiz.dcho);
            raiz.visitar();

        }
    }
}
