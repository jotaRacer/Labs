package modelo;

public class Votante {
    private int id;
    private String nombre;
    private boolean yaVoto;

    public Votante(int Id, String Nombre){
        this.id = Id;
        this.nombre = Nombre;
        this.yaVoto = false;
    }

    public int getId() { return id;}

    public void setId(int id) { 
        this.id = id;
    }

    public String getNombre() { return nombre;}

    public void setNombre(String nombre) {
         this.nombre = nombre; 
    }

    public boolean isYaVoto() { return yaVoto;}

   
    public void marcarComoVotado(){
        this.yaVoto = true;
    }
    
}
