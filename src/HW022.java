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




    }
}
