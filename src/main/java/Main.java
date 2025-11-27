public class Main {
    public static void main(String[] args) {
        IElement myWeatherWidget = Factory.getInstance().getWidget("Weather", "Mac OS Theme");
        IWidgetListener btnClickListener = new ButtonClickListener();
       Button btn =  ((Window) myWeatherWidget).getFrames().get(0).getButtons().get(0);
        btn.addListener(btnClickListener);
        myWeatherWidget.paint(new DefaultCanvas());

        btn.click();
    }
}
