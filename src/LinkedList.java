public class LinkedList {
    User head;

    public LinkedList() {
        this.head = null;
    }

    public void add(User user) {
        if (head == null) {
            head = user;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = user;
        }
    }

    public void remove(String username) {
        User temp = head;
        User prev = null;
        while (temp != null) {
            if (temp.getUsername().equals(username)) {
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Kullanıcı Zaten yok!");
    }

    public User search(String username) {
        User temp = head;
        while (temp != null) {
            if (temp.getUsername().equals(username)) {
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Kullanıcı bulunamadı.");
        return null;
    }

}

