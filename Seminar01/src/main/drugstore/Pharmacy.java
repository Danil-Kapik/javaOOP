package main.drugstore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();

    public void addComponents(Component ... components) {
        Collections.addAll(this.components, components);
    }

    // todo Аналогично можно сделать по полю weight. Добавив метод getWeight() в Component.
    @Override
    public int compareTo(Pharmacy o) {
        int totalPowerThis = this.components.stream().mapToInt(Component::getPower).sum();
        int totalPowerOther = o.components.stream().mapToInt(Component::getPower).sum();
        return Integer.compare(totalPowerThis, totalPowerOther);
    }

    // todo Наверно это не логично но вот второй способ сравнения, по количеству полей
//    @Override
//    public int compareTo(Pharmacy o) {
//        return Integer.compare(this.components.size(), o.components.size());
//    }
}
