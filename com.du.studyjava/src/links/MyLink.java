package links;

public class MyLink {
	Node head=null;//头节点

	public MyLink() {
		
	}
	class Node{
		Node next=null;//表示当前节点的下一个节点的引用
		int data;//节点的数据
		public int getData() {
			return data;
		}
		public Node(int d) {
			this.data=d;
			
		}
		void addNode(int d){
			if(this.next==null) {
				this.next=new Node(d);
			}
			else {
				this.next.addNode(d);//递归 
				
			}
			
		}
		public void delNode(int data2) {
			if(this.next!=null) {
				if(this.next.data==data2) {
					this.next=this.next.next;
				}else {
					this.next.delNode(data2);
				}
			}
			
			
		}
		
	}
/*向链表中插入数据，外部使用的
 * 1.从头部插入
 * 2.尾部插入
 * */
	public void addNode(int data){
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		else {
			head.addNode(data);
		}
		
	}
	/*删除节点*/
	public void delNode(int data){
		if(head.getData()==data) {
			head=head.next;
		}else {
			head.delNode(data);
		}
		
	}
}
