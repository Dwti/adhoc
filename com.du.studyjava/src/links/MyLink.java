package links;

public class MyLink {
	Node head=null;//ͷ�ڵ�

	public MyLink() {
		
	}
	class Node{
		Node next=null;//��ʾ��ǰ�ڵ����һ���ڵ������
		int data;//�ڵ������
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
				this.next.addNode(d);//�ݹ� 
				
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
/*�������в������ݣ��ⲿʹ�õ�
 * 1.��ͷ������
 * 2.β������
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
	/*ɾ���ڵ�*/
	public void delNode(int data){
		if(head.getData()==data) {
			head=head.next;
		}else {
			head.delNode(data);
		}
		
	}
}
