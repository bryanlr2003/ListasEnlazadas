package Modelos;
 class NODO {
     int dato;
     NODO siguiente;
//Se encapsula
    public NODO(int dato) {
        this.dato = dato;
        this.siguiente = null;
        
    }
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NODO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NODO siguiente) {
        this.siguiente = siguiente;
    }
    
     
}
