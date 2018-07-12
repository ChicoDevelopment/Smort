package chicodev.smort.contract;

import chicodev.smort.model.Erro;
import chicodev.smort.model.Veiculo;

/**
 * Created by txring on 24/06/2018.
 */
public interface ManutencaoVeiculoContract {

    void excluirVeiculo(Erro erro);

    void veiculoPreparado(Veiculo veiculo);

    void veiculoErrado();

}
