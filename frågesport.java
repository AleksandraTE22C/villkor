import java.util.Scanner;
public class frågesport {
    public static void main(String args[]){
        Scanner tb = new Scanner (System.in);

        int poäng = 0;
        System.out.println("Fråga 1");
        System.out.println("alt1, alt2, alt3, alt4");
        System.out.println("Vilket är rätt? Skriv numret:");
        int val1 = tb.nextInt();

        switch(val1){
            case 1:
            System.out.println("Rätt");
            poäng++;
            System.out.println("Du har "+poäng+" poäng");
            break;
            
            default:
            System.out.println("Fel");
            System.out.println("Du har "+poäng+" poäng");

        }
        System.out.println("");
        System.out.println("Fråga 2");
        System.out.println("alt1, alt2, alt3, alt4");
        System.out.println("Vilket är rätt? Skriv numret:");
        int val2 = tb.nextInt();

        switch(val2){
            
            case 3:
            System.out.println("Rätt");
            poäng++;
            System.out.println("Du har "+poäng+" poäng");
            break;
            
            default:
            System.out.println("Fel");
            System.out.println("Du har "+poäng+" poäng");

        }
        System.out.println("");
        System.out.println("Fråga 3");
        System.out.println("alt1, alt2, alt3, alt4");
        System.out.println("Vilket är rätt? Skriv numret:");
        int val3 = tb.nextInt();

        switch(val3){
            case 2:
            System.out.println("Rätt");
            poäng++;
            System.out.println("Du har "+poäng+" poäng");
            break;
            
            default:
            System.out.println("Fel");
            System.out.println("Du har "+poäng+" poäng");

        }
        System.out.println("");
        System.out.println("Fråga 4");
        System.out.println("alt1, alt2, alt3, alt4");
        System.out.println("Vilket är rätt? Skriv numret:");
        int val4 = tb.nextInt();

        switch(val4){
            case 3:
            System.out.println("Rätt");
            poäng++;
            System.out.println("Du har "+poäng+" poäng");
            break;
            
            default:
            System.out.println("Fel");
            System.out.println("Du har "+poäng+" poäng");

        }
        System.out.println("");
        System.out.println("Fråga 5");
        System.out.println("alt1, alt2, alt3, alt4");
        System.out.println("Vilket är rätt? Skriv numret:");
        int val5 = tb.nextInt();

        switch(val5){
            case 4:
            System.out.println("Rätt");
            poäng++;
            System.out.println("Du har "+poäng+" poäng");
            break;
            
            default:
            System.out.println("Fel");
            System.out.println("Du har "+poäng+" poäng");

        }
        System.out.println("Du fick "+poäng+"/5 poäng");
    }
}