package tema5.utcluj.ro;

import java.util.Objects;

public class Product
{
    private String name;
    private int quantity;
    private int price;
    public Product()
    {

    }
    public Product (String name, int quantity, int price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return String.format("Name: "+name+"\n"+"Quantity: "+quantity+"\n"+"Price: "+price);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Product product = (Product) o;
        return quantity == product.quantity && price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, quantity, price);
    }
}
