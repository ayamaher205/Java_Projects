//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double x= 15.52 ,y=10.12;
        int k=7,j=20;
    Proto p= new Proto(x,y);
    Proto p2= new Proto(k,j);
    p.addition();
    p.subtraction();
    p2.addition();
    p2.subtraction();
    }
}