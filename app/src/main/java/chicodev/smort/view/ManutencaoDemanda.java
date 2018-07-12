package chicodev.smort.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chicodev.smort.R;
import chicodev.smort.contract.ManutencaoDemandaContract;
import chicodev.smort.model.Demanda;
import chicodev.smort.model.Erro;

public class ManutencaoDemanda extends AppCompatActivity implements ManutencaoDemandaContract {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manutencao_demanda);
    }

    @Override
    public void excluirDemanda(Erro erro) {

    }

    @Override
    public void demandaPreparada(Demanda demanda) {

    }

    @Override
    public void demandaErrada() {

    }
}
