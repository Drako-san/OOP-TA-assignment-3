public class Ascended1part1 {
    public static void main(String args[]){
        String[] id = {"2440081942", "2440077301", "2440061285", "2440074174", "2440065163"};
        String[] names = {"Edsel Putra Harren", "Jason Jeremy Wijadi", "Monique Senjaya", "Morris Kim", "Ardelia Shaula Araminta"};
        String[] colours = {"Red Velvet", "White", "Blue", "Violet", "Black"};
        String key1, key2;
        String key3;
        int y;

        for(int x = 1; x < names.length; x++){
            key1 = names[x];
            key2 = colours[x];
            key3 = id[x];
            y = x - 1;
            while(y >= 0 && names[y].compareTo(key1) > 0){
                names[y+1] = names[y];
                colours[y+1] = colours[y];
                id[y+1] = id[y];
                y--;
            }
            names[y+1] = key1;
            colours[y+1] = key2;
            id[y+1] = key3;
        }

        System.out.println("Sorted by name:");
        System.out.println("=============================================");
        for(int x = 0; x < names.length; x++){
            System.out.println(id[x] + " | " + names[x] + " | " + colours[x] + " | ");
        }
        System.out.println("=============================================");
        System.out.println();

        for(int x = 1; x < colours.length; x++){
            key1 = names[x];
            key2 = colours[x];
            key3 = id[x];
            y = x - 1;
            while(y >= 0 && colours[y].compareTo(key2) > 0){
                names[y+1] = names[y];
                colours[y+1] = colours[y];
                id[y+1] = id[y];
                y--;
            }
            names[y+1] = key1;
            colours[y+1] = key2;
            id[y+1] = key3;
        }

        System.out.println("Sorted by colour:");
        System.out.println("=============================================");
        for(int x = 0; x < names.length; x++){
            System.out.println("| " + id[x] + " | " + names[x] + " | " + colours[x] + " | ");
        }
        System.out.println("=============================================");
    }
}