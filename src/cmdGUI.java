import java.io.IOException;
import java.util.Scanner;

public class cmdGUI
{
    DictionaryCommandline dcm = new DictionaryCommandline();

    void callMenuNumber1() throws IOException
    {
        dcm.showAllWords();
        callMenuNumber0();
    }

    void callMenuNumber2() throws IOException
    {
        dcm.dictionarySearcher();
        callMenuNumber0();
    }

    void callMenuNumber3() throws IOException
    {
        dcm.insertSingleWordFromCommanline();
        callMenuNumber1();
    }

    void callMenuNumber4() throws IOException
    {
        dcm.removeSingleWordFromCommanline();
        callMenuNumber1();
    }

    void callMenuNumber5() throws IOException
    {
        dcm.changeSingleWord();
        callMenuNumber1();
    }

    void callMenuNumber0() throws IOException
    {
        System.out.println("----------------------------------------------");
        System.out.println("1: Hien thi tat ca cac tu.");
        System.out.println("2: Tim kiem tu.");
        System.out.println("3: Them tu moi.");
        System.out.println("4: Xoa tu.");
        System.out.println("5: Sua tu.");
        System.out.println("0: Thoat chuong trinh.");
        System.out.printf("nhap lua chon cua ban: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int choose = Integer.parseInt(input);
        switch (choose)
        {
            case 1:
                callMenuNumber1();
                break;
            case 2:
                callMenuNumber2();
                break;
            case 3:
                callMenuNumber3();
                break;
            case 4:
                callMenuNumber4();
                break;
            case 5:
                callMenuNumber5();
                break;
            case 0:
                dcm.dictionaryExportToFile();
                System.exit(0);
            default:
                System.out.println("ban chon sai, xin vui long chon lai: ");
                callMenuNumber0();
        }
    }

    cmdGUI() throws IOException
    {
        dcm.insertFromFile();
        callMenuNumber0();
    }
}