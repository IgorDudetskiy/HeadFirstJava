public class TestEx {
    public static void main(String[] args) {
        TestEx l = new TestEx();
        String str = "STSs";
        String st = "fg";
        try {
            doR(str);
            doK(st);

            System.out.println("start");
        } catch (BoinkEx b) {
            System.out.println("ah");

        } catch (BillEx b) {

        } catch (BarEx b) {
            System.out.println("STS is good");

        } catch (FooEx b) {
            System.out.println("STS is very good");

        } catch (BazEx b) {

        }
    }



    static void doR(String str) throws BazEx {
        System.out.println("start risky");
        if ("STS".equals(str)) {
            throw new BazEx();

        }

    }
    static void doK(String str) throws BoinkEx {
        System.out.println("start risky");
        if ("fg".equals(str)) {
            throw new BoinkEx();

        }

    }
}

class BazEx extends Exception{

}
class FooEx extends BazEx{

}
class BarEx extends FooEx{

    }

class BillEx extends FooEx{

}
class BoinkEx extends BillEx{

}
