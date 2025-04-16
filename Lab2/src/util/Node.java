package util;

import modelo.Candidato;

public class Node {
 Candidato candidato;
 Node next;
 
public Node(Candidato Candidato, Node Next){
    this.candidato = Candidato;
    this.next = Next; 
}
public Node(Candidato Candidato){
    this.candidato = Candidato;
    this.next = null; 
}
public Candidato getCandidato() {
    return candidato;
}

public void setData(Candidato Candidato) {
    this.candidato = Candidato;
}

public Node getNext() {
    return next;
}

public void setNext(Node Next) {
    this.next = Next;
}

}