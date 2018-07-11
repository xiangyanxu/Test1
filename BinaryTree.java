package test2;

public class BinaryTree {
	private class Node{
		private Node lchild;
		private Node rchild;
		private int data;
		public Node(int data){
			this.lchild = null;
			this.rchild = null;
			this.data = data;
		}
	}
	private Node root;
	public BinaryTree(){
		root = null;
	}
	public void buildTree(Node node,int data){
		if(root == null){
			root = new Node(data);
		}else{
			if(data < node.data){
				if(node.lchild == null){
					node.lchild = new Node(data);
				}else{
					buildTree(node.lchild, data);
				}
			}else{
				if(node.rchild == null){
					node.rchild = new Node(data);
				}else{
					buildTree(node.rchild, data);
				}
			}
		}
	}
	public void inOrder(Node node){
		if(node == null){
			return ;
		}else{
			inOrder(node.lchild);
			System.out.println(node.data+" ");
			inOrder(node.rchild);
		}
	}
	public static void main(String[] args) {
		int[] a = {2,4,12,45,21,6,11};
		BinaryTree bTree = new BinaryTree();
		for(int i = 0;i<a.length;i++){
			bTree.buildTree(bTree.root, a[i]);
		}
		bTree.inOrder(bTree.root);
	}
}
