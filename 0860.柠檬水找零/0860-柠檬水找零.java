class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count_5 = 0;
        int count_10 = 0;
        int count_20 = 0;
        for(int bill:bills){
            if(bill == 5){
                count_5++;
            }else if(bill == 10){
                if(count_5 == 0){
                    return false;
                }else{
                    count_5--;
                    count_10++;
                }
            }else if(bill == 20){
                if(count_10 > 0){
                    if(count_5 == 0){
                        return false;
                    }else{
                        count_5 --;
                        count_10 --;
                        count_20 ++;
                    }
                }else{
                    if(count_5 < 3){
                        return false;
                    }else{
                        count_5 -= 3;
                    }
                }
            }
        }
        return true;
    }
}