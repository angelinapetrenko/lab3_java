import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        int[] sizes = new int[] {1000, 2000, 5000};
        System.out.println("------------------------------------------------");
        System.out.println("| Method  |  Size  | ArrayList |  LinkedList   |");

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("------------------------------------------------");


            LinkedList<Integer> linkedList = new LinkedList<>();
            ArrayList<Integer> arrayList = new ArrayList<>();
            long addArrayListTime = new TimeTester().addList(arrayList, sizes[i]);
            long addLinkedListTime = new TimeTester().addList(linkedList, sizes[i]);

            long getArrayListTime = new TimeTester().getList(arrayList, sizes[i]);
            long getLinkedListTime = new TimeTester().getList(linkedList, sizes[i]);

            long removeArrayListTime = new TimeTester().removeList(arrayList, sizes[i]);
            long removeLinkedListTime = new TimeTester().removeList(linkedList, sizes[i]);


            System.out.format("| Add     |  %d   |   %d ms   |    %d ms    |%n", sizes[i], addArrayListTime, addLinkedListTime);
            System.out.format("| Get     |  %d   |   %d ms   |    %d ms    |%n", sizes[i], getArrayListTime, getLinkedListTime);
            System.out.format("| Remove  |  %d   |   %d ms   |    %d ms    |%n", sizes[i], removeArrayListTime, removeLinkedListTime);
            System.out.println("------------------------------------------------");
        }
    }
}

