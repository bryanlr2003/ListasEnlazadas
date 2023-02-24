package Modelos;

public class Lista {
    
    NODO primero;
    
    public void InsertarNodo(int dato){
        
        NODO nodoNuevo = new NODO(dato);
        if(primero == null)
        {
            primero = nodoNuevo;
        }
        else
        {
        nodoNuevo.siguiente = primero;
        primero = nodoNuevo;
        }
    }
    public void ListarNodos(){
        NODO Auxiliar;
        Auxiliar = primero;
        while(Auxiliar!=null)
        {
            System.out.println(Auxiliar.getDato());
            Auxiliar = Auxiliar.siguiente;
            
        }
    }
}
