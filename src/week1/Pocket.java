package week1;

public class Pocket {
    private int money;

    public Pocket(int money) {
        this.money = money;
    }

    public long getMoney() {
        if (money <= 10) {
            return 0;
        } else {
            return money;
        }
    }

    public void setMoney(int money) {
        if (money >= 0 && money <=3000) {
            this.money = money;
        } else {
            System.out.println("I don’t have enough space in my pocket for as much money!");
        }
    }
}
