class multiThread{
    public static void main(String args[]){
       int n=4;
       for(int i=0;i<=n;i++){
        A t1= new A();
        B t2= new B();
        t1.start();
        t2.start();
       }
    }
}

class A extends Thread{
    public void run(){
        try{
			System.out.println("Thread1 - "+ Thread.currentThread().getId()+" is ruinnig");
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Error"+e);
        }
    }    
}

class B extends Thread{
    public void run(){
        try{
			System.out.println("Thread1 - "+ Thread.currentThread().getId()+" is ruinnig");
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Error"+e);
        }
    }    
}