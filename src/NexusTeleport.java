
import org.osbot.rs07.api.map.Area;

public enum NexusTeleport {

    //    SELECT_A_TELEPORT(null, null),
//    VARROCK("Varrock", Banks.VARROCK_WEST),
//    GRAND_EXCHANGE("Grand Exchange", Banks.GRAND_EXCHANGE),
//    LUMBRIDGE("Lumbridge", Banks.LUMBRIDGE_UPPER),
//    FALADOR("Falador", Banks.FALADOR_WEST),
//    CAMELOT("Camelot", Banks.CAMELOT),
//    ARDOUGNE("Ardougne", Banks.ARDOUGNE_NORTH),
//    WATCHTOWER("Watchtower", Banks.YANILLE),
    LUNAR_ISLE("Lunar Isle", null);

    private String widgetMessage;
    private Area bankArea;

    NexusTeleport(String location, Area bankArea) {
        this.widgetMessage = location;
        this.bankArea = bankArea;
    }

    public String getWidgetMessage() {
        return widgetMessage;
    }

    public Area getBankArea() {
        return bankArea;
    }
}
