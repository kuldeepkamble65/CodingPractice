package Assi2_Resturant;

public class Restaurant{

    private String[] itemarry = new String[100] ;

    private double[] prices = new double[100];
    private int[] ratings = new int[100];
    private int iCount=0;

    public Restaurant() {
    }

    public Restaurant(String[] itemarry, double[] price, int[] ratings, int iCount) {
        this.itemarry = itemarry;
        this.prices = price;
        this.ratings = ratings;
        this.iCount = iCount;
    }


    public void addItem(String item, double price, int rating ){
        itemarry[iCount] = item;
        prices[iCount]=price;
        ratings[iCount]=rating;
        iCount++;

    }
    public void removeItem(String item){
        for(int i=0; i< iCount; i++) {
            if(itemarry[i].equals(item)) {
                for(int j=i; j< iCount-1; j++) {
                    itemarry[j] = itemarry[j+1];
                    prices[j] = prices[j+1];
                    ratings[j] = ratings[j+1];
                }
                iCount--;
                break;
            }

        }
        }
    public double calculateAverageRating() {
        if(iCount == 0) {
            System.out.println("Your cart is empty");
            return 0;
        }
        int sum = 0;
        for(int i=0; i< iCount; i++){
            sum += ratings[i];
        }
        return (double) sum / iCount;
    }
    public String toString() {
        String result = "Restaurant{menuItems=[";
        for (int i = 0; i < iCount; i++) {
            result += itemarry[i];
            if (i != iCount - 1) {
                result += ", ";
            }
        }
        result += "]}";
        return result;
    }
}


