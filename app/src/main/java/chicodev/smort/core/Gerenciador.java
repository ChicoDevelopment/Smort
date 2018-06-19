package chicodev.smort.core;

import android.content.Context;

/**
 * Created by txring on 01/05/2018.
 */

/**
 * Created by txring on 07/03/2018.
 */

public class Gerenciador {
    private static Gerenciador instancia = null;
    private static Context contexto = null;

    //Construtor
    private Gerenciador(Context contexto) {
        this.contexto = contexto;
    }

    //Setar instância
    public static synchronized Gerenciador setInstance(Context context) {
        if (null == instancia)
            instancia = new Gerenciador(context);
        return instancia;
    }

    //Captar instância
    public static synchronized Gerenciador getInstancia() {
        if (null == instancia) {
            throw new IllegalStateException(Gerenciador.class.getSimpleName() +
                    " is not initialized, call getInstancia(...) first");
        }
        return instancia;
    }

    //Captar contexto
    public static synchronized Context getContexto() {
        if (null == contexto) {
            throw new IllegalStateException(Gerenciador.class.getSimpleName() +
                    " is not initialized, call getContexto(...) first");
        }
        return contexto;
    }
}