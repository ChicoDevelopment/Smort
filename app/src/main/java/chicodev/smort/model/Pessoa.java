package chicodev.smort.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by txring on 03/05/2018.
 */
public class Pessoa {

    @JsonProperty (value = "email")
    private String email;

    @JsonProperty (value = "senha")
    private String senha;

    @JsonProperty (value = "nome")
    private String nome;

    @JsonProperty (value = "cpf")
    private int cpf;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
