package com.java.array;

public abstract class MyAbstractList<E> implements MyList<E> {
	
	protected int size = 0;
	
	//costructor
	protected MyAbstractList() {
		
	}
	
//create a list from array of an object
	protected MyAbstractList(E[] objects) {
		for(int i = 0; i < objects.length;i++) {
			add(objects[i]);
		}
	}
	
	// add new element at the end of the list
	@Override
	public void add(E e) {
		add (size,e);
	}
	
	

}
