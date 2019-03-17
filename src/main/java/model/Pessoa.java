package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Pessoa implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private String email;
}
