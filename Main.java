package com.company;

abstract class Shop implements Comparable<Shop> {
    abstract double getIncome();
    @Override
    public int compareTo(Shop s)
    {
        return Double.compare(this.getIncome(), s.getIncome());
    }
    public boolean equals (Shop s) {
        return this.getIncome() == s.getIncome();
    }
}
class Flute extends Shop
{
    Flute(int price, int quantity)
    {
        this.p = price;
        this.q = quantity;
    }
    int p,q;
    @Override
    double getIncome() {
        return p*q;
    }
    public String toString() {
        return "price is "+p+" ,quantity is "+q;
    }
}
class Piano extends Shop
{
    Piano(int price, int quantity)
    {
        this.p = price;
        this.q = quantity;
    }
    int p,q;
    @Override
    double getIncome() {
        return p*q;
    }
    public String toString() {
        return "price is "+p+" ,quantity is "+q;
    }
}
class Guitar extends Shop
{
    Guitar(int price, int quantity)
    {
        this.p = price;
        this.q = quantity;
    }
    int p,q;
    @Override
    double getIncome() {
        return p*q;
    }
    public String toString() {
        return "price is "+p+" ,quantity is "+q;
    }
}
public class Main {
    public static void main(String[] args) {

        Piano p = new Piano(2000,15);
        Guitar g = new Guitar(5600,10);
        Flute f = new Flute(8600,8);
        Shop s;

        if (p.getIncome() > g.getIncome() && p.getIncome() > f.getIncome())
            System.out.println("Top Selling Products in category piano "+ p.getIncome());
        else if (g.getIncome() > p.getIncome() && g.getIncome() > f.getIncome())
            System.out.println("Top Selling Products in category guitars "+ g.getIncome());
        else
            System.out.println("Top selling products in category flutes " + f.getIncome());
        System.out.println(p.equals(f));
    }
}