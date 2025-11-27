public interface IElement {
    void paint(ICanvas canvas);
    String getName();
    void addListener(IWidgetListener listener);
    void notifyListeners(WidgetEvent event);
}
