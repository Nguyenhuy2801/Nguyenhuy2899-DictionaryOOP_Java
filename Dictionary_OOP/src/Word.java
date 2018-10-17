/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenhuy
 */
public class Word implements Comparable<Word>
{
    private String wordTarget, wordExlain;

    public String getWordTarget()
    {
        return wordTarget;
    }

    public void setWordTarget(String wordTarget)
    {
        this.wordTarget = wordTarget;
    }

    public String getWordExlain()
    {
        return wordExlain;
    }

    public void setWordExlain(String wordExlain)
    {
        this.wordExlain = wordExlain;
    }
    public int compareTo(Word w) {
        return this.wordTarget.compareTo(w.wordTarget);
    }
}