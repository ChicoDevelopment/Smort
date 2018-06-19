package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by txring on 19/06/2018.
 */
public class FormaPagamento {

    @JsonProperty (value = "idForma")
    private int idForma;

    @JsonProperty (value = "descricao")
    private String descricao;

    public int getIdForma() {
        return idForma;
    }

    public void setIdForma(int idForma) {
        this.idForma = idForma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "idForma=" + idForma +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
