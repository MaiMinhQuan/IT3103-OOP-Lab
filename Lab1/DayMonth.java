package Lab1;

import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] month2 = {"February", "Feb", "Feb.", "2"};

        String[] month31 = {"January", "March", "May", "July", "August", "October", "December",
                            "Jan", "Mar", "Jul", "Aug", "Oct", "Dec",
                            "Jan.", "Mar.", "Aug.", "Oct.", "Dec.",
                            "1", "3", "5", "7", "8", "10", "12"};

        String[] month30 = {"April", "June", "September",  "November",
                            "Apr", "Jun", "Sep", "Nov",
                             "Apr.", "Sept.", "Nov.",
                            "4", "6", "9", "11",};

        
        String month;
        int year;
        int day = 0;
        
        System.out.println("Mai Minh Quan - 20225661 - Nhap thang: ");
        while (true) {
            month = scanner.nextLine();
            boolean check = false;
            
            for (int i = 0; i < month31.length; i++) {
                if (month31[i].equals(month) == true) {
                    check = true;
                    day = 31;
                    break;
                }
            }

            for (int i = 0; i < month30.length; i++) {
                if (month30[i].equals(month) == true) {
                    check = true;
                    day = 30;
                    break;
                }
            }

            for (int i = 0; i < month2.length; i++) {
                if (month2[i].equals(month) == true) {
                    check = true;
                    day = 28;
                    break;
                }
            }

            if (check == false) {
                System.out.println("Mai Minh Quan - 20225661 - Thang khong hop le. Vui long nhap lai!");
            } else {
                break;
            }
        }

        System.out.println("Mai Minh Quan - 20225661 - Nhap nam: ");
        while (true) {
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Mai Minh Quan - 20225661 - Nam khong hop le. Vui long nhap lai!");
            } else {
                break;
            }
        }

        if (day == 28) {
            if (isLeapYear(year) == true) day = 29;
        }

        
        System.out.println("Mai Minh Quan - 20225661 - thang " + month + " nam " + year + " co " + day + " ngay");
        scanner.close();


    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; 
            }
            return true; 
        }
        return false; 
    }
}
