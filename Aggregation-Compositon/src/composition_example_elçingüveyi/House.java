package composition_example_elçingüveyi;

import java.util.ArrayList;
import java.util.Comparator;

public class House {
    private Room r1, r2, r3;
    private ArrayList<Room> rooms;

    public House() {
        //nesneleri burada(Constructor da) oluşturmalıyız
        r1 = new Room("Living Room :", "20m2");
        r2 = new Room("Bed Room :", "15m2");
        r3 = new Room("Kitchen :", "10m2");

        //Aşağıdakileri yapınca home içinde 3 tane nesne var artık
        rooms = new ArrayList<Room>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

    }


    public String toString() {
        String str = "";
        for (Room r : rooms)
            str = str + r.getName()+"\n";
        return str;
    }

    public String getm2(String str) {
        for(Room r:rooms)
            //if içi ==0 olacak ama hep null olduğu için böyle yazdım
           if(r.getName().compareTo(str)!=0)
               return r.getAlan();
        return null;
    }
}


class Room {
    private String name, alan;


    public String getName() {

        return name;
    }

    public String getAlan() {

        return alan;
    }


    public Room(String name, String m2) {
        this.name = name;
        alan = m2;
    }
}


