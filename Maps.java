package maps;

import java.util.*;

public class Maps {
	  public static void main(String[] args) {
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Vamshi");    
	      hm.put(2,"Vyshna");    
	      hm.put(3,"Vennela");   
	       
	      System.out.println("\nhash map elements are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Monitha");  
	      ht.put(5,"Sindhu");  
	      ht.put(6,"Harika");  
	      ht.put(7,"Lahya");  

	      System.out.println("\nhash table elements are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Deepika");    
	      map.put(9,"Gowri");    
	      map.put(10,"Alia");       
	      
	      System.out.println("\ntree map elements are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    

	  }

	
	
	

}