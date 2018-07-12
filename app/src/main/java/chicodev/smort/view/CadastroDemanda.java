package chicodev.smort.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chicodev.smort.R;
import chicodev.smort.contract.CadastroDemandaContract;
import chicodev.smort.model.Erro;

public class CadastroDemanda extends AppCompatActivity implements CadastroDemandaContract{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_demanda);
    }

    @Override
    public void cadastrarDemanda(Erro erro) {

    }

    @Override
    public void alterarDemanda(Erro erro) {

    }
}
