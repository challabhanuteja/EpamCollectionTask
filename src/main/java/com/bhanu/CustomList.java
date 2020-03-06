package com.bhanu;
import java.util.Scanner;
public class CustomList 
{
	Node head,tail;
	CustomList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 elements:");
		int n,t =10;
		while(t>0)
		{
			n = sc.nextInt();
			insert(n);
			t--;
		}
		sc.close();
	}
	public void insert(int data)  //Inserts data at the end
	{
		Node node= new Node();
		node.next = null;
		node.data = data;
		
		if(head==null)
		{
			head = node;
			tail = node;
		}
		else
		{
			tail.next = node;
			tail = tail.next;
		}
//		System.out.println(data + " has been inserted");
	}
	
	public void print() //Prints the complete linked list
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	public void  delete(int pos) //Deletes the node at given position
	{
		if(pos==0)
		{
			System.out.println(head.data +" has been deleted from the list");
			head = head.next;
		}
		else {
		Node n = head,n1 = head;
		int nu = 0;
		while(nu < pos && n!=null)
		{
			n1= n;
			n = n.next;
			nu++;
		}
		if(n==null)
		{
			System.out.println("Postion not present");
		}
		else
		{
			System.out.println(n.data +" has been deleted from the list");
			if(n == tail)
			{
				n1.next = null;
				tail = n1;
			}
			else
			{
				n1.next = n1.next.next;
			}
		}
		}
	}
	public int fetch(int pos) //returns the data of node at the given position
	{
		if(pos==0)
		{
			return head.data;
		}
		else
		{
			Node n = head;
			int nu = 0;
			while(nu < pos && n!=null)
			{
				n = n.next;
				nu++;
			}
			if(n ==null)
			{
				return -1;
			}
			else
			{
				return n.data;
			}
		}
	}
}
