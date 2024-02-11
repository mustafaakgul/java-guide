package Test03_OOP;

public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;

    public Bicycle() {

    }

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public double computePayment(
        double loanAmt,
        double rate,
        double futureValue,
        int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest), - numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
        return answer;
    }
    /*public Polygon polygonFrom(Point... corners) {
        int numberOfSides = corners.length;
        double squareOfSide1, lengthOfSide1;
        squareOfSide1 = (corners[1].x - corners[0].x)
                * (corners[1].x - corners[0].x)
                + (corners[1].y - corners[0].y)
                * (corners[1].y - corners[0].y);
        lengthOfSide1 = Math.sqrt(squareOfSide1);

        // more method body code follows that creates and returns a
        // polygon connecting the Points
    }*/


}
