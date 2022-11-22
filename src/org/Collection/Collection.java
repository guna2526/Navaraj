package org.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("guna");
		l.add("Mathi");
		l.add("Selva");
		l.add("Venki");
		System.out.println(l);
		for (Object x : l) {
			System.out.println(x);
		}
		System.out.println("******************ArrayList******************************");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("**************************************************");
		List l1 = new LinkedList();
		l1.add("guna");
		l1.add("Mathi");
		l1.add(110);
		l1.add("Selva");
		l1.add("Venki");
		l1.set(2,"Suganesh");
		System.out.println(l1);
		for (Object x1 : l1) {
			System.out.println(x1);
	}
		System.out.println("*******************Linked List*****************************");
		for (int j = 0; j < l1.size(); j++) {
			System.out.println(l1.get(j));
		}
}
}
