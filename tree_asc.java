class Node_d{
	
	Node_d left=null;
	Node_d right=null;
	int data;
	Node_d(int data)
	{
		this.data=data;
	}
	
	void to_check(Node_d n2)
	{
		if(n2.data>this.data)//right
		{
			if(right==null)
			{
				right=n2;
			}else {
				right.to_check(n2);
			}
		}else {//left
			if(left==null)
			{
				left=n2;
			}else {
				left.to_check(n2);
			}
		}
	}
	
}

class tree{
	Node_d head=null;
	void add(int get_data)
	{
		Node_d n2=new Node_d(get_data);
		 if(head==null)
		 {
			 head=n2;
		 }else {
			 head.to_check(n2);
		 }
	}
	
	boolean recur(Node_d h1)
	{
		if(h1==null)
		{
			System.out.println("get lost");
			return false;
		}
		if(h1.left==null &&  h1.right==null)
		{
			System.out.println(h1.data);
		}
		if(h1.left!=null)
		{
			recur(h1.left);
			System.out.println(h1.data);
		}
		if(h1.right!=null)
		{
			recur(h1.right);
		}
		return true;
	}
	
	void print_sort()
	{
		recur(head);
	}
}
public class tree_asc {

	public static void main(String[] args) {
		tree ll=new tree();
		ll.add(4);ll.add(1);ll.add(7);
		ll.add(0);ll.add(5);ll.add(2);
		ll.print_sort();

	}

}
