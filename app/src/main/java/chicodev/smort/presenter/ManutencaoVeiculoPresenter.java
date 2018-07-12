package chicodev.smort.presenter;

import chicodev.smort.core.RetrofitConfig;
import chicodev.smort.model.Erro;
import chicodev.smort.model.Veiculo;
import chicodev.smort.service.VeiculoService;
import chicodev.smort.view.ManutencaoVeiculo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by txring on 24/06/2018.
 */
public class ManutencaoVeiculoPresenter {

    private ManutencaoVeiculo manutencaoVeiculo;
    private VeiculoService veiculoService;

    public ManutencaoVeiculoPresenter(ManutencaoVeiculo manutencaoVeiculo) {
        this.manutencaoVeiculo = manutencaoVeiculo;
    }

    public void getVeiculo(Veiculo veiculo) {
        veiculoService = new RetrofitConfig().getVeiculoService();

        Call<Veiculo> callVeiculo = veiculoService.pesquisaveiculo(veiculo);
        callVeiculo.enqueue(new Callback<Veiculo>() {
            @Override
            public void onResponse(Call<Veiculo> call, Response<Veiculo> response) {

                if (response != null) {
                    if (response.isSuccessful()) {
                        manutencaoVeiculo.veiculoPreparado(response.body());
                    }
                } else {
                    manutencaoVeiculo.veiculoErrado();
                }
            }

            @Override
            public void onFailure(Call<Veiculo> call, Throwable t) {
                t.printStackTrace();
                System.out.println(t.getMessage());
                manutencaoVeiculo.veiculoErrado();
            }
        });
    }

    public void excluirVeiculo(Veiculo veiculo) {
        Call<Erro> callExcluir = new RetrofitConfig().getVeiculoService().excluiveiculo(veiculo);
        callExcluir.enqueue(new Callback<Erro>() {
            @Override
            public void onResponse(Call<Erro> call, Response<Erro> response) {
                if (response.isSuccessful()) {
                    manutencaoVeiculo.excluirVeiculo(response.body());
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
