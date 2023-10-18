public class if_else{
    public static void main (String args[]){

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

        

    }
}