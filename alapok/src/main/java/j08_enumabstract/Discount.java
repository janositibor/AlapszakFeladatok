package j08_enumabstract;

public enum Discount {
    SPECIAL_OFFER{
        public double getAmountToPay(int price, int pieces){
            return 0.8*price*pieces;
        }
    },
    BLACK_FRIDAY_OFFER{
        public double getAmountToPay(int price, int pieces){
            if(pieces<=2){
                return 0.75*price*pieces;
            }
            else{
                return (0.5+0.75*(pieces-1))*price;
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
