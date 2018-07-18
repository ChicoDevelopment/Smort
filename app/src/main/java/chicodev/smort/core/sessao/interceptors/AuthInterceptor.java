package chicodev.smort.core.sessao.interceptors;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by txring on 18/07/2018.
 */
public class AuthInterceptor implements Interceptor {

    private ApiService apiService;

    private Session session;


    public AuthorizationInterceptor(ApiService apiService, Session session) {

        this.apiService = apiService;

        this.session = session;

    }


    @Override

    public Response intercept(Interceptor.Chain chain) throws IOException {

        Response mainResponse = chain.proceed(chain.request());

        if (mainResponse.code() == 401 || mainResponse.code() == 403) {

            session.invalidate();

        }

        return mainResponse;

    }
}
