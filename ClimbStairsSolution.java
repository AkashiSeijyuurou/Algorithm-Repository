class Solution1{
	public int climbStairs(int n){
		if(n == 1){
			return 1;
		}
		
		if(n == 2){
			return 2;
		}
		
		return climbStairs(n - 1) + climbStairs(n - 2);
	}
}

class Solution2{
	public int climbStairs(int n){
		int[] arr = new int[n + 1];
		return climb(n, arr);
	}
	
	public int climb(int n, int[] arr){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		if(arr[n] > 0){
			return arr[n];
		}
		
		arr[n] = climb(n - 1, arr) + climb(n - 2, arr);
		return arr[n];
	}
}

class Solution3{
	public int climbStairs(int n){
		int[] climb = new int[n + 1];
		climb[0] = 1;
		climb[1] = 1;
		
		for(int i = 2; i <= n; i++){
			climb[i] = climb[i - 1] + climb[i - 2];
		}
		
		return climb[n];
	}
}