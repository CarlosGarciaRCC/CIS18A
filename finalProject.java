class carServices extends Wheels {
//Member variables declared

  String washType;
  private double typePrice;

//Consturctor
  carServices(String washType, String wheelWash1, String wheelWash2) {

  super(wheelWash1, wheelWash2);

  this.washType = washType;

  this.typePrice = 0.00;
}

//Pricing per wash type return
double typePrice() {

switch(this.washType) {

  case "Basic Wash":
    this.typePrice = 10.00;
    break;

  case "Deluxe Wash":
    this.typePrice = 15.00;
    break;

  default:
  this.typePrice = 0.00;
}

//Car wash type pricing return
return this.typePrice;
}

//Tax calculation
double taxes() {

  return (this.typePrice() + super.wheelPrice()) * .0573 ;
  }
}

interface wheelInterface {

  default double wheelPrice() {
  //Output for input would be here if this where a real program

  return 0;
  }
}

class Wheels implements wheelInterface {

String WheelWash [] = {"", ""};

  double wheelPrice;

  Wheels (String wheelWash1, String wheelWash2) {

    this.WheelWash[0] = wheelWash1;

    this.WheelWash[1] = wheelWash2;

    this.wheelPrice = 0.00;  
}

public double wheelPrice() {

  double total = 0;
  int size;

  if(WheelWash[1] == "") size = 1;
    else size = 2;

//Cost of wheel washing options
for(int i = 0; i < size; i++) {

switch(this.WheelWash[i]) {

  case "Rim Shine":
    this.wheelPrice = 5.00;
    break;

  case "Tire Shine":
    this.wheelPrice = 8.00;
    break;

  default:
    this.wheelPrice = 0.00;
}

total += wheelPrice;
}

return total;
  }
}

class WashPricing {

  public static void main (String args[]) {

  //main code would be here if this where a real program
  }
}

 
