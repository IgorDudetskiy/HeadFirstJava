public class TestException {
    public static void main(String[] args) {
        /*String test = "No";
        try{
            System.out.println("Begin try");
            doRisky(test);
            System.out.println("End try");
        }catch (ScaryException se){
            System.out.println("Scary exception");
        }finally {
            System.out.println("finally");
        }
        System.out.println("End main");
    }
    static void doRisky(String test) throws ScaryException{
        System.out.println("Begin danger method");
        if("yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("End danger method");
        return;

         */
        System.out.println("start of main");
        String test = "no";
        try{
            System.out.println("start try");
            doRisky(test);
            System.out.println("end  try");
        }catch(ScaryException se){
            System.out.println("scary exception");
        }finally{
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
    static void doRisky(String test) throws ScaryException{
        System.out.println("start risky");
        if( "yes".equals(test) ){
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }

}
class ScaryException extends Exception{


    }
