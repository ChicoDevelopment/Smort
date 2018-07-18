package chicodev.smort.core;

import chicodev.smort.core.service.DemandaService;
import chicodev.smort.core.service.MarcaService;
import chicodev.smort.core.service.TipoVeiculoService;
import chicodev.smort.core.service.TransportadorService;
import chicodev.smort.core.service.UsuarioService;
import chicodev.smort.core.service.VeiculoService;

public class Services {

    private RetrofitConfig retrofitConfig;

    public Services(){
        this.retrofitConfig = new RetrofitConfig();
    }
    
    public VeiculoService getVeiculoService() {
        return retrofitConfig.config().create(VeiculoService.class);
    }

    public UsuarioService getPesoaService(){
        return retrofitConfig.config().create(UsuarioService.class);
    }

    public TransportadorService getTransportadorService(){
        return retrofitConfig.config().create(TransportadorService.class);
    }

    public TipoVeiculoService getTipoVeiculoService(){
        return retrofitConfig.config().create(TipoVeiculoService.class);
    }

    public MarcaService getMarcaService(){
        return retrofitConfig.config().create(MarcaService.class);
    }

    public DemandaService getDemandaService(){
        return retrofitConfig.config().create(DemandaService.class);
    }
}