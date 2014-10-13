import java.util.Scanner;

public class Number
{
    public static void Number()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1,000 and 999,999 with a coma: ");
        String number=in.next();
        int commaPosition= number.indexOf(",");
        String part1 = number.substring(0,commaPosition);
        String part2 = number.substring((commaPosition+1));
        String newNum= part1+part2;
        System.out.println(newNum);
    }
    
}
