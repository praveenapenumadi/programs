import java.util.*;
public class month {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int number_of_days_inmonth=0;
      String monthname="unknown";
      System.out.println("enter the month number");
      int month=sc.nextInt();
      System.out.println("enter the year");
      int year=sc.nextInt();
      switch(month)
      {
          case 1:
            monthname="january";
            number_of_days_inmonth=31;
            break;
        case 2:
           monthname = "February";
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
        {
            number_of_days_inmonth = 29;
        } 
         else 
         {
            number_of_days_inmonth = 28;
         }
         break;
         case 3:
            monthname="march";
            number_of_days_inmonth=31;
            break;
        case 4:
            monthname="april";
            number_of_days_inmonth=30;
            break;
        case 5:
            monthname="may";
            number_of_days_inmonth=31;
            break;
        case 6:
            monthname="june";
            number_of_days_inmonth=30;
            break;
        case 7:
            monthname="july";
            number_of_days_inmonth=31;
            break;  
        case 8:
             monthname="augest";
             number_of_days_inmonth=31;
             break;
        case 9:
            monthname="september";
            number_of_days_inmonth=30;
            break;
        case 10:
            monthname="october";
            number_of_days_inmonth=31;
            break;
        case 11:
            monthname="november";
            number_of_days_inmonth=30;
            break;
        case 12:
            monthname="december";
            number_of_days_inmonth=31;
            break;
      }
      System.out.println(monthname+" "+year+" "+"has   " +number_of_days_inmonth+"days");
    }
}
