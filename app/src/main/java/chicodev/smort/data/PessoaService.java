package chicodev.smort.data;

import java.util.List;

import chicodev.smort.entities.Erro;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by txring on 03/05/2018.
 */
public interface PessoaService {

    @POST("cadastrar")
    Call<Erro> cadastrar(@Field("idPessoa") String idPessoa,
                         @Field("email") String email,
                         @Field("senha") String senha,
                         @Field("nome") String nome,
                         @Field("cpf") int cpf);
}