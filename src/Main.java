public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Cam", "Don"};

        for(int i = 0; i < names.length; i++){
            names[i] = names[i] + " Smith";
            System.out.println(names[i]);
        }

        for(String name: names){
            name = names + " Smith";
            System.out.println(name);
        }
    }
}