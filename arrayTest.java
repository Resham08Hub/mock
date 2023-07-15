package array;

import java.util.Scanner;

public class arrayTest {
	static arrayOperation ob = new arrayOperation();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter element" +" " +(i + 1) );
			a[i] = sc.nextInt();
		}
		while (true) {
			System.out.println("\n 1.Insert \n 2.Delete \n 3.update" + "\n 4.Sort \n 5.Search \n 6.Reverse \n"
					+ "7.Display \n 8.Min" + "\n 9.Max" + "\n 10.is Empty \n 11.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the new element to  insert");
				int new_ele = sc.nextInt();
				System.out.println("Enter the position to insert new element");
				int pos = sc.nextInt();
				a = ob.insert(a, new_ele, pos);
				ob.display(a);
				break;
			}
			case 2: {
				System.out.println("Enter the element to delete");
				int ele = sc.nextInt();
				a = ob.delete(a, ele);
				ob.display(a);
				break;
			}
			case 3: {
				System.out.println("Enter the element to  update");
				int ele = sc.nextInt();
				a = ob.update(a, option, ele);
				ob.display(a);
				break;
			}
			case 4: {
				a = ob.sort(a);
				ob.display(a);
				break;
			}
			case 5: {
				System.out.println("Enter the element to search");
				int ele = sc.nextInt();
				int index = ob.search(a, ele);
				if (index == -1) {
					System.out.println("element not found ");
				} else {
					System.out.println("element found at position " + (index + 1));
				}
				break;
			}
			case 6: {
				int rev[] = ob.reverse(a);
				ob.display(a);
				break;
			}
			case 7: {
				ob.display(a);
				break;
			}
			case 8: {
				int min = ob.min(a);
				System.out.println(" min element is: " + min);
				break;
			}
			case 9: {
				int max = ob.max(a);
				System.out.println(" max element is: " + max);
				break;
			}
			case 10: {
				if (ob.isEmpty(a)) {
					System.out.println("array is empty");
				} else {
					System.out.println("array is not empty ");
				}
				break;
			}
			case 11:{
				System.exit(0);
			}
			default :{
				System.out.println("choose the correct option");
			}

			}
		}
	}
}
