class Solution {
    public boolean lemonadeChange(int[] bills) {
        int tens = 0;  
        int fives = 0;
        int i;
        for(i = 0; i < bills.length; i++){
            if(bills[i] == 10){
                if(fives > 0){
                    fives--;
                    tens++;
                }else break;
            }
            else if(bills[i] == 20){
                if(tens > 0 && fives > 0){
                    tens--;
                    fives--;
                }
                else if(tens == 0 && fives > 2){
                    fives -= 3;
                }
                else break;
            }
            else{
                fives++;
            }
        }
        return i == bills.length;
    }
}	