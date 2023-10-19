package com.xworkz.plastoreapp;

import com.xworkz.plastoreapp.application.Application;
import com.xworkz.plastoreapp.hub.SoftwareHub;
import java.util.Scanner;

public class ApplicationEx {
    public static void main(String[] args) {

   /*     //object creation using builder(clasname ref=classname Builder().build;
        Application app=Application.builder().appId(1).appType("SocialMedia").appName("WhatsApp").companyName("Meta").releasedDate("26-3-2023").sizeInMb(300).version(1.3).build();

        /* Application app =new Application();//object creation using new
         app.setAppId(1);
        app.setAppName("Whatsapp");
        app.setSizeInMb(300);
        app.setVersion(2.23);
        app.setReleasedDate("26-3-2023");
        app.setCompanyName("Meta");
        app.setAppType("SocialMedia");*/


  /*      Application app1=new Application();
        app1.setAppId(2);
        app1.setAppName("Snapchat");
        app1.setSizeInMb(500);
        app1.setVersion(2.3);
        app1.setReleasedDate("8-7-2021");
        app1.setCompanyName("SnapInc");
        app1.setAppType("socialMedia");

        Application app3=new Application();
        app3.setAppId(3);
        app3.setAppName("yono SBI");
        app3.setSizeInMb(200);
        app3.setVersion(4.2);
        app3.setCompanyName("SBI");
        app3.setReleasedDate("24-11-2017");
        app3.setAppType("financial app");



        SoftwareHub softwareHub= new SoftwareHub();

        softwareHub.addApplications(app);
        softwareHub.addApplications(app1);
        softwareHub.addApplications(app3);
        //softwareHub.getAllApplication();


        Application appByName= softwareHub.getApplicationByName("Snapchat");
        System.out.println(appByName.getAppId()+" "+appByName.getAppName()+" "+appByName.getCompanyName()+" "+appByName.getVersion()+" "+appByName.getSizeInMb()+" "+appByName.getReleasedDate());

        Application appByType=softwareHub.getApplicationByType("financial app");

        System.out.println("Application information based on type  "+appByType.getAppType());
        System.out.println(appByType.getAppId()+" "+appByType.getCompanyName()+ " "+ appByType.getCompanyName()+ " "+appByType.getVersion()+" "+appByType.getSizeInMb()+" "+ appByType.getReleasedDate());

        Application appById=softwareHub.getApplicationById(2);
        System.out.println("Application information based on  Id"+appById.getAppId());
        System.out.println(appById.getAppId()+ " " +appById.getAppName()+" "+appById.getSizeInMb()+ " "+appById.getVersion()+" "+appById.getCompanyName()+" "+appById.getReleasedDate());


        String appName=softwareHub.getApplicationNameByType("financial app");
        System.out.println("App Name is fetched by the type : "+ appName);

        int sizeinMb=softwareHub.getapplicationSizeByName("Snapchat");
        System.out.println("Application size in MB is fetched by the application name : " +sizeinMb);

        String appTypeByName=softwareHub.getApplicationTypeByName("WhatsApp");
        System.out.println("Application type  fetched by the application Name(WhatssApp) is : "+appTypeByName);
    }
}*/

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of applications to be added");
        int size;
        size=sc.nextInt();
        SoftwareHub software=new SoftwareHub();

        for(int index=0;index<size;index++) {
            Application application=new Application();
            System.out.println("enter the app name");
            application.setAppName(sc.next());
            System.out.println("enter the app size");
            application.setSizeInMb(sc.nextInt());
            System.out.println("enter the app version");
            application.setVersion(sc.nextDouble());
            System.out.println("enter the app release date");
            application.setReleasedDate(sc.next());
            System.out.println("enter the app company name");
            application.setCompanyName(sc.next());
            System.out.println("enter the app type");
            application.setAppType(sc.next());
            software.addApplications(application);
        }
        software.getAllApplication();
        String input=null;
        do{
            System.out.println("press 1:to get details");
            System.out.println("press 2:to get details");
            System.out.println("press 3:to get details");
            System.out.println("press 4:to get details");
            System.out.println("press 5:to get details");
            System.out.println("press 6:to get details");
            System.out.println("press 7:to get details");
            System.out.println("press 8:to get details");

            int options = sc.nextInt();
            switch (options){
                case 1 :
                    software.getAllApplication();
                    break;

                case 2 :
                    System.out.println("enter the type");
                    String appType= software.getApplicationTypeByName(sc.next());
                    System.out.println(appType);

                case 3:
                    System.out.println("enter the application name");
                    Application appName= software.getApplicationByName(sc.next());
                    System.out.println(appName);

                case 4:
                    System.out.println("enter the type");
                    Application type= software.getApplicationByType(sc.next());
                    System.out.println(type);

                case 5:
                    System.out.println("enter the id");
                    Application id= software.getApplicationById(sc.nextInt());
                    System.out.println(id);

                case 6:
                    System.out.println("enter the type");
                    String appType1= software.getApplicationNameByType(sc.next());
                    System.out.println(appType1);

                case 7:
                    System.out.println("enter the application name");
                    int appName1= software.getapplicationSizeByName(sc.next());
                    System.out.println(appName1);

                case 8:
                    System.out.println("enter the application name");
                    String appName2= software.getApplicationTypeByName(sc.next());
                    System.out.println(appName2);

                default:
                    System.out.println("pls choose the options");
                    break;
            }
            System.out.println("do u want to continue Y/N");
            input= sc.next();
        }while (input.equals("Y"));
        System.out.println("tqw for using.....");
    }
}
