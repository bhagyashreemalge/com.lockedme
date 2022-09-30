package com.lockedme.src;

import java.util.Scanner;

public class LockedMeUserOperations {
    static String directoryPath=System.getProperty("user.dir")+"\\com\\lockedme\\resources\\filesholder\\";
    static LockedMeServices lms=new LockedMeServices();
    static WelcomeScreen wlcmScreen=new WelcomeScreen();

    public static void main(String[] args)
    {   wlcmScreen.displayHeader();
        wlcmScreen.displayWelcomeTextAndInput();
        Scanner sc=new Scanner(System.in);
        int serviceChoice=sc.nextInt();
        switch(serviceChoice)
        {
            case 1:lms.displayAllFilesInAscOrder(directoryPath);
                break;
            case 2:lms.performOperation(directoryPath);
                break;
            case 3:lms.closeApplication();
                break;
            default:System.out.println("Please entre valid choice");
        }
    }

}
