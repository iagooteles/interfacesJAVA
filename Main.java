import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Centro de eventos", UsageType.GOVERNMENT));
        mappables.add(new Building("Dragão do mar", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Ponte dos ingleses", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Praça da OAB", UsageType.SPORTS));

        mappables.add(new UtilityLine("Ari de Sá", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Sede da Cagece", UtilityType.WATER));
        mappables.add(new UtilityLine("Sede da enel", UtilityType.ELETRICAL));

        mappables.add(new Tourism("Parque Ypioca", TourismType.VIEW));
        mappables.add(new Tourism("Museu do som e imagem", TourismType.CULTURE));

        for (var m: mappables) {
            Mappable.mapIt(m);
        }
    }
}
