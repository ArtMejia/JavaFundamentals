package Interview;

public class time_conversion {

    public static String timeConversion(String s) {
        String[] splitTime = s.split(":");
        String hh = splitTime[0];
        String mm = splitTime[1];
        String ssPlusAffix = splitTime[2];
        String ss = ssPlusAffix.substring(0, 2);
            if(ssPlusAffix.contains("AM")){
                if(Integer.valueOf(hh) == 12)
                    hh = "00";
            } else {
                Integer hhNum = Integer.valueOf(hh);
                if(hhNum != 12)
                    hh = String.valueOf(hhNum + 12);
            }
            return hh.concat(":").concat(mm).concat(":").concat(ss);
        }
    }

