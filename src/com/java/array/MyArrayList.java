package com.java.array;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {

	public static final int INITIAL_CAPACITY = 16; 
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	
	
	// default constructor
	public MyArrayList()
	{
		
	}
	//create a list from an array of object
	public MyArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
			
		}
	}
	@Override /** Add a new element at the specified index */

	public void add(int index, E e) { ensureCapacity();

	// Move the elements to the right after the specified index 
	for (int i = size - 1; i >= index; i--) 
		data[i + 1] = data[i];

	// Insert new element to data[index] 
	data[index] = e;

	// Increase size by 1 
	size++;
	}

	
	
	private void ensureCapacity() { 
		if (size >= data.length) { 
			E[] newData = (E[])(new Object[size * 2 + 1]); 
			
			System.arraycopy(data, 0, newData, 0, size); data = newData; }
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		StringBuilder stringb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			stringb.append(data[i]);
			if (i < size-1 ) {
				stringb.append(", ");
			}
		}
		return stringb.toString() + "]";
	}
}
