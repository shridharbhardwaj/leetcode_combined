class Solution {
    public boolean isPalindrome(int x) {

        if (x==0){
            return true;
        }

        if (x<0 || x%10 ==0){
            return false;
        }

        int rev = 0;
        while(x>rev){
            int digit = x%10;
            rev = rev*10 + digit;
            x=x/10;
        }

        if(x==rev || x==rev/10){
            return true;
        }      else{
            return false;
        }
    }
}