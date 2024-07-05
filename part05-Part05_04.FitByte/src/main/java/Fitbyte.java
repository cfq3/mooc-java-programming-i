public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double answer;
        double maxHeartRate = 0;
        maxHeartRate = 206.3 - (0.711 * age);
        answer = (maxHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
        return answer;
    }
}