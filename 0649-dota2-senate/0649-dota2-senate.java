class Solution {
    public String predictPartyVictory(String senate) {
        boolean[] eliminated = new boolean[senate.length()];

        int i = -1;
        
        while (true) {
            i = (i+1)%(senate.length());
            Character currSenate = senate.charAt(i);
            
            if (eliminated[i]) {
                continue;
            }
            int j = (i+1)%(senate.length());
            while (j != i && (currSenate == senate.charAt(j) || eliminated[j])) {         
                j = (j+1)%(senate.length());
            }
 
            if (j == i) {
                return currSenate == 'R' ? "Radiant" : "Dire";
            }

             eliminated[j] = true;
        }
    }
}