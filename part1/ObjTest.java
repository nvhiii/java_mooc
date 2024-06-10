public class ObjTest {

    public static void main(String[] args) {

        Obj firstObj = new Obj("nahi");
        System.out.println(firstObj);

        // copy first obj ref
        Obj secondObj = firstObj;
        System.out.println(secondObj);

        secondObj.growOlder();
        System.out.println(secondObj);
        System.out.println(firstObj);

        firstObj = new Obj("mim");
        System.out.println(firstObj);


    }

}