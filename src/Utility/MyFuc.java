package Utility;

public class MyFuc {

    public static void Bekle(int sn)
    {
        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            System.out.println("Hata oluştu:"+e.getMessage());
        }
    }

}
