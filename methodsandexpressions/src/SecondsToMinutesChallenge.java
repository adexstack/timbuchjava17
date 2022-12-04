public class SecondsToMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(10000);
        getDurationString(0);
        getDurationString(-5);
        getDurationString(50);
        getDurationString(130);
        getDurationString(3610);
        getDurationString(60, 10);
        getDurationString(-5, 10);
        getDurationString(-5, -5);
        getDurationString(0, -5);
        getDurationString(5, 10);
        getDurationString(5, 0);
        getDurationString(0, 30);
        getDurationString(0, 59);
        getDurationString(0, 61);
        getDurationString(65, 145);
    }

    private static void getDurationString(int min, int sec) {
        if(sec < 0 || min < 0){
            System.out.println("seconds is less than 0 " +
                    "minute must be more than 0 and less than 59");
            return;
        }
        int totalSec = (min * 60) + sec;
        getDurationString(totalSec);
    }

    private static void getDurationString(int sec) {
        if(sec < 0){
            System.out.println("seconds must be more than 0");
            return;
        }
        int hr = sec/3600;
        int rmSecHr = (sec % 3600);
        int min = (rmSecHr)/60;
        int rmSec = rmSecHr % 60;
        System.out.println(sec + "S = " + hr + "H " + min + "M " + rmSec + "S");
    }
}
