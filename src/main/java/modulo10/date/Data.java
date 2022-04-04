package modulo10.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main (String []args) throws ParseException {


        SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date teste = data1.parse("12/02/2022");
        Date teste2 = data2.parse("12/02/2022 16:16:30");

        System.out.println(data1.format(teste));
        System.out.println(data2.format(teste2));
    }


}
