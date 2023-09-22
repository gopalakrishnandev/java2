package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GeoceryItem(String name, String type, int count){
        public  GeoceryItem(String name, String type){
            this(name, type, 12);
        }
}
public class Main {


        //Array
    public static void main(String[] args) {
        GeoceryItem[] gerceryArray = new GeoceryItem[3];
        gerceryArray[0] = new GeoceryItem("sachin", "pp");
        gerceryArray[1] = new GeoceryItem("Dhoni", "yy ");
        gerceryArray[2] = new GeoceryItem("Virat", "kk");

        //System.out.println(Arrays.toString(gerceryArray));

        //Array list
        ArrayList<GeoceryItem> arrList = new ArrayList<>();
        arrList.add(new GeoceryItem("Sam", "human"));
        arrList.set(0,new GeoceryItem("Gayle", "batter", 44));
        //arrList.remove(0);

        System.out.println(arrList);
    }
}
