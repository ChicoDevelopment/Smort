package chicodev.smort.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONObject;

import chicodev.smort.R;
import chicodev.smort.core.RetrofitConfig;
import chicodev.smort.entities.Erro;
import chicodev.smort.entities.Veiculo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroVeiculo extends AppCompatActivity {

    Veiculo veiculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_veiculo);
        veiculo = (Veiculo) getIntent().getSerializableExtra("veiculo");
    }

    @Override
    protected void onResume() {
        super.onResume();

        final EditText txtPlaca = findViewById(R.id.txtPlaca);
        final EditText txtMarca = findViewById(R.id.txtMarca);
        final EditText txtModelo = findViewById(R.id.txtModelo);
        final EditText txtCor = findViewById(R.id.txtCor);
        final Button btnSalvar = findViewById(R.id.btnSalvar);

        if (veiculo == null){
            veiculo = new Veiculo();
        }else{
            txtPlaca.setText(veiculo.getPlaca());
            txtMarca.setText(veiculo.getMarca());
            txtModelo.setText(veiculo.getModelo());
            txtCor.setText(veiculo.getCor());
        }

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veiculo.setMarca(txtMarca.getText().toString());
                veiculo.setModelo(txtModelo.getText().toString());
                veiculo.setPlaca(txtPlaca.getText().toString());
                veiculo.setCor(txtCor.getText().toString());

                ObjectMapper mp = new ObjectMapper();

                JSONObject js = new JSONObject();

                try {
                    System.out.println(mp.writeValueAsString(veiculo));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }

                Call<Erro> callAlterar = new RetrofitConfig().getVeiculoService().alteraveiculo(veiculo);

                callAlterar.enqueue(new Callback<Erro>() {
                    @Override
                    public void onResponse(Call<Erro> call, Response<Erro> response) {
                        System.out.println(response.message().toString());
                        System.out.println(response.body().toString());
                        if (response.isSuccessful()) {
                            if (response.body().isErro()) {
                                Toast.makeText(getApplicationContext(), "Alterado com sucesso", Toast.LENGTH_LONG).show();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Erro> call, Throwable t) {
                        System.out.println();
                        t.printStackTrace();
                        System.out.println(t.getMessage());
                    }
                });
            }
        });
    }
}