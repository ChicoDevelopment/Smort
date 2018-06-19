package chicodev.smort.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}