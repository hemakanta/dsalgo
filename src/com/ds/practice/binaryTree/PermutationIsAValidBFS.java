package com.ds.practice.binaryTree;

import java.util.*;

public class PermutationIsAValidBFS {


    HashMap<Integer, Vector<Integer>> tree = new HashMap();
    //HashMap<Integer, Integer> visit = new HashMap();


    public boolean validBfs(List<Integer> chk) {

        int n = (int)chk.size();
        boolean[] visit = new boolean[n+1];
        Queue<HashSet<Integer>> q = new LinkedList<>();
        HashSet<Integer> s = new HashSet();
        s.add(1);

        q.add(s);
        int i = 0;
        while(!q.isEmpty() && i < n) {

            if(visit[chk.get(i)]) {
                return false;
            }
            visit[chk.get(i)]=true;

            if(q.peek().size() == 0) {
                q.remove();
            }

            if (!q.peek().contains(chk.get(i)))
            {
                return false;
            }
            s = new HashSet();

            for(int j : tree.get(chk.get(i))){
                if(visit[j]){
                    continue;
                }
                s.add(j);
            }

            if(s.size() > 0){
                //HashSet<Integer> temp = s;
                q.add(s);
            }

            q.peek().remove(chk.get(i));
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        PermutationIsAValidBFS obj = new PermutationIsAValidBFS();


        for(int i = 0; i < 7; i++) {
            obj.tree.put(i, new Vector<Integer>());
        }

        obj.tree.get(1).add(2);
        obj.tree.get(2).add(1);
        obj.tree.get(1).add(5);
        obj.tree.get(5).add(1);
        obj.tree.get(2).add(3);
        obj.tree.get(3).add(2);
        obj.tree.get(2).add(4);
        obj.tree.get(4).add(2);
        obj.tree.get(5).add(6);
        obj.tree.get(6).add(5);

        Integer[] arr = {1, 5, 2, 6, 3, 4};
        List<Integer> chk = Arrays.asList(arr);

        if (obj.validBfs(chk))
            System.out.print("Yes" + "\n");
        else
            System.out.print("No" + "\n");

    }


}
