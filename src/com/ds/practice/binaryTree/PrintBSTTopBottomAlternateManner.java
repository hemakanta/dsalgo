package com.ds.practice.binaryTree;

import java.util.*;

public class PrintBSTTopBottomAlternateManner {


    class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        PrintBSTTopBottomAlternateManner obj = new PrintBSTTopBottomAlternateManner();

        Node root = null;

        root =
                obj.addToBST(root, 25);
        obj.addToBST(root, 36);
        obj.addToBST(root, 20);
        obj.addToBST(root, 10);
        obj.addToBST(root, 30);
        obj.addToBST(root, 22);
        obj.addToBST(root, 40);
        obj.addToBST(root, 5);
        obj.addToBST(root, 48);
        obj.addToBST(root, 12);
        obj.addToBST(root, 38);
        obj.addToBST(root, 28);

        obj.levelPrint(root);

        List<List<Integer>> listData = obj.topDown(root);
        obj.printTopReverseDwnALternate(listData);
        obj.topDownLessSpace(root);
    }

    public void printTopReverseDwnALternate(List<List<Integer>> listData) {
        System.out.println("\nTop down data in all the levels.. !!!");
        listData.stream().forEach(lst -> System.out.print(lst+" "));
        int size = listData.size();

        System.out.println("\nFinal Output:");
        List<Integer> top = null;
        List<Integer> down =null;
        for(int i = 0, j=size-1; i<=j && j>0; i++, j--) {

            top =  listData.get(i);
            top.stream().forEach(data -> System.out.print(data+" "));
            if(i!= j) {
                down =  listData.get(j);
                down.stream().sorted(Comparator.reverseOrder()).forEach(data -> System.out.print(data+" "));
            }

        }
    }

    public void topDownLessSpace(Node root) {
        int size = 0;
        Queue<Node> q = new LinkedList();
        q.add(root);
        Deque<Integer> dq = new ArrayDeque();
        dq.add(root.data);
        while(!q.isEmpty()) {
            size = q.size();
            dq.add(null);
            while(size >0) {
                root = q.peek();
                q.remove();
                if(null != root.left) {
                    q.add(root.left);
                    dq.add(root.left.data);
                }
                if(null != root.right) {
                    q.add(root.right);
                    dq.add(root.right.data);
                }
                size --;
            }
        }
        System.out.println("\nFinal output with less space complexity .. !!!");
        while(!dq.isEmpty()) {
            while(dq.peekFirst() != null) {
                System.out.print(dq.pollFirst()+" ");
            }
            dq.pollFirst();
            dq.pollLast();
            while(dq.peekLast() != null) {
                System.out.print(dq.pollLast()+" ");
            }
        }
    }

    public List<List<Integer>> topDown(Node root){
        List<List<Integer>> topDwn = new ArrayList<List<Integer>>();

        Queue<Node> q = new LinkedList();
        q.add(root);
        int size = 0;
        int index = 0;
        List<Integer> data = new ArrayList();
        data.add(root.data);

        while(!q.isEmpty()) {
            topDwn.add(index, data);
            index++;
            size = q.size();
            data = new ArrayList();
            while(size >0) {
                root = q.peek();
                q.remove();
                if(null != root.left) {
                    q.add(root.left);
                    data.add(root.left.data);
                }
                if(null != root.right) {
                    q.add(root.right);
                    data.add(root.right.data);
                }
                size --;
            }
        }
        return topDwn;
    }

    public Node addToBST(Node root, int data) {

        if (null == root) {
            root = new Node(data);
            return root;
        }
        Queue<Node> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            root = q.peek();
            q.remove();

            if (data < root.data) {
                if (null == root.left) {
                    root.left = new Node(data);
                } else {
                    q.add(root.left);
                }
            } else {
                if (null == root.right) {
                    root.right = new Node(data);
                } else {
                    q.add(root.right);
                }
            }
        }
        return root;
    }

    public void levelPrint(Node root) {

        if (null == root) {
            System.out.println("No Datat in Tree");
            return;
        }
        Queue<Node> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            root = q.remove();
            System.out.print(root.data + " ");
            if (null != root.left) {
                q.add(root.left);
            }
            if (null != root.right) {
                q.add(root.right);
            }
        }
    }


}
