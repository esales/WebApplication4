package entidade;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private Integer idade;
    private ArrayList<String> perfis;

    public Pessoa(){
        perfis = new ArrayList<String>();
    }

    public ArrayList<String> getPerfis() {
        return perfis;
    }

    public void setPerfis(ArrayList<String> perfis) {
        this.perfis = perfis;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
}