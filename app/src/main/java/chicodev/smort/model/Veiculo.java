package chicodev.smort.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by txring on 21/02/2018.
 */

public class Veiculo implements Serializable{

    @JsonProperty(value = "veiculos")
    private List<Veiculo> listaVeiculo;

    @JsonProperty(value = "idveiculo")
    private int idVeiculo;

    @JsonProperty (value = "marca")
    private Marca marca;

    @JsonProperty(value = "modelo")
    private String modelo;

    @JsonProperty(value = "cor")
    private String cor;

    @JsonProperty(value = "placa")
    private String placa;

    @JsonProperty (value = "tipo")
    private TipoVeiculo tipo;

    @JsonProperty (value = "transportador")
    private Transportador transportador;

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Veiculo> getListaVeiculo() {
        return listaVeiculo;
    }

    public void setListaVeiculo(List<Veiculo> listaVeiculo) {
        this.listaVeiculo = listaVeiculo;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Transportador getTransportador() {
        return transportador;
    }

    public void setTransportador(Transportador transportador) {
        this.transportador = transportador;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "listaVeiculo=" + listaVeiculo +
                ", idVeiculo=" + idVeiculo +
                ", marca=" + marca +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", tipo=" + tipo +
                ", transportador=" + transportador +
                '}';
    }
}