package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by txring on 19/06/2018.
 */
public class Demanda {

    @JsonProperty (value = "idDemanda")
    private int idDemanda;

    @JsonProperty (value = "estado")
    private String estado;

    @JsonProperty (value = "nota")
    private String nota;

    @JsonProperty (value = "comentario")
    private String comentario;

    @JsonProperty (value = "idUsuario")
    private int idUsuario;

    @JsonProperty (value = "idTransportador")
    private int idTransportador;

    public int getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(int idDemanda) {
        this.idDemanda = idDemanda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTransportador() {
        return idTransportador;
    }

    public void setIdTransportador(int idTransportador) {
        this.idTransportador = idTransportador;
    }

    @Override
    public String toString() {
        return "Demanda{" +
                "idDemanda=" + idDemanda +
                ", estado='" + estado + '\'' +
                ", nota='" + nota + '\'' +
                ", comentario='" + comentario + '\'' +
                ", idUsuario=" + idUsuario +
                ", idTransportador=" + idTransportador +
                '}';
    }
}
