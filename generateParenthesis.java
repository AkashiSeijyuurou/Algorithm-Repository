class Solution {
    public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		generate(0, 0, n, "", result);
		return result;
    }
	
	public void generate(int left, int right, int n, String s, List<String> list){
		//terminator
		if(left == n && right == n){
			list.add(s);
		}
		
		//process
		//drill down
		if(left < n)
			generate(left + 1, right, max, s + "(", list);
		
		if(right < left)
			generate(left, right + 1, max, s + ")", list);
		//reverse state
	}
}