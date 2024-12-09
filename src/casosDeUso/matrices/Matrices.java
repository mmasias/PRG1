package casosDeUso.matrices;

class Matrices {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = a;
        int[] c = {1,2,3};
        int[] d = null;
        int[] e = d;

        System.out.println("Igualdad");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==b);
        System.out.println(d==e);

        System.out.println("Lomismidad");

        System.out.println(compara(a,b));
        System.out.println(compara(a,c));
        System.out.println(compara(c,b));
        System.out.println(compara(d,e));
    }

    static boolean compara(int[] primerVector, int[] segundoVector){

        if(primerVector.length!=segundoVector.length){
            return false;
        }

        for(int i=0;i<primerVector.length;i++){
            if(primerVector[i]!=segundoVector[i]) {
                return false;
            }
        }
        return true;
    }
}