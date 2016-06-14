package com.example.phuwarin.list2type;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class Storage {

    public static String[] listTopic = {"สัตว์เลี้ยงลูกด้วยน้ำนม", "สัตว์ครึ่งบนครึ่งน้ำ", "สัตว์เลื้อยคลาน", "ปลา"};
    public static String[][] listItem = {{"หมีแพนด้า", "เสือ", "สิงโต"},
            {"กบ", "จระเข้", "คางคก"},
            {"จิ้งจก", "ตุ๊กแก", "งู"},
            {"กะพง", "ช่อน", "ตะเพียน"}};
    public static String[][] listPhoto = {
            {"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Grosser_Panda.JPG/1200px-Grosser_Panda.JPG",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Tigress_at_Jim_Corbett_National_Park.jpg/600px-Tigress_at_Jim_Corbett_National_Park.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Lion_waiting_in_Namibia.jpg/375px-Lion_waiting_in_Namibia.jpg"},

            {"https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Anoures.jpg/330px-Anoures.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Persiancrocodile.jpg/330px-Persiancrocodile.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Bufo_bufo.jpg/360px-Bufo_bufo.jpg"},

            {"https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Asian_house_gecko_%28Hemidactylus_platyurus%29.jpg/330px-Asian_house_gecko_%28Hemidactylus_platyurus%29.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Tokay.jpg/360px-Tokay.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/2/2d/NajaKaouthia.jpg"},

            {"https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/13-08-06-abu-dhabi-marina-mall-64.jpg/330px-13-08-06-abu-dhabi-marina-mall-64.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Gabus_070909_0074_rwg.jpg/375px-Gabus_070909_0074_rwg.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Mirror_carp_2008_G1.jpg/330px-Mirror_carp_2008_G1.jpg"}
            };

    public static String[][] getListItem() {
        return listItem;
    }

    public static String[] getListTopic() {
        return listTopic;
    }
}
