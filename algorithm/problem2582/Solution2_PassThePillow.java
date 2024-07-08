public class Solution2_PassThePillow {
    public static int passThePillow(int n, int time) {
        int i = 1;
        boolean forward = true;
        while(time != 0){
            time--;
            if(forward){
                i++;
                if(i == n){
                    forward = false;
                }
            }
            else{
                i--;
                if(i == 1){
                    forward = true;
                }
            }
        }
        return i;
    }
}
