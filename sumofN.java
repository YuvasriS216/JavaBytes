import java.util.Scanner;
class sonn{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int N = scanner.nextInt();
        int sum = 0;
        System.out.println("the sum of n is");
        for(int i=1;i<=N;i++){
           sum += i;
        }
    
        System.out.println("Sum of first"+N+"Natural Number"+sum);
        scanner.close();
    }
}

