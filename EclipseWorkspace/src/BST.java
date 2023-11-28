
public class BST {
	public BST(int i) {
		rootNode = new BstNode(i);
	}

	public void addNode(int i) {
		BstNode currentNode = rootNode;
		boolean finished = false;
		do {
			BstNode curLeftNode = currentNode.leftNode;
			BstNode curRightNode = currentNode.rightNode;
			int curIntData = currentNode.intData;
			if (i > curIntData) {
				if (curRightNode == null) {
					currentNode.rightNode = new BstNode(i);
					finished = true;
				} else {
					currentNode = currentNode.rightNode;
				}
			} else {
				if (curLeftNode == null) { // create a new node referenced with currentNode.leftNode
					currentNode.leftNode = new BstNode(i);
					finished = true;
				} else {
					currentNode = currentNode.leftNode;
				}
			}
		} while (!finished);
	}
	
	BstNode rootNode;
	public boolean Find(int num) {
		BstNode currentNode = rootNode;
		boolean finished = false;
		boolean returner=false;
		if(currentNode.intData==num) {
			returner=true;
		}else {
			do {
				BstNode curLeftNode = currentNode.leftNode;
				BstNode curRightNode = currentNode.rightNode;
				int curIntData = currentNode.intData;
				if(curLeftNode ==null && curRightNode==null) {
					finished=true;
					returner=false;
				}else {
					if (num > curIntData) {
						if (curRightNode.intData == num) {
							returner=true;
							finished = true;
							break;
						} else {
							currentNode = currentNode.rightNode;
						}
					} else {
						if (curLeftNode.intData == num) { // create a new node referenced with currentNode.leftNode
							returner=true;
							finished = true;
						} else {
							currentNode = currentNode.leftNode;
						}
					}
				}
			} while (!finished);
		}
		return returner;
	}
	public void traverseAndPrint(BstNode currentNode) {
		System.out.print("data = " + currentNode.intData);
		if (currentNode.leftNode == null) {
			System.out.print(" left = null");
		} else {
			System.out.print(" left = " + (currentNode.leftNode).intData);
		}
		if (currentNode.rightNode == null) {
			System.out.print(" right = null");
		} else {
			System.out.print(" right = " + (currentNode.rightNode).intData);
		}
		System.out.println("");
		if (currentNode.leftNode != null)
			traverseAndPrint(currentNode.leftNode);
		if (currentNode.rightNode != null)
			traverseAndPrint(currentNode.rightNode);
	}
}
