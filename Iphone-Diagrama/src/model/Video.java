package model;
public class Video extends Midia{
private Boolean wideScreen = false;
    public void wideScreen(){
        if(wideScreen) System.out.println("Modo Wide Screen");
        else System.out.println("Modo normal");
    }

}
