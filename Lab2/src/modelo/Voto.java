package modelo;

public class Voto {
    private long idVoto;
    private int idVotante;
    private int idCandidato;
    private String timestamp;

    public Voto(long idvoto, int idvotante, int idcandidato, String TIMESTAMP){
        this.idVoto = idvoto;
        this.idVotante = idvotante;
        this.idCandidato = idcandidato;
        this.timestamp = TIMESTAMP;
    }
    public long getIdVoto() {
        return idVoto;
    }

    public int getIdVotante() {
        return idVotante;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
        
}
