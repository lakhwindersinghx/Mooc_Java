public class decreasingCounter {
    private int value;// a variable that remembers the value of the counter

    public decreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value > 0) {
            this.value = this.value - 1;
        }
        // and the other methods go here
    }
    public int reset(){
        return 0;
    }
}