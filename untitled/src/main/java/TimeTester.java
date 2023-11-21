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
/**
        * Method for testing the speed of checking if a list contains a specific item
     * @param list - list to check
     * @param <T> - type for list items
     * @param item - item to check for
        * @return time of checking if the list contains the item
     */
    public static <T> long containsList(List<T> list, T item) {
        long start = System.nanoTime();
        boolean contains = list.contains(item);
        return System.nanoTime() - start;
    }
    /**
     * Method for testing the speed of finding an item in the list
     * @param list - list to search in
     * @param <T> - type for list items
     * @param item - item to find in the list
     * @return time of finding the item
     */
    public static <T> long indexOfList(List <T>list, T item)
    {
        long start = System.nanoTime();
        list.indexOf(item);
        return  System.nanoTime() - start;
    }
}