package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

/**
 * Created by txring on 19/06/2018.
 */

public class Usuario extends Pessoa {

    @JsonProperty (value = "idUsuario")
    private int idUsuario;

    @JsonProperty (value = "reputacao")
    private double reputacao;

    @JsonProperty (value = "foto")
    private byte[] foto;

    @JsonProperty (value = "pessoa")
    private Pessoa pessoa;

    @JsonProperty (value = "listaForma")
    private List<FormaPagamento> listaForma;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getReputacao() {
        return reputacao;
    }

    public void setReputacao(double reputacao) {
        this.reputacao = reputacao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public List<FormaPagamento> getListaForma() {
        return listaForma;
    }

    public void setListaForma(List<FormaPagamento> listaForma) {
        this.listaForma = listaForma;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", reputacao=" + reputacao +
                ", foto=" + Arrays.toString(foto) +
                ", pessoa=" + pessoa +
                ", listaForma=" + listaForma +
                '}';
    }
}