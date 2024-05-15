public class DailyData {
    //stack'e eklenecek her bir veri grubu (node)
    private String date;
    private int pulse;
    private int bloodPressure;
    private int sleepDuration;
    private int activityLevel;
    public DailyData previousData;

    public DailyData(String date, int pulse, int bloodPressure, int sleepDuration, int activityLevel, Stack history) {
        this.date = date;
        this.pulse = pulse;
        this.bloodPressure = bloodPressure;
        this.sleepDuration = sleepDuration;
        this.activityLevel = activityLevel;
    }
}
