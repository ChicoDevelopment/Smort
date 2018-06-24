package chicodev.smort.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import chicodev.smort.R;
import chicodev.smort.contract.CadastroVeiculoContract;
import chicodev.smort.model.Erro;
import chicodev.smort.model.Marca;
import chicodev.smort.model.TipoVeiculo;
import chicodev.smort.model.Transportador;
import chicodev.smort.model.Veiculo;
import chicodev.smort.presenter.CadastroVeiculoPresenter;

public class CadastroVeiculo extends AppCompatActivity implements CadastroVeiculoContract {

    private CadastroVeiculoPresenter presenter;

    private List<Marca> listaMarca;
    private List<TipoVeiculo> listaTipo;
    private EditText txtPlaca;
    private EditText txtModelo;
    private EditText txtCor;
    private Button salvar;
    private AutoCompleteTextView txtMarca;
    private AutoCompleteTextView txtTipo;
    private ArrayAdapter<Marca> marcaArrayAdapter;
    private ArrayAdapter<TipoVeiculo> tipoArrayAdapter;
    private Veiculo veiculo;
    private Erro erro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_veiculo);
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter = new CadastroVeiculoPresenter(this);
        presenter.getListaMarca();
        presenter.getListaTipo();

        txtPlaca = findViewById(R.id.txtPlaca);
        txtMarca = findViewById(R.id.txtMarca);
        txtTipo = findViewById(R.id.txtTipoVeiculo);
        txtModelo = findViewById(R.id.txtModelo);
        txtCor = findViewById(R.id.txtCor);
        salvar = findViewById(R.id.btnSalvar);

        veiculo = new Veiculo();

        txtMarca.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                veiculo.setMarca(listaMarca.get(position));
            }
        });

        txtTipo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(listaTipo.get(position));
                veiculo.setTipo(listaTipo.get(position));
            }
        });

        txtMarca.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(listaMarca.get(position));
                veiculo.setMarca(listaMarca.get(position));
            }
        });

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veiculo.setCor(txtCor.getText().toString());
                veiculo.setModelo(txtModelo.getText().toString());
                veiculo.setPlaca(txtPlaca.getText().toString());

                Transportador t = new Transportador();
                t.setIdTransportador(1);
                veiculo.setTransportador(t);

                presenter.cadastrarVeiculo(veiculo);

            }
        });
    }


    @Override
    public void cadastrarVeiculo(Erro erro) {

        this.erro = erro;
        System.out.println(erro.getMensagem());
        Toast.makeText(this, erro.getMensagem(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void getListaMarca(List<Marca> marcas) {

        this.listaMarca = marcas;
        marcaArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaMarca);
        txtMarca.setAdapter(marcaArrayAdapter);

    }

    @Override
    public void getListaTipo(List<TipoVeiculo> tipos) {

        this.listaTipo = tipos;
        tipoArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaTipo);
        txtTipo.setAdapter(tipoArrayAdapter);

    }
}