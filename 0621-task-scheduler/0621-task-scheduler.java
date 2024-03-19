class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];
        
        for (char task : tasks) {
            frequency[task - 'A']++;
        }
        
        Arrays.sort(frequency);
        
        int maxFreq = frequency[25] - 1;
        
        int idleSlots = maxFreq * n;
        
        for (int i = 24; i >= 0 && frequency[i] > 0; i--) {
            idleSlots -= Math.min(maxFreq, frequency[i]);
        }
        
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}