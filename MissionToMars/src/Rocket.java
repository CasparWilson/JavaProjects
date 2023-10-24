import java.util.ArrayList;

public class Rocket implements  SpaceShip {

    //Rocket variables
    int rocketCost;
    int initialRocketWeight;
    int maxWeight;
    double launchRisk;
    double landRisk;
    int rocketWeight;
    //ArrayList<Item> cargo;

    //method that determines whether a rocket crashes given some risk

    public boolean crash(double risk) {
        if (//((this.rocketWeight - initialRocketWeight) == 0) ||
        (Math.random() > (risk * (((double)(this.rocketWeight - initialRocketWeight)) / (double)(maxWeight - initialRocketWeight))))){
            return true;
        } else {
            return false;
        }
    }

    //method to determine whether a rocket can carry some item

    public boolean canCarry(Item item) {
        boolean isSpace = false;
        if ((this.rocketWeight + item.weight) <= this.maxWeight) {
            isSpace = true;
        }
            return isSpace;
        }

    //method which updates

    public void carry(Item item) {
        this.rocketWeight = this.rocketWeight + item.weight;
    }
}