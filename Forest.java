import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> trees;

    public Forest() {
        trees = new ArrayList<Tree>();
    }

    public void addTree(int growthPct) {
        Tree tree1 = new Tree(growthPct);
        trees.add(tree1);
    }

    public String toString() {
        String var1 = "";
        for (Tree tree : trees) {
            var1 = var1 + tree.toString();
        }
        return "Forest(" + var1 + ")";
    }

    public void growOneYear() {
        for (Tree tree : trees) {
            tree.growOneYear();
        }
    }
        
}
