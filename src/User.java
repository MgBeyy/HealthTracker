public class User {
    //Kullanıcı bilgilerini tutan sınıf (user node)
    private String username;
    private String fullname;
    private HashMap password;
    private int weight;
    private int height;
    private int age;
    private HealthData healthData;
    User next;

    public User(String username, String fullname, HashMap password, int weight, int height, int age) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.healthData = new HealthData();
        this.next = null;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public HashMap getPassword() {
        return password;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}