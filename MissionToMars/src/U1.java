import java.util.ArrayList;

public class U1 extends Rocket {
    U1() {
        initialRocketWeight = 10000;
        rocketCost = 100;
        rocketWeight = initialRocketWeight;
        maxWeight = 18000;
        launchRisk = 0.05;
        landRisk = 0.01;
       // cargo = new ArrayList<Item>();
    }
}
