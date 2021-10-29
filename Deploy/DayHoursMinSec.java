package Deploy;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DayHoursMinSec {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("00.###");// создаем формат для вывода
        int day=0,input,sec,min,hours;
        final int a = 3600;
        System.out.println("Введите число секунд ");
        input = scanner.nextInt();
        hours = input/a;// рассчитываем часы
        min = (input-hours*a)/60;// рассчитываем минуты
        sec = (input-hours*a)-min*60;// рассчитываем секунды
        if (hours >= 24) { // подсчитываем дни
            day = hours/24;
            hours  -= 24 * (hours / 24);
        }
        System.out.println(day+":"+form.format(hours)+":"+form.format(min)+":"+form.format(sec));// выводим с учетом формата
    }
}
