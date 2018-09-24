package azheng;

public class azhengLib
{
    public static String dateStr(String str)
    {
        String day = str.substring(0, 2);
        String month = str.substring(4, 5);
        String year = str.substring(6);
        String newDate = day + " - " + month +  "  - " + year;
        return newDate;

    }

    public static String cutOut(String mainStr, String subStr)
    {
        int cut = mainStr.indexOf(subStr);
        String cutted = "";
        if(cut>0)
        {
            cutted = mainStr.substring(0, cut) + mainStr.substring(cut + subStr.length());
        }
        else{
            cutted = mainStr.substring(subStr.length());
        }
        return cutted;
    }

    public static void multiplicationTable(int base, int range)
    {
        String all= "";
        for(int i = 0;i < range; i++)
        {
            System.out.println(i*base);
        }
    }

    public static void sumUpTo(int start)
    {
        int sum = 0;
        for(int i = 0;i < start+1; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }


}
