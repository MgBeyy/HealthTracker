public class Stack {

    DailyData head;

    public Stack() {
        this.head = null;
    }

    public void push(DailyData data) {
        data.previousData = head;
        head = data;
    }

    public DailyData pop() {
        if (head == null) {
            return null;
        }
        DailyData temp = head;
        head = head.previousData;
        return temp;
    }

    public void delete_all() {
        head = null;
        System.out.println("Tüm veriler silindi");
    }

    public boolean is_empty() {
        return head == null;
    }

    public DailyData search(String date) {
        Stack tempStack = new Stack();
        while (head != null && !head.getDate().equals(date)) {
            tempStack.push(this.pop());
        }
        DailyData foundData = head;

        while (!tempStack.is_empty()) {
            this.push(tempStack.pop());
        }
        return foundData;
    }
}