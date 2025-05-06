class Solution {
    static void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return ;
        inorder(root.left,arr);
         arr.add(root.val);
       inorder(root.right,arr);
    }
    public int getMinimumDifference(TreeNode root) {
        int mn=Integer.MAX_VALUE;
        ArrayList<Integer>arr=new ArrayList<>();
        inorder(root,arr);
    for(int i=1;i<arr.size();i++){
        mn=Math.min(mn,Math.abs(arr.get(i)-arr.get(i-1)));
    }
    return mn;
}
}