import java.util.Scanner; 

    class sedm { 

   
    public static void main(String[] args) {
       
        System.out.println("Zadej cislo delitelne 7"); 
        
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();

        if(cislo % 7 == 0) {
            System.out.println("Je delitelne 7");
        }
        else {
            System.out.println("Neni delitelne sedmy");

        }        
    }

    
}