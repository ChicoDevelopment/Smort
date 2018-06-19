package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by txring on 19/06/2018.
 */
public class Transportador extends Pessoa {

    @JsonProperty (value = "idTransportador")
    private int idTransportador;

    @JsonProperty (value = "cnh")
    private int cnh;

    @JsonProperty (value = "reputacao")
    private double reputacao;

    @JsonProperty (value = "pessoa")
    private Pessoa pessoa;

    private List<Veiculo> listaVeiculo;

    public int getIdTransportador() {
        return idTransportador;
    }

    public void setIdTransportador(int idTransportador) {
        this.idTransportador = idTransportador;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public double getReputacao() {
        return reputacao;
    }

    public void setReputacao(double reputacao) {
        this.reputacao = reputacao;
    }

    public List<Veiculo> getListaVeiculo() {
        return listaVeiculo;
    }

    public void setListaVeiculo(List<Veiculo> listaVeiculo) {
        this.listaVeiculo = listaVeiculo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Transportador{" +
                "idTransportador=" + idTransportador +
                ", cnh=" + cnh +
                ", reputacao=" + reputacao +
                ", pessoa=" + pessoa +
                ", listaVeiculo=" + listaVeiculo +
                '}';
    }
}
