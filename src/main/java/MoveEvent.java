public class MoveEvent implements WidgetEvent {
   private String eventInfo;
   public MoveEvent(String eventInfo) {
       this.eventInfo = eventInfo;
   }

   public String toString(){
       return eventInfo;
   }
}
