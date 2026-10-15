class Solution {
    public void pattern17(int n) {
         
        for(int i=0;i<n;i++){
            char ch = 'A';
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
                
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch++);
                
            }
              ch -= 2; // Step back past the peak element
            for (int j = 0; j <i; j++) {
                System.out.print(ch);
                ch--;
            }
             System.out.println();
            
        }
    }
}