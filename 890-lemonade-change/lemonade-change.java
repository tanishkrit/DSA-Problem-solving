
class Solution {
    public boolean lemonadeChange(int[] bills) {

        int bill5 = 0;
        int bill10 = 0;
        int bill20 = 0;

        for(int i = 0; i < bills.length; i++) {

            if(bills[i] == 5) 
            {
                bill5++;
            }

            else if(bills[i] == 10) 
            {
                bill10++;

                if(bill5 >= 1) 
                {
                    bill5--;
                }
                else 
                {
                    return false;
                }
            }

            else if(bills[i] == 20) 
            {
                bill20++;

                if(bill10 >= 1 && bill5 >= 1) 
                {
                    bill10--;
                    bill5--;
                }
                else if(bill5 >= 3) 
                {
                    bill5 -= 3;
                }
                else 
                {
                    return false;
                }
            }
        }

        return true;
    }
}
