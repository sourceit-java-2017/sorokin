package Buildr;

public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.pages = pages;
        this.title = title;
    }

    private Book(Builder b) {
        this.pages = b.pages;
        this.title = b.title;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }


    public static class Builder {

        private String title;
        private int pages;

        Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        Builder withPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }


}
