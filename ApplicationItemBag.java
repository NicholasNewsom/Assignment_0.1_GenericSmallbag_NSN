
public class ApplicationItemBag {
	public static final String Item = null;
	
	public static void main(String[] args) 
	{
		Item<String> item1 = new Item<>();
		
		item1.setE("Nicholas Newsom");
		
		Item<Integer> item2 = new Item<>();
		
		item2.setE(25);
		
		Smallbag<Item> smallbag = new Smallbag<>();
		
		smallbag.setE(item1);
		System.out.println("The bag's item is: "+ item1.getE());
		
		smallbag.setE(item2);
		System.out.println("The bag's item is: "+ item2.getE());
	}

}
