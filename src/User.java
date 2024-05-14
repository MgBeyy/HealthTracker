public class User {
    //Kullanıcı oluşturma ve giriş yapma gibi temel işlemleri yapan sınıf
    //Her yeni kullanıcı bir node olarak linkdlistte tutulacak
    //Her yeni kullanıcı şifresi bir hashmap olarak saklanack (sadece 8 karekter)
    //Şifre max 8 karekter ve her karekterin ascii kodunun 8'e moduna göre bir indiste tutulacak.
    //Çakışma olması halinde linner ilerlenecek
    //Her giriştte önce username linkedlistte aranacak
    //username bulunursa girdiği şifreden de hash map oluşturup kyıtlı olanla karşılaştırılacak

    private String username;
    private String fullname;
    private String password;
    private int weight;
    private int height;
    private int age;
    private HealthData healthData;

    public void newUser(String username, String fullname, String password, int weight, int height, int age) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.healthData = new HealthData();


    }

    public boolean login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            System.out.println("Giriş başarılı!");
            return true;
        } else {
            System.out.println("Hatalı şifre! Tekrar deneyin.");
            return false;
        }
    }

    public void viewHealthData() {
        healthData.displayData("");
    }
}