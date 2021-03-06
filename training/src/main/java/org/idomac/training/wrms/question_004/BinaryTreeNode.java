package org.idomac.training.wrms.question_004;

/**
 * @author : lihaoquan
 * 在二元树中找出和为某一值的所有路径(树)
 * 从树的根结点开始往下访问一直到叶结点所经过的所有结点形成一条路径。
 *
 * *********************************************
 * 参考资料:
 * 1. http://zhuiyi74.iteye.com/blog/838867
 */
public class BinaryTreeNode {

    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
