public class App {
    public static void main(String[] args) throws Exception {
        int nota1 = 7;
        int nota2 = 5;
        int nota3 = 5;
        int nota4 = 5;

        int result = (nota1 + nota2 + nota3 + nota4)/4;

        if(result >= 7){
            System.out.println("Parabens em, mais tambem FACIL DE MAIS");
        }else if (result >= 5) {
            System.out.println("Vacilou mané, TA DE RECUPERAÇÃO");
        } else if(result <= 5) {
            System.out.println("kkk a casa caiu! REPROVADO MESMO");
        }
    }
}
