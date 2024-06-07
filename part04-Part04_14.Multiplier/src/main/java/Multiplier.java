public class Multiplier {
    private int number; 

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        int answer = 0;
        answer = this.number * number;
        return answer;
    }
}