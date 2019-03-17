package controller.bean;

import lombok.Data;
import model.Pessoa;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@Data
@Named("pessoaBean")
public class PessoaBean implements Serializable {

    public static final long serialVersionUID = 1L;

    @Inject
    private Pessoa pessoa;

    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public String adicionar(){
        pessoas.add(pessoa);
        limpar();
        return "";
    }

    public void limpar(){
        pessoa = new Pessoa();
    }
}
