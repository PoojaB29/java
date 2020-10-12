//Created by Pooja
//On 10 Oct 2020
//This program serialize and deserialize binary search tree.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "null";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder result = new StringBuilder(); 
        while( !queue.isEmpty()){
            int size = queue.size();
            for (int i=0; i < size; i++){
               TreeNode current = queue.poll(); 
                if (current == null){
                    result.append("null,");
                    continue;
                }
                result.append(current.val).append(',');
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
        System.out.println(result);
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        int index = 0;
        if (nodes[index].equals("null")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[index++]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i=0; i < size; i++){
                TreeNode current = queue.poll();
                if(!nodes[index].equals("null")){
                    current.left = new TreeNode(Integer.parseInt(nodes[index]));
                    queue.offer(current.left);
                }
                index++;
                if(!nodes[index].equals("null")){
                    current.right = new TreeNode(Integer.parseInt(nodes[index]));
                    queue.offer(current.right);
                }
                index ++;
            }
        }
        
       return root; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;