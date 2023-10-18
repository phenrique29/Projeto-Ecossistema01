public class Ecossistema {

    public static class Animais {
        private String nome;
        private int idade;

        public Animais(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void Reproduzir() {
            System.out.println(nome + " está se reproduzindo.");
        }

        public void comer() {
            System.out.println(nome + " está se alimentando.");
        }

        public void locomoção() {
            System.out.println(nome + " está se movendo.");
        }
    }

    public static class Mamiferos extends Animais {
        public Mamiferos(String nome, int idade) {
            super(nome, idade);
        }
    }

    public static class Aves extends Animais {
        public Aves(String nome, int idade) {
            super(nome, idade);
        }
    }

    public static class Reptil extends Animais {
        public Reptil(String nome, int idade) {
            super(nome, idade);
        }
    }

    public static class Plantas {
        public void paraQueServe() {
            System.out.println("As plantas servem como abrigo para diversos animais.");
        }

        public void Alimentacao() {
            System.out.println("As plantas produzem alimentos através da fotossíntese.");
        }
    }

    public static class Fenomenos {
        public void Climaticos() {
            System.out.println("Fenômenos climáticos têm impacto significativo na floresta.");
        }

        public void CausasHumanas() {
            System.out.println("As atividades humanas, como as queimadas, são uma ameaça para as florestas.");
        }
    }

    public static void main(String[] args) {
        Mamiferos leao = new Mamiferos("Leão", 6);
        Aves aguia = new Aves("Águia", 3);
        Reptil cobra = new Reptil("Cobra", 2);

        System.out.println("Informações sobre os animais:");
        System.out.println("Nome: " + leao.nome + ", Idade: " + leao.idade);
        leao.Reproduzir();
        leao.comer();
        leao.locomoção();

        System.out.println("Nome: " + aguia.nome + ", Idade: " + aguia.idade);
        aguia.Reproduzir();
        aguia.comer();
        aguia.locomoção();

        System.out.println("Nome: " + cobra.nome + ", Idade: " + cobra.idade);
        cobra.Reproduzir();
        cobra.comer();
        cobra.locomoção();

        Plantas arvore = new Plantas();
        arvore.paraQueServe();
        arvore.Alimentacao();

        Fenomenos fenomenos = new Fenomenos();
        fenomenos.Climaticos();
        fenomenos.CausasHumanas();
    }
}
