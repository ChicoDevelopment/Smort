package chicodev.smort.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import chicodev.smort.R;
import chicodev.smort.contract.ManutencaoVeiculoContract;
import chicodev.smort.model.Erro;
import chicodev.smort.model.Veiculo;
import chicodev.smort.presenter.ManutencaoVeiculoPresenter;

public class ManutencaoVeiculo extends AppCompatActivity implements ManutencaoVeiculoContract {

    private ManutencaoVeiculoPresenter presenter;
    private TextView txtPlaca;
    private TextView txtMarca;
    private TextView txtModelo;
    private TextView txtCor;
    private EditText placa;
    private Button btnBusca;
    private Button btnAlterar;
    private Button btnExcluir;
    private Button btnNovo;
    private Veiculo veiculo;
    private Erro erro;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manutencao_veiculo);
    }

    @Override
    protected void onResume() {
        super.onResume();
        inicializaComponentes();

        btnBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veiculo = new Veiculo();
                veiculo.setPlaca(placa.getText().toString());

                presenter.getVeiculo(veiculo);
            }
        });

        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.excluirVeiculo(veiculo);
            }
        });

        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putBoolean("novo", false);
                bundle.putSerializable("veiculo", veiculo);
                Intent it = new Intent(ManutencaoVeiculo.this, CadastroVeiculo.class);
                it.putExtras(bundle);
                startActivity(it);
                finish();

            }
        });

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putBoolean("novo", true);
                Intent it = new Intent(ManutencaoVeiculo.this, CadastroVeiculo.class);
                it.putExtras(bundle);
                startActivity(it);
                finish();
            }
        });
    }

    private void inicializaComponentes() {
        presenter = new ManutencaoVeiculoPresenter(this);
        txtPlaca = findViewById(R.id.txtPlaca);
        txtMarca = findViewById(R.id.txtMarca);
        txtModelo = findViewById(R.id.txtModelo);
        txtCor = findViewById(R.id.txtCor);
        placa = findViewById(R.id.etPlaca);
        btnBusca = findViewById(R.id.btnPesquisar);
        btnAlterar = findViewById(R.id.btnAlterar);
        btnExcluir = findViewById(R.id.btnExcluir);
        btnNovo = findViewById(R.id.btnNovo);
        veiculo = new Veiculo();
        erro = new Erro();
        bundle = new Bundle();
    }

    private void setCampos(boolean erro) {
        if (erro) {
            txtPlaca.setText(veiculo.getPlaca());
            txtMarca.setText(veiculo.getMarca().getDescricao());
            txtModelo.setText(veiculo.getModelo());
            txtCor.setText(veiculo.getCor());

            btnAlterar.setVisibility(View.VISIBLE);
            btnExcluir.setVisibility(View.VISIBLE);
        }else{
            Toast.makeText(getApplicationContext(), "Placa inválida!", Toast.LENGTH_SHORT).show();
            txtPlaca.setVisibility(View.INVISIBLE);
            txtMarca.setVisibility(View.INVISIBLE);
            txtModelo.setVisibility(View.INVISIBLE);
            txtCor.setVisibility(View.INVISIBLE);

            btnAlterar.setVisibility(View.INVISIBLE);
            btnExcluir.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void excluirVeiculo(Erro erro) {
        this.erro = erro;
        Toast.makeText(this, erro.getMensagem(), Toast.LENGTH_LONG).show();
        //setCampos(erro.isErro());
    }

    @Override
    public void veiculoPreparado(Veiculo v) {
        veiculo = v;
        setCampos(true);
    }

    @Override
    public void veiculoErrado() {
        setCampos(false);
    }
}