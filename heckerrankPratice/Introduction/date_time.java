package heckerrankPratice.Introduction;

public class date_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() + " = millis seconds form 1 jan 1970");
        System.out.println(System.currentTimeMillis() / 1000 + " = is seconds form 1 jan 1970");
        System.out.println(System.currentTimeMillis() / 1000 / 60 + " = is minits form 1 jan 1970");
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 + " = is hours form 1 jan 1970");
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 + " = is days form 1 jan 1970");
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365 + " = is year form 1 jan 1970");

    }

}
