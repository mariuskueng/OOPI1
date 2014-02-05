import java.util.Iterator;

public class Stack implements Collection{
	private Object[] storage;
	private int size;
	
	public Stack(int capacity){
		Object storage[] = new Object[capacity];
		size = 0;
	}
	public boolean isEmpty(){
		if (size == 0){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		if (storage.length == size){
			return true;
		}
		return false;
	}
	
	public int size(){
		return size;
	}
	
	public void clear(){
		for (int i = 0; i < storage.length; i++) {
			storage[i] = null;
		}
	}
	
	public Object peek(){
		if(!this.isEmpty()){
			return storage[size];
		}
		return null;
	}
	public Object pop(){
		if(!this.isEmpty()){
			Object element = storage[size];
			storage[size] = null;
			this.size--;
			return element;
		}
		return null;
	}
	
	public void push(Object elem){
		if (!this.isFull()){
			this.storage[this.size+1] = elem;
			this.size++;
		}
	}
	
	public boolean equals(Object x){
		return false;
	}
	
	
}
