import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Window extends AbstractElement implements IElement {
    private List<Frame> frames;
    private ILooknFeel theme;

    Window(String name, ILooknFeel themeSelected) {
        super(name);
        this.theme = themeSelected;
        frames = new ArrayList<Frame>();
    }
    @Override
    public void paint(ICanvas canvas) {
       Iterator iterator = frames.iterator();
       while(iterator.hasNext()){
           Frame frame = (Frame) iterator.next();
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

    void setTheme(String themeName){
        this.theme.setTheme(themeName);
    }

    public List<Frame> getFrames() {
        return frames;
    }

}
