package assignment01;

public class ClassAdapter<E extends Comparable<? super E>> extends 
SortedList<E> implements SortedSet<E> {
	
	// Note because this is a subclass, this is a list and has 
	// all the methods of SortedList

	@Override
	public void add(E e) {
		// add e if e is not contained in this list
		// otherwise do nothing
	}
}
