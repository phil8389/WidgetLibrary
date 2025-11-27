public class ClickEvent implements WidgetEvent{
   private String eventInfo;
   public ClickEvent(String eventInfo) {
       this.eventInfo = eventInfo;
   }
    public String toString(){
        return eventInfo;
    }
}
