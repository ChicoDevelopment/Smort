package chicodev.smort.core.sessao;

/**
 * Created by txring on 18/07/2018.
 */
public interface SessaoInterface {

    boolean isLoggedIn();

    void saveToken(String token);

    String getToken();

    void saveEmail(String email);

    String getEmail();

    void savePassword(String password);

    String getPassword();

    void invalidate();

}
