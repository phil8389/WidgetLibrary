import java.time.LocalDateTime;
import java.util.Date;

public class Button extends AbstractElement implements IElement {
    Button(String name) {
        super(name);
    }
    @Override
    public void paint(ICanvas canvas) {
        System.out.println("(Drawing a clickable button) "+ this.getName());
    }



    @Override
    public void notifyListeners(WidgetEvent event) {
       // System.out.println("(Button ) "+ this.getName() + " has clicked and the event has been recorded!");
        System.out.println(event.toString());
    }

    void click(){
        System.out.println("(Clicking the button ) "+ this.getName());
        WidgetEvent event = new ClickEvent("Button name: "+ getName() + " , Event time: "+ LocalDateTime.now());
        this.notifyListeners(event);
    }
}
