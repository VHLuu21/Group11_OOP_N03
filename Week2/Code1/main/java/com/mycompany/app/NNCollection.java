package Week2.Code1.main.java.com.mycompany.app;


import java.util.ArrayList;
import java.util.List;

public class NNCollection<T> {
    private List<T> items;

    public NNCollection() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null; // Hoặc xử lý ngoại lệ nếu cần
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        return "NNCollection [items=" + items + "]";
    }
}
