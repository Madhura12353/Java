package com.java.array;

public interface MyList<E> extends java.lang.Iterable<E> {
	
// Add new element at the end of the list	
	
	public void add(E e);
	
// Add new element at the specific index  of the list
	public void add(int index, E e);
	
}
