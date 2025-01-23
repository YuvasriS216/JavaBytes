import java.util.Scanner;
public class ageGroup{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        if(age >0 && age <= 12){
            System.out.println("child");
        }
        else if(age >=13 && age <= 19){
            System.out.println("teen");
        }
        else if(age >=20 && age <= 64){
            System.out.println("adult");
        }else if(age >=65){
            System.out.println("senior");
        }
        else{
            System.out.println("dead");
        }
        scanner.close();
    }
}

