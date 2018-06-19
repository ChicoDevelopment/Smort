package chicodev.smort.data;

import java.util.List;

import chicodev.smort.entities.Erro;
import chicodev.smort.entities.Veiculo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by txring on 30/04/2018.
 */
public interface VeiculoService {

    @GET("pesquisarveiculo/{placa}")
    Call<List<Veiculo>> pesquisaveiculo(@Path("placa") String placa);

    @GET("excluirveiculo/{placa}")
    Call<Erro> excluiveiculo (@Path("placa") String placa);

    @POST("alterarveiculo")
    Call<Erro> alteraveiculo(@Body Veiculo veiculo);

    @POST("inserirveiculo")
    @FormUrlEncoded
    Call<Erro> insereveiculo(@Body Veiculo veiculo);

}