package chicodev.smort.core;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by txring on 30/04/2018.
 */
public class RetrofitConfig {

    public Retrofit config() {
        return new Retrofit.Builder()
                .baseUrl("http://192.168.43.199/SmortAPI/public/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
}