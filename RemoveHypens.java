public class RemoveHypens{
    public static void main(String ... args){
        String noHypens = "ABC1234";
        String hypens = "CDE-6789";

        System.out.println ("no hypens: " + noHypens.replace("-", ""));
        System.out.println ("hypens: " + hypens.replace("-", ""));
    }
}