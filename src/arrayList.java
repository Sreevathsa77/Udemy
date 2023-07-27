import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class arrayList {
public void hashMap() {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(0, "hello"); hm.put(1, "Gudbye"); 
	hm.put(42, "morning"); 
	hm.put(3, "evening"); 
	System.out.println(hm.get(42));
	hm.remove(42); System.out.println(hm.get(42));
	Set sn= hm.entrySet();
	Iterator it =sn.iterator(); 
	//hashtable -pass table set collections  
	while(it.hasNext()) 
	{
		System.out.println(it.next()); 
		Map.Entry mp=(Map.Entry)it.next();
		System.out.println(mp.getKey()); 
		System.out.println(mp.getValue());
	}
}

public void hashSet() {
	//HashSet treeset, LinkedHashset implements Set interface 
	//does not accept duplicate values  
	// There is no guarantee elements stored in sequential order..Random order 
	HashSet<String> hs= new HashSet<String>(); hs.add("USA"); 
	hs.add("UK");
	hs.add("INDIA");
	hs.add("he"); 
	hs.add("she"); 
	hs.add("INDIA"); 
	System.out.println(hs);
	//System.out.println(hs.remove("UK")); 
	System.out.println(hs.isEmpty()); 
	System.out.println(hs.size()); 
	Iterator<String> i=hs.iterator(); 
	while(i.hasNext()) 
	{ 
		System.out.println(i.next()); 

	} }
public void arrayList() {
	// can accept duplicate values //ArraList,LinkedList,vector- Implementing List interface //array have fixed size where as arraylist can grow dynamicaly //you can access and insert any value in any index private int i =5; public static void main(String[] args) { // TODO Auto-generated method stub

	ArrayList<String> a=new ArrayList<String>(); 
	a.add("rahul");
	a.add("java"); 
	a.add("java"); 
	System.out.println(a); 
	a.add(0, "student"); 
	System.out.println(a); 
	/*a.remove(1); 
	 * a.remove("java"); 
	 * System.out.println(a);*/ 
	System.out.println(a.get(2)); 
	// testing 
	System.out.println(a.contains("java")); 
	System.out.println(a.indexOf("rahul")); 
	System.out.println(a.isEmpty()); 
	System.out.println(a.size()); } 


public static void main(String[] args) {
	arrayList AL = new arrayList();
	AL.arrayList();
	AL.hashMap();
	AL.hashSet();
	
}}

