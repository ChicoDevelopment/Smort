package chicodev.smort.data;

import java.util.List;

import chicodev.smort.entities.Erro;
import chicodev.smort.entities.Pessoa;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by txring on 03/05/2018.
 */
public interface UsuarioService {

    @POST("usuario/cadastrar")
    Call<Erro> cadastrar(@Body Pessoa pessoa);

    @POST("usuario/alterar")
    Call<Erro> alterar (@Body Pessoa pessoa);

    @POST("usuario/excluir")
    Call<Erro> excluir (@Body Pessoa pessoa);

    @GET("usuario/pesquisar")
    Call<Pessoa> pesquisar (@Field("idPessoa") String idpessoa);
}