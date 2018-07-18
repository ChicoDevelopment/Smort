package chicodev.smort.presenter;

import java.util.List;

import chicodev.smort.core.Services;
import chicodev.smort.model.Erro;
import chicodev.smort.model.Marca;
import chicodev.smort.model.TipoVeiculo;
import chicodev.smort.model.Veiculo;
import chicodev.smort.view.CadastroVeiculo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by txring on 23/06/2018.
 */
public class CadastroVeiculoPresenter {

    private CadastroVeiculo cadastroVeiculo;

    public CadastroVeiculoPresenter(CadastroVeiculo cadastroVeiculo) {
        this.cadastroVeiculo = cadastroVeiculo;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {

        Call<Erro> callCadastro = new Services().getVeiculoService().insereveiculo(veiculo);
        callCadastro.enqueue(new Callback<Erro>() {
            @Override
            public void onResponse(Call<Erro> call, Response<Erro> response) {

                if (response.isSuccessful()){
                    cadastroVeiculo.cadastrarVeiculo(response.body());
                }

            }

            @Override
            public void onFailure(Call<Erro> call, Throwable t) {

                t.printStackTrace();
                System.out.println(t.getMessage());

            }
        });

    }

    public void alterarVeiculo(Veiculo veiculo){

        Call<Erro> callAltera = new Services().getVeiculoService().alteraveiculo(veiculo);
        callAltera.enqueue(new Callback<Erro>() {
            @Override
            public void onResponse(Call<Erro> call, Response<Erro> response) {

                if (response.isSuccessful()){
                    cadastroVeiculo.alterarVeiculo(response.body());
                }
            }

            @Override
            public void onFailure(Call<Erro> call, Throwable t) {

                t.printStackTrace();
                System.out.println(t.getMessage());

            }
        });
    }

    public void getListaMarca(){
        Call<List<Marca>> callListaMarca = new Services().getMarcaService().getlista();
        callListaMarca.enqueue(new Callback<List<Marca>>() {
            @Override
            public void onResponse(Call<List<Marca>> call, Response<List<Marca>> response) {

                if (response.isSuccessful()){
                    cadastroVeiculo.getListaMarca(response.body());
                }

            }

            @Override
            public void onFailure(Call<List<Marca>> call, Throwable t) {

                t.printStackTrace();
                System.out.println(t.getMessage());

            }
        });
    }

    public void getListaTipo(){
        Call<List<TipoVeiculo>> callListaTipo = new Services().getTipoVeiculoService().getlista();
        callListaTipo.enqueue(new Callback<List<TipoVeiculo>>() {
            @Override
            public void onResponse(Call<List<TipoVeiculo>> call, Response<List<TipoVeiculo>> response) {

                if (response.isSuccessful()){
                    cadastroVeiculo.getListaTipo(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<TipoVeiculo>> call, Throwable t) {

                t.printStackTrace();
                System.out.println(t.getMessage());

            }
        });
    }
}