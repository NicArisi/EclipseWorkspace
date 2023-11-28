
public class tester {
	public static void main(String args[]) {
		BST bstObj = new BST(50);
		bstObj.addNode(56);
		bstObj.addNode(52);
		bstObj.addNode(25);
		bstObj.addNode(74);
		bstObj.addNode(54);
		bstObj.traverseAndPrint(bstObj.rootNode);
		System.out.println(bstObj.Find(25));
		System.out.println(bstObj.Find(52));
		System.out.println(bstObj.Find(54));
		System.out.println(bstObj.Find(56));
		System.out.println(bstObj.Find(74));
		System.out.println(bstObj.Find(4));//false
		System.out.println(bstObj.Find(100));//false
		System.out.println(bstObj.Find(53));//false
	}
}
