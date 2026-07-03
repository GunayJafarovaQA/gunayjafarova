import java.util.Scanner;

public class exercise10 {


public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Ad Soyad daxil edin:");
        String fullName = sc.nextLine();

        System.out.print("Yas daxil edin");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Illik gelir daxil edin :");
        String incomeText = sc.nextLine();

        double income = Double.parseDouble(incomeText);

        boolean nameCheck = fullName.contains(" ") && fullName.length()>5;
        boolean ageCheck = age >= 18  && age<=70;
        boolean incomeCheck = income >= 3000;

        boolean accepted = nameCheck && ageCheck && incomeCheck ;
           System.out.printf("\n===== HESABAT =====\n") ;
          System.out.printf("Ad Soyad : %s\n",fullName.toUpperCase()) ;
          System.out.printf("Yas : %d\n",age) ;
          System.out.printf("Gelir : %.2f AZN\n", income) ;

             System.out.println  ("\nSertler:");
          System.out.println ("Ad Soyad uygundur:"+nameCheck);
            System.out.println ("Yas uygundur:"+ageCheck);
            System.out.println ("Gelir uygundur:"+ incomeCheck);

                        System.out.println ("\nQerar:" + accepted);

    }
            }
