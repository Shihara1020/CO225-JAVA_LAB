public class Discountrate {
    static double serviceDiscountPremium=0.2;
    static double serviceDiscountGold=0.15;
    static double serviceDiscountSilver=0.1;

    static double productDiscountPremium=0.1;
    static double productDiscountGold=0.1;
    static double productDiscountSilver=0.1;

    public static double getServiceDiscountRate(String type){
        if(type=="Gold"){
            return serviceDiscountGold;
        }else if(type=="Premium"){
            return serviceDiscountPremium;
        }else{
            return serviceDiscountSilver;
        }
    }
    
    public static double getproductDiscountRate(String type){
        if(type=="Gold"){
            return productDiscountGold;
        }else if(type=="Premium"){
            return productDiscountPremium;
        }else{
            return productDiscountSilver;
        }


    }

    
}
