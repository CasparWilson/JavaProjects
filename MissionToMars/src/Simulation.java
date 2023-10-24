import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Simulation {
    Simulation() {
    }

    public ArrayList<Item> loadItems(String textFile) throws FileNotFoundException {
        File file = new File(textFile);
        Scanner scanner = new Scanner(file);
        ArrayList<Item> cargoArrayList = new ArrayList<>();
        while (scanner.hasNext()) {
            String[] orderedItem = scanner.nextLine().split("=");
            Item item = new Item();
            item.name = orderedItem[0];
            item.weight = Integer.parseInt(orderedItem[1]);
            cargoArrayList.add(item);
        }
        return cargoArrayList;
    }

    public ArrayList<Rocket> loadU1s(ArrayList<Item> cargoArrayList) {
        ArrayList<Rocket> u1ArrayList = new ArrayList<>();
        while (cargoArrayList.size() > 0) {
            U1 u1 = new U1();
            int i = 0;
            while (i < (cargoArrayList.size())) {
                if (u1.canCarry(cargoArrayList.get(i))) {
                    u1.carry(cargoArrayList.get(i));
                    // u1.cargo.add(cargoArrayList.get(i));
                    cargoArrayList.remove(cargoArrayList.get(i));
                } else {
                    i++;
                }
            }
            //System.out.println(u1.rocketWeight);
            u1ArrayList.add(u1);
        }
        return u1ArrayList;
    }

    public ArrayList<Rocket> loadU2s(ArrayList<Item> cargoArrayList) {
        ArrayList<Rocket> u2ArrayList = new ArrayList<>();
        while (cargoArrayList.size() > 0) {
            U2 u2 = new U2();
            int i = 0;
            while (i < (cargoArrayList.size())) {
                if (u2.canCarry(cargoArrayList.get(i))) {
                    u2.carry(cargoArrayList.get(i));
                    // u2.cargo.add(cargoArrayList.get(i));
                    cargoArrayList.remove(cargoArrayList.get(i));
                } else {
                    i++;
                }
            }
            u2ArrayList.add(u2);
        }
        return u2ArrayList;
    }

    public int runSimulation(ArrayList<Rocket> rocketArrayList) {
        int i = 0;
        int cost = 0;
        while (i < (rocketArrayList.size() - 1)) {
            cost = cost + rocketArrayList.get(i).rocketCost;
            //System.out.println(cost);
            //System.out.println(rocketArrayList.get(i).rocketWeight);
            //System.out.println(rocketArrayList.get(i).initialRocketWeight);
            //System.out.println(rocketArrayList.get(i).maxWeight);
            if ((rocketArrayList.get(i).crash(rocketArrayList.get(i).launchRisk)) && (rocketArrayList.get(i).crash(rocketArrayList.get(i).landRisk))) {
                System.out.println("Successful mission!");
                i++;
            } else {
                System.out.println("Unsuccessful mission...");
            }
        }
        return cost;
    }
}