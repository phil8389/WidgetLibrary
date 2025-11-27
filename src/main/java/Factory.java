public final class Factory {

    private static class FactoryUniqInstanceHolder{
        private static final Factory UNIQUE_INSTANCE = new Factory();
    }

    public static Factory getInstance()
    {
        return FactoryUniqInstanceHolder.UNIQUE_INSTANCE;
    }

    private Factory()
    {
        //
    }

    public IElement getWidget(String name, String theme)
    {
        Window weatherWidget = null;
        if(name.equals("Weather"))
        {
            weatherWidget = new Window("Weather Widget", new MacOSTheme(theme) );
            Frame fedFrame = new Frame("Canada Weather Info");
            Label l1 = new Label("Countrywise weather warning!");
            Button b1 = new Button("Click here for Countrywise weather warning");
            Label l2 = new Label("Contact Federal Environment Dept on 1-888-xxxxxx");
            fedFrame.addLabel(l1);
            fedFrame.addButton(b1);
            fedFrame.addLabel(l2);

            Frame provinceFrame = new Frame("Quebec Weather Info");
            Label l3 = new Label("Quebec weather forecast");
            Button b2 = new Button("Click here to select CIty and find weather details");
            Label l4 = new Label("Contact Quebec regional offices on 1-514-xxxxx");
            provinceFrame.addButton(b2);
            provinceFrame.addLabel(l3);
            provinceFrame.addLabel(l4);
            fedFrame.addFrame(provinceFrame);
            weatherWidget.addFrame(fedFrame);
        }

        return weatherWidget;
    }


}
