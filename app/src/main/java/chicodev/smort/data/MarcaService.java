package chicodev.smort.data;

import java.util.List;

import chicodev.smort.entities.Marca;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by txring on 22/06/2018.
 */
public interface MarcaService {

    @GET("demanda/getlista")
    Call<List<Marca>> getlista();

}
