package gb.sal;

public class Array {
	private int[]items;
	public int count;
	public Array(int length) {
		
		items=new int[length];
	}
	public void print() {
		for(int i=0;i<count;i++) 
			System.out.println(items[i]);
			
		
	}
	public void insert(int item) {
		
		if(items.length==count) {
			int [] newItem= new int[count*2];
			
			for(int i=0;i<count;i++)
				newItem[i]=items[i];
			items=newItem;
		}
		items[count++]=item;
	}
 
    public void removeAt(int index) {
    	if (index<0||index>=count) 
    		throw new IllegalArgumentException();
    	for(int i=index;i<count;i++) {
    		items[i]=items[i+1];
    		count--;
    	}
	
}
   public int indexOf(int item) {
	   for(int i=0;i<count;i++)
		   if (items[i]==item)
			   return i;
	   return -1;
   }
   
   
}
