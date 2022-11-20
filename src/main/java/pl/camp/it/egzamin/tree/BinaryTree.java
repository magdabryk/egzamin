package pl.camp.it.egzamin.tree;

public class BinaryTree {

    private Node root;


    public void add(int value) {
        root = addRecursive(root, value);
    }

    private int minNode(Node root) {
        return (root.getLeft()) == null ? root.getValue() : minNode(root.getLeft());
    }

public int min(){
        return minNode(root);
}

    private int maxNode(Node root) {
        return (root.getRight()) == null ? root.getValue() : maxNode(root.getRight());
    }

    public int max() {

        return maxNode(root);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            return current;
        }

        return current;
    }

    private boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        } else if (value == current.getValue()) {
            return true;
        }
        return (value < current.getValue() ? containsNode(current.getLeft(), value) : containsNode(current.getRight(), value));
    }

    public boolean contains(int value){
        return containsNode(root , value);
    }
}

