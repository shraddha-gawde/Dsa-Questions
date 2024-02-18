class Solution {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
    int squareSum,d;
	while (inLoop.add(n)) {
		squareSum = 0;
		while (n > 0) {
		    d = n%10;
			squareSum += d*d;
			n /= 10;
		}
		if (squareSum == 1)
			return true;
		else
			n = squareSum;

	}
	return false;

    }
}