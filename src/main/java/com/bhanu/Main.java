package com.bhanu;
public class Main {

	public static void main(String[] args) {
		CustomList a = new CustomList();
		a.insert(11);
		a.delete(0);
		a.delete(11);
		a.insert(12.11);
		System.out.println(a.fetch(10));
		a.print();
	}

}
