package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by txring on 19/06/2018.
 */
public class Marca {

    @JsonProperty (value = "idMarca")
    private int idMarca;

    @JsonProperty (value = "descricao")
    private String descricao;

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "idMarca=" + idMarca +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
