public class User {
    //Kullanıcı bilgilerini tutan sınıf (user node)
    private String username;
    private String fullname;
    private HashMap password;
    private int weight;
    private int height;
    private int age;
    private HealthData healthData;

    public User(String username, String fullname, HashMap password, int weight, int height, int age) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.healthData = new HealthData();
    }

}