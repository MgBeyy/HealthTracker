public class User {
    private String username;
    private String fullname;
    private String hashedPassword;
    private int weight;
    private int height;
    private int age;
    private HealthData healthData;
    public User next;

    public User(String username, String fullname, String password, int weight, int height, int age) {
        this.username = username;
        this.fullname = fullname;
        this.hashedPassword = password;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.healthData = new HealthData();
        this.next = null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HealthData getHealthData() {
        return healthData;
    }

    public void setHealthData(HealthData healthData) {
        this.healthData = healthData;
    }
}