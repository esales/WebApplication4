package bean;

import entidade.Pessoa;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MBPessoa {

    private Pessoa pessoa;
    private ArrayList<String> perfisDisponiveis;
   // private DAOPessoa daoPessoa;

    public MBPessoa() {
        this.pessoa = new Pessoa();
        
        this.perfisDisponiveis = new ArrayList<String>();
        this.perfisDisponiveis.add("Estudante");
        this.perfisDisponiveis.add("Técnico");
        this.perfisDisponiveis.add("Professor");
        this.perfisDisponiveis.add("Terceirizado");
        
        //this.daoPessoa = new DAOPessoa();
    }

    public ArrayList<String> getPerfisDisponiveis() {
        return perfisDisponiveis;
    }

    public void setPerfisDisponiveis(ArrayList<String> perfisDisponiveis) {
        this.perfisDisponiveis = perfisDisponiveis;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String navegar() {
        String retorno = "";

        if (this.pessoa.getNome().equals("abc")) {
            retorno = "pagina3";
        } else {
            retorno = "pagina2";
        }

        return retorno;
    }
    
    
//    public String cadastrar(){
//       // daoPessoa.inserir(this.pessoa);
//    }
}
