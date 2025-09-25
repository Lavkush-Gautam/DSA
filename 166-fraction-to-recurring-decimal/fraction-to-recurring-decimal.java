class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)return "0";
        StringBuilder res=new StringBuilder();
        if((long)numerator*(long)denominator <0){
            res.append("-");
        }
        long absNume=Math.abs((long)numerator);
        long absDenom=Math.abs((long)denominator);
         
         long integerPart=absNume/absDenom;
         res.append(integerPart);

         long rem=absNume%absDenom;
         if(rem==0) return res.toString();

         res.append(".");

         Map<Long,Integer>mp=new HashMap<>();
         while(rem!=0){
            if(mp.containsKey(rem)){
                int insertPos=mp.get(rem);
                res.insert(insertPos,"(");
                res.append(")");
                break;
            }

            mp.put(rem,res.length());
            rem*=10;
            long digit=rem/absDenom;
            res.append(digit);
            rem%=absDenom;
         }
return res.toString();
    }
}