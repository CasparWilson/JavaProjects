import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Simulation simulation = new Simulation();

        ArrayList<Item> cargoArrayList1 = simulation.loadItems("Phase-1.txt");
        ArrayList<Rocket> u1ArrayList1 = simulation.loadU1s(cargoArrayList1);
        //System.out.println(u1ArrayList1.size());

        ArrayList<Item> cargoArrayList2 = simulation.loadItems("Phase-1.txt");
        ArrayList<Rocket> u2ArrayList1 = simulation.loadU2s(cargoArrayList2);
        //System.out.println(u2ArrayList1.size());

        ArrayList<Item> cargoArrayList3 = simulation.loadItems("Phase-2.txt");
        ArrayList<Rocket> u1ArrayList2 = simulation.loadU1s(cargoArrayList3);
        //System.out.println(u1ArrayList2.size());

        ArrayList<Item> cargoArrayList4 = simulation.loadItems("Phase-2.txt");
        ArrayList<Rocket> u2ArrayList2 = simulation.loadU2s(cargoArrayList4);
        //System.out.println(u2ArrayList2.size());

     int costU1Phase1 = simulation.runSimulation(u1ArrayList1);
     int costU1Phase2 = simulation.runSimulation(u1ArrayList2);
     System.out.println("The cost of using U1 Rockets: $" + (costU1Phase1 + costU1Phase2) + " million.");

     int costU2Phase1 = simulation.runSimulation(u2ArrayList1);
     int costU2Phase2 = simulation.runSimulation(u2ArrayList2);
     System.out.println("The cost of using U2 Rockets: $" + (costU2Phase1 + costU2Phase2) + " million.");
    }
}