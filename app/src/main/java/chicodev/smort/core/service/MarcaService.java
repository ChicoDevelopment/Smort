package chicodev.smort.core.service;

import java.util.List;

import chicodev.smort.model.Marca;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MarcaService {

    @GET("marca/getlista")
    Call<List<Marca>> getlista();

}
