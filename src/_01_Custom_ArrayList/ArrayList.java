package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	private T[] list;
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
	}
	
	public void add(T val) {
		
		if (list==null) {
		list = (T[]) new Object[1];
		}
		else {
		T[] oldList = list;
		list = (T[]) new Object[list.length+1];
		for (int i = 0;i<oldList.length;i++) {
			list[i] = oldList [i];
		}
		
		}
		list[list.length-1] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] list2 = (T[]) new Object[list.length+1];
		
		
		
		for (int i = 0;i<loc;i++) {
			list2[i] = list[i];
		}
		list2[loc] = val;
		for (int i = loc;i<list.length;i++) {
			list2[i+1] = list[i];
		}
		list = list2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {

		list[loc ] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] list2 = (T[]) new Object[list.length-1];
		
		
		
		for (int i = 0;i<loc;i++) {
			list2[i] = list[i];
		}
		
		for (int i = loc;i<list2.length;i++) {
			list2[i] = list[i+1];
		}
		list = list2;
	}
	
	public boolean contains(T val) {
		for (int i=0;i<list.length;i++) {
			if (list[i]==val) {
				return true;
			}
		}
		return false;
	}
	public int size () {
		return list.length;
	}
}