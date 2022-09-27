package Interview;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class time_conversion {

    public static String timeConversion(String time) {
//        String[] splitTime = s.split(":");
//        String hh = splitTime[0];
//        String mm = splitTime[1];
//        String ssPlusAffix = splitTime[2];
//        String ss = ssPlusAffix.substring(0, 2);
//            if(ssPlusAffix.contains("AM")){
//                if(Integer.valueOf(hh) == 12)
//                    hh = "00";
//            } else {
//                Integer hhNum = Integer.valueOf(hh);
//                if(hhNum != 12)
//                    hh = String.valueOf(hhNum + 12);
//            }
//            return hh.concat(":").concat(mm).concat(":").concat(ss);
//        }

        System.out.println(LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.US)).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        return time;
    }
}
