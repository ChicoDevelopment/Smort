package chicodev.smort.core.service;

import java.util.List;

import chicodev.smort.model.TipoVeiculo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TipoVeiculoService {

    @GET("tipoveiculo/getlista")
    Call<List<TipoVeiculo>> getlista();

}
