package chicodev.smort.core;

import chicodev.smort.data.UsuarioService;
import chicodev.smort.data.VeiculoService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by txring on 30/04/2018.
 */
public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.204.139/SmortServices/public/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public VeiculoService getVeiculoService() {
        return this.retrofit.create(VeiculoService.class);
    }

    public UsuarioService getPesoaService(){
        return this.retrofit.create(UsuarioService.class);
    }

}