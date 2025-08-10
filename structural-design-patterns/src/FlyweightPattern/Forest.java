package FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> treeList;

    public Forest() {
        this.treeList = new ArrayList<>();
    }

    public void plantTree(int x, int y, String name, String color, String texture) {
        Tree tree = new Tree(x, y, TreeTypeFactory.getTreeType(name, color, texture));
        treeList.add(tree);
    }

    public void draw() {
        for(Tree tree : treeList) {
            tree.draw();
        }
    }
}
