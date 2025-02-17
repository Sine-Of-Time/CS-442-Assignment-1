package assignment01;

import java.util.List;

public class ObjectAdapter<E extends Comparable<? super E>> implements SortedSet<E> {
	private SortedList<E> adaptee;
	
	public ObjectAdapter(SortedList<E> adapteeIn) {
		adaptee = adapteeIn;
	}
	@Override
	public void add(E e) {
		// add e to adaptee if e is not in the adaptee already
		// otherwise do nothing
	}
	@Override
	public boolean contains(E e) {
		// delegate to adaptee
	}
	@Override
	public boolean remove(E e) {
		// delegate to adaptee
	}
	@Override
	public String toString() {
		// delegate to adaptee
	}
	@Override
	public List<E> asList() {
		// delegate to adaptee
	}
	@Override
	public int size() {
		// delegate to adaptee
	}
}
