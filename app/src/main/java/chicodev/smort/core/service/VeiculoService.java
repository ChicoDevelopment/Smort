package chicodev.smort.core.service;

import chicodev.smort.model.Erro;
import chicodev.smort.model.Veiculo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface VeiculoService {

    @POST("veiculo/pesquisar")
    Call<Veiculo> pesquisaveiculo(@Body Veiculo veiculo);

    @POST("veiculo/excluir")
    Call<Erro> excluiveiculo (@Body Veiculo veiculo);

    @POST("veiculo/alterar")
    Call<Erro> alteraveiculo(@Body Veiculo veiculo);

    @POST("veiculo/inserir")
    Call<Erro> insereveiculo(@Body Veiculo veiculo);

}