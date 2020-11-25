import java.util.Scanner;

public class pattern4{​​​​

public static void main(String[] args){​​​​

Scanner sc = new Scanner(System.in);



System.out.println("How many rows you want to print in this pattern");

int rows = sc.nextInt();

System.out.println("Here is the pattern");

for(int i=rows;i>=1;i--)

{​​​​

for(int j=1;j<=i;j++)

{​​​​

System.out.print(i+"");

}​​​​

System.out.println();

}​​​​

}​​​​

}​​​​