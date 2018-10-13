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
