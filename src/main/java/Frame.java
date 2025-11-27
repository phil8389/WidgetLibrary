import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Frame extends AbstractElement implements IElement {
    private List<Frame> frames;
    private List<Button> buttons;
    private List<Label> labels;

    Frame(String name) {
        super(name);
        frames = new ArrayList<Frame>();
        buttons = new ArrayList<Button>();
        labels = new ArrayList<Label>();
    }
    @Override
    public void paint(ICanvas canvas) {
        Iterator iterator3 = labels.iterator();
        while(iterator3.hasNext()){
            Label label = (Label) iterator3.next();
            label.paint(canvas);
        }

        Iterator iterator2 = buttons.iterator();
        while(iterator2.hasNext()){
            Button button = (Button) iterator2.next();
            button.paint(canvas);
        }

        Iterator iterator1 = frames.iterator();
        while(iterator1.hasNext()){
            Frame frame = (Frame) iterator1.next();
            frame.paint(canvas);
        }


    }

    @Override
    public void addListener(IWidgetListener listener) {

    }

    @Override
    public void notifyListeners(WidgetEvent event) {

    }

    void addFrame(Frame frame){
        frames.add(frame);
    }
    void addButton(Button button){
        buttons.add(button);
    }
    void addLabel(Label label){
        labels.add(label);
    }

    public List<Button> getButtons() {
        return buttons;
    }
}
