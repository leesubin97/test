package coin;


import java.util.Scanner;

public class CoinClass {
/*두개의 주사위 합을 맞히는 게임 제작
코인: 20개
합을 맞추면 제시한 숫자에 따라서 배당금이 달라진다.

dice


*/
	boolean clear;
	int dice1;
	int dice2;
	int sum;
	int TotalCoin = 20;
	int userNumber;
	int betCoin;
	
	public int diceRandom() {
		
		
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			
			sum = dice1 + dice2;
			
			return sum;
		}
		
		
					
	
	
	
	
	
	public void inPutCoin() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("배팅할 코인의 수는? ------->");
		betCoin = sc.nextInt();
		TotalCoin =TotalCoin - betCoin;
		
		if(TotalCoin<=0 || betCoin>TotalCoin) {  //입력한 코인이 0이하이거나 가진코인보다 높게 입력하면 다시 위로
            
            System.out.println("가지고있는코인보다 많이 입력했거나 없거나 음수입니다.");
            
        }
		break;
		}
	}
	
	public  void userInPutSum() {
		Scanner sc = new Scanner(System.in);
		  
        while(true) {
            System.out.print("두 주사위의 합은? ");
            userNumber = sc.nextInt();
 
            
            if(userNumber == 2 || userNumber ==12) {
                System.out.println("해당 숫자는 제시할 수 없습니다.");
                continue;
            }
           
            break;
        }
	}
        
        
       public void MatchNumber() {
    	   
    	   if(sum == userNumber){
    		   if(userNumber == 3 && userNumber == 11) {
    			   TotalCoin = TotalCoin + betCoin*18;
    		  
    		  }else if(userNumber == 4 && userNumber == 10) {
    			  TotalCoin = TotalCoin + betCoin*12;
    		  }else if(userNumber == 5 && userNumber == 9) {
    			  TotalCoin = TotalCoin + betCoin*9;
    		  }else if(userNumber == 6 && userNumber == 7) {
    			  TotalCoin = TotalCoin + betCoin*9;
    		  }else  {
    			  TotalCoin = TotalCoin + betCoin*9;
   
    		  }
    		  System.out.println("맞췄습니다.");
              System.out.println("주사위의 합: " + sum);
              System.out.println("현재 코인 수: " + TotalCoin);
    		   
    		   
    		   
    	   
    		   
    	   }else {
    		   System.out.println("틀렸습니다");
      			System.out.println("주사위의 합: " + sum);
               System.out.println("현재 코인 수: " + TotalCoin);//if else end
    	   }
    	   
       }
        
       
       public void loop() {
   		int loop = 0;	
   		
   		while(loop < 10) {
   			
   			diceRandom();
   			// TODO:2. user input -> 3개
   			userInPutSum();			
   			
   			
   			MatchNumber();
   			
   				// 맞췄을 때
   				if(sum == userNumber) {
   					clear = true;
   					break;
   				}
   				
   					
   			
   			
   			
   		}
   			loop++;
   		
   		
   		
   	}
		
		
	
	
	
}//class 종료

