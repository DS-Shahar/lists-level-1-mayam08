public class Main {	
	
	public static void main(String[] args) {
//		testIntNode();
//		testStack();
		testBuildList();
		 
	}
	
	//Lists Level 1 . 1
	public static void testBuildList() {
		int[] arr = {1,3,4,5,6,7,90};
		Node<Integer> list;
		list = buildList(arr);
		System.out.print(isFound(list,15));
		System.out.println(isFound(list,90));
		printList(deleteNodeX(list,3));
		printList(deleteNodeX(list,33));
		//printList(list);
		//printListRecursion(list);
		//printListRecursionReverse(list);
		//printListEven(list);
		//printList(deleteNode(list, 1));
		//printList(deleteNode(list, 90));
		//printList(deleteNode(list, 5));
		
				
	}
	
	public static void printList( Node<Integer> list) {
		Node<Integer> n=list; 
		while (n!= null) {			
			System.out.println(n.getValue());
			n=n.getNext();
		}
	}
	
	public static void printListEven( Node<Integer> list) {
		Node<Integer> n=list; 
		while (n!= null) {	
			if (n.getValue()%2 == 0)
				System.out.println(n.getValue());
				n=n.getNext();
		}
	}
	
	public static void printListRecursion( Node<Integer> list) {
		if (list == null)
			return;
		System.out.println(list.getValue());
		printListRecursion(list.getNext());
		    
		 
	}
	
	public static void printListRecursionReverse( Node<Integer> list) {
		if (list == null)
			return;
		
		printListRecursionReverse(list.getNext());
		System.out.println(list.getValue());    
		 
	}
	
	public static boolean isFound(Node<Integer> list, int n) {
		while (list != null) {
			if (list.getValue()==n)
				return true;
			
			list =list.getNext();
		}
		return false;
	}
	
	public static Node<Integer> deleteNode(Node<Integer> list, int n) {
		Node<Integer> tmp = list;
		if (list == null)
			return null;
		if (list.getValue() == n)
			return list.getNext();
 		while (list != null && list.getNext()!=null ) {
			if (list.getNext().getValue()==n) {
				list.setNext(list.getNext().getNext());
				return tmp;
			}
			 
			list =list.getNext();
		}
 		
 		return tmp;
		 
	}
	
	public static Node<Integer> buildList(int[] a) {
		Node<Integer> h = new Node<Integer>(-1);
		Node<Integer> p = h;
		Node<Integer> x;
		for (int i = 0; i < a.length; i++) {
			x = new Node<Integer>(a[i]);
			p.setNext(x);
			p = p.getNext();
		}
		return h.getNext();
	}
	
	
	
	public static Node<Integer> deleteNodeX(Node<Integer> list ,int x){
		Node<Integer> tmp = list;
		for (int i=1; i<x-1 && list !=null; i++) {
			list = list.getNext();
		}
		if (list != null)
			list.setNext(list.getNext().getNext());
		return tmp;
		
	}
}
	
