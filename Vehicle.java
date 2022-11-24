import java.util.Scanner;

    class Vehicle {
    static public Scanner sc = new Scanner(System.in);
    static public Berth berths = new Berth();
    protected String truckType;
    protected int weight;


   public Vehicle (String truckType, int weight) {
       this.truckType = truckType;
        this.weight = weight;
   }

    public Vehicle() {
        registerNewTruck();
    }

    public String getTruckType()
    {
        return truckType;
    }


    public int getWeight() {
        return weight;
    }


        public void registerNewTruck() {
           printOutTypeOfTruck();

           String truckType = sc.nextLine();

           System.out.println("Write truck's weight:");
           int weight = sc.nextInt();

            Vehicle vehicle = null;

           if (truckType.equals("1")) {
               vehicle = new Van(weight);


           } else if (truckType.equals("2")) {
               vehicle = new SmallTruck(weight);


           } else if (truckType.equals("3")) {
               vehicle = new HeavyTruck(weight);

           } else {
              System.out.println("\nInvalid input");
           }

           int berthIndex = -1;
           if(getTruckType().equalsIgnoreCase("van")) {
               if(berths.berth.get(0)==null) {
                   berthIndex = 0;
               } else if (berths.berth.get(1) == null) {
                   berthIndex = 1;
               }
           } else if(getTruckType().equalsIgnoreCase("small truck")) {
               if(berths.berth.get(2)==null) {
                   berthIndex = 2;
               } else if (berths.berth.get(3)==null) {
                   berthIndex = 3;
               } else if (getWeight() < 5000 && berths.berth.get(0)==null) {
                   berthIndex =0;
               }
           } else if (getTruckType().equalsIgnoreCase("heavy truck")) {
               if(berths.berth.get(4)==null) {
                   berthIndex = 4;
               } else if (getWeight() < 9000 && berths.berth.get(3)==null) {
                   berthIndex = 3;
               }
           }
           if(berthIndex == -1) {
               System.out.println("Sorry, we are full");
           } else {
               System.out.println("Truck registered at berth" + berths.berthName.get(berthIndex));
               berths.berth.set(berthIndex, vehicle);
           }
       }

       static public void printOutTypeOfTruck() {
           System.out.println();
           System.out.println("""
                Choose your type of truck:
                1. Van
                2. Small truck
                3. Heavy truck
                """);
       }
}
