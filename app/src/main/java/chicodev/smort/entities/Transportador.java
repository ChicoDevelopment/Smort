package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    @Override
    public String toString() {
        return "Transportador{" +
                "idTransportador=" + idTransportador +
                ", cnh=" + cnh +
                ", reputacao=" + reputacao +
                '}';
    }
}
