package chicodev.smort.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

    @JsonProperty (value = "usuario")
    private Usuario usuario;

    @JsonProperty (value = "veiculo")
    private Veiculo veiculo;

    private List<Objeto> listaObjeto;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Objeto> getListaObjeto() {
        return listaObjeto;
    }

    public void setListaObjeto(List<Objeto> listaObjeto) {
        this.listaObjeto = listaObjeto;
    }

    @Override
    public String toString() {
        return "Demanda{" +
                "idDemanda=" + idDemanda +
                ", estado='" + estado + '\'' +
                ", nota='" + nota + '\'' +
                ", comentario='" + comentario + '\'' +
                ", usuario=" + usuario +
                ", veiculo=" + veiculo +
                ", listaObjeto=" + listaObjeto +
                '}';
    }
}
