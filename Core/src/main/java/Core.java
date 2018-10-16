public class Core {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        try{
            int a = i / j;
        }
        catch (Exception ex){
            System.out.println("Incorrect data");
        }
    }

}
