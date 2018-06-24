package chicodev.smort.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import chicodev.smort.R;
import chicodev.smort.core.Gerenciador;
import chicodev.smort.core.RetrofitConfig;
import chicodev.smort.model.Erro;
import chicodev.smort.model.Transportador;
import chicodev.smort.model.Veiculo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ManutencaoVeiculo extends AppCompatActivity {

    Veiculo veiculo;
    Transportador transportador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manutencao_veiculo);
        Gerenciador.setInstance(this);
    }

    @Override
    protected void onResume() {

        super.onResume();

        final TextView txtPlaca = findViewById(R.id.txtPlaca);
        final TextView txtMarca = findViewById(R.id.txtMarca);
        final TextView txtModelo = findViewById(R.id.txtModelo);
        final TextView txtCor = findViewById(R.id.txtCor);
        final EditText placa = findViewById(R.id.etPlaca);
        final Button btnBusca = findViewById(R.id.btnPesquisar);
        final Button btnAlterar = findViewById(R.id.btnAlterar);
        final Button btnExcluir = findViewById(R.id.btnExcluir);
        final Button btnNovo = findViewById(R.id.btnNovo);

        btnBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transportador.setIdTransportador(Integer.parseInt(placa.getText().toString()));
                veiculo.setTransportador(transportador);
                Call<Veiculo> callBusca = new RetrofitConfig().getVeiculoService().pesquisaveiculo(veiculo);
                callBusca.enqueue(new Callback<Veiculo>() {
                    @Override
                    public void onResponse(Call<Veiculo> call, Response<Veiculo> response) {

                        if (response.isSuccessful()) {
                            veiculo = response.body();
                            System.out.println(veiculo.getIdVeiculo());
                            txtPlaca.setText(veiculo.getPlaca());
                            txtMarca.setText(veiculo.getMarca().getDescricao());
                            txtModelo.setText(veiculo.getModelo());
                            txtCor.setText(veiculo.getCor());

                            btnAlterar.setVisibility(View.VISIBLE);
                            btnExcluir.setVisibility(View.VISIBLE);
                        } else {
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
                    public void onFailure(Call<Veiculo> call, Throwable t) {
                        Log.e("CEPService   ", "Erro ao buscar a lista de veículos: " + t.getMessage());
                        t.printStackTrace();
                        System.out.append(t.toString());

                    }
                });
            }
        });

        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<Erro> callExcluir = new RetrofitConfig().getVeiculoService().excluiveiculo(veiculo);
                callExcluir.enqueue(new Callback<Erro>() {
                    @Override
                    public void onResponse(Call<Erro> call, Response<Erro> response) {
                        System.out.println(response);

                        if (response.isSuccessful()) {
                            if (response.body().isErro()) {
                                Toast.makeText(getApplicationContext(), response.body().getMensagem(), Toast.LENGTH_LONG).show();
                                txtPlaca.setVisibility(View.INVISIBLE);
                                txtMarca.setVisibility(View.INVISIBLE);
                                txtModelo.setVisibility(View.INVISIBLE);
                                txtCor.setVisibility(View.INVISIBLE);
                                btnAlterar.setVisibility(View.INVISIBLE);
                                btnExcluir.setVisibility(View.INVISIBLE);
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Erro> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
            }
        });

        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
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
                Intent it = new Intent(ManutencaoVeiculo.this, CadastroVeiculo.class);
                startActivity(it);
                finish();
            }
        });
    }

    private void setVeiculo(){

    }
}

