public class Label extends AbstractElement implements IElement {
    Label(String name) {
        super(name);
    }
    @Override
    public void paint(ICanvas canvas) {
        System.out.println("(Drawing a info label) "+ this.getName());
    }

    @Override
    public void addListener(IWidgetListener listener) {

    }

    @Override
    public void notifyListeners(WidgetEvent event) {

    }
}
