import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=1366 lang=java
 *
 * [1366] 通过投票对团队排名
 */

// @lc code=start
class Solution {
    public String rankTeams(String[] votes) {
        int cntPlayers = votes[0].length(), cntVoters = votes.length;
        if(cntVoters==1 || cntPlayers==1) return votes[0];

        Character[] letters = new Character[cntPlayers];
        int idx =0;
        for(Character ch: votes[0].toCharArray()){
            letters[idx++] = ch;
        }
        int[][] count = new int[26][cntPlayers];

        for(int i = 0; i<cntPlayers; i++){
            for(int j = 0; j< cntVoters; j++){
                count[votes[j].charAt(i)-'A'][i]++;
            }
        }

        Arrays.sort(letters, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int[] c1 = count[o1-'A'], c2 = count[o2-'A'];
                for(int i = 0; i<cntPlayers; i++){
                    if(c1[i]>c2[i]){
                        return -1;
                    } else if(c1[i]<c2[i]){
                        return 1;
                    }
                }
                return o1-o2;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(char c:letters){
            sb.append(c);
        }
        return sb.toString();
    }
}
// @lc code=end

