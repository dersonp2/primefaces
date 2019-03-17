package model;

public enum TipoAtividade {

    APRESENTACAO("Apresentação"), CURSOS("Cursos"), MINICURSOS("Minicursos"), PALESTRAS("Palestras"),
    SEMINARIO("Seminário"), SIMPOSIO("Simpósio"), OUTRA("Outra");

    private String descricao;

    TipoAtividade(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
