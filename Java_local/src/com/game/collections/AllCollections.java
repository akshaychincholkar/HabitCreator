package com.game.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class CollectionDemoClass{
	private int id;
	private String stringValue;
	public CollectionDemoClass() {
		// TODO Auto-generated constructor stub
	}
	public CollectionDemoClass(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
}
public class AllCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1. ArrayList
		 * 2. HashSet
		 * 3. LinkedHashSet
		 * 4. TreeSet
		 * 5. Vector
		 * 6. LinkedList
		 * 7. Stack
		 * 8. PriorityQueue
		 * 9. ArrayDeque
		 * 10. HashMap
		 * 11. LinkedHashMap
		 * 12. TreeMap
		 * 13. HashTable
		 */
//		demoArrayList();
//		demoLinkedList();
		demoVector();
	}
	
	private static void demoVector() {
	}

	private static void demoLinkedList() {
		LinkedList<CollectionDemoClass> linkedList = new LinkedList<>();
		for(int i=0 ; i<5 ; i++){
			linkedList.add(new CollectionDemoClass(i));
		}
		System.out.println("Values added to the linkedList");
		for(CollectionDemoClass local: linkedList){
			System.out.println(local.getId());
//			linkedList.remove();										//ConcurrentModificationException
		}
	}
    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
	private static void demoArrayList() {
		ArrayList arrayList = new ArrayList<>();
		arrayList.add("String Value");
		arrayList.add(5);
		arrayList.add(new CollectionDemoClass());
		
		for(int i = 0; i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
		ArrayList<CollectionDemoClass> arrayList2 = new ArrayList<>();
		for(int i=0; i< 5 ; i ++){
			arrayList2.add(new CollectionDemoClass(i));
		}

		System.out.println("Inside the for each loop");
		for(CollectionDemoClass local: arrayList2){
			System.out.println(local.getId());
//			arrayList2.remove(local);						//ConcurrentModificationException
		}
		Iterator iter = arrayList2.iterator();
		System.out.println("inside the iterator");
		while(iter.hasNext()){
			CollectionDemoClass local = (CollectionDemoClass) iter.next();
			System.out.println(local.getId());
			iter.remove();
			System.out.println("object removed with Id:"+local.getId());
		}
		System.out.println("ArrayList<> size: "+arrayList2.size());
	}
	
}
