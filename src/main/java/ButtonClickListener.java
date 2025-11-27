public class ButtonClickListener implements IWidgetListener {
    @Override
    public void moveUpdate(MoveEvent e) {

    }

    @Override
    public void clickUpdate(ClickEvent e) {
        System.out.println(e.toString());
    }
}
