class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consume=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int extra=empty/numExchange;

            int remain=empty%numExchange;

            consume+=extra;

            empty=remain+extra;
            
        }
        return consume;
    }
}