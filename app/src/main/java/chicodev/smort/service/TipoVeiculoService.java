package chicodev.smort.service;

import java.util.List;

import chicodev.smort.model.TipoVeiculo;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by txring on 22/06/2018.
 */
public interface TipoVeiculoService {

    @GET("tipoveiculo/getlista")
    Call<List<TipoVeiculo>> getlista();

}
