package q2_1;

public class Link {
	int data;
	Link next;
	
	public Link(int val) {
		this.data = val;
	}
	
	public Link() {}
	
	public Link(int val, Link n) {
		this.data = val;
		this.next = n;
	}
}
