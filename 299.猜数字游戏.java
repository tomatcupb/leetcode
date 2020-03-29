import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=299 lang=java
 *
 * [299] 猜数字游戏
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // int countA = 0;
        // int countB = 0;
        // for(int i = 0; i < secret.length(); i++){
        //     if(secret.charAt(i)==guess.charAt(i)){
        //         countA ++;
        //     } 
        //     if(map.containsKey(guess.charAt(i))){
        //         map.put(guess.charAt(i), map.get(guess.charAt(i))+1);
        //     } else{
        //         map.put(guess.charAt(i), 1);
        //     }
        // }

        // for(int i = 0; i< secret.length(); i++){
        //     if(map.containsKey(secret.charAt(i)) && map.get(secret.charAt(i))!=0){
        //         countB++;
        //         map.put(secret.charAt(i), map.get(secret.charAt(i))-1);
        //     }
        // }


        // return countA+"A"+(countB-countA)+"B";


        int[] secretCount  = new int[10];
        int[] guessCount  = new int[10];
        int countA = 0;
        int countB = 0;
        for(int i = 0; i< secret.length(); i++){
            secretCount[secret.charAt(i)-'0']++;
            guessCount[guess.charAt(i)-'0']++;
            if(secret.charAt(i)==guess.charAt(i)) countA++;
        }

        for(int i = 0; i< 10; i++){
            countB += Math.min(secretCount[i], guessCount[i]);
        }

        return countA+"A"+(countB-countA)+"B";
    }
}
// @lc code=end

