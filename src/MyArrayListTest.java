public class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList<Integer> myList1 = new MyArrayList<>();
		myList1.add(1);
		myList1.add(2);
		myList1.add(3);
		myList1.add(2, 0);
		for (int i = 0; i < myList1.size(); i++) {
			System.out.println(myList1.get(i));
		}
		System.out.println("Size of list1 before clear: " + myList1.size());
		myList1.clear();
		System.out.println("Size of list1 after clear: " + myList1.size());

		MyArrayList<Integer> myList2 = new MyArrayList<>(15);
		myList2.add(10);
		myList2.add(20);
		myList2.add(30);
		myList2.add(40);
		System.out.println("-----Elements of list2 before remove element 30-----");
		for (int i = 0; i < myList2.size(); i++) {
			System.out.println(myList2.get(i));
		}
		System.out.println("List2 contain element 30? " + myList2.contains(30));
		System.out.println("Index of element 30: " + myList2.indexOf(30));
		Object removeElement = myList2.remove(2);
		System.out.println("-----After remove element " + removeElement + "-----");
		System.out.println("List2 contain element 30? " + myList2.contains(30));
		System.out.println("Index of element 30: " + myList2.indexOf(30));
		for (int i = 0; i < myList2.size(); i++) {
			System.out.println(myList2.get(i));
		}
	}
}
