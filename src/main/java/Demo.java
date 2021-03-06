

//this is a demo for hashing password
import org.mindrot.jbcrypt.BCrypt;

public class Demo {
    public static void main(String[] args) {

        String password = "password123";

        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hash);
// Output: $2a$10$Xb8.QOh8AWXVA3M66vUBJOoRoWAXvMdYEZC20p0AM7/3dde/usU6m
        hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hash);
// Output: $2a$10$E6boHsNAQ6Iz3xEQCNtiLObPF8d2W6SPqh8ik1da4ASmqySgvghpK

        String password1 = "password123";
        String hash1 = BCrypt.hashpw(password1, BCrypt.gensalt());
        boolean passwordsMatch = BCrypt.checkpw("mypassword", hash1);
        System.out.println(passwordsMatch); // false
        passwordsMatch = BCrypt.checkpw("password123", hash);
        System.out.println(passwordsMatch); // true
    }

}
