import java.io.FileNotFoundException;

public class DictionaryCommandline extends DictionaryMangement
{
    // In ra thư viện từ điểm và sắp xếp theo thứ tự alphabet
    void showAllWords()
    {
        int i = 1;
        System.out.printf("%-5s| %-20s | Vietnamese\n", "No", "English");
        while (i <= Dictionary.container.size())
        {
            int j = i - 1;
            System.out.printf("%-5d| %-20s | %s\n", i, Dictionary.container.get(j).getWordTarget().trim(), Dictionary.container.get(j).getWordExlain().trim());
            i++;
        }
    }
    void dictionaryBasic ()
    {
        showAllWords();
    }
    void dictionaryAdvanced () throws FileNotFoundException
    {
        insertFromFile();
        showAllWords();
     
    }

    public DictionaryCommandline() throws FileNotFoundException{
        
    }

}
