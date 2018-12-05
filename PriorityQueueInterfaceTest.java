public class PriorityQueueInterfaceTest 
{
	public static void main(String[] args)
	{
		PriorityQueueInterface pq = new HeapPriorityQueue<>();
		Integer[] int_data = {57, 22, 3, 64, 52, 88, 2, 51, 30, 94, 75};
		String[] string_data = {"h", "w", "y", "j", "d", "l", "v", "p", "a", "k", "f"};
		test_pq_data_isEmpty_and_getSize(pq);
		test_peek(pq);
		test_remove(pq);
		test_add(pq, string_data);
		test_pq_data_isEmpty_and_getSize(pq);
		test_peek(pq);
		test_remove(pq);
		test_pq_data_isEmpty_and_getSize(pq);
		test_clear(pq);
		test_pq_data_isEmpty_and_getSize(pq);
		test_add_peek_and_isEmpty_remove(pq, int_data);
		PriorityQueueInterface pq1 = null;
		test_constructor_build_from_array(pq1, int_data);
	}
	public static void test_constructor_build_from_array(PriorityQueueInterface pq, Comparable[] data)
	{
		System.out.println("**********");
		String str = "Array:\t\t[";
		for(Comparable entry : data)
			str += entry.toString() + " ";
		str = str.trim() + "]";
		System.out.println(str);
		pq = new HeapPriorityQueue<>(data);
		System.out.println("buildPQ:\t" + pq);
		System.out.println("----------");
	}
	public static void test_pq_data_isEmpty_and_getSize(PriorityQueueInterface pq)
	{
		System.out.println("**********");
		System.out.println("PQ:\t\t" + pq);
		System.out.println("isEmpty:\t" + pq.isEmpty());
		System.out.println("getSize:\t" + pq.getSize());
		System.out.println("----------");
	}
	public static void test_remove(PriorityQueueInterface pq)
	{
		System.out.println("**********");
		System.out.println("remove:\t\t" + pq.remove());
		System.out.println("----------");
	}
	public static void test_add(PriorityQueueInterface pq, Comparable[] data)
	{
		System.out.println("**********");
		String str = "add:\t\t";
		for(Comparable entry : data)
		{
			str += entry.toString() + " ";
			pq.add(entry);
		}
		System.out.println(str);
		System.out.println("----------");
	}
	public static void test_clear(PriorityQueueInterface pq)
	{
		System.out.println("**********");
		String str = pq.toString();
		pq.clear();
		System.out.println("clear:\t\t" + str);
		System.out.println("----------");
	}
	public static void test_peek(PriorityQueueInterface pq)
	{
		System.out.println("**********");
		System.out.println("peek:\t\t" + pq.peek());
		System.out.println("----------");
	}
	public static void test_add_peek_and_isEmpty_remove(PriorityQueueInterface heap, Comparable[] data)
	{
		System.out.println("**********");
		System.out.println("peek:\t\t" + heap.peek());
		for(Comparable entry : data)
		{
			heap.add(entry);
			System.out.println("Heap:\t\t" + heap);
			System.out.println("__peek:\t\t" + heap.peek());
		}
		System.out.println("isEmpty:\t" + heap.isEmpty());
		while(!heap.isEmpty())
		{
			System.out.println("Heap:\t\t" + heap);
			System.out.println("__remove:\t" + heap.remove() + " removed.");
		}
		System.out.println("isEmpty:\t" + heap.isEmpty());
		System.out.println("----------");
	}
}
