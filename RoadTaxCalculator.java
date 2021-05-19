class RoadTaxCalculator{
public static void main(String args[]){
int vehiclePrice=60000;
String stateKeyword="KA";
switch(stateKeyword){
case "TN":
double roadTaxTn=0.15;
double finalTaxTn=vehiclePrice*roadTaxTn;
System.out.println("the Tax to be paid is" +finalTaxTn);
break;
case "KA":
double roadTaxKA=0.22;
double finalTaxKA=vehiclePrice*roadTaxKA;
System.out.println("the Tax to be paid is" +finalTaxKA);
break;
case "RJ":
double roadTaxRJ=0.35;
double finalTaxRJ=vehiclePrice*roadTaxRJ;
System.out.println("the Tax to be paid is" +finalTaxRJ);
break;
case "UP":
double roadTaxUP=0.44;
double finalTaxUP=vehiclePrice*roadTaxUP;
System.out.println("the Tax to be paid is" +finalTaxUP);
break;
case "AP":
double roadTaxAP=0.44;
double finalTaxAP=vehiclePrice*roadTaxAP;
System.out.println("the Tax to be paid is" +finalTaxAP);
break;

default:System.out.println("Road tax not available for the vehicle");
}
}
}