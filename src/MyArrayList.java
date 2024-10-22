import java.util.ArrayList;

public class MyArrayList <E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements;

	public MyArrayList() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		elements = new Object[capacity];
	}

	public void add(int index, E element) {
		checkIndex(index);
		ensureCapacity(size + 1);
		for (int i = size; i > index; i--) {
			elements[i] = elements[i - 1];
		}
		elements[index] = element;
		size++;
	}

	private void checkIndex(int index) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}
	}

	public E remove(int index) {
		checkIndex(index);
		E temp = (E) elements[index];
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		return temp;
	}

	public int size() {
		return size;
	}

	public boolean contains(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	public int indexOf(E o) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o)) {
				index = i;
			}
		}
		return index;
	}

	public boolean add(E e) {
		ensureCapacity(size + 1);
		elements[size++] = e;
		return true;
	}

	public void ensureCapacity(int minCapacity) {
		if (minCapacity == elements.length) {
			int new_size = elements.length * 2;
			Object[] new_elements = new Object[new_size];
			for (int i = 0; i < size; i++) {
				new_elements[i] = elements[i];
			}
			elements = new_elements;
		}
	}

	public E get (int i) {
		checkIndex(i);
		return (E) elements[i];
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}
}
