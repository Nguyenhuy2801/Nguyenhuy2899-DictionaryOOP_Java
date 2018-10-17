/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenhuy
 */
import com.gtranslate.Language;
import com.gtranslate.Translator;
import java.io.IOException;

public class mainTest
{
    public static void main(String[] args) throws IOException
    {
        DictionaryCommandline dm = new DictionaryCommandline();
        System.out.println("^^^^^^^^^^^^^^^^^");
        dm.dictionarySearcher("ap");
        //dm.dictionaryLookUp();
        System.out.println("^^^^^^^^^^^^^^^");
        Translator tran = Translator.getInstance();
        String text = tran.translate("Hello!", Language.ENGLISH, Language.ROMANIAN);
        System.out.println(text); // "Bună ziua!" 
    }
}

