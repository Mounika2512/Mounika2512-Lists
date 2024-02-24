import java.util.ArrayList;
import java.util.List;

public class Lab {
    /**
     * Instantiate and return a List of Integers.
     *
     * @return a List<Integer> object.
     */
    public List<Integer> createList() {
        return new ArrayList<>();
    }

    /**
     * Get the size of a list.
     *
     * @param list a List<Integer> object.
     * @return the size of List (number of items it holds.)
     */
    public int getSize(List<Integer> list) {
        return list.size();
    }

    /**
     * Add an item to a list.
     * When we add a value to a list, it gets appended to the end.
     *
     * @param list  a List<Integer> object that we would like to modify.
     * @param value an integer that we would like to add to list.
     */
    public void addToList(List<Integer> list, int value) {
        list.add(value);
    }

    /**
     * Get a particular index of a list.
     *
     * @param list  a List<Integer> object that we would like to examine.
     * @param index represents the index of the element we would like to retrieve.
     * @return the int value at the location in 'list' represented by 'index'.
     */
    public int get(List<Integer> list, int index) {
        return list.get(index);
    }

    /**
     * Remove an index from a list.
     *
     * @param list     a List<Integer> object that we would like to modify.
     * @param position represents the index of the element we would like to remove.
     */
    public void removeFromList(List<Integer> list, int position) {
        list.remove(position);
    }

    /**
     * Update an index of a list.
     *
     * @param list     a List<Integer> object that we would like to modify.
     * @param position represents the index of the element we would like to change.
     * @param value    the new value which we would like to assign to the item at position in list
     */
    public void updateAtPosition(List<Integer> list, int position, int value) {
        list.set(position, value);
    }
}