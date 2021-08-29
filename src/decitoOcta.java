import java.util.Scanner;

public class decitoOcta {
    public static void main(String args[]){
        int i;
        int j;
        int l=0;
        System.out.println("enter the decimal number");
        int array[]=new int[100];
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        for(i=0;i<=1000;i++){
            array[i]=decimal%8;
            decimal=decimal/8;
            if(decimal<8){
                i++;
                array[i]=decimal;
                break;
            }
        }
        for(j=i;j>=0;j--){
            System.out.print(array[j]);
        }

    }
}
