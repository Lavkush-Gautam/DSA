class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int num=low;num<=high;num++){
            if(num>=10 && num<=99 && num%11==0){
                count++;
            }
            else if(num>=1000 && num<=9999){
                int first=num/1000;
                int sec=(num/100)%10;

                int third=(num/10)%10;
                int four=num%10;
                if(first+sec==third+four){
                    count++;
                }
            }
        }
        return count;
        
    }
}