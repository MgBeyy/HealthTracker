//Kullanıcı oluşturma ve giriş yapma gibi temel işlemleri yapan sınıf
//Her yeni kullanıcı user sınıfından bir node olarak linkdlistte tutulacak
//Her yeni kullanıcı şifresi bir hashmap olarak saklanack (sadece 8 karekter)
//Şifre max 8 karekter ve her karekterin ascii kodunun 8'e moduna göre bir indiste tutulacak.
//Çakışma olması halinde linner ilerlenecek
//Her giriştte önce username linkedlistte aranacak
//username bulunursa girdiği şifreden de hash map oluşturup kyıtlı olanla karşılaştırılacak

public class UserManagement {
    private LinkedList users; // Kullanıcıları LinkedList'te tutmak için

    public UserManagement() {
        this.users = new LinkedList();
    }

    // Yeni kullanıcı oluşturma işlemi
    public void createUser(String username, String fullname, String password,
                           int weight, int height, int age) {
        HashMap passwordMap = createPasswordMap(password);
        User newUser = new User(username, fullname, passwordMap, weight,
                height, age);
        users.add(newUser);
    }

    // Kullanıcı girişi işlemi
    public boolean loginUser(String username, String password) {
        User user = users.search(username);
        if(user != null){
            HashMap storedPassword = user.getPassword();
            HashMap enteredPasswordMap = createPasswordMap(password);
            if (comparePasswords(storedPassword, enteredPasswordMap)) {
                System.out.println("Giriş başarılı. Hoş geldiniz, " + user.getFullname() + "!");
                return true;
            } else {
                System.out.println("Hatalı şifre. Lütfen tekrar deneyin.");
                return false;
            }
        }else{
            System.out.println("Kullanıcı bulunamadı.");
            return false;
        }

            }



    // Şifreyi HashMap olarak oluşturma
    private HashMap createPasswordMap(String password) {
        HashMap passwordMap = new HashMap();
        for (char c : password.toCharArray()) {
            passwordMap.put(c);
        }
        return passwordMap;
    }

    // İki şifreyi karşılaştırma
    private boolean comparePasswords(HashMap password1, HashMap password2) {


        return true;
    }
}
