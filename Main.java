public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree(55500.0);
        System.out.println(tree1.toString());
        tree1.growOneYear();
        System.out.println(tree1.toString());
        tree1.growOneYear();
        System.out.println(tree1.toString());
        Forest t = new Forest();
        t.addTree(30);
        t.addTree(50);
        System.out.println(t.toString());
        System.out.println(t.toString());
    }
}
