package prac13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filework {

    public Filework(){
        int choice = -1;
        String input;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1 - добавить 2- добавить с перезаписью 3 - печать 0 - выход");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    input = sc.nextLine();
                    this.TestFileAppend(input, true);
                    break;
                case 2:
                    input = sc.nextLine();
                    this.TestFileAppend(input, false);
                    break;
                case 3:
                    this.TestFileOutput();
                    break;
            }
        }
    }

    public void TestFileAppend(String text, boolean append) {
        try(FileWriter writer = new FileWriter("C:\\Users\\nazar\\Downloads\\testtext.txt", append)) {
            writer.append(text);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void TestFileOutput() {
        try(FileReader reader = new
                FileReader("C:\\Users\\nazar\\Downloads\\testtext.txt"))
        {
            int c;
            while((c= reader.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
