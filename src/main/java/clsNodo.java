/*
La clase Nodo agrupa a todos los campos de que consta: dato, izdo (rama izquierda) y dcho
(rama derecha). Además, dispone de dos constructores; el primero inicializa el campo dato a un
valor y los enlaces a null, en definitiva, se inicializa como hoja y el segundo inicializa dato a
un valor y las ramas a dos subárboles.
 */
public class clsNodo {
    //tenemos un nodo que dentro suyo contiene el dato y ese dato tiene rama izq y derec
    // protected, que significa que las subclases sí pueden tener acceso al campo o método.
        protected Object dato; //objet designa q nuestro nodo podra guardar cualq cosa 
        protected clsNodo izdo; 
        protected clsNodo dcho;
        //constructor 
        public clsNodo(Object valor){
        dato = valor; //al dato dentro del nodo le asigna el valor q recibe
        izdo = dcho = null; //no tiene subarboles solo raiz 
        }
        //constructor que nos pasa nodo p izq y der
        public clsNodo(clsNodo ramaIzdo, Object valor, clsNodo ramaDcho){
        //this(valor);//llamo a otro constructor q esta en la misma clase q recibe un unico atributo de tipo objeto me ahorro el const de arriba
        izdo = ramaIzdo;//un nodo p la rama izquierda
        dcho = ramaDcho; //nodo p rama der
        dato = valor;
        }
        // operaciones de acceso
        public Object getDato(){ 
            return dato; 
        }
        public void setNuevoV(Object dato){ 
            this.dato = dato; 
        }
        public clsNodo getIzdo(){ 
            return izdo;
        }
         public void setIzdo(clsNodo izdo){
            this.izdo = izdo;
         }
        public clsNodo getDcho(){
            return dcho;
        }
        public void setDcho(clsNodo dcho){ 
            this.dcho = dcho; 
        }
        void visitar(){
            System.out.println(dato+"");
        }
 
}
