package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by txring on 19/06/2018.
 */
public class TipoVeiculo {

    @JsonProperty (value = "idTipo")
    private int idTipo;

    @JsonProperty (value = "descricao")
    private String descricao;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoVeiculo{" +
                "idTipo=" + idTipo +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
