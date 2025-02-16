package assignment01;

import java.util.List;

/**
 * [This is how the Java API describes Set.
 * A collection that contains no duplicate elements. More formally, sets contain 
 * no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. 
 * As implied by its name, this interface models the mathematical set abstraction.
 * In this case SortedSet 
 * @param <E>
 */
public interface SortedSet<E extends Comparable<? super E>> {
	void add(E e);
	boolean contains(E e);
	boolean remove(E e);
	List<E> asList();
	int size();
}
