package m2j.commons;

public class CommonUtil {
	private CommonUtil() {
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void display(Node node) {
		if (node == null) {
			throw new RuntimeException("List is empty");
		}
		Node currentNode = node;

		while (currentNode != null) {
			System.out.print(currentNode.getInfo() + " -> ");
			currentNode = currentNode.getNextNode();
		}
		System.out.println("NULL");
	}
	
	public static int max(int n1, int n2) {
		return (n1 > n2) ? n1:n2;
	}

}
