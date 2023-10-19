package com.xworkz.policestation;
import com.xworkz.policestation.officer.officer;
import com.xworkz.policestation.Officer.Policestation;
import com.xworkz.policestation.officer.Policestation;

import java.util.Scanner;


class officerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of officers to be added");
        int size;
        size = sc.nextInt();
        officer policeStation = new officer(int);
        for (int index = 0; index < size; index++) {
            officer officer = new officer();
            System.out.println("enter the officer id");
            int officerId = sc.nextInt();
            officer.setOfficerId(officerId);
            System.out.println("enter the officer name");
            officer.setName(sc.next());
            System.out.println("enter the gender");
            officer.setGender(sc.next());
            System.out.println("enter thr officer age");
            officer.setAge(sc.nextInt());
            System.out.println("enter thr officer post");
            officer.setPostName(sc.next());
            System.out.println("enter thr officer blood group");
            officer.setBloodGroup(sc.next());
            System.out.println("enter thr officer location");
            officer.setAddress(sc.next());
            policeStation.addofficers(officer);
        }
        policeStation.getAllofficer();


        //policeStation.get;

        String input=null;
        do{
            System.out.println("press 1 : to get details");
            System.out.println("press 2 : to get details");
            System.out.println("press 3 : to get details");
            System.out.println("press 4 : to get details");
            System.out.println("press 5 : to get details");
            System.out.println("press 6 : to get details");

            int options= sc.nextInt();
            switch (options)
            {
                case 1 :
                    policeStation.getAllofficer();
                    break;

                case 2 :
                    System.out.println("enter the id");
                    String address = policeStation.getAddressById(sc.nextInt());
                    System.out.println(address);
                    break;

                case 3:
                    System.out.println("enter the name");
                    String officerName=policeStation.getPostNameByName(sc.next());
                    System.out.println(officerName);

                case 4:
                    System.out.println("enter the id");
                    String officerId=policeStation.getPostNameById(sc.nextInt());
                    System.out.println(officerId);

                case 5:
                    System.out.println("enter the name");
                    int officersName=policeStation.getOfficerAgeByName(sc.next());
                    System.out.println(officersName);

                case 6:
                    System.out.println("enter the id");
                    officer id=policeStation.getOfficeInfoById(sc.next());
                    System.out.println(id);

                default:
                    System.out.println("please choose the correct options");
                    break;
            }
            System.out.println("do u want to continue yes/no");
            input = sc.next();
        }while(input.equals("yes"));
        System.out.println("tqww");

    }

}