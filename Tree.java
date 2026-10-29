public class BinarySearchTree {

    public Node root;

    public void addNode(int value) {
        root = addNodeIn(value, root);
    }

    private Node addNodeIn(int value, Node currentNode) {

        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = addNodeIn(value, currentNode.left);
        } else if (value > currentNode.value) {
            currentNode.right = addNodeIn(value, currentNode.right);
        }

        return currentNode;
    }

    public int countNodes() {
        return countNodesIn(root);
    }

    private int countNodesIn(Node currentNode) {

        if (currentNode == null) {
            return 0;
        }

        return 1
                + countNodesIn(currentNode.left)
                + countNodesIn(currentNode.right);
    }

    public int countLeaves() {
        return countLeavesIn(root);
    }

    private int countLeavesIn(Node currentNode) {

        if (currentNode == null) {
            return 0;
        }

        if (currentNode.left == null && currentNode.right == null) {
            return 1;
        }

        return countLeavesIn(currentNode.left)
                + countLeavesIn(currentNode.right);
    }
}
