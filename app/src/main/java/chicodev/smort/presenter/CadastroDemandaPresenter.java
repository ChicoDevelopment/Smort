package chicodev.smort.presenter;

import chicodev.smort.core.Services;
import chicodev.smort.model.Demanda;
import chicodev.smort.model.Erro;
import chicodev.smort.view.CadastroDemanda;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by txring on 27/06/2018.
 */
public class CadastroDemandaPresenter {

    private CadastroDemanda cadastroDemanda;

    public CadastroDemandaPresenter(CadastroDemanda cadastroDemanda) {
        this.cadastroDemanda = cadastroDemanda;
    }

    public void cadastrarDemanda(Demanda demanda) {
        Call<Erro> cadastrar = new Services().getDemandaService().cadastrar(demanda);
        cadastrar.enqueue(new Callback<Erro>() {
            @Override
            public void onResponse(Call<Erro> call, Response<Erro> response) {
                if (response.isSuccessful()) {
                    cadastroDemanda.cadastrarDemanda(response.body());
                }
            }

            @Override
            public void onFailure(Call<Erro> call, Throwable t) {
                t.printStackTrace();
                System.out.println(t.getMessage());
            }
        });
    }

    public void alterarDemanda(Demanda demanda){
        Call<Erro> alterar = new Services().getDemandaService().alterar(demanda);
        alterar.enqueue(new Callback<Erro>() {
            @Override
            public void onResponse(Call<Erro> call, Response<Erro> response) {
                if (response.isSuccessful()){
                    cadastroDemanda.alterarDemanda(response.body());
                }
            }

            @Override
            public void onFailure(Call<Erro> call, Throwable t) {
                t.printStackTrace();
                System.out.println(t.getMessage());
            }
        });
    }
}
