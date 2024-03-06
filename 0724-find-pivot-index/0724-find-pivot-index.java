class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        if(n==1){
            return 0;
        }
        int[] p=new int [n];
        int[] s=new int [n];
        int f=0;
        int ind=-1;
        for(int i=0;i<n;i++){
            f=f+arr[i];
            p[i]=f;
        }
        f=0;
        for(int i=n-1;i>=0;i--){
            f=f+arr[i];
            s[i]+=f;
        }
        
        for(int i=0;i<n;i++){
            if(i==0||i==n-1){
                if(i==0 && s[i+1]==0){
                    ind=0;
                    break;
                }
                else if(i==n-1 && p[i-1]==0){
                    ind=n-1;
                    break;
                }
            }
            else if(p[i-1]==s[i+1]){
                ind=i;
                break;
            }
        }
        return ind;
    }
}