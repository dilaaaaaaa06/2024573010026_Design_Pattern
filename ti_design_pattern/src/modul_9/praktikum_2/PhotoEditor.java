package modul_9.praktikum_2;

public class PhotoEditor {
    private FilterStrategy filter;

    public PhotoEditor() {}

    public void setFilter(FilterStrategy filter) {
        this.filter = filter;
    }

    public void applyFilter(String fileName) {
        filter.apply(fileName);
    }
}