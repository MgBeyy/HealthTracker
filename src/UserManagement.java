public class UserManagement {
    public LinkedList users;

    public UserManagement() {
        this.users = new LinkedList();
    }

    public void createUser(String username, String fullname, String password,
                           int weight, int height, int age) {
        System.out.println("bilgiler alındı");
        String passwordMap = createPasswordMap(password);
        System.out.println("şifre oluştu");
        User newUser = new User(username, fullname, passwordMap, weight,
                height, age);
        System.out.println("kullnıcı oluştu");
        users.add(newUser);
        System.out.println("eklendi");
    }

    public boolean loginUser(String username, String password) {
        User user = users.search(username);
        if (user != null) {
            String storedPassword = user.getHashedPassword();
            String enteredPasswordMap = createPasswordMap(password);
            if (comparePasswords(storedPassword, enteredPasswordMap)) {
                System.out.println("Giriş başarılı. Hoş geldiniz, " + user.getFullname() + "!");
                return true;
            } else {
                System.out.println("Hatalı şifre. Lütfen tekrar deneyin.");
                return false;
            }
        } else {
            System.out.println("Kullanıcı bulunamadı.");
            return false;
        }
    }

    private String createPasswordMap(String password) {
        System.out.println("şifre fonksiyonu başladı");
        HashMap passwordMap = new HashMap();
        for (char c : password.toCharArray()) {
            passwordMap.put(c);
            System.out.println(c + " harfi ekledni");
        }
        System.out.println("şifre hash edildi: " + passwordMap.getPasswordHash());
        return passwordMap.getPasswordHash();
    }

    private boolean comparePasswords(String password1, String password2) {
        return password1.equals(password2);
    }
}
