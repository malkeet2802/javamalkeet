import java.util.*;
class Item{
	Integer itemID;
	String itemName;
	Item(int itemID,String itemName){
		this.itemID=itemID;
		this.itemName=itemName;
		
	}
	Item(){}
	
		void setitemID(int ItemID){
			this.itemID=itemID;
		}
		void setitemName(String itemName){
			this.itemName=itemName;
		}
		public String toString(){
			return this.itemID+" "+this.itemName;
		}
		@Override
		public boolean equals(Object o){ //Checking with objects
			if(o  instanceof Item){
				Item temp=(Item)o; //Downcasting
			if (this.itemID.equals(temp.itemID)&& this.itemName.equals(temp.itemName))
				{
					return true;
				}
			}
			return false;	
		}
		public int hashCode(){
			int prime = 13;
			int val =1;
			val = val*prime + this.itemID.hashCode();
			val = val*prime + this.itemName.hashCode();
			return val;
		}	
}

class namesort implements Comparator<Item>{
	public int compare(Item I1,Item I2){
		return I1.itemName.compareTo(I2.itemName);
	}
}
class idsort implements Comparator<Item>{
	public int compare(Item I1,Item I2){
		return I1.itemID.compareTo(I2.itemID);
	}
}


class Inventory{
	static Item I = new Item();
	static ArrayList<Item> list = new ArrayList<>();
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int choice;
		Item I1=new Item(1,"Amul Butter");
		Item I2= new Item(2,"Amul Cheese");
		Item I3 = new Item(3,"Amul Ice-cream");
		Item I4 = new Item (4,"Amul Milk");
		
		list.add(I1);
		list.add(I2);
		list.add(I3);
		list.add(I4);
		do{
			System.out.println("Enter your Choice->");
			System.out.println("1.AddItem.\n2.Display inventory in sorted order of itemname and item ID\n3.Remove Item\n4.Exit");
			
			choice = s.nextInt();
			switch(choice){
				case 1:System.out.println("Enter your Details as follows");
				System.out.println("Enter Item to be added");
				for (int i = 1 ; i<=1;i++){
					System.out.println("Enter Item id");
					int d = s.nextInt();
					I.setitemID(d);
					System.out.println("Enter Name of Item");
					s.nextLine();
					String ss = s.nextLine();
					I.setitemName(ss);
					if (!list.contains(I)){
						list.add(I);
					}
				}
				System.out.println("Added Items");
				System.out.println(list);
				case 2: System.out.println("Before sorting");
				System.out.println(list);
				System.out.println("Sorting by ID");
				idsort n2 = new idsort();
				Collections.sort(list,n2);
				System.out.println(list);
				System.out.println("Sorting by Name");
				namesort n1 = new namesort();
				Collections.sort(list,n1);
				System.out.println(list);
				break;
				
				case 3 : System.out.println("List  as follows");
				System.out.println(list);
				System.out.println("Enter item  to be removed with index ");
				int r = s.nextInt();
				list.remove(r);
				System.out.println("List after removal");
				System.out.println(list);
				break;
				case 4: System.out.println("Thankyou");
				break;
				
			}
		}
		while(choice!=4);
	}
}