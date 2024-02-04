package main.drugstore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();

    public void addComponents(Component ... components) {
        Collections.addAll(this.components, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pharmacy [Components: ");
        for (Component component : components) {
            sb.append(component).append(", ");
        }
        if (!components.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }

    // Аналогично можно сделать по полю weight. Добавив метод getWeight() в Component.
    @Override
    public int compareTo(Pharmacy o) {
        int totalPowerThis = this.components.stream().mapToInt(Component::getPower).sum();
        int totalPowerOther = o.components.stream().mapToInt(Component::getPower).sum();
        return Integer.compare(totalPowerThis, totalPowerOther);
    }

    // Наверно это не логично но вот второй способ сравнения, по количеству полей, только их везде 3)
//    @Override
//    public int compareTo(Pharmacy o) {
//        return Integer.compare(this.components.size(), o.components.size());
//    }
}
