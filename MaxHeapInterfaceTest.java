public class MaxHeapInterfaceTest
{
	public static void main(String[] args)
	{
		MaxHeapInterface heap = new ArrayMaxHeap<>();
		Integer[] int_data = {57, 22, 3, 64, 52, 88, 2, 51, 30, 94, 75};
		String[] string_data = {"h", "w", "y", "j", "d", "l", "v", "p", "a", "k", "f"};
		test_heap_data_isEmpty_and_getSize(heap);
		test_getMax(heap);
		test_remove_max(heap);
		test_add(heap, string_data);
		test_heap_data_isEmpty_and_getSize(heap);
		test_getMax(heap);
		test_remove_max(heap);
		test_heap_data_isEmpty_and_getSize(heap);
		test_clear(heap);
		test_heap_data_isEmpty_and_getSize(heap);
		test_add_getMax_and_isEmpty_removeMax(heap, int_data);
		MaxHeapInterface heap1 = null;
		test_constructor_buildMaxHeap(heap1, int_data);
	}
	public static void test_constructor_buildMaxHeap(MaxHeapInterface heap, Comparable[] data)
	{
		System.out.println("**********");
		String str = "Array:\t\t[";
		for(Comparable entry : data)
			str += entry.toString() + " ";
		str = str.trim() + "]";
		System.out.println(str);
		heap = new ArrayMaxHeap<>(data);
		System.out.println("buildMaxHeap:\t" + heap);
		System.out.println("----------");
	}
	public static void test_heap_data_isEmpty_and_getSize(MaxHeapInterface heap)
	{
		System.out.println("**********");
		System.out.println("Heap:\t\t" + heap);
		System.out.println("isEmpty:\t" + heap.isEmpty());
		System.out.println("getSize:\t" + heap.getSize());
		System.out.println("----------");
	}
	public static void test_remove_max(MaxHeapInterface heap)
	{
		System.out.println("**********");
		System.out.println("removeMax:\t" + heap.removeMax());
		System.out.println("----------");
	}
	public static void test_add(MaxHeapInterface heap, Comparable[] data)
	{
		System.out.println("**********");
		String str = "add:\t\t";
		for(Comparable entry : data)
		{
			str += entry.toString() + " ";
			heap.add(entry);
		}
		System.out.println(str);
		System.out.println("----------");
	}
	public static void test_clear(MaxHeapInterface heap)
	{
		System.out.println("**********");
		String str = heap.toString();
		heap.clear();
		System.out.println("clear:\t\t" + str);
		System.out.println("----------");
	}
	public static void test_getMax(MaxHeapInterface heap)
	{
		System.out.println("**********");
		System.out.println("getMax:\t\t" + heap.getMax());
		System.out.println("----------");
	}
	public static void test_add_getMax_and_isEmpty_removeMax(MaxHeapInterface heap, Comparable[] data)
	{
		System.out.println("**********");
		System.out.println("getMax:\t\t" + heap.getMax());
		for(Comparable entry : data)
		{
			heap.add(entry);
			System.out.println("Heap:\t\t" + heap);
			System.out.println("__getMax:\t" + heap.getMax());
		}
		System.out.println("isEmpty:\t" + heap.isEmpty());
		while(!heap.isEmpty())
		{
			System.out.println("Heap:\t\t" + heap);
			System.out.println("__removeMax:\t" + heap.removeMax() + " removed.");
		}
		System.out.println("isEmpty:\t" + heap.isEmpty());
		System.out.println("----------");
	}
}
