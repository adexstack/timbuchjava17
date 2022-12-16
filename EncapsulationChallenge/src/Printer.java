public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        int totalToner = tonerLevel + tonerAmount;
        if(totalToner < 0 || totalToner > 100){
            return -1;
        }
        return tonerLevel += tonerAmount;
    }
    public int printPages(int pages){
        int totalPrinted = (duplex) ? pages / 2 + pages % 2 : pages;
        pagesPrinted += totalPrinted;
        return totalPrinted;
    }
}
