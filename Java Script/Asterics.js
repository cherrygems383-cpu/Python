const prompt = require("prompt-sync")();
while(true){
  let number = Number(prompt("Enter a number:  "));
    	        
    	        if (number < 1){
                    console.log("Enter number  greater than 1");
                    }
                       else if (number > 10){
    	                
    	                console.log("Enter number  greater than 10");
    	                } else {  
                        for (let index = 1; index <= number; index ++ ){

                                    if (index % 2 == 0){
                                          
                                    console.log(" # # # #")
                                    } 
                                    else {
                                  console.log("# # # #")
                                  }
    	            }
    	            break
                }
            }



      

  //else  {
       // console.log("Enter number from 1 to 10")
  
            
    // console.log (number (range ( 1 ,   10))); 
    //  console.log ("enter number 1 to 10"); 
     
      //  } 
