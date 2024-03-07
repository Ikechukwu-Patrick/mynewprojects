package DiaryApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Diary {
    private String userName;
    private String passWord;
    private boolean isLocked;
    public List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void lockDiary() {
        isLocked = true;

    }

    public boolean unLockDiary() {
        lockDiary();
        if (validatePassword(passWord)) {
            isLocked = false;
        }
        throw new IllegalArgumentException("Incorrect pass word, please enter correct pass word");
    }

    private boolean validatePassword(String passWord) {
        if (this.passWord.equals(passWord)) {
            return true;

        }
        throw new IllegalArgumentException("Password incorrect");

    }

    public boolean isLocked() {
        if (unLockDiary()) {
            validatePassword(passWord);
            isLocked = true;
        }
        throw new IllegalArgumentException("Diary is not yet locked");
    }

    public void createEntry(int id, String title, String body) {
        Entry entry = new Entry(id, title, body);
        entries.add(entry);
    }

    public void deleteEntry(int id) {
        Entry deleteEntry = findEntryById(id);
        entries.remove(deleteEntry);
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries)
            if (entry.getId()== id) {
              return entry;
            }
        return null;
    }

    public void updateEntry(int id, String title, String body) {
         var entry = findEntryById(1);
         entry.setBody(body);
         entry.setTittle(title);
    }
    public  String toString(){
        return String.format(entries.toString());
    }

}
class main {
    public static void main(String[] args) {
        Diary diary = new Diary("ayo","1234");
        diary.createEntry(1,"ike","chichi");
        diary.updateEntry(2,"chichi","Oke");
        System.out.println(diary.entries);
    }


}


