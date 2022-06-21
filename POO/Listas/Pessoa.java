package Listas;
public class Pessoa {
    private int Id;
    private String Nome;
    
    public Pessoa(int Id, String Nome) {
        this.Id = Id;
        this.Nome = Nome;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    @Override
    public String toString() {
        return "ID: " + Id + ", Nome: " + Nome;
    }

    
}