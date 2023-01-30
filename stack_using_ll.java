class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}//End of Node
class MyStack{
    Node head;
    int size;
    MyStack(){
        head=null;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return(head==null);
    }
    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int pop(){
        if(head==null){
            return -1;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }
    int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }
    public void display()
	{
		// check for stack underflow
		if (head == null) {
			System.out.printf("\nStack Underflow");
            return;
		}
		else {
			Node temp = head;
			while (temp != null) {

				// print node data
				System.out.print(temp.data);

				// assign temp link to temp
				temp = temp.next;
				if(temp != null)
					System.out.print(" -> ");
			}
            System.out.println();
		}
    }
}
public class stack_using_ll {
    public static void main(String[] args){
        MyStack s = new MyStack();
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        s.push(55);
        s.display();
        s.pop();
        s.pop();
        s.display();
    }
}
