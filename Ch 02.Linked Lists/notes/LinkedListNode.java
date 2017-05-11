package notes;


public class LinkedListNode {
	LinkedListNode next;
	LinkedListNode prev;
	LinkedListNode last;
	int data;
	
	public LinkedListNode(int val, LinkedListNode n, LinkedListNode p){
		this.data = val;
		setNext(n);
		setPrev(p);
	}
	
	public LinkedListNode(int val){
		this.data = val;
	}
	
	public LinkedListNode(){}
	
	public void setNext(LinkedListNode n){
		this.next = n;
		if (this == this.last){
			this.last = n;
		}
		if (n != null && n.prev != this) {
			n.setPrev(this);
		}
	}
	
	public void setPrev(LinkedListNode p) {
		this.prev = p;
		if (p != null && p.next != this) {
			p.setNext(this);
		}
	}
	
	public String printForward() {
		if (this.next != null) return this.data + "->" + next.printForward();
		else return ((Integer) data).toString();
	}
	
	public LinkedListNode clone() {
		LinkedListNode next2 = null;
		if (this.next != null) next2 = this.next.clone();
		LinkedListNode head2 = new LinkedListNode(this.data, next2, null);
		return head2;
	}
}
