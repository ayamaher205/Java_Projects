import static java.lang.Character.isLetter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Alphapets check = (str)-> {
    for(int i = 0;  i < str.length(); i++){
    if(!isLetter(str.charAt(i)))
        return false;
}
    return true;
    };
System.out.println("is this 4 alphapet:  " + check.isOnlyAlphapets("is this 4 alphapet"));
}
}