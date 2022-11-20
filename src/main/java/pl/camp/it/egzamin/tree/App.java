package pl.camp.it.egzamin.tree;

public class App {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.add(8);
        bt.add(9);
        bt.add(10);
        bt.add(9);
        bt.add(122);
        System.out.println(bt.contains(0));
        System.out.println(bt.contains(10));
        System.out.println(bt.contains(5));
        System.out.println(bt.contains(9));
        System.out.println(bt.min());
        System.out.println(bt.max());
        bt.add(8);
        bt.add(5);
        bt.add(10);
        bt.add(9);
        bt.add(148);
        System.out.println(bt.contains(0));
        System.out.println(bt.contains(10));
        System.out.println(bt.contains(5));
        System.out.println(bt.contains(9));
        System.out.println(bt.min());
        System.out.println(bt.max());
    }
}
