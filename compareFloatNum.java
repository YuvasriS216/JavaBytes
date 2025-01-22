class cfn{
static void compareFloatNum(double a , double b){
		if(Math.abs(a - b) < 1e-9){
		System.out.println("the  nums are equal");
	}
        else{
		System.out.println("the nums are not equal");
		}

	}
public static void main(String[] args){
	double a = -0.03;
	double b = 9;
	compareFloatNum(a,b);
}
}
