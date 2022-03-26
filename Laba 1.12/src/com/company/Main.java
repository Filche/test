package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File f1 = new File("D:/Программирование/Java/Laba 1.12","text1.txt");
        File f2 = new File("D:/Программирование/Java/Laba 1.12","text2.txt");
        try {
            f1.createNewFile();
            f2.createNewFile();
        }
        catch (IOException ex){
        }

        try(var fw = new FileWriter((f1)))
        {
            Scanner sc = new Scanner(System.in);
            fw.write(sc.nextLine());

        }catch (IOException ex){}

        try(var fr = new FileReader(f1))
        {
            while (fr.ready())
            {
                System.out.print((char) fr.read());
            }

        }
        catch (IOException ex){}

        try(var fw = new FileWriter((f2)))
        {
            Scanner sc = new Scanner(System.in);
            fw.write(sc.nextLine());

        }catch (IOException ex){}

        try(var fr = new FileReader(f2))
        {
            while (fr.ready())
            {
                System.out.print((char) fr.read());
            }

        }
        catch (IOException ex){}

        try(var fw2 = new FileWriter((f2),true);
            var fr1 = new FileReader(f1))
        {


            while(fr1.ready()) {
                fw2.write(fr1.read());

            }


        }catch (IOException ex){}

        System.out.println();

        try(var fr = new FileReader(f2))
        {

            while (fr.ready())
            {
                System.out.print((char) fr.read());
            }

        }
        catch (IOException ex){}
    }
}