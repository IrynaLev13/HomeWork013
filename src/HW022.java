public class HW022 {

    public static void main(String[] args) {
        Smartphones smatr01 = new Androids("Android 9");
        smatr01.call();
        smatr01.sms();
        smatr01.internet();


        
        Smartphones smart02 = new iPhones("iPhone 11");

        smart02.call();
        smart02.sms();
        smart02.internet();

        Androids tel01 = new Androids("SamsungA50");
        iPhones tel02 = new iPhones("iPhone15");
        tel01.call();
        tel01.sms();
        tel01.internet();

        tel02.call();
        tel02.sms();
        tel02.internet();

        LinuxOs telA = new Androids("Redmi 9");
        IOS telB = new iPhones("iPhone 14");

        telA.loading();
        telB.loading();







    }
}
