package datastructures;
import java.util.Iterator;

import interfaces.Visitor;

class ForwardIterator<T> implements Iterator<T> {
	private Node<T> current;
	
	public ForwardIterator(Node<T> node) {
		this.current = node;
	}
	
	@Override
	public boolean hasNext() {
		return (current != null);
	}

	@Override
	public T next() {
		T data = current.getData();
		current = current.getNext();
		return data;
	}
}

class ReverseIterator<T> implements Iterator<T> {
	private Node<T> current;
	
	public ReverseIterator(Node<T> node) {
		this.current = node;
	}
	
	@Override
	public boolean hasNext() {
		return (current != null);
	}

	@Override
	public T next() {
		T data = current.getData();
		current = current.getPrevious();
		return data;
	}
	
}

class Node<T> {
	private T data;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	public void setNext(Node<T> node) {
		this.next = node;
	}
	
	public void setPrevious(Node<T> node) {
		this.previous = node;
	}
	
	public Node<T> getNext() {
		return next;
	}

	public Node<T> getPrevious() {
		return previous;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}

public class LinkedList<T> implements Iterable<T> {
	private Node<T> head = null;
	private Node<T> tail = null;
	
	public void append(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
			tail = node;
		}
	}

	public void insertAfter(Node<T> previous, T data) {
		Node<T> node = new Node<T>(data);
		Node <T> next = previous.getNext();
		node.setNext(next);
		node.setPrevious(previous);
		previous.setNext(node);
		if (next != null) {
			next.setPrevious(node);
		} else {
			tail = node;
		}
	}
	
	public void addFirst(T data) {
		Node<T> node = new Node<T>(data);
		node.setNext(head);
		if (head != null)
			head.setPrevious(node);
		head = node;
		if (tail == null)
			tail = node;
	}
	
	public void remove(Node<T> node) {
		Node<T> previous = node.getPrevious();
		Node<T> next = node.getNext();
		if (previous != null) {
			previous.setNext(next);
		} else {
			head = next;
		}
		if (next != null) {
			next.setPrevious(previous);
		} else {
			tail = previous;
		}
	}
	
	public <K extends Comparable<T>> Node<T> search(K key) {
		Node<T> iter = head;
		while (iter != null) {
			if (key.compareTo(iter.getData()) == 0)
				break;
			iter = iter.getNext();
		}
		return iter;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ForwardIterator<T>(head);
	}

	public ReverseIterator<T> reverseIterator() {
		return new ReverseIterator<T>(tail);
	}

	public void foreach(Visitor<T> visitor) {
		for (T data : this)
			visitor.visit(data);
	}
}










