public class InterviewBit {

        String message = " Welcome to InterviewBit";
    }
    class Scaler extends InterviewBit{


        String message = " Welcome to Scaler Academy";
        public void printMethod(){
            //this will print the message variable of the current class.
            System.out.println(this.message);

            //this will print the message variable of Base class.
            System.out.println(super.message);
        }
        public static void main(String[] args) {
            Scaler sa = new Scaler();
            sa.printMethod();
        }
    }

