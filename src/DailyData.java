public class DailyData {
    private String date;
    private int pulse;
    private int bloodPressure;
    private int sleepDuration;
    private int activityLevel;
    public DailyData previousData;

    public DailyData(String date, int pulse, int bloodPressure, int sleepDuration, int activityLevel) {
        this.date = date;
        this.pulse = pulse;
        this.bloodPressure = bloodPressure;
        this.sleepDuration = sleepDuration;
        this.activityLevel = activityLevel;
        this.previousData = null;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getSleepDuration() {
        return sleepDuration;
    }

    public void setSleepDuration(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }

    public int getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(int activityLevel) {
        this.activityLevel = activityLevel;
    }

    public DailyData getPreviousData() {
        return previousData;
    }


}
