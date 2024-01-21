import java.util.Scanner;
public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        while (true){
            System.out.println("Enter a string or press enter to exit!");
            String entry=scanner.nextLine();
            if(entry.isEmpty()){
                break;
            }
            String[] splitString=entry.split(" ");
            for (String item:splitString){
                System.out.println(item);
            }
        }
    }
}
