package gb.sal;

import java.util.NoSuchElementException;

public class LinkList {
	private Node first;
	private  Node last;
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}

	}
	public boolean isEmpty() {
		return first==null;
	}

	public void addLast(int item) {
		var node =new Node(item);
		if(isEmpty())
			first=last=node;
		else {
			last.next=node;
			last=node;
		}
		}
    public void addFirst(int item) {
			var node =new Node(item);
			if(isEmpty())
				first=last=node;
			else {
				node.next=first;
				first=node;
			}
		
	}
	
	public int indexOf(int item) {
		int index=0;
		var current=first;
		while(current!=null) {
			if(current.value==item)return index;
			current=current.next;
			index++;
		}
			return -1;
	}
	
	public boolean contains(int item) {
		return indexOf(item)!=-1;
	}
	public void removefirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		if(first==last) {
			first=last=null;
			return;}
		var second=first.next;
		first.next=null;
		first=second;
	}
	public void removelast() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(first==last) {
			first=last=null;
			return;}
		}
		
		
	
	
	private Node previous(Node node) {
	var pervious=	previous(last);
	last=pervious;
	last.next=null;
		var current=first;
		while(current!=null) {
			if(current.next==node)return current;
			current=current.next;
	}
	
	
	return null;
	}
	
    //addfirst;
	//addLast;
	//deletFirst;
	//deletLast;
	//contains;
	//indexOf;
}
