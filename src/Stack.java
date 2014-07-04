import java.util.*;

/**
 * Created by br0ce on 03.07.14.
 */
interface MyStack<Object> extends List<Object>
{
	void push(Object o);
	void pop();
}

public class Stack<T> implements MyStack<Object>
{
	private Collection<T> mStack = new ArrayList<T>();
	private int mSize;

	@Override
	public void push(Object o)
	{
		try
		{
			T t = (T) o;
			if(o != null)
			{
				mStack.add(t);
				mSize++;
			} else
				throw new IllegalArgumentException();
		} catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		} catch(ClassCastException e)
		{
			System.out.println("Argument wird nicht unterstützt.");
		}

	}
	@Override
	public void pop()
	{
		try
		{
			if(!mStack.isEmpty())
			{
				Iterator it = mStack.iterator();
				while(it.hasNext())
					it.next();

				it.remove();
				mSize--;
			} else
				throw new EmptyStackException();
		}catch(EmptyStackException e)
		{
			System.err.println("Der Stack ist leer");
		}
	}
	@Override
	public int size()
	{
		return mSize;
	}
	@Override
	public boolean isEmpty()
	{
		return (mSize == 0);
	}
	public void printStack()
	{
		for(T t : mStack)
			System.out.println(t);
	}
	@Override
	public boolean contains(Object o)
	{
		return false;
	}
	@Override
	public Iterator<Object> iterator()
	{
		return null;
	}
	@Override
	public Object[] toArray()
	{
		return new Object[0];
	}
	@Override
	public <T> T[] toArray(T[] a)
	{
		return null;
	}
	@Override
	public boolean add(Object o)
	{
		return false;
	}
	@Override
	public boolean remove(Object o)
	{
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c)
	{
		return false;
	}
	@Override
	public boolean addAll(Collection<?> c)
	{
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<?> c)
	{
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c)
	{
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c)
	{
		return false;
	}
	@Override
	public void clear()
	{

	}
	@Override
	public Object get(int index)
	{
		return null;
	}
	@Override
	public Object set(int index, Object element)
	{
		return null;
	}
	@Override
	public void add(int index, Object element)
	{

	}
	@Override
	public Object remove(int index)
	{
		return null;
	}
	@Override
	public int indexOf(Object o)
	{
		return 0;
	}
	@Override
	public int lastIndexOf(Object o)
	{
		return 0;
	}
	@Override
	public ListIterator<Object> listIterator()
	{
		return null;
	}
	@Override
	public ListIterator<Object> listIterator(int index)
	{
		return null;
	}
	@Override
	public List<Object> subList(int fromIndex, int toIndex)
	{
		return null;
	}
}

