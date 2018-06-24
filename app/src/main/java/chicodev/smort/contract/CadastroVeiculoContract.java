package chicodev.smort.contract;

import java.util.List;

import chicodev.smort.model.Erro;
import chicodev.smort.model.Marca;
import chicodev.smort.model.TipoVeiculo;

/**
 * Created by txring on 23/06/2018.
 */
public interface CadastroVeiculoContract {

    void cadastrarVeiculo(Erro erro);

    void getListaMarca (List<Marca> listaMarca);

    void getListaTipo (List<TipoVeiculo> listaTipo);

}
