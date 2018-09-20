
package singleton;

import java.time.Instant;

public class Singleton {


    public static void main(String[] args) {
        
        UserPreferences.user = "Aline";
        UserPreferences.password= "123";
        UserPreferences.lastAccess = Instant.now();
        UserPreferences.profile="ADM";
        
        UserPreferences.UserPreferences();
    }
    
}
