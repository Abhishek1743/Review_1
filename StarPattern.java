import java.util.Scanner;
class StarPattern{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	int j=0;
	System.out.println("Enter the number");
	int row = input.nextInt();
        for(int i=0; i<row; i++){
            for(j=row-i; j>1; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
