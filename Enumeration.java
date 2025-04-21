import java.util.Enumeration;
import java.util.Vector;
class EnumerationDemo{
	public static void main(String[] args){
		Vector v=new Vector();
		v.add("Mango");
		v.addElement("Banana");
		v.add("Apple");
		v.add("Guava");
		v.add("Dragonfruit");
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			String s=(String) e.nextElement();
			System.out.println(s);
			}
		}
	}

