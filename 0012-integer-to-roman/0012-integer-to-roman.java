class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();

        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');

        int bitPlace = (int) Math.pow(10, (int) Math.log10(num));
        int temp = 0;

        for (int i = bitPlace; i > 0; i /= 10) {
            int bit = num / i - temp * 10;
            temp = temp * 10 + bit;

            if (bit == 0) {
                continue;
            }

            if (bit == 5) {
                sb.append(map.get(5 * i));
                continue;
            }

            if (bit < 5) {

                if (5 - bit == 1) {
                    sb.append(map.get(1 * i));
                    sb.append(map.get(5 * i));
                } else {
                    int b = 1;

                    while (b <= bit) {
                        sb.append(map.get(1 * i));
                        b++;
                    }
                }
            } else {
                if (10 - bit == 1) {
                    sb.append(map.get(1 * i));
                    sb.append(map.get(10 * i));
                } else {

                    sb.append(map.get(5 * i));
                    int b = 1;

                    while (5 + b <= bit) {
                        sb.append(map.get(1 * i));
                        b++;
                    }
                }

            }
        }

        return sb.toString();
    }
}