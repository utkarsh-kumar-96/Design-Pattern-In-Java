package Structural.Flyweight;

import java.awt.Graphics;

//Contains state shared by several trees
//extrinsic data or mutable data
public class Tree {
	 private int x;
	    private int y;
	    private TreeType type;

	    public Tree(int x, int y, TreeType type) {
	        this.x = x;
	        this.y = y;
	        this.type = type;
	    }

	    public void draw(Graphics g) {
	        type.draw(g, x, y);
	    }
}
