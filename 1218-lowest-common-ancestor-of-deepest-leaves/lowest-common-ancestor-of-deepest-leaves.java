
class Solution {
    class Pair{
        int dep;
        TreeNode node;
        Pair(int dep,TreeNode node){
            this.dep=dep;
            this.node=node;
        }
    }
    Pair solve(TreeNode root){
         if(root==null){
            return new Pair(0,null);
        }
        Pair l=solve(root.left);
        Pair r=solve(root.right);

        if(l.dep==r.dep){
            return new Pair(l.dep+1,root);
        }
        else if(l.dep>r.dep){
            return new Pair(l.dep+1,l.node);
        }
        else{
            return new Pair(r.dep+1,r.node);
        }

    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return solve(root).node;
    }
}