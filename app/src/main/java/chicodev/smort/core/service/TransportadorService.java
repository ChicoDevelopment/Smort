package chicodev.smort.core.service;

import chicodev.smort.model.Erro;

import chicodev.smort.model.Transportador;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TransportadorService {

    @POST("transportador/cadastrar")
    Call<Erro> cadastrar(@Body Transportador transportador);

    @POST("transportador/alterar")
    Call<Erro> alterar (@Body Transportador transportador);

    @POST("transportador/excluir")
    Call<Erro> excluir (@Body Transportador transportador);

}
