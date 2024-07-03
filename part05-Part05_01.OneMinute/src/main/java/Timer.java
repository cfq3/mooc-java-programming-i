public class Timer {
    private ClockHand hund;
    private ClockHand sec;

    public Timer() {
        this.hund = new ClockHand(100);
        this.sec = new ClockHand(60);
    }

    public void advance() {
        this.hund.advance();

        if (this.hund.value() == 0) {
            this.sec.advance();
        }
    }

    public String toString() {
        return this.sec + ":" + this.hund;
    }
}