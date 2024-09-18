enum TourismType {FOOD, VIEW, PARTY, CULTURE}

public class Tourism implements Mappable{
    private String name;
    private TourismType type;

    public Tourism(String name, TourismType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POLYGON;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case CULTURE -> Color.PURPLE + " " + PointMarker.PUSH_PIN;
            case VIEW -> Color.PURPLE + " " + PointMarker.SQUARE;
            case PARTY -> Color.PURPLE + " " + PointMarker.TRIANGLE;
            case FOOD -> Color.PURPLE + " " + PointMarker.CIRCLE;
            default -> Color.PURPLE + " " + PointMarker.STAR;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s"\s""".formatted(name, type);
    }

}
