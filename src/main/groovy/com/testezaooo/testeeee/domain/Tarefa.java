package com.testezaooo.testeeee.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Tarefa {

    private int id;

    private String  titulo;


    private int usuarioId;

    private boolean  completo;

    public Tarefa() {
        super();
    }
    @JsonCreator
    public Tarefa(@JsonProperty("id")int id,@JsonProperty("titulo") String titulo,@JsonProperty("usuarioId") int usuarioId,@JsonProperty("completo") boolean completo) {
        this.id = id;
        this.titulo = titulo;
        this.usuarioId = usuarioId;
        this.completo = completo;
    }

    //@JsonProperty("id")
    public void setId(@JsonProperty("id") int id) {
        this.id = id;
    }

    public void setTitulo(@JsonProperty("titulo") String titulo) {
        this.titulo = titulo;
    }

    public void setUsuarioId(@JsonProperty("usuarioId") int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setCompleto(@JsonProperty("completo") boolean completo) {
        completo = completo;
    }
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("titulo")
    public String getTitulo() {
        return titulo;
    }
    @JsonProperty("usuarioId")
    public int getUsuarioId() {
        return usuarioId;
    }
    @JsonProperty("completo")
    public boolean isCompleto() {
        return completo;
    }

}
