class Solution {
    public void pattern15(int n) {
        for(int i=0;i<n;i++){
            Character ch = 'A';
            for(int j = n;j>i;j--){
                System.out.print(ch++);
                
            }
             System.out.println();
        }
    }
}