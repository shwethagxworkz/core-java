package com.xworkz.plastoreapp.hub;


import com.xworkz.plastoreapp.application.Application;
import.java.util.Arrays;
import lombok.Builder;
        


public class SoftwareHub   //perform crud on application
{
    Application application[];
    public SoftwareHub(int size){
        application=new Application[size];
    }
    int index;

    public boolean addApplications(Application application) {
        System.out.println("invoked add applications");
        boolean isAdded = false;
        if (application != null) {
            this.application[index++] = application;
            isAdded = true;
        }

        return isAdded;

    }


    public void getAllApplication() {
        System.out.println("The list of application details are:");

        for (int i = 0; i < index; i++) {
            System.out.println(
                    application[i].getAppId() + " " +
                            application[i].getAppName() + " " +
                            application[i].getVersion() + " " +
                            application[i].getSizeInMb() + " " +
                            application[i].getCompanyName() + " " +
                            application[i].getAppType() );

        }
    }

    public Application getApplicationByName(String appName) {
        Application application1 = null;
        System.out.println("invoking the appApplicationByName method");
        for(int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() == appName) {
                application1 = application[appIndex];
                System.out.println("Application is found ..please collect the appName information in executor");
            }
        }
        return application1;
    }

    public Application getApplicationByType(String type) {

        System.out.println("invoking the appApplicationBy type method");
        for(int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType() == type) {
                System.out.println("Application is found please collect the app information based on app type  in executor");

                return application[appIndex];
            }
        }
        return null;
    }


    public Application getApplicationById(int id) {

        System.out.println("invoking the appApplicationBy Id method");
        for(int i = 0; i < this.application.length; i++) {
            if (application[i].getAppId() == id) {
                System.out.println("Application is found please collect the app information based on app Id  in executor");
                return application[i];

            }
        }
        return null;
    }

    public String getApplicationNameByType(String appType)
    {
        String appName=null;

        System.out.println("invoking the method get getApplicationNameByType");
        for (int i = 0; i <this.application.length ; i++) {
            if(application[i].getAppType() == appType){
               appName=application[i].getAppName();
            }

        }
                return appName;
    }

    public int  getapplicationSizeByName(String appName ){
        int  sizeInMb=0;

        for (int i = 0; i < application.length ; i++) {
            if(application[i].getAppName()==appName)
            {
                sizeInMb=application[i].getSizeInMb();
            }

        }
        return sizeInMb;
    }

   public String getApplicationTypeByName(String appName ){
       String  appType=null;

       for (int i = 0; i < application.length ; i++) {
           if(application[i].getAppName()==appName)
           {
               appType=application[i].getAppType();
           }

       }
       return appType;
   }



}



