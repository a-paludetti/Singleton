package singleton;

import java.security.Timestamp;
import java.time.Instant;


public class UserPreferences {

    public static String user = "";
    public static String password = "";
    public static Instant lastAccess;
    public static String profile ="";
    
    public static void UserPreferences(){
        System.out.println("Usuário: "+user);
        System.out.println("Senha: "+password);
        System.out.println("Último Acesso: "+lastAccess);
        System.out.println("Perfil: "+profile);
    }
}
