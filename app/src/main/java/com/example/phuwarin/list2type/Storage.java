package com.example.phuwarin.list2type;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class Storage {
    private String[] listTopic = {"สัตว์เลี้ยงลูกด้วยน้ำนม", "สัตว์ครึ่งบนครึ่งน้ำ", "สัตว์เลื้อยคลาน", "ปลา"};
    private String[][] listItem = {{"หมีแพนด้า", "เสือ", "สิงโต", "แมว"},
            {"กบ", "อึ่งอ่าง", "จระเข้", "คางคก"},
            {"จิ้งจก", "ตุ๊กแก", "งู"},
            {"กะพง", "ทับทิม", "ตะเพียน"}};
    private String[] listPhoto = {"https://en.wikipedia.org/wiki/File:Grosser_Panda.JPG",
            "https://en.wikipedia.org/wiki/File:Tigress_at_Jim_Corbett_National_Park.jpg"};

    public String[][] getListItem() {
        return listItem;
    }

    public String[] getListTopic() {
        return listTopic;
    }
}
