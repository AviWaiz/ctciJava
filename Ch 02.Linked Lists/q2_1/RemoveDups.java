package q2_1;

import java.util.HashMap;

import q2_1.Link;

public class RemoveDups {
	public static void removeDups1(Link link){
		HashMap<Integer, Boolean> visited = new HashMap<>();
		Link prev = null;
		while (link != null) {
			if (visited.containsKey(link.data)) {
				prev.next = link.next; 
			} else {
				prev = link;
				visited.put(link.data, true);
			}
			link = link.next;
		}
	}
	
	public static void removeDups2(Link link) {
		Link current = link;
		while (current != null) {
			Link runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else runner = runner.next;
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		Link l = new Link(1);
		l.next = new Link(2);
		l.next.next = new Link(3);
		l.next.next.next = new Link(2);
		l.next.next.next.next = new Link(1);
		l.next.next.next.next.next = new Link(2);
		Link c = l, d = l, e = l;
		while (c != null) {
			System.out.println(c.data);
			c = c.next;
		}
		System.out.println();
		removeDups1(d);
		System.out.println("d");
		System.out.println();
		while (d != null) {
			System.out.println(d.data);
			d = d.next;
		}
		removeDups2(e);
		System.out.println("e");
		System.out.println();
		while (e != null) {
			System.out.println(e.data);
			e = e.next;
		}
	}
}

