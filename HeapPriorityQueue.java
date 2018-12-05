public class HeapPriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T>
{
	private MaxHeapInterface<T> heap;
	public HeapPriorityQueue()
	{
		heap = new ArrayMaxHeap<>();
	}
	public HeapPriorityQueue(T[] array)
	{
		heap = new ArrayMaxHeap<>(array);
	}
	public void add(T newEntry)
	{
		heap.add(newEntry);
	}
	public T remove()
	{
		return heap.removeMax();
	}
	public T peek()
	{
		return heap.getMax();
	}
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	public int getSize()
	{
		return heap.getSize();
	}
	public void clear()
	{
		heap.clear();
	}
	public String toString()
	{
		return heap.toString();
	}
}
