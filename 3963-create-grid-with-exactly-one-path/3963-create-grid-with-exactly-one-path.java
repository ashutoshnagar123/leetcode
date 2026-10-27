class Solution {
    public String[] createGrid(int m, int n) {
        char[][] ch = new char[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(j==0 || i==m-1){
                    ch[i][j]='.';
                }else{
                    ch[i][j]='#';
                }
            }
        }
        String[] ans = new String[m];
        for(int i=0; i<m; i++){
            ans[i]=new String(ch[i]);
        }
        return ans;
    }
    
}