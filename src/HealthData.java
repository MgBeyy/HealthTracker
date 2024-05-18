public class HealthData {

    private Stack history;

    public HealthData() {
        this.history = new Stack();
    }

    public void displayData(String date) {
        DailyData data = history.search(date);
        if (data != null) {
            System.out.println("Nabız: " + data.getPulse() + ", Kan Basıncı: " + data.getBloodPressure() +
                    ", Uyku Süresi: " + data.getSleepDuration() + ", Aktivite Seviyesi: " + data.getActivityLevel());
        } else {
            System.out.println("Veri bulunamadı.");
        }
    }

    public void add(String date, int pulse, int bloodPressure, int sleepDuration,
                    int activityLevel) {
        DailyData newData = new DailyData(date, pulse, bloodPressure,
                sleepDuration, activityLevel);
        history.push(newData);
    }
}
