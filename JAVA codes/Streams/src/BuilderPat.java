class Cake {
    private final int sugar;
    private final int milk;
    private  int vanilla;

    private Cake(CakeBuilder c) {
        this.sugar = c.sugar;
        this.milk = c.milk;
        this.vanilla = vanilla;
    }
    public int getSugar() {
        return sugar;
    }

    public int getMilk() {
        return milk;
    }

    public int getVanilla() {
        return vanilla;
    }
    @Override
    public String toString() {
        return sugar+" "+" "+milk+" "+vanilla;
    }

    static class CakeBuilder {
        private int sugar;
        private int milk;
        private int vanilla;

        public CakeBuilder(int sugar,int milk) {
            this.sugar = sugar;
            this.milk = milk;
        }
        public CakeBuilder setVanilla(int vanilla) {
            this.vanilla = vanilla;
            return this;
        }

        public Cake build() {
            Cake c= new Cake(this);
            return c;
        }

    }
}
public class BuilderPat {
    public static void main(String[] args) {
        Cake c1 = new Cake.CakeBuilder(100,200).setVanilla(300).build();
        System.out.println(c1);
    }
}
