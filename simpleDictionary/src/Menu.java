import java.util.*;

public class Menu {
     static Scanner s = new Scanner(System.in);
    public  static dictionary firstDictionary = new dictionary();
    public static boolean exit = false;
    private static boolean handleChar(String str){
            str=s.nextLine();
            if(str.length()>1){
                System.out.println("it's not a letter");
                return false;
            }
            return true;

    }
    public static void printMenu(){
        System.out.println("------------------Main Menu------------------");
        System.out.println("1) Print Dictionary");
        System.out.println("2) Search for word");
        System.out.println("3) Words of specific Key");
        System.out.println("4) Remove Key");
        System.out.println("5) Remove Word");
        System.out.println("6) Insert Words");
        System.out.println("7) Exit");
    }
    public static  void mainMenu(){
    int menu = 0;
        try {
         menu = s.nextInt();
    }catch ( InputMismatchException ex){
        System.out.println("please enter valid choice!! : ");
    }
        switch (menu) {
        case 1:
            firstDictionary.printDict();
            break;
        case 2:
            System.out.println("Enter word you want to search for: ");
            s.nextLine();
            String str = s.nextLine();
            System.out.println(str);
                    firstDictionary.search(str);
            break;
        case 3:
            System.out.println("Enter Key you want to search for: ");
            str = s.nextLine();
            if(handleChar(str)){
            Character ch = s.next().charAt(0);
                    firstDictionary.wordsOfGivenLetter(ch);
            }
            break;
        case 4:
            System.out.println("Enter key you want to remove: ");
            str = s.nextLine();
            if(handleChar(str)){
            Character c = s.next().charAt(0);
                    firstDictionary.removeKey(c);
            }
            break;
        case 5:
            System.out.println("enter word you want to Remove: ");
            s.nextLine();
            String st = s.nextLine();
                    firstDictionary.removeWord(st);
            break;
        case 6:
            System.out.println("enter words you want to Insert separated by space: ");
            s.nextLine();
            String [] str1 = s.nextLine().split(" ");
            TreeSet<String> t = new TreeSet<>(Arrays.asList(str1));
                    Collections.addAll(t, str1);
                    firstDictionary.insert(t);
            break;
            case 7:
                exit = true;
                break;
        default:
            System.out.println("Invalid Choice!");
        }
    }
}
