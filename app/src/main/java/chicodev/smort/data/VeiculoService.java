package chicodev.smort.data;

import java.util.List;

import chicodev.smort.entities.Erro;
import chicodev.smort.entities.Veiculo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by txring on 30/04/2018.
 */
public interface VeiculoService {

    @GET("veiculo/pesquisar")
    Call<List<Veiculo>> pesquisaveiculo(@Field("placa") String placa);

    @GET("veiculo/excluir")
    Call<Erro> excluiveiculo (@Body Veiculo veiculo);

    @POST("veiculo/alterar")
    Call<Erro> alteraveiculo(@Body Veiculo veiculo);

    @POST("veiculo/inserir")
    Call<Erro> insereveiculo(@Body Veiculo veiculo);

}