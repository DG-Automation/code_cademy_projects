package loops;

import java.util.ArrayList;
import java.util.Objects;

public class Lunch {
    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        // Add your code below
        for (int i = 0; i < lunchBox.size(); i++) {
            if(Objects.equals(lunchBox.get(i), "ant")){
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }
        return lunchBox;

    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);

    }
}
