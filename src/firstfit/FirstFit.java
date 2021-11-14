/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstfit;

/**
 *
 * @author User
 */
public class FirstFit {

    
   public static void main(String[] arg){
       
       int memory[]={100,500,200,300,600};
       int process[]={225,380,80,280};
       String status[]={"avaible","avaible","avaible","avaible","avaible","avaible"};
       int rmg=0;
      
       
      System.out.println("Before: ");
      System.out.println("Memory Request");
      for(int k=0;k<process.length;k++)
       {
            System.out.println(process[k]);
       }
      
      System.out.println("Process "+"\tMemory "+"\t\tStatus ");
       for(int k=0;k<memory.length;k++)
       {
            System.out.println((k+1)+"\t\t"+memory[k]+"\t\t"+status[k]);
       }
       System.out.println();
       for(int i =0;i<process.length;i++){
           
           for(int j=0;j<memory.length;j++){
               
               if(memory[j]>=process[i]){
                   
                   rmg= memory[j]-process[i];
                   int tempMemory[] = new int[memory.length+1];
                   for(int h=0;h<memory.length;h++){
                       tempMemory[h]=memory[h];
                       if(j<h){
                           tempMemory[h]=memory[h-1];
                       }
                   }
                   
                       tempMemory[tempMemory.length-1]=memory[memory.length-1];
                       memory = tempMemory;
                       memory[j]=process[i];
                       memory[j+1]=rmg;
                       
                       
                    String[] tempStatus= new String[status.length+1];
                    for(int k=0;k<status.length;k++){
                        tempStatus[k]= status[k];
                        if(j<k){
                            
                            tempStatus[k]=status[k-1];
                        }
                    }
                    tempStatus[tempStatus.length-1]= status[status.length-1];
                    status = tempStatus;
                    status[j]="Occupie";
                   
                  
                  break;
               }
           }  
       }
       System.out.println("After: ");
       System.out.println("Process "+"\tMemory "+"\t\tStatus ");
       for(int k=0;k<memory.length;k++)
       {
            System.out.println((k+1)+"\t\t"+memory[k]+"\t\t"+status[k]);
       }
      
   }
    
}
