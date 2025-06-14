class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        int flag;
        
        if("<".equals(ineq)){
            flag = n < m ? 1 : 0; 
        } else {
            flag = n > m ? 1 : 0;
        }
        
        flag = eq.equals("=") && n==m ? 1 : flag;
        return flag;
    }
}