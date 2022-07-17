package polimorfismo_sobrescrita;

public class RodarAplicacao {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFila2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFila2 classeFila2 = new ClasseFila2();
        classeFila2.metodo2();

    }
}
