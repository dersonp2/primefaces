package controller.bean;

import lombok.Data;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Data
@SessionScoped
@Named
public class TimesBean implements Serializable {

    private List<String> times;

    public void selecionar(){
        for(String time : times){
            System.out.println(time);
        }
    }
}
