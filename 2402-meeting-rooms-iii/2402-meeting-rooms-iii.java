class Solution {

    class Pair {
        int start;
        int end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int mostBooked(int n, int[][] meetings) {

        ArrayList<Pair> meets = new ArrayList<>();

        for (int i = 0; i < meetings.length; i++) {
            Pair p = new Pair(meetings[i][0], meetings[i][1]);
            meets.add(p);
        }

        meets.sort(Comparator.comparingInt(o -> o.start));

        long[] rooms = new long[n];
        int[] count = new int[n];

        for (int i = 0; i < meetings.length; i++) {
            int start = meets.get(i).start;
            int end = meets.get(i).end;

            boolean emptyCheck = false;
            int minEndIndex = -1;
            long minEnd = Long.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (rooms[j] < minEnd) {
                    minEnd = rooms[j];
                    minEndIndex = j;
                }

                if (rooms[j] <= start) {
                    rooms[j] = end;
                    count[j]++;
                    emptyCheck = true;
                    break;
                }
            }
            if (!emptyCheck && (start < rooms[minEndIndex])) {
                rooms[minEndIndex] = rooms[minEndIndex] + end - start;
                count[minEndIndex]++;
            } else if (!emptyCheck && (start >= rooms[minEndIndex])) {
                for (int j = 0; j < n; j++) {
                    if (rooms[j] < start) {
                        rooms[j] = end;
                        count[j]++;
                        break;
                    }
                }
            }

        }

        int maxVal = -1;
        for (int i : count) {

            maxVal = Math.max(i, maxVal);
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (count[i] == maxVal) {

                ans = i;
                break;
            }
        }
        return ans;
    }
}
