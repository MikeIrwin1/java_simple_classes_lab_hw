public class Printer {
    private int paperRemaining;
    private int toner;

    public Printer() {
        this.paperRemaining = 20;
        this.toner = 100;
    }

    public int getPaperRemaining(){
        return this.paperRemaining;
    }

    public void print(int noPages, int noCopies){
        int totalPages = noPages * noCopies;
        if (totalPages <= this.paperRemaining) {
            this.paperRemaining -= totalPages;
            this.toner -= totalPages;
        }
    }

    public void refill(){
        this.paperRemaining = 20;
    }

    public int getToner(){
        return this.toner;
    }
}
