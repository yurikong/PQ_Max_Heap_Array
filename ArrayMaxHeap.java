import java.util.Arrays;

public class ArrayMaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T>
{
	private T[] arr;
	private int size;
	private int capacity = 10;
	public ArrayMaxHeap()
	{
		arr = (T[]) new Comparable[capacity];
		size = 0;
	}
	public ArrayMaxHeap(T[] array)
	{
		buildMaxHeap(array);
	}
	public void add(T newEntry)
	{
		if(size == capacity)
			resize();
		arr[size] = newEntry;
		maxUpHeap(size++);
	}
	public T removeMax()
	{
		if(isEmpty())
			return null;
		else if(size == 1)
		{
			T entry = arr[--size];
			arr[size] = null;
			return entry;
		}
		T entry = arr[0];
		arr[0] = arr[--size];
		arr[size] = null;
		maxHeapify(0);
		return entry;
	}
	public T getMax()
	{
		if(isEmpty())
			return null;
		return arr[0];
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public int getSize()
	{
		return size;
	}
	public void clear()
	{
		arr = (T[]) new Comparable[capacity];
		size = 0;
	}
	private void buildMaxHeap(T[] array)
	{
		arr = array;
		size = capacity = array.length;
		for(int i = size / 2 - 1; i >= 0; i--)
			maxHeapify(i);
	}
	private void maxHeapify(int index)
	{
		if(index > size / 2 - 1)
			return;
		int max = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		if(left < size && arr[left].compareTo(arr[max]) > 0)
			max = left;
		if(right < size && arr[right].compareTo(arr[max]) > 0)
			max = right;
		if(max != index)
		{
			T temp = arr[index];
			arr[index] = arr[max];
			arr[max] = temp;
			maxHeapify(max);
		}
	}
	private void maxUpHeap(int index)
	{
		while(index > 0 && arr[index].compareTo(arr[(index - 1)/2]) > 0)
		{
			T temp = arr[index];
			arr[index] = arr[(index - 1)/2];
			arr[(index - 1)/2] = temp;
			index = (index - 1)/2;
		}
	}
	private void resize()
	{
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);
	}
	public String toString()
	{
		if(isEmpty())
			return "[]";
		String str = "[";
		for(int i = 0; i < size; i++)
			str += arr[i].toString() + " ";
		str = str.trim() + "]";
		return str;
	}
}
