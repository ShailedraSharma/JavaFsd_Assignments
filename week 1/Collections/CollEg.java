import java.util.*;
class CollEg{

	public static void main(String[] args)
	{
	    	List<Integer> list = new ArrayList<Integer>();
	   	list.add("Arun",10);
	    	list.add("Arun");
		list.add("Swathi");
		// list.add(new Integer(10)); // Boxing
		// list.add(5.2);	// AUTO BOXING
		// list.add(true);
		// list.add(15);
		//list.add(null);

		System.out.println(list);
		System.out.println(list.size());

		Iterator it = list.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

		/*Set set = new TreeSet();
	   	//set.add("Arun");
	    	//set.add("Arun");
		//set.add("Swathi");
		set.add(100);
		//set.add(5.2);
		//set.add(true);
		set.add(15);
		//set.add(null);

		System.out.println(set);
		System.out.println(set.size());
		

		Iterator itt = set.iterator();
		while(itt.hasNext())
		{
		System.out.println(itt.next());
		}
		
		Map<Integer,String> map = new TreeMap<>();
	   	map.put(1,"Arun");
	    	map.put(2,"Arun");
		map.put(3,"Swathi");
		map.put(3,"Sharmi");
		 map.put("4thentry",10);
		 map.put(5,5.2);
		 map.put(6,true);
		 map.put(7,15);
		map.put(8,null);
		// map.put(null,89);
		//map.put(null,null);

		System.out.println(map);

		Collection  col=map.values();
		Iterator itm = col.iterator();
		while(itm.hasNext())
		{
		System.out.println(itm.next());
		}
		System.out.println(map.keySet());
		System.out.println(map.size());
		*/
	}

}