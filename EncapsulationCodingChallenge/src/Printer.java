public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplex) {
        System.out.println(duplex? "Printing in duplex mode" : "");
        this.tonerLevel = (tonerLevel > -1 && tonerLevel < 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if((tonerAmount < 0 || tonerAmount > 100) || ((tonerLevel + tonerAmount) > 100)){
            return -1;
        }
        return tonerLevel += tonerAmount;
    }
    public int printPages(int pages){
        int pagesToPrint = (duplex) ? pages / 2 + pages % 2 : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
