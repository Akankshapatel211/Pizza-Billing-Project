public class Pizza{
    public int  BasePrice;
    public int  ExtraTopings;
    public int  ExtraCheese;
    public int  TakeAwayBag;

    public Boolean isExtraTopings;
    public Boolean isExtraCheese;
    public Boolean isTakeAway;

    public int  size;

    public int Total;
    public String bill;
    public Boolean isVeg;
    public Pizza(Boolean isVeg,int size){
        this.isVeg=isVeg;
        this.size=size;
        if(isVeg){
            switch(size) {
                case 0: small(isVeg);
                    break;
                case 1:
                    medium(isVeg);
                    break;
                case 2:
                    large(isVeg);
                    break;

            }
            this.ExtraTopings=50;
        }
        else{
            switch(size) {
                case 0:
                    small(isVeg);
                    break;
                case 1:
                    medium(isVeg);
                    break;
                case 2:
                    large(isVeg);
                    break;

            }
            this.ExtraTopings=80;
        }
        this.ExtraCheese=30;
        this.TakeAwayBag=15;
        this.isExtraTopings=false;
        this.isExtraCheese=false;
        this.isTakeAway=false;
    }
  public void small(Boolean isVeg){
      if(isVeg ){
          this.BasePrice=200;
      }
      else{
          this.BasePrice=300;
      }


  }
    public void medium(Boolean isVeg){
        if(isVeg ){
            this.BasePrice=400;
        }
        else{
            this.BasePrice=500;
        }


    }
    public void large(Boolean isVeg){
        if(isVeg ){
            this.BasePrice=550;
        }
        else{
            this.BasePrice=750;
        }
    }
   public int getExtraCheese(){
        return ExtraCheese;
   }
    public void addExtraCheese(){
        if(!isExtraCheese){

            isExtraCheese=true;
        }
    }
    public void addExtraTopings(){

        if(!isExtraTopings){
            isExtraTopings=true;
        }
    }
    public int getExtraTopings(){

        return ExtraTopings;
    }

    public int getTakeAwayBag(){
        return TakeAwayBag;
    }
    public void addTakeAway(){

        if(!isTakeAway){
            isTakeAway=true;
        }
    }

    public String getBill(){
        if(isVeg) {
            bill = "Your Veg";
        }
        else {
            bill= "Your non-Veg";
        }
        switch (size) {
                        case 0: bill += " Small Pizza Price = " + this.BasePrice + "/-" + "\n";
                            break;
                        case 1: bill += " Medium Pizza Price = " + this.BasePrice + "/-" + "\n";
                          break;
                        case 2: bill += " Large Pizza Price = " + this.BasePrice + "/-" + "\n";
        }
        this.Total+=this.BasePrice;
        if(isExtraCheese) {
                bill +=" Price for ExtraCheese"+ this.ExtraCheese +"/-"+ "\n";
                this.Total+=this.ExtraCheese;
        }
        if(isExtraTopings) {
            bill +=" Price for ExtraTopings"+ this.ExtraTopings +"/-"+ "\n";
            this.Total+=this.ExtraTopings;
        }
        if(isTakeAway) {
            bill +=" Price for Bage"+ this.TakeAwayBag+"/-"+ "\n";
            this.Total+=this.TakeAwayBag;
        }

        bill+="You final price for this pizza "+ this.Total+"/-"+"\n";
        return bill;
    }
    public int getTotal(){
        return  this.Total;
    }
}
