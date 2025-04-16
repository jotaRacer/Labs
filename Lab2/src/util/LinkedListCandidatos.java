package util;
import modelo.Candidato;
public class LinkedListCandidatos{
   private Node head;
   
   public LinkedListCandidatos(){
    this.head = null;
   }
  
   public void agregarCandidato(Candidato candidato){
    Node nuevoNodo = new Node(candidato);
    Node nodeAux = head;
        if(nodeAux == null){
        this.head = nuevoNodo;
        }   
        else{ 
             while(nodeAux.getNext() != null){
            nodeAux = nodeAux.getNext();
            }
        nodeAux.setNext(nuevoNodo);
        }
    }

    public Candidato buscarCandidato(int id){
        Node nodeAux = head;
        while(nodeAux != null){
            if(nodeAux.getCandidato().getId()== id){
                return nodeAux.getCandidato();
            }
            nodeAux = nodeAux.getNext();
        }
        return null;
    }
    public void mostrarCandidatos(){
        Node aux = head;
        while(aux != null){
            System.out.println("ID: " + aux.getCandidato().getId() + " - " + aux.getCandidato().getNombre());
            aux = aux.getNext();
        }
    }








}
