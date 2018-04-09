public class Printer {
    private int paperLevel;
    private int tonerLevel;

    public Printer(int paperLevel, int tonerLevel){
        this.paperLevel = paperLevel;
        this.tonerLevel = tonerLevel;
    }

    public int returnPaperLevel() {
        return this.paperLevel;
    }

    public int returnTonerLevel() {
        return this.tonerLevel;
    }

    public void print(int pages, int copies) {
        if (this.paperLevel >= pages*copies)
        { this.paperLevel -= pages*copies;
          this.tonerLevel -= pages*copies;
        }
    }

    public void refillPaper(int pagesForRefill) {
        this.paperLevel += pagesForRefill;
    }
}
