package oo;

public class AmoebaTestDrive {
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba("Amoeba.hif");
        amoeba.rotate();

        Amoeba amoeba2 = new Amoeba("Amoeba.hif",5.5,7.5);
        amoeba2.rotate();
    }
}
