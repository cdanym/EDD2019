
class Nodo{
    Object elemento;
    Nodo siguiente;
    
    public Nodo(Object elemento){
        this.elemento = elemento;
        siguiente = null;
    }
    
    
}



public class Bolsa {
    Nodo primero;
    Nodo ultimo;
    int contador;
    
    public Bolsa(){
        primero = ultimo = null;    
    }
    
    public boolean esVacia(){
        return (primero == null) && (ultimo == null);
    }
    
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            nuevo.siguiente = nuevo;
            primero = ultimo = nuevo;
        }
        else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            primero = nuevo;
        }
    }
    
    public void contar(){
        Nodo temporal = primero;
        if (esVacia()) {
            System.out.println("La bolsa esta vacia");
            contador = 0;
        }
        else{
            do {
                temporal = temporal.siguiente;
                contador++;
            } while (temporal != primero);
        }
        
    }
    
    
    public static void main(String[] args) {
        
    }
    
}

