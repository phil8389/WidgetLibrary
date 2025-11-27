import java.util.ArrayList;
import java.util.List;

public class AbstractElement {
    String name;
    List<IWidgetListener> listeners;
    public final String getName(){
        return this.name;
    }

    AbstractElement(String name){
        this.name = name;
        this.listeners = new ArrayList<IWidgetListener>();
    }
}
