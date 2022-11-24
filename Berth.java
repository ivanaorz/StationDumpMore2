import java.util.ArrayList;
import java.util.List;

public class Berth {

       List <Vehicle> berth;
        List<String> berthName;


    public void seeParkedTrucks() {

        List <Vehicle> berth = new ArrayList<>();
        List<String> berthName = new ArrayList<>();
        berthName.add("A");
        berthName.add("B");
        berthName.add("C");
        berthName.add("D");
        berthName.add("E");

        for (int i = 0; i < 5; i++) {
            berth.add(null);
        }


        for (int i = 0; i < 5; i++) {
            Vehicle vehicle = berth.get(i);
                System.out.println("Berth" + berthName.get(i));
                System.out.println(berth.get(i));
            }
        }
    }












