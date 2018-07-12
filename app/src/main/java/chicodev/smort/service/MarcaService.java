package chicodev.smort.service;

import java.util.List;

import chicodev.smort.model.Marca;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by txring on 22/06/2018.
 */
public interface MarcaService {

    @GET("marca/getlista")
    Call<List<Marca>> getlista();

}
