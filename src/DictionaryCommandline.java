import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryCommandline extends DictionaryMangement
{
    void showAllWords()
    {
        int i = 1;
        System.out.printf("%-5s| %-20s | Vietnamese\n", "No", "English");
        while (i <= this.container.size())
        {
            int j = i - 1;
            System.out.printf("%-5d| %-20s | %s\n", i, this.container.get(j).getWordTarget().trim(), this.container.get(j).getWordExlain().trim());
            i++;
        }
    }

    void dictionaryBasic()
    {
        insertSingleWordFromCommanline();
        showAllWords();
    }

    void dictionarySearcher()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu can tim: ");
        String search = sc.nextLine();
        search = search.toLowerCase();

        int i = 0;
        for (Word word : container)
        {
            if (word.getWordTarget().substring(0, search.length()).equals(search))
            {
                i++;
                if (i == 1)
                {
                    System.out.println("------------------Ket qua---------------------");
                    System.out.printf("%-5s| %-20s | Vietnamese\n", "No", "English");
                }
                System.out.printf("%-5d| %-20s | %s\n", i, word.getWordTarget(), word.getWordExlain());
            }
        }

        if (i == 0)
        {
            System.out.println("khong co tu " + search);
        }
    }

    void dictionaryAdvanced() throws FileNotFoundException
    {
        insertFromFile();
        showAllWords();
        dictionaryLookUp();
    }
}
