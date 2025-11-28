import java.util.ArrayList;
import java.util.List;

public abstract class AbstractElement {
    String name;
    List<IWidgetListener> listeners;
    public final String getName(){
        return this.name;
    }

    AbstractElement(String name){
        this.name = name;
        this.listeners = new ArrayList<IWidgetListener>();
    }

    public final void addListener(IWidgetListener listener)
    {
        this.listeners.add(listener);
    }
    //public abstract void notifyListeners(WidgetEvent event);
}
