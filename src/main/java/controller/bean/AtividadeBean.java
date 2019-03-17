package controller.bean;

import lombok.Data;
import model.Atividade;
import model.TipoAtividade;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Data
@SessionScoped
@Named
public class AtividadeBean implements Serializable {

    public static final long serialVersionUID=1L;

    @Inject
    private Atividade atividade;

    public TipoAtividade[] getAtividades(){
        return TipoAtividade.values();
    }

}
