public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Phone 1", 0.2);
        Phone phone2 = new Phone("987654321", "Phone 2", 0.3);
        LandLinePhone landLinePhone1 = new LandLinePhone("111111", "Landline 1", 1.5, true);
        LandLinePhone landLinePhone2 = new LandLinePhone("222222", "Landline 2", 1.8, false);
        MobilePhone mobilePhone1 = new MobilePhone("999999999", "Mobile 1", 0.4, 6.0, true);
        MobilePhone mobilePhone2 = new MobilePhone("888888888", "Mobile 2", 0.5, 5.5, false);

        System.out.println(phone1);
        aboutPhone(phone1);
        phone1.receiveCall("Dima");
        System.out.println(phone2);
        aboutPhone(phone2);
        phone1.receiveCall("Andrew");
        System.out.println(landLinePhone1);
        aboutPhone(landLinePhone1);
        phone1.receiveCall("Johny");
        System.out.println(landLinePhone2);
        aboutPhone(landLinePhone2);
        phone1.receiveCall("Petya");
        System.out.println(mobilePhone1);
        mobilePhone1.sendMessage("Пропущеных звонков", 0);
        aboutPhone(mobilePhone1);
        phone1.receiveCall("Anna");
        System.out.println(mobilePhone2);
        mobilePhone1.sendMessage("Новых сообщений", 2);
        aboutPhone(mobilePhone2);
        phone1.receiveCall("Dasha");

        phone1.setModelName("Iphone");
        phone1.setWeight(0.25);
        phone1.setNumber("123123123");
        mobilePhone2.setscreenSize(5.0);
        mobilePhone2.setisFoldable(true);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(landLinePhone1.toString());
        System.out.println(landLinePhone2.toString());
        System.out.println(mobilePhone1.toString());
        System.out.println(mobilePhone2.toString());
    }
    public static void aboutPhone(RingAble phone) {
        phone.ring();
    }
}