package chicodev.smort.contract;

import chicodev.smort.model.Demanda;
import chicodev.smort.model.Erro;

/**
 * Created by txring on 27/06/2018.
 */
public interface ManutencaoDemandaContract {

    void excluirDemanda(Erro erro);

    void demandaPreparada(Demanda demanda);

    void demandaErrada();

}
