package ders11;

public class Node {
	Node next, prev;
	String contents;
	Node(String contents) {
		this.contents = contents;
		next = prev = null;
	}
}
