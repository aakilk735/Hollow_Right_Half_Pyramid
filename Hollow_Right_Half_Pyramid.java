import java.util.Scanner;
public class Hollow_Right_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number= ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}