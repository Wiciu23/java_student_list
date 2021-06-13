public class DigitSequence implements IntSequence{
    private int number;

    public DigitSequence(int number){
        this.number = number;
    }

    @Override
    public int next() {
        int result = number%10;
        number /= 10;
        return result;
    }

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    public int rest(){
        return  number;
    }


}
