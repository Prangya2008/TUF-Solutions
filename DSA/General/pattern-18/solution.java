class Solution {
    public void pattern18(int n) {
        char ch = (char)('A'+n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
              
                System.out.print((char)(ch-i+j)+" ");

            }
           System.out.println();
        }
        
    }
}