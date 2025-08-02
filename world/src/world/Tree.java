package world;

import hlo.nodetree;

public class Tree {
public static void main(String[] args) {
	treeimp n = new treeimp();
	n.insert(10);
	n.insert(20);
	n.insert(30);
	n.insert(2);
	n.insert(5);
	n.insert(9);
	n.delete(10);
	n.inoreder();
	n.preoreder();
	n.postoreder();
	n.search(2000);
}
}

class node {
	int data;
	node left;
	node right;
	
	node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class treeimp {
	node root;
	
	treeimp() {
		this.root = null;
	}
	
	void insert(int data) {
		root = insertrec(root, data);
	}
	
	node insertrec(node root, int data) {
		if(root == null) {
			root = new node(data);
		}
		else if(data > root.data) {
			root.right = insertrec(root.right,data);
		}
		else if (data < root.data) {
			root.left = insertrec(root.left,data);
		}
		return root;
	}
	
	void preoreder() {
		System.out.println("preorder traversal:-");
		preorderrec(root);
		System.out.println();
	}
	
	void preorderrec(node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preorderrec(root.left);
			preorderrec(root.right);
		}
	}
	
	void postoreder() {
		System.out.println("postorder traversal:-");
		postorderrec(root);
		System.out.println();
	}
	
	void postorderrec(node root) {
		if(root != null) {
			postorderrec(root.left);
			postorderrec(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	void inoreder() {
		System.out.println("Inorder traversal:-");
		inorderrec(root);
		System.out.println();
	}
	
	void inorderrec(node root) {
		if(root != null) {
			inorderrec(root.left);
			System.out.print(root.data + " ");
			inorderrec(root.right);
		}
	}
	
	void search(int data) {
		node result = searchrec(root, data);
		if(result != null) {
			System.out.println(data + " found in the tree.");
		}else {
			System.out.println(data + " not found in tree.");
		}
	}
	
	node searchrec(node root,int data) {
		if(root == null || root.data == data) {
			return root;
		}
		if( data > root.data) {
			return searchrec(root.right,data);
		}else {
			return searchrec(root.left,data);
		}
	}
	
	void delete(int data) {
		root = deleterec(root,data);
	}
	
	node deleterec(node root,int data) {
		if(root == null) {
			return null;
		}
		if(data > root.data) {
			root.right = deleterec(root.right, data);
		}
		else if (data < root.data){
			root.left =  deleterec(root.left, data);
		} else {
			//1.both null
			if(root.left == null && root.right == null) {
				return null;
			}
			
			//2.one child
			else if(root.left == null) {
				return root.right;
			}
			else if (root.right == null) {
				return root.left;
			}
			
			//3.two child
			root.data = minvalue(root.right);
			root.right = deleterec(root.right,root.data);
		}
		return root;
	}

	int minvalue(node root) {
		int min = root.data;
		
		while(root.left != null) {
			root = root.left;
			min = root.data;
		}
		return min;
	}
}