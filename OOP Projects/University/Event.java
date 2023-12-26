public class Event {
    private String name;
    private String theme;
    private String date;
    private String organiser;
    Event(String name, String theme, String date, String organiser)
    {this.name=name;
        this.theme=theme;
    this.date=date;
    this.organiser=organiser;}

    public String getDate() {
        return date;
    }

    public String getOrganiser() {
        return organiser;
    }

    public String getTheme() {
        return theme;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void ShowEvent()
    {
        System.out.println("Event name: "+name);
        System.out.println("Theme: "+theme);
        System.out.println("Date: "+date);
        System.out.println("Organised by: "+organiser);

    }
}
