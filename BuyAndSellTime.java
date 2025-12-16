public class BuyAndSellTime {
    public static int profitCalc(int[] price)
    {
        int profit=0;
        int min=price[0];
        for(int p:price)
        {
            min=Math.min(min,p);
            profit=Math.max(profit,p-min);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] price={7,1,3,6,2};
        System.out.println(BuyAndSellTime.profitCalc(price));
    }
}
 /* Logic explanation - here we are providing an array of prices. We have to choose to prices from the array and first one will represent the buying price which must be minimum among other price elements, and second one will be the selling price. By subtracting these two elements ,we must get maximum profit.
So if the array is {7,1,3,6,2}, then buying price is the minimum element in the array which is 1, and if we choose 6 as selling price then the profit will be maximum which is 5.
So initialize profit with 0 and min element as array's first element at first. Then we are applying a loop in the array and within the loop we are: 
1. comparing previous min and current element, and updating min
2. also updating profit value by comparing the previous profit value and (current element-min val)
Atlast we are returning profit.
 */