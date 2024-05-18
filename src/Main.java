public class Main {
    public static void main(String[] args) {
        UserManagement userManager = new UserManagement();

        userManager.createUser("jdoe", "John Doe", "password1", 70, 175, 30);
        userManager.createUser("asmith", "Alice Smith", "password2", 65, 165, 28);

        System.out.println("---- Kullanıcı Girişi Testi ----");
        userManager.loginUser("jdoe", "password1");  // Başarılı giriş
        userManager.loginUser("asmith", "wrongpass"); // Başarısız giriş

        User john = userManager.users.search("jdoe");
        if (john != null) {
            HealthData johnHealthData = john.getHealthData();

            johnHealthData.add("2024-05-18", 70, 120, 8, 5);
            johnHealthData.add("2024-05-19", 72, 118, 7, 6);

            System.out.println("---- Sağlık Verileri ----");
            johnHealthData.displayData("2024-05-18");
            johnHealthData.displayData("2024-05-19");
            johnHealthData.displayData("2024-05-20"); // Bulunamadı durumu
        }
    }
}
