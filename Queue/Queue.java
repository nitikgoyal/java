
import java.util.Scanner;

public class Queue {
		Node front,rear;
		static class Node
		{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
			}
		}
		public static void enQueue(Queue q, int data)
		{
			Node newNode=new Node(data);
			newNode.next=null;
			if(q.front == null)
			{
			q.front=newNode;
			q.rear=newNode;
			System.out.println(data+" is inserted");
			}
			else
			{
				Node last=q.front;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;
				q.rear=newNode;
				System.out.println(data+" is inserted");
			}
		
		}
		public void deQueue()
		{
			if(front==null)
			{
				System.out.println("Queue is empty");
			}
			else
			{
			Node temp=front;
			System.out.println(temp.data+" is deleted");
			front=temp.next;
			}
		}

		public void display()
		{
			Node temp=front;
			System.out.println("Queue is:");
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		Queue q=new Queue();
		Scanner sc=new Scanner(System.in);
		String option1, option2;
		option2 = "yes";
		while (option2.equals("yes")) {
			System.out.println("Enter 1 to insert the element in queue");
			System.out.println("Enter 2 to delete in queue");
			System.out.println("Enter 3 to display");
			option1 = sc.next();
			switch (option1) {
			case "1":
				System.out.println("Enter the element:");
				int num1 = sc.nextInt();
				q.enQueue(q,num1);
				break;
			case "2":
				q.deQueue();
				break;
			case "3":
				q.display();
				break;
			default:
				System.out.println("Invalid Input");

			}
			System.out.println("Whether you want to continue,enter yes or no");
			option2 = sc.next();
			if (option2.equals("yes") || option2.equals("no")) {
				continue;
			} 
			else {
				System.out.println("Enter valid choice:");
				while (!option2.equals("yes")) {
					option2 = sc.next();
					if (option2.equals("no"))
						break;
					else
						System.out.println("Enter valid choice:");
				}

			}

		}
		System.out.println("**PROGRAM FINISHED**");
	}

}
