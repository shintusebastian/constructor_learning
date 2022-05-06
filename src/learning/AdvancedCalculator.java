package learning;
//the code below represents the syntax for inheriting the Calculator class for creating an advanced caculator
public class AdvancedCalculator extends Calculator{
// this inheritance will show error because the parent object wasn't created. Below line solves the error as the constructor was
    // created for the child class using the super keyword. the keyword has to be the first line.
    public AdvancedCalculator(String type) {
        super(type);
    }
}
