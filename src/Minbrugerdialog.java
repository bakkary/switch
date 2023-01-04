import java.util.ArrayList;
import java.util.Scanner;

public class Minbrugerdialog {
    public void menuValg(ArrayList<String> grønt) {


            try{


                System.out.println("please chose a vegtable");

                for (int i = 0; i < grønt.size(); i++){
                    System.out.println(grønt.get(i));
                }


        Scanner scan = new Scanner(System.in);
        String brugerInput = scan.nextLine();

        switch (Integer.parseInt(brugerInput)) {

            case 1:
                System.out.println(grønt.get(0));
                break;
            case 2:
                System.out.println(grønt.get(1));
                break;
            case 3:
                System.out.println(grønt.get(2));
                break;
            default:
                System.out.println("invalid input please try again");

        }
        }catch(NumberFormatException e){
                menuValg(grønt);
            }

    }
    }
