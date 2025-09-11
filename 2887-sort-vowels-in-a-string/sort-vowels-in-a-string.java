class Solution {
    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e'|| ch=='i' || ch=='o'||ch=='u');
    }
    public String sortVowels(String s) {
        StringBuilder temp=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                temp.append(ch);
            }
        }

        char[]arr=temp.toString().toCharArray();
        Arrays.sort(arr);

        int j=0;
        char[]res=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                res[i]=arr[j];
                j++;
            }
        }
        return new String(res);
        
    }
}
