package chicodev.smort.presenter;

import chicodev.smort.core.Services;
import chicodev.smort.model.Demanda;
import chicodev.smort.model.Erro;
import chicodev.smort.view.ManutencaoDemanda;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by txring on 27/06/2018.
 */
public class ManutencaoDemandaPresenter {

    private ManutencaoDemanda manutencaoDemanda;

    public ManutencaoDemandaPresenter(ManutencaoDemanda manutencaoDemanda){
        this.manutencaoDemanda = manutencaoDemanda;
    }

    public void getDemanda(Demanda demanda){
        Call<Demanda> callDemanda = new Services().getDemandaService().pesquisar(demanda);
        callDemanda.enqueue(new Callback<Demanda>() {
            @Override
            public void onResponse(Call<Demanda> call, Response<Demanda> response) {
                if (response != null) {
                    if (response.isSuccessful()) {
                        manutencaoDemanda.demandaPreparada(response.body());
                    }
                } else {
                    manutencaoDemanda.demandaErrada();
                }

            }

            @Override
            public void onFailure(Call<Demanda> call, Throwable t) {

            }
        });
    }

    public void excluirDemanda(Demanda demanda){
        Call<Erro> excluir = new Services().getDemandaService().excluir(demanda);
        excluir.enqueue(new Callback<Erro>() {
            @Override
            public void onResponse(Call<Erro> call, Response<Erro> response) {
                if (response.isSuccessful()){
                    manutencaoDemanda.excluirDemanda(response.body());
                }
            }

            @Override
            public void onFailure(Call<Erro> call, Throwable t) {

            }
        });
    }
}
