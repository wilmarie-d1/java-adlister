import org.mindrot.jbcrypt.BCrypt;

public class HashTest {
    public static void main(String[] args) {

        //User Registration

        String password = "password123";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hash);
// Output: $2a$10$Xb8.QOh8AWXVA3M66vUBJOoRoWAXvMdYEZC20p0AM7/3dde/usU6m

        //login

        boolean passwordsMatch = BCrypt.checkpw("mypassword", hash);
        System.out.println(passwordsMatch); // false

    }
}

