package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File _filePath = new File("D:/Программирование/Java/Refactor Laba 1.12");
        File _file1 = new File(_filePath,"text1.txt");
        File _file2 = new File(_filePath,"text2.txt");
        Scanner _scanner = new Scanner(System.in);
        try {
            _file1.createNewFile();
            _file2.createNewFile();
        }
        catch (IOException ex){}

        WriteFile(_file1, _scanner);

        ReadFile(_file1);

        WriteFile(_file2, _scanner);

        ReadFile(_file2);

        try(var _fileWriterFile2 = new FileWriter((_file2),true);
            var _fileReaderFile1 = new FileReader(_file1))
        {
            while(_fileReaderFile1.ready()) {
                _fileWriterFile2.write(_fileReaderFile1.read());
            }
        }catch (IOException ex){}

        System.out.println();

        ReadFile(_file2);
    }

    public static void ReadFile(File _file)
    {
        try(var _fileReader = new FileReader(_file))
        {
            while (_fileReader.ready())
            {
                System.out.print((char) _fileReader.read());
            }
        }
        catch (IOException ex){}
    }

    public static void WriteFile(File _file, Scanner _scanner)
    {
        try(var fileWriter = new FileWriter((_file)))
        {
            fileWriter.write(_scanner.nextLine());

        }catch (IOException ex){}
    }
}