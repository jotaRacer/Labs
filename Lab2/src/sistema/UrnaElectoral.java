package sistema;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import util.LinkedListCandidatos;
import modelo.Voto;
import modelo.Votante;

public class UrnaElectoral {
    private LinkedListCandidatos listaCandidatos;
    private Stack <Voto> historialVotos;
    private Queue <Voto> votosReportados;
    private int idCounter;

    public UrnaElectoral() {
        this.listaCandidatos = new LinkedListCandidatos();
        this.historialVotos = new Stack<>();
        this.votosReportados = new LinkedList<>();
        this.idCounter = 0; 
    }

    public boolean verificarVotante(Votante votante ){
        Stack <Voto> aux = historialVotos;
        Voto votoAux;
        while(!aux.empty()){
            votoAux = aux.pop();
            if(votante.getId()==votoAux.getIdVotante()){
                return true;
            }


        }
        return false;
    }







}
