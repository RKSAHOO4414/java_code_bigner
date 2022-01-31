

// How to implements LinkedList by using Collection Framework
import java.util.*;
public class LinkedListEx 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer> ();
		LinkedList<Integer> list1 = null;
		while(true)
		{
			System.out.println("1  - insertAtBegin  	2  - insertAtEnd   	3   - insertAtAnyPosition");
			System.out.println("4  - deleteAtBegin  	5  - deleteAtEnd   	6   - deleteAtAnyPosition");
			System.out.println("7  - displayTheList 	8  - sortTheList   	9   - searchElement");
			System.out.println("10 - reverseList  	 	11 - countTheList  	12  - mergeList");
			System.out.println("13 - removeList    		14 - DisplayElement 15 - elementOccurance");
			System.out.println("16 - deleteDuplicate 	17  - convertArray  18   - arratToList");
			System.out.println("19 - traverseIterator 	20  - traverseListIterator 21   - traverseForEach");
			System.out.println("0 for exit");
			
			System.out.println("Enter the choice ");
			int choice = sc.nextInt();
			switch (choice) 
			{
				case 1:
						System.out.println("Enter the value for the first node ");
						list.addFirst(sc.nextInt());
						break;
				
				case 2:
						System.out.println("Enter the value for last node ");
						list.addLast(new Integer(sc.nextInt()));  // boxing 
						break;
				case 3:
						System.out.println("Enter the position and element");
						list.add(sc.nextInt(),sc.nextInt());
						break;
				case 4:
						System.out.println("Delete node value is : "+list.removeFirst()); 
						System.out.println("After delete the first Node list is : "+list);
						break;
				case 5:
						System.out.println("Delete node value is : "+list.removeLast()); 
						System.out.println("After delete the last Node list is : "+list);
						break;
				
				case 6:
						System.out.println("Enter the position ");
						list.remove(sc.nextInt());
						break;
						
				case 7:
						System.out.println("List is : "+list);
						break;
				
				case 8 :
						Collections.sort(list);
						System.out.println("After sort the list is : "+list);
						break;
				case 9:
						System.out.println("Enter the element to be searched ..");
						int element = sc.nextInt();
						System.out.println("Element present or not : "+list.contains(element));
						System.out.println("First occurance :"+list.indexOf(element));
						System.out.println("Last occurance :"+list.lastIndexOf(element));
						System.out.println("Element present in the folllowing indexes : ");
						for (int i = 0; i < list.size() ; i++) 
						{
							if(list.get(i) == element)
								System.out.println(i);
						}
						break;
				case 10:
						Collections.reverse(list);
						System.out.println("After reverse the list : "+list);
						break;
				case 11:
						System.out.println("The no of Nodes present in list : "+list.size());
						break;
				
				case 12:
						list1 = new  LinkedList<Integer>();
						list1.add(100); // by default add means addLast()
						list1.add(1,200);
						list.add(300);
						list.addAll(list1); // addAll() merging 
						System.out.println("After merge the list1 with the list ");
						break;
				case 13:
						System.out.println("After delete  list1 from the list ");
						list.removeAll(list1);
						break;
				case 14:
						System.out.println("First element in the list : "+list.getFirst());
						System.out.println("Last  element in the list : "+list.getLast());
						System.out.println("Element based on 2  index: "+list.get(2));
						
				case 17:
						System.out.println("After conver the list to array ");
						Object arr[] = list.toArray();
						for(Object ob : arr)
							System.out.print(ob+"\t");
						System.out.println();
						break;	
				case 18:
						Integer arr1[] = new Integer[] {23,34,45};
						LinkedList<Integer> list2 = new LinkedList<Integer>();
						for(Integer x : arr1)
							list2.add(x);
						System.out.println("After array to list : "+list2);
						break;
				case 19:
						System.out.println("Traverse by Iterator interface ");
						Iterator<Integer>  itr1 = list.iterator();
						while(itr1.hasNext())	//	hasNext() method always check the element existance 
						{
							System.out.print(itr1.next() +"\t"); // next() method always return the element
						}
						System.out.println();
						break;
				case 20:
					ListIterator<Integer>  itr2 = list.listIterator();
					
					System.out.println("Traverse by ListIterator interface  forward direction");
					while(itr2.hasNext())	//	hasNext() method always check the next element existance 
					{
						System.out.print(itr2.next() +"\t"); // next() method always return the element
					}
					System.out.println();
					System.out.println("Traverse by ListIterator interface  backward direction");
					while(itr2.hasPrevious())	//	hasPrevious() method always check the previous element existance 
					{
						System.out.print(itr2.previous() +"\t"); // next() method always return the element
					}
					break;
				case 21:
					System.out.println("Traverse by foreach loop");
					for(Integer data : list)
						System.out.println(data);
					break;
					
				case 0:
						System.out.println("Exited");
						System.exit(0);
					
				default:
						System.out.println("Enter a valid Choice ...");
						break;
			}
		}
	}
}
















