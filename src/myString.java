
public class myString {
	char current; 
	myString next;
	
	// assume sIn.length() >= 1
	myString(String sIn){
		current = sIn.charAt(0);
		if(sIn.length() > 1) {
			next = new myString(sIn.substring(1));
		}
	}
	
	public void print() {
		System.out.print(current);
		if(next != null) {
			next.print();
		}else {
			System.out.println();
		}
	}
	
	// returns > 0 if current is after, returns < 0 if current is before alphabetically
	public int compareTo(myString other) {
		if(current == other.current && (next != null) && (other.next!=null)) {
			return next.compareTo(other.next);
		}
		if(current != other.current) {
			return (int)current-(int)other.current;
		}
		if(next==null && other.next!=null) {
			return -1 * (int)other.next.current;
		}
		if(next!= null && other.next==null) {
			return (int)next.current;
		}
		return 0;
	}
	
}
