package chicodev.smort.core;

import chicodev.smort.service.DemandaService;
import chicodev.smort.service.MarcaService;
import chicodev.smort.service.TipoVeiculoService;
import chicodev.smort.service.TransportadorService;
import chicodev.smort.service.UsuarioService;
import chicodev.smort.service.VeiculoService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by txring on 30/04/2018.
 */
public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.107/SmortAPI/public/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public VeiculoService getVeiculoService() {
        return this.retrofit.create(VeiculoService.class);
    }

    public UsuarioService getPesoaService(){
        return this.retrofit.create(UsuarioService.class);
    }

    public TransportadorService getTransportadorService(){
        return this.retrofit.create(TransportadorService.class);
    }

    public TipoVeiculoService getTipoVeiculoService(){
        return this.retrofit.create(TipoVeiculoService.class);
    }

    public MarcaService getMarcaService(){
        return this.retrofit.create(MarcaService.class);
    }

    public DemandaService getDemandaService(){
        return this.retrofit.create(DemandaService.class);
    }

}