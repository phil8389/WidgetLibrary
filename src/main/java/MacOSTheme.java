public class MacOSTheme implements ILooknFeel {
    @Override
    public void setTheme(String themeName) {
        System.out.println("Theme applied is MacOSTheme");
    }

   public MacOSTheme( String themeName ) {
        setTheme(themeName);
    }
}
