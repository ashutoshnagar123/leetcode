class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        recur("",0,0,n,list);
        return list;

    }

    private void recur(String s, int open, int close, int n, List<String> list){
        if(open==n && close==n){
            list.add(s);
            return;
        }

        if(open>n || close>n || close>open) return;

        recur(s + "(", open+1, close, n, list);
        recur(s + ")", open, close+1, n, list);

    }
}