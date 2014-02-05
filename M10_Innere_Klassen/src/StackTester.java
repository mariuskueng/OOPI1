import java.util.Iterator;

public class StackTester {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	public static void test2(){
		Stack s= new Stack(10);
		for (int i= 0; i<5; i++){
			s.push(new Integer(i));
		}
		System.out.println("Es werden "+s.size()+" Elemente ausgegeben:");
		Iterator i= s.getIterator();
		while(i.hasNext()){
			Object o= i.next();
			System.out.println(o);
			if (o.equals(new Integer(2))){
				i.remove();
			}
		}
		System.out.println("Es werden "+s.size()+" Elemente ausgegeben:");
		i= s.getIterator();
		while(i.hasNext()){
			Object o= i.next();
			System.out.println(o);
		}
	}

	public static void test1() {
		Land l1= new Land("Schweiz", 40);
		Land l2= new Land("Frankreich", 100);
		Land l3= new Land("Deutschland", 150);
		Stack s1= new Stack(5);
		s1.push(l1);
		s1.push(l3);
		System.out.println(s1.size());
		Object o= s1.peek();
		if (o instanceof Land){
			Land l= (Land)o;
			l.print();
		}
		s1.push(l2);
		System.out.println(s1.size());
		o= s1.peek();
		if (o instanceof Land){
			Land l= (Land)o;
			l.print();
		}
	}

}
