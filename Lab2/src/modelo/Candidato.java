package modelo;
import java.util.Queue;
import java.util.LinkedList;

public class Candidato {
    private int id;
    private String nombre;
    private String partido;
    private Queue<Voto> votosRecibidos;

    public Candidato(int Id, String Nombre, String Partido){
        this.id = Id;
        this.nombre = Nombre;
        this.partido = Partido;
        this.votosRecibidos = new LinkedList<>();
    }
    public void agregarVoto(Voto voto){
        votosRecibidos.offer(voto);
    }

public int getId() { return id; }

public String getNombre() { return nombre;}

public String getPartido() { return partido;}

public Queue<Voto> getVotosRecibidos() { return votosRecibidos;}

public void setId(int id) {
    this.id = id;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setPartido(String partido) {
    this.partido = partido;
}
public void setVotosRecibidos(Queue<Voto> votosRecibidos) {
    this.votosRecibidos = votosRecibidos;
}

}
