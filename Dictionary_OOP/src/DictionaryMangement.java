import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DictionaryMangement  {

    void insertSingleWordFromCommanline(String wordTarget, String wordExplain)
    {

        // tao tu moi
        Word newWord = new Word();
        newWord.setWordExlain(wordExplain.toLowerCase());
        newWord.setWordTarget(wordTarget.toLowerCase());
        //add tu moi
        Dictionary.container.add(newWord);
    }

    void insertFromFileDemo(String fullLine) throws FileNotFoundException {
        File dict = new File("dictionary.txt");
        Scanner sc = new Scanner(dict, "utf-8");;
        String[] split = fullLine.split("\t");
        // tao tu moi
        Word newWord = new Word();
        //set tu moi
        newWord.setWordExlain(split[1]);
        newWord.setWordTarget(split[0]);
        //add tu moi
        Dictionary.container.add(newWord);
        sc.close();
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
            Dictionary.container.add(newWord);
        }
        sc.close();
        Collections.sort(Dictionary.container);
    }

    String dictionaryLookUp(String search) {
        search = search.toLowerCase();
        int i = 0;
        for (Word word : Dictionary.container) {
            if (word.getWordTarget().equals(search)) {
                return word.getWordExlain();
            }
        }
        return "";
    }
    
    String binaryLookup (String search, int low, int high)
    {
        
        if( high >= low){
            int mid = low + (high - low) / 2;
            if (search.compareTo(Dictionary.container.get(mid).getWordTarget()) == 0)
                return Dictionary.container.get(mid).getWordExlain();
            if (search.compareTo(Dictionary.container.get(mid).getWordTarget()) > 0)
                return binaryLookup(search, mid + 1, high);
            if (search.compareTo(Dictionary.container.get(mid).getWordTarget()) < 0)
                return binaryLookup(search, low, mid - 1);
        }
        
        return "Không tìm thấy từ";

        
    }
    String binaryAdd (String search, int low, int high)
    {
        
        if( high >= low){
            int mid = low + (high - low) / 2;
            if (search.compareTo(Dictionary.container.get(mid).getWordTarget()) == 0)
                return Dictionary.container.get(mid).getWordExlain();
            if (search.compareTo(Dictionary.container.get(mid).getWordTarget()) > 0)
                return binaryLookup(search, mid + 1, high);
            if (search.compareTo(Dictionary.container.get(mid).getWordTarget()) < 0)
                return binaryLookup(search, low, mid - 1);
        }
        
        return "Không tìm thấy từ";

        
    }
    
    String dictionarySearcher(String search) {

        search = search.toLowerCase();
        for (Word word : Dictionary.container) {
            if (!word.getWordTarget().contains(search)) {
            } else {
                return word.getWordExlain();
            }
        }
        return null;
    }
    // Hàm Nhập dữ liệu từ container vào file
    void dictionaryExportToFile() throws IOException {
        FileWriter fileWriter = new FileWriter("dictionary.txt");
        for (Word oldWord : Dictionary.container) {
            fileWriter.write(oldWord.getWordTarget() + "\t" + oldWord.getWordExlain() + "\n");
        }
        fileWriter.close();
    }
     Boolean removeSingleWordFromCommanline(String search)
    {
        search = search.toLowerCase();
        for (Word word : Dictionary.container)
        {
            if (word.getWordTarget().equals(search))
            {
                Dictionary.container.remove(word);
                System.out.println("da xoa tu " + search);
                return true;
            }
        }
        return false;
    }

    Boolean changeSingleWord(String search, String tmp, String tmp1)
    {
        tmp = tmp.toLowerCase();
        tmp1 = tmp1.toLowerCase();
        Scanner sc = new Scanner(System.in);
        search = search.toLowerCase();
        boolean found  = false;
        for (Word word : Dictionary.container)
        {
            if (word.getWordTarget().equals(search))
            {
                found = true;
                word.setWordTarget(tmp);
                if ( tmp1 != ""){
                    word.setWordExlain(tmp1);
                }
                else {
                    word.setWordExlain(word.getWordExlain());
                }
                return true;
            }
        }
        return false;
//            if (!found)
//            {
//                System.out.println("khong tim thay tu " + search);
//            }
    }
}
