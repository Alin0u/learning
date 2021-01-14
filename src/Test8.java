import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println(dateFormat.format(date));
    }
}
