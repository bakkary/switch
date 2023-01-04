import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<String> grønt = new ArrayList<>();

    grønt.add("Agurk");
    grønt.add("Tomat");
    grønt.add("salat");
    Minbrugerdialog minbrugerdialog = new Minbrugerdialog();
    minbrugerdialog.menuValg(grønt);


    }
}