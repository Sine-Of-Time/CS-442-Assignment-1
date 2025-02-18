package assignment01;

import java.util.List;

//Testing push

public class ObjectAdapter<E extends Comparable<? super E>> implements SortedSet<E> {
	private SortedList<E> adaptee;
	
	public ObjectAdapter(SortedList<E> adapteeIn) {
		adaptee = adapteeIn;
	}
	@Override
	public void add(E e) {
		// add e to adaptee if e is not in the adaptee already
		// otherwise do nothing)
		if(!adaptee.contains(e)){
			adaptee.add(e);
		}
	}
	@Override
	public boolean contains(E e) {
		// delegate to adaptee
		return adaptee.contains(e);
	}
	@Override
	public boolean remove(E e) {
		// delegate to adaptee
		return adaptee.remove(e);
	}
	@Override
	public String toString() {
		// delegate to adaptee
		return adaptee.toString();
	}
	@Override
	public List<E> asList() {
		// delegate to adaptee
		return adaptee.asList();
	}
	@Override
	public int size() {
		// delegate to adaptee
		return adaptee.size();
	}
}
