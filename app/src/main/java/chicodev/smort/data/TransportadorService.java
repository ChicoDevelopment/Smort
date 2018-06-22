package chicodev.smort.data;

import chicodev.smort.entities.Erro;

import chicodev.smort.entities.Transportador;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by txring on 22/06/2018.
 */
public interface TransportadorService {

    @POST("transportador/cadastrar")
    Call<Erro> cadastrar(@Body Transportador transportador);

    @POST("transportador/alterar")
    Call<Erro> alterar (@Body Transportador transportador);

    @POST("transportador/excluir")
    Call<Erro> excluir (@Body Transportador transportador);

}
