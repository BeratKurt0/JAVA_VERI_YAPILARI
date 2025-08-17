package ders11;

public class WebPage {
	Node head, tail;
	WebPage() {
		head = tail = webSite("Firefox anasayfasına hoşgeldiniz.");
	}
	
	Node webSite(String contents) {
		Node site = new Node(contents);
		return site;
	}
	
	
}
