package models;

/**
 *
 * @author lichi
 */
public class OrderLine {
    // Private Attributes
    private int orderLineId;
    private Product productBought;
    private int quantity;
    private double lineTotal;

    // Constructors
    
    // Default constructor (OrderLine())
    public OrderLine() {
        orderLineId = 101;
        productBought = new Product();
        quantity = 0;
        lineTotal = 0;
    }
    
    
    // constructor for object as only param
    public OrderLine(Product productIn)
    {
        orderLineId = 0;
        productBought = productIn;
        quantity = 1;
        lineTotal = productBought.getPrice();        
    }

    // Parameterized constructor with everything in parameters
    public OrderLine(int orderLineIdIn,
                     Product productIn,
                     int quantityIn,
                     double lineTotalIn
                     ) 
    {
    
        this.orderLineId = orderLineIdIn;
        this.productBought = productIn;
        this.quantity = quantityIn;
        this.lineTotal = lineTotalIn;
    }

    // Parameterized constructor with everything except lineTotal
    public OrderLine(int orderLineIdIn,
                     Product productIn,
                     int quantityIn) 
    {
       
        this.orderLineId = orderLineIdIn;
        this.productBought = productIn;
        this.quantity = quantityIn;
        this.lineTotal = productBought.getPrice()*quantity;
    }
  
    // Getter for orderLineId
    public int getOrderLineId() {
        return orderLineId;
    }

    // Setter for orderLineId
    public void setOrderLineId(int orderLineIdIn) {
        this.orderLineId = orderLineIdIn;
    }

    // Getter for product
    public Product getProductBought() {
        return productBought;
    }

    // Setter for product
    public void setProductBought(Product productIn) {
        this.productBought = productIn;
      
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantityIn) {
        this.quantity = quantityIn;
      
    }

    // Getter for lineTotal
    public double getLineTotal() {
        return lineTotal;
    }

    // Setter for lineTotal
    public void setLineTotal(double lineTotalIn) {
        this.lineTotal = lineTotalIn;
    }
}
