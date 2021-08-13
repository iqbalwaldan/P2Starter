package polinema.ac.id.dtschapter03_starter;

public class ScreenItem {

    String Title,Description;
    int ScreenImg, ScreenBackground;

    public ScreenItem(String title, String description, int screenImg, int screenBackground) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
        ScreenBackground = screenBackground;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg, int screenBackground) {
        ScreenImg = screenImg;
        ScreenBackground = screenBackground;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;

    }
    public int getScreenBackground() {
        return ScreenBackground;
    }

}