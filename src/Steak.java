public class Steak {
    //push, pop, isempty gibi temel stack fonksiyonlarını içeren sınıf

    DailyData head;

    public Steak() {
        this.head = null;
    }

    void push(DailyData data) {
        data.previousData = head;
        head = data;
    }

    DailyData pop() {
        DailyData temp = head;
        head = head.previousData;
        return temp;
    }

    void delete_all() {
        head = null;
        System.out.println("Tüm veriler silindi");
    }

    boolean is_empty() {
        if (head != null) {
            System.out.println("Steak boş değildir.");
            return true;
        } else {
            System.out.println("Staek boştur.");
            return false;
        }
    }

}
