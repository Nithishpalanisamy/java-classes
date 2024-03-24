class demo{
    final static int i=0;
    public void set(){i=1;}
    class Examination{
        public static void main(String args[]){
            demo s=new demo();
            int k=demo.i*10;
            System.out.println("The value of k is "+ k);
        }
    }
}