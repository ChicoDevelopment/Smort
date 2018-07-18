package chicodev.smort.core.service;

import chicodev.smort.model.Demanda;
import chicodev.smort.model.Erro;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DemandaService {

    @POST("demanda/pesquisar")
    Call<Demanda> pesquisar(@Body Demanda demanda);

    @POST("demanda/cadastrar")
    Call<Erro> cadastrar(@Body Demanda demanda);

    @POST("demanda/alterar")
    Call<Erro> alterar (@Body Demanda demanda);

    @POST("demanda/excluir")
    Call<Erro> excluir (@Body Demanda demanda);
}