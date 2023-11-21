import java.util.List;
/**
 * Class for testing the productivity of ArrayList and LinkedList
 */
public class TimeTester
{
    /**
     * Method for testing the speed of adding items in list
     * @param list - list to add items
     * @param <T> - type for list items
     * @param size - count of items for adding
     * @return time of adding items
     */
    public static <T> long addList(List <T>list, int size)
    {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            Object obj = i;
            list.add((T) obj);
        }
        return  System.nanoTime() - start;

    }
    /**
     * Method for testing the speed of getting items from the list
     * @param list - list of items to get
     * @param <T> - type for list items
     * @param size - count of items for getting from the list
     * @return time of getting items
     */
    public static <T> long getList(List <T>list, int size)
    {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            T a =  list.get(i);
        }
        return  System.nanoTime() - start;
    }
    /**
     * Method for testing the speed of removing items from the list
     * @param list - list of items to remove
     * @param <T> - type for list items
     * @param size - count of items for removing from the list
     * @return time of removing items
     */

    public static <T> long removeList(List <T>list, int size)
    {
        long start = System.nanoTime();
        for (int i = size - 1; i >= 0; i--) {
            list.remove(i);
        }
        return  System.nanoTime() - start;
    }

}