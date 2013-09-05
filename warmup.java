class warmup {
	
	public static void main(String[] args) {
	
		System.out.println(factorial(5));

	}

	public static int sum(int n){
		int sum = 0;
		for (int i = n;	i>0 ; i--) {
			sum = sum + i;
		}
		return sum;
	}

	public static int xToTheN(int x, int n){
		int sum = 1;
		for (int i = n; i>0; i--) {
			sum = sum * x;
		}
		return sum;
	}

	public static int factorial(int n){
		int sum = 1;
		for (int i = n; i > 0; i--) {
			sum = sum * i;
		}
		return sum;
	}
	
}