import java.util.Scanner;
public class if_else{
    public static void main (String args[]){
        Scanner tb = new Scanner (System.in);

        System.out.println("Uppgift A");
        /*int litetTal=10;

        if(litetTal<1000)
        {
            int stortTal=1000;
            System.out.println(litetTal +" är mindre än "+stortTal);
        }
        else
        {
            System.out.println(litetTal+ " är mindre än " +stortTal);
        }
        System.out.println("litetTal="+litetTal+", stortTal=" +stortTal);*/

        //Varför fungerar koden inte?
        //Svar: int stortTal är skrivet i if-satsen, den finns alltså inte om litetTal inte är mindre än 1000.

        //Hur kan du få koden att fungera?
        //Svar: Man skriver int stortTal=1000 ovanför if-satsen

        int litetTal=10;
        int stortTal=1000;

        if(litetTal<1000)
        {
            System.out.println(litetTal +" är mindre än "+stortTal);
        }
        else
        {
            System.out.println(litetTal+ " är mindre än " +stortTal);
        }
        System.out.println("litetTal="+litetTal+", stortTal=" +stortTal);
        
        System.out.println("");
        System.out.println("Uppgift B och C");
        int tal1=10;
        int tal2=20;

        if(tal2>tal1){
            System.out.println(tal2+ " är större än " +tal1);
        }
        else{
            System.out.println(tal2+ " är mindre än " +tal1);
        }

        System.out.println("");
        System.out.println("Uppgift D");

        System.out.println("Vad är klockan?");
        double tid = (double)tb.nextDouble();

        if(tid>=7.00 && tid<12.00){
            System.out.println("Dags att gå upp");
        }
        else if(tid==12.00){
            System.out.println("Dags att äta");
        }
        else if(tid>=23.00){
            System.out.println("Dags att gå och lägga sig");
        }

        System.out.println("");
        System.out.println("Uppgift E");
        String ja = "JA";
        String nej = "NEJ";

        System.out.println("Hur gammal är du?");
        int ålder = tb.nextInt();

        System.out.println("Är du en medlem? Ja eller nej?");
        String medlem = tb.next();

        if(ålder>=18 || medlem.equalsIgnoreCase(ja)){
            System.out.println("Välkommen");
        }
        else if(ålder<18 || medlem.equalsIgnoreCase(nej)){
            System.out.println("Gå härifrån");
        }

        System.out.println("");
        System.out.println("Uppgift F");
        String namn = "root";
        String pass = "passwd";

        System.out.println("Skriv ditt användarnamn: ");
        String användarnamn = tb.next();

        System.out.println("Skriv ditt lösenord: ");
        String lösenord = tb.next();

        if (användarnamn.equals(namn) && lösenord.equals(pass)){
            System.out.println("loggar in...");
        }
        else if(användarnamn.equals(namn)){
            System.out.println("Fel lösenord");
        }
        else if(lösenord.equals(pass)){
            System.out.println("Fel användarnamn");
        }
        else {
            System.out.println("Fel användarnamn och lösenord");
        }

        System.out.println("");
        System.out.println("Uppgift G");

        System.out.println("Meny Väderprogram");
        System.out.println("1. Skriv ut temperatur");
        System.out.println("2. Skriv ut vind");
        System.out.println("3. Skriv ut luftfuktighet");
        System.out.print("Ange val:");
        int val = tb.nextInt();

        switch(val){

            case 1:
            System.out.println("Det är 18 grader.");
            break;

            case 2: 
            System.out.println("Vinden är 10 sekund-meter.");
            break;

            case 3: 
            System.out.println("Det är 100% luftfuktighet");
            break;
        }
    }
}