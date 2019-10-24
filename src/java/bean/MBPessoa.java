package bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@SessionScoped
public class MBPessoa {

    private String nome;

    public MBPessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String navegar() {
        String retorno = "";

        if (this.nome.equals("abc")) {
            retorno = "pagina3";
        } else {
            retorno = "pagina2";
        }

        return retorno;
    }
}
