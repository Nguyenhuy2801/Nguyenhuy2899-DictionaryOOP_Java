import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryMangement extends Dictionary
{
    void insertSingleWordFromCommanline()
    {
        Scanner sc = new Scanner(System.in);

        // tao tu moi
        Word newWord = new Word();
        // nhap tu moi
        System.out.print("Nhap tu moi: ");
        String newWordTarget = sc.nextLine();
        System.out.print("Nhap nghia cua tu: ");
        String newWordExplain = sc.nextLine();
        //set tu moi
        newWord.setWordExlain(newWordExplain.toLowerCase());
        newWord.setWordTarget(newWordTarget.toLowerCase());
        //add tu moi
        this.container.add(newWord);
    }

    void insertFromFile() throws FileNotFoundException
    {
        File dict = new File("dictionary.txt");
        Scanner sc = new Scanner(dict, "utf-8");
        while (sc.hasNextLine())
        {
            String fullLine = sc.nextLine();
            String[] split = fullLine.split("\t");
            // tao tu moi
            Word newWord = new Word();
            //set tu moi
            newWord.setWordExlain(split[1].toLowerCase());
            newWord.setWordTarget(split[0].toLowerCase());
            //add tu moi
            this.container.add(newWord);
        }
        sc.close();
        Collections.sort(container);
    }

    void dictionaryLookUp()
    {
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        search = search.toLowerCase();
        int i = 0;
        for (Word word : container)
        {
            if (word.getWordTarget().equals(search))
            {
                i++;
                System.out.printf("%-5d| %-20s | %s\n", i, word.getWordTarget(), word.getWordExlain());
            }
        }
    }

    void dictionaryExportToFile() throws IOException
    {
        FileWriter fileWriter = new FileWriter("Dictionary.txt", false);
        for (Word oldWord : container)
        {
            fileWriter.write(oldWord.getWordTarget() + "\t" + oldWord.getWordExlain() + "\n");
        }
        fileWriter.close();
    }

    void removeSingleWordFromCommanline()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu can xoa: ");
        String search = sc.nextLine();
        search = search.toLowerCase();
        boolean found = false;
        for (Word word : container)
        {
            if (word.getWordTarget().equalsIgnoreCase(search))
            {
                found = true;
                container.remove(word);
                System.out.println("da xoa tu " + search);
                break;
            }
        }
        if (!found)
        {
            System.out.println("khong co tu " + search);
        }
    }

    void changeSingleWord()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tu can sua: ");
        String search = sc.nextLine();
        search = search.toLowerCase();
        boolean found = false;
        for (Word word : container)
        {
            if (word.getWordTarget().equals(search))
            {
                found = true;
                String temp;
                System.out.print("nhap tu moi: ");
                temp = sc.nextLine();
                word.setWordTarget(temp);
                System.out.print("nhap nghia moi: ");
                temp = sc.nextLine();
                word.setWordExlain(temp);
                break;
            }
        }
        if (!found)
        {
            System.out.println("khong tim thay tu " + search);
        }
    }
}