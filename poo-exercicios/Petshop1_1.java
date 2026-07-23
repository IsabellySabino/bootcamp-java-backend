class executarBanho {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Petshop1_0 pet;


    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquiana para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getNome() + "está limpo");

    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return this.pet != null;

    }

    public void setPet(Petshop1_0 pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar pet é necessário limpa-lá");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getNome() + "está na máquina nesse momento");
            return;
        }

        this.pet = pet;
        System.out.println(pet.getNome() + " entrou na máquina.");
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para retirar");
            return;
        }
        this.clean = !this.pet.isClean(); // Se o pet sai limpo, a máquina passa a ficar suja (false)
        System.out.println("O pet " + this.pet.getNome() + " foi retirado");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}