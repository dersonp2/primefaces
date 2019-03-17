package controller.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@ViewScoped
@Named
public class MessagesBean {

    public void salvar(){
        FacesMessage message = new FacesMessage("Mensagem de Sucesso");
        FacesContext.getCurrentInstance().addMessage(null,message);
    }

    public  void erro(){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Mensagem de Erro",null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
