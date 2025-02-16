package assignment01;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that maintains a list of elements that are sorted according to the natural ordering
 * of the generic parameter E. Many classes are Comparable, see
 * <a href="https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html">
 * Comparable</a>. Elements are stored in an ArrayList. Operations use binarySearch rather than linear 
 * search for efficiency. 
 */
public class SortedList<E extends Comparable<? super E>> {
	private List<E> internalList = new ArrayList<>();
	/**
	 * Inserts the specified element at the correct position in the sorted order.
	 * If there are multiple elements equal to e, the new copy of e enters as the last
	 * copy of e in the list.
	 * @param e element to be inserted.
	 */
	public void add(E e) {
		int index = binarySearchHigh(internalList, e);
		if (index < 0) {
			index = -index - 1;
		}
		internalList.add(index, e);
	}

	int binarySearchHigh(List<E> list, E e) {
		return 0;
	}
	
	int binarySearchLow(List<E> list, E e) {
		return 0;
	}

	/**
	 * Returns true if this list contains the specified element. More formally, 
	 * returns true if and only if this list contains at least one element o 
	 * such that Objects.equals(o, e).
	 * @param e element whose presence in this list is to be tested 
	 * @return true when this list contains the specified element. 
	 */
	public boolean contains(E e) {
		return binarySearchHigh(internalList, e) >= 0;
	}
	
	/**
	 * Removes the first occurrence of the specified element from this list, 
	 * if it is present. If the list does not contain the element, it is unchanged. 
	 * More formally, removes the element with the lowest index i such that 
	 * Objects.equals(e, get(i)) (if such an element exists). Returns true if 
	 * this list contained the specified element (or equivalently, if this list 
	 * changed as a result of the call).
	 * @param e element to be removed from this list, if present
	 * @return true when this list contains the specified element.
	 */
	public boolean remove(E e) {
		int index = binarySearchLow(internalList, e);
		if (index < 0) return false;
		internalList.remove(index);
		return true;
	}

	public List<E> asList() { 
		return internalList; 
	}
	
	public int size() { 
		return internalList.size(); 
	}

	public String toString() { 
		return internalList.toString(); 
	} 
}
