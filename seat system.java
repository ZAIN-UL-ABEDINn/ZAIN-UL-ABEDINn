import java.util.*;
class seatsystem{
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        
        int row=5;
        int column=5;
        int[][] seats=new int[row][column];
        while (true) {
            System.out.println("...............");
            System.out.println("seating system");
            System.out.println("...............");
            System.out.println("1) display seating arrangments. ");
            System.out.println("2) book seat. ");
            System.out.println("3) cancel booking");
            System.out.println("4) EXIT");
            int choice=z.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("SEATING ARRANGMENT...");     // SEAT ARRANGMENT VIEW.
                    for(int i=0; i<5; i++){
                        for(int j=0; j<5; j++){
                            System.out.print(seats[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;



                case 2:
                    
                     System.out.println("booking seat");              // seat booking SYSTEM
                     System.out.print("Enter row number (0-4): ");
                     int rowbook = z.nextInt();
                     System.out.print("Enter seat number (0-4): ");
                     int colbook = z.nextInt();
                     if (rowbook>=0 && rowbook<5 && colbook>=0 && colbook<5 ) {
                        if (seats[rowbook][colbook]==0) {
                            seats[rowbook][colbook]=10;
                            System.out.println("seat booked");
                        }
                        else{
                            System.out.println("this seat is already booked.");
                        }
                     }
                     else{
                        System.out.println("invalid seat number. ");
                     }
                     break;




                case 3:
                    System.out.print("Enter row number (0-4): ");       //seat cancel system
                    int r2cancel = z.nextInt();
                    System.out.print("Enter seat number (0-4): ");
                    int c2cancel = z.nextInt();
                    if (r2cancel>=0 && r2cancel<5  && c2cancel>=0 && c2cancel<5) {
                        if (seats[r2cancel][c2cancel]==10) {
                            seats[r2cancel][r2cancel]=0;
                            System.out.println("seat cancelled");
                            
                        }
                        else{

                            System.out.println("seat already cancelled");
                        }
                        
                    
                    }
                    else{
                        System.out.println("seat number invalid");
                    }
                    break; 
                    
                    
                    
                case 4:
                    System.out.println("Exiting the system.");          //exit system
                    z.close();                                    
                    return;
                    
                    
                default:
                    System.out.println("invalid number");
                    break;
            }
        }
    }
    
}
