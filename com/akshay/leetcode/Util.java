package com.akshay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Node implements Comparable
{
    int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Node node = (Node)obj;
        return x == node.x && y == node.y;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return ("(" + x + ", " + y + ") ");
    }
};

class Util
{
    // Below arrays details all 8 possible movements from a cell
    private static final int[] row = { -1, -1, -1,  0, 0,  1, 1, 1 };
    private static final int[] col = { -1,  0,  1, -1, 1, -1, 0, 1 };
    private static Map<String, List<Integer>> result = new TreeMap();

    // Function to check if it is possible to go to position next
    // from current position. The function returns false if next is
    // not a valid position or it is already visited
    public static boolean isValid(Node next, List<Node> path, int M, int N)
    {
        return (next.x >= 0) && (next.x < M) &&
                       (next.y >= 0) && (next.y < N) &&
                       (!path.contains(next));
    }

    public static void DFS(char mat[][], String word, Node next, List<Node> path, int index, Map<String, List<Integer>> result)
    {
        int i = next.x;
        int j = next.y;
        int n = word.length();

        // return if characters don"t match
        if (mat[i][j] != word.charAt(index)) {
            return;
        }

        // if all words are matched, print the result and return
        if (index == n - 1)
        {
            //for (int k = 0; k < path.size(); k++)  
            //	System.out.println("'" + word.substring(0) + "'" + path.get(0));
            if(result.containsKey(word)) result.put(word, Arrays.asList(path.get(0).x,path.get(0).y));
            //System.out.println("'" + word.charAt(path.size()) + "'" + new Node(i, j));
            return;
        }

        // include current cell in the path
        path.add(new Node(i, j));

        // check all 8 possible movements from current cell
        // and recurse for each valid movement
        for (int k = 0; k < 8; k++)
        {
            // calculate next position
            next = new Node(i + row[k], j + col[k]);

            // check if it is possible to go to next position
            // from current position
            if (isValid(next, path, mat.length, mat[0].length)) {
                DFS(mat, word, next, path, index + 1, result);
                
            }
        }
        // include current cell in the path
        path.remove(path.size() - 1);

    }

    public static void main(String[] args)
    {
        char mat[][] =
        {
            "TRAP".toCharArray(),
            "CARD".toCharArray(),
            "FACT".toCharArray(),
            "DART".toCharArray()
            
        };
        
        String [] word = {"CAT","FAT","DOG"};
        List<Node> path = new ArrayList<>();
        
        for(String each  : word)  result.put(each, Arrays.asList(-1,-1));
        
        
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[0].length; ++j) {
            	for(String each  : word) {
            	    DFS(mat, each, new Node(i, j), path, 0, result);                    
            	}            
            }
        }
        System.out.println(result);
        
    }
}