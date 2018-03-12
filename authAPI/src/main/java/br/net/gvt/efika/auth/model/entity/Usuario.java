package br.net.gvt.efika.auth.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_efika_web_permissoes", schema = "efika")
public class Usuario implements Serializable {

    @Id
    @Column(name = "LOGIN")
    private String login;

    @Column(name = "SENHA")
    @JsonProperty
    private String senha;

    @Column(name = "NIVEL")
    private Integer nivel;

    public Usuario() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @JsonIgnore
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}
