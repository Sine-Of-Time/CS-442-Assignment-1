package assignment01;

import java.util.List;

public class ClassAdapter<E extends Comparable<? super E>> extends
SortedList<E> implements SortedSet<E> {
	private final SortedList<E> internalSortedList = new SortedList<>();

	@Override
	public void add(E e)
	{
		if (!internalSortedList.contains(e))
		{
			internalSortedList.add(e);
		}
	}

	@Override
	public boolean contains(E e)
	{
		return internalSortedList.contains(e);
	}

	@Override
	public boolean remove(E e)
	{
		return internalSortedList.remove(e);
	}

	@Override
	public List<E> asList()
	{
		return internalSortedList.asList();
	}

	@Override
	public int size()
	{
		return internalSortedList.size();
	}
}
