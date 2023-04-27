package gradingsystem;


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
	    //ITEM CODE
	    int item_code1 = 001;
	    int item_code2 = 002;
	    int item_code3 = 003;
	    int item_code4 = 004;
	    int item_code5 = 005;
	    //ITEM CODE STRING
	    String itm_code1 = "001";
	    String itm_code2 = "002";
	    String itm_code3 = "003";
	    String itm_code4 = "004";
	    String itm_code5 = "005";
	    //ITEM NAME
	    String item_name1 = "BIGSHOT Classic Regular";
	    String item_name2 = "BIGSHOT Classic Jumbo";
	    String item_name3 = "BIGSHOT Classic King Size";
	    String item_name4 = "BIGSHOT Classic Spr Jumbo";
	    String item_name5 = "BIGSHOT Cheese Regular";
	    //QUANTITY
	    int item_quantity1 = 1000;
	    int item_quantity2 = 1000;
	    int item_quantity3 = 1000;
	    int item_quantity4 = 1000;
	    int item_quantity5 = 1000;
            //STOCK OUT
            int item_stckOut1 = 0;
            int item_stckOut2 = 0;
            int item_stckOut3 = 0;
            int item_stckOut4 = 0;
            int item_stckOut5 = 0;
            //STOCK IN
            int item_stckIn1 = 0;
            int item_stckIn2 = 0;
            int item_stckIn3 = 0;
            int item_stckIn4 = 0;
            int item_stckIn5 = 0;
            
        boolean stck = true;
        boolean updt_cnfmtn = true;
        
        int stck_out = 0;
        int qnty_sold = 0;
        int qnty_add = 0;
        char choice;
        
        
        System.out.println("FROZEN GOODS INVENTORY SYSTEM");
        do{
            System.out.println("\n===========================================================");
            System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name1 , item_quantity1 , item_stckOut1 , item_stckIn1);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code2 , item_name2 , item_quantity2 , item_stckOut2 , item_stckIn2);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code3 , item_name3 , item_quantity3 , item_stckOut3 , item_stckIn3);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code4 , item_name4 , item_quantity4 , item_stckOut4 , item_stckIn4);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code5 , item_name5 , item_quantity5 , item_stckOut5 , item_stckIn5);
            System.out.println("\n==========================================================="); 
        //do{    
            System.out.print("\nEnter item CODE: ");
            String slct_code = myObj.nextLine();
            if (slct_code.equals("001")){
                System.out.println("\n===========================================================");
                System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
                System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name1 , item_quantity1 , item_stckOut1 , item_stckIn1);
                System.out.println("\n===========================================================");
                //while (true){
                    System.out.print("\n[A] ---- Stock out | [B] ---- Stock in: ");
                    choice = myObj.next().charAt(0);
                    if (choice == 'A' || choice == 'a'){
                            if (item_quantity1 >= 0){
                                System.out.print("\nQuantity Sold: ");
                                qnty_sold = myObj.nextInt();
                                if (item_quantity1 >= qnty_sold && qnty_sold >= 0){
                                    item_quantity1 = item_quantity1 - qnty_sold;
                                    item_stckOut1 = item_stckOut1 + qnty_sold;
                                    if(item_quantity1 <= 100) {
                                    	System.out.println("Your product is below 10% of the currenct stock.");
                                    }
                                    System.out.print("Total quantity left: " + item_quantity1);
                                    
                                    while (updt_cnfmtn == true){
                                        System.out.print("\nStill need to update? [Y] or [N]: ");
                                        choice = myObj.next().charAt(0);
                                        if (choice == 'Y' || choice == 'y'){
                                            break;
                                        }
                                        else if (choice == 'N' || choice == 'n'){
                                            System.out.println("\n===========================================================");
            System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name1 , item_quantity1 , item_stckOut1 , item_stckIn1);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code2 , item_name2 , item_quantity2 , item_stckOut2 , item_stckIn2);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code3 , item_name3 , item_quantity3 , item_stckOut3 , item_stckIn3);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code4 , item_name4 , item_quantity4 , item_stckOut4 , item_stckIn4);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code5 , item_name5 , item_quantity5 , item_stckOut5 , item_stckIn5);
            System.out.println("\n==========================================================="); 
                                            System.exit(0);
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Out of stock");
                                    break;
                                }
                        }
                            else{
                                System.out.println("Add quantity first");
                                break;
                            }
                        
                    }
                    else if (choice == 'B' || choice == 'b'){
                         while(true){
                             System.out.print("\nQuantity Add: ");
                             qnty_add = myObj.nextInt();
                             item_stckIn1 = item_stckIn1 + qnty_add;
                             item_quantity1 = item_quantity1 + qnty_add;
                             System.out.print("Total quantity added: " + item_stckIn1);
                             break;
                         }
                    }
                    else{
                        System.out.print("Invalid input");
                        
                    }
                //}
            }
            else if (slct_code.equals("002")){
                 System.out.println("\n===========================================================");
                System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
                System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code2 , item_name2 , item_quantity2 , item_stckOut2 , item_stckIn2);
                System.out.println("\n===========================================================");
                //while (true){
                    System.out.print("\n[A] ---- Stock out | [B] ---- Stock in: ");
                    choice = myObj.next().charAt(0);
                    if (choice == 'A' || choice == 'a'){
                            if (item_quantity2 >= 0){
                                System.out.print("\nQuantity Sold: ");
                                qnty_sold = myObj.nextInt();
                                if (item_quantity2 >= qnty_sold && qnty_sold >= 0){
                                    item_quantity2 = item_quantity2 - qnty_sold;
                                    item_stckOut2 = item_stckOut2 + qnty_sold;
                                    if(item_quantity2 <= 100) {
                                    	System.out.println("Your product is below 10% of the currenct stock.");
                                    }
                                    System.out.print("Total quantity left: " + item_quantity2);
                                    while (updt_cnfmtn == true){
                                        System.out.print("\nStill need to update? [Y] or [N]: ");
                                        choice = myObj.next().charAt(0);
                                        if (choice == 'Y' || choice == 'y'){
                                            break;
                                        }
                                        else if (choice == 'N' || choice == 'n'){
                                            System.out.println("\n===========================================================");
            System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name1 , item_quantity1 , item_stckOut1 , item_stckIn1);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code2 , item_name2 , item_quantity2 , item_stckOut2 , item_stckIn2);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code3 , item_name3 , item_quantity3 , item_stckOut3 , item_stckIn3);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code4 , item_name4 , item_quantity4 , item_stckOut4 , item_stckIn4);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code5 , item_name5 , item_quantity5 , item_stckOut5 , item_stckIn5);
            System.out.println("\n==========================================================="); 
                                            System.exit(0);
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Out of stock");
                                    break;
                                }
                        }
                            else{
                                System.out.println("Add quantity first");
                                break;
                            }
                        
                    }
                    else if (choice == 'B' || choice == 'b'){
                         while(true){
                             System.out.print("\nQuantity Add: ");
                             qnty_add = myObj.nextInt();
                             item_stckIn2 = item_stckIn2 + qnty_add;
                             item_quantity2 = item_quantity2 + qnty_add;
                             System.out.print("Total quantity added: " + item_stckIn2);
                             break;
                         }
                    }
                    else{
                        System.out.print("Invalid input");
                        
                    }
            }
            else if (slct_code.equals("003")){
                 System.out.println("\n===========================================================");
                System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
                System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name3 , item_quantity3 , item_stckOut3 , item_stckIn3);
                System.out.println("\n===========================================================");
                //while (true){
                    System.out.print("\n[A] ---- Stock out | [B] ---- Stock in: ");
                    choice = myObj.next().charAt(0);
                    if (choice == 'A' || choice == 'a'){
                            if (item_quantity3 >= 0){
                                System.out.print("\nQuantity Sold: ");
                                qnty_sold = myObj.nextInt();
                                if (item_quantity3 >= qnty_sold && qnty_sold >= 0){
                                    item_quantity3 = item_quantity3 - qnty_sold;
                                    item_stckOut3 = item_stckOut3 + qnty_sold;
                                    if(item_quantity3 <= 100) {
                                    	System.out.println("Your product is below 10% of the currenct stock.");
                                    }
                                    System.out.print("Total quantity left: " + item_quantity3);
                                    
                                    while (updt_cnfmtn == true){
                                        System.out.print("\nStill need to update? [Y] or [N]: ");
                                        choice = myObj.next().charAt(0);
                                        if (choice == 'Y' || choice == 'y'){
                                            break;
                                        }
                                        else if (choice == 'N' || choice == 'n'){
                                           System.out.println("\n===========================================================");
            System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name1 , item_quantity1 , item_stckOut1 , item_stckIn1);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code2 , item_name2 , item_quantity2 , item_stckOut2 , item_stckIn2);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code3 , item_name3 , item_quantity3 , item_stckOut3 , item_stckIn3);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code4 , item_name4 , item_quantity4 , item_stckOut4 , item_stckIn4);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code5 , item_name5 , item_quantity5 , item_stckOut5 , item_stckIn5);
            System.out.println("\n==========================================================="); 
                                             System.exit(0);
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Out of stock");
                                    break;
                                }
                        }
                            else{
                                System.out.println("Add quantity first");
                                break;
                            }
                        
                    }
                    else if (choice == 'B' || choice == 'b'){
                         while(true){
                             System.out.print("\nQuantity Add: ");
                             qnty_add = myObj.nextInt();
                             item_stckIn3 = item_stckIn3 + qnty_add;
                             item_quantity3 = item_quantity3 + qnty_add;
                             System.out.print("Total quantity added: " + item_stckIn3);
                             break;
                         }
                    }
                    else{
                        System.out.print("Invalid input");
                        
                    }
            }
            else if (slct_code.equals("004")){
                 System.out.println("\n===========================================================");
                System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
                System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code4 , item_name4 , item_quantity4 , item_stckOut4 , item_stckIn4);
                System.out.println("\n===========================================================");
                //while (true){
                    System.out.print("\n[A] ---- Stock out | [B] ---- Stock in: ");
                    choice = myObj.next().charAt(0);
                    if (choice == 'A' || choice == 'a'){
                            if (item_quantity4 >= 0){
                                System.out.print("\nQuantity Sold: ");
                                qnty_sold = myObj.nextInt();
                                if (item_quantity4 > qnty_sold && qnty_sold >= 0){
                                    item_quantity4 = item_quantity4 - qnty_sold;
                                    item_stckOut4 = item_stckOut4 + qnty_sold;
                                    if(item_quantity4 <= 100) {
                                    	System.out.println("Your product is below 10% of the currenct stock.");
                                    }
                                    System.out.print("Total quantity left: " + item_quantity4);
                                    
                                    while (updt_cnfmtn == true){
                                        System.out.print("\nStill need to update? [Y] or [N]: ");
                                        choice = myObj.next().charAt(0);
                                        if (choice == 'Y' || choice == 'y'){
                                            break;
                                        }
                                        else if (choice == 'N' || choice == 'n'){
                                           System.out.println("\n===========================================================");
            System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name1 , item_quantity1 , item_stckOut1 , item_stckIn1);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code2 , item_name2 , item_quantity2 , item_stckOut2 , item_stckIn2);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code3 , item_name3 , item_quantity3 , item_stckOut3 , item_stckIn3);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code4 , item_name4 , item_quantity4 , item_stckOut4 , item_stckIn4);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code5 , item_name5 , item_quantity5 , item_stckOut5 , item_stckIn5);
            System.out.println("\n==========================================================="); 
                                             System.exit(0);
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Out of stock");
                                    break;
                                }
                        }
                            else{
                                System.out.println("Add quantity first");
                                break;
                            }
                        
                    }
                    else if (choice == 'B' || choice == 'b'){
                         while(true){
                             System.out.print("\nQuantity Add: ");
                             qnty_add = myObj.nextInt();
                             item_stckIn4 = item_stckIn4 + qnty_add;
                             item_quantity4 = item_quantity4 + qnty_add;
                             System.out.print("Total quantity added: " + item_stckIn4);
                             break;
                         }
                    }
                    else{
                        System.out.print("Invalid input");
                        
                    }
            }
            else if (slct_code.equals("005")){
                 System.out.println("\n===========================================================");
                System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
                System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code5 , item_name5 , item_quantity5 , item_stckOut5 , item_stckIn5);
                System.out.println("\n===========================================================");
                //while (true){
                    System.out.print("\n[A] ---- Stock out | [B] ---- Stock in: ");
                    choice = myObj.next().charAt(0);
                    if (choice == 'A' || choice == 'a'){
                            if (item_quantity5 >= 0){
                                System.out.print("\nQuantity Sold: ");
                                qnty_sold = myObj.nextInt();
                                if (item_quantity5 >= qnty_sold && qnty_sold >= 0){
                                    item_quantity5 = item_quantity5 - qnty_sold;
                                    item_stckOut5 = item_stckOut5 + qnty_sold;
                                    if(item_quantity5 <= 100) {
                                    	System.out.println("Your product is below 10% of the currenct stock.");
                                    }
                                    System.out.print("Total quantity left: " + item_quantity5);
                                    
                                    while (updt_cnfmtn == true){
                                        System.out.print("\nStill need to update? [Y] or [N]: ");
                                        choice = myObj.next().charAt(0);
                                        if (choice == 'Y' || choice == 'y'){
                                            break;
                                        }
                                        else if (choice == 'N' || choice == 'n'){
                                            System.out.println("\n===========================================================");
            System.out.printf("%-6s %-25s %5s %10s %8s"  , "CODE" , "ITEMS" , "QTY" , "STOCK OUT" , "STOCK IN");
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code1 , item_name1 , item_quantity1 , item_stckOut1 , item_stckIn1);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code2 , item_name2 , item_quantity2 , item_stckOut2 , item_stckIn2);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code3 , item_name3 , item_quantity3 , item_stckOut3 , item_stckIn3);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code4 , item_name4 , item_quantity4 , item_stckOut4 , item_stckIn4);
            System.out.printf("\n%-6s %-25s %6d %5d %9d"  , itm_code5 , item_name5 , item_quantity5 , item_stckOut5 , item_stckIn5);
            System.out.println("\n==========================================================="); 
                                            System.exit(0);
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Out of stock");
                                    break;
                                }
                        }
                            else{
                                System.out.println("Add quantity first");
                                break;
                            }
                        
                    }
                    else if (choice == 'B' || choice == 'b'){
                         while(true){
                             System.out.print("\nQuantity Add: ");
                             qnty_add = myObj.nextInt();
                             item_stckIn5 = item_stckIn5 + qnty_add;
                             item_quantity5 = item_quantity5 + qnty_add;
                             System.out.print("Total quantity added: " + item_stckIn5);
                             break;
                         }
                    }
                    else{
                        System.out.print("Invalid input");
                        
                    }
            }
            else{
                System.out.print("\nInvalid item code");
            }
        }
	while (stck == true);
    }

	
	

}
