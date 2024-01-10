import java.util.*;
public class dictionary {
    // helper dunctions
    private static boolean checkString(String str){
        if (str != null && !str.trim().isEmpty()) {
            if (str.matches("[a-zA-Z]+"))
                return true;
            else{
                System.out.println("it's not String");
                return false;
            }
        } else{
            System.out.println("empty value");
            return false;
        }


    }
    private static boolean checkChar(char ch){
        if (ch != ' ') {
            if (Character.isAlphabetic(ch)&&Character.valueOf(ch)==4) {
                return true;
            } else{
                System.out.println("It's not Alphabet");
                return false;
            }
        } else
            System.out.println("Empty value");
        return false;
    }
    public static Map<Character, SortedSet<String>> dict = new HashMap<>();
    public dictionary() {
        dict = new HashMap<>();
        initializeDictionary();
    }

    private void initializeDictionary() {
        dict.put('A',new TreeSet<>(Arrays.asList(
                "Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator",
                "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant"
                )));
        dict.put('B',new TreeSet<>(Arrays.asList(
                "Banana", "Brave", "Breeze", "Bubble", "Blossom",
                "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful"
                )));
        dict.put('C',new TreeSet<>(Arrays.asList(
                "Cactus", "Cascade", "Crisp", "Calm", "Charm",
                "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon"
                )));
        dict.put('D',new TreeSet<>(Arrays.asList(
                "Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop",
                "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly"
                )));
        dict.put('E',new TreeSet<>(Arrays.asList(
                "Eagle", "Eclipse", "Elegant", "Enchant", "Emerald",
                "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral"
                )));
        dict.put('F',new TreeSet<>(Arrays.asList(
                "Fairy", "Flame", "Fiesta", "Frost", "Floral",
                "Firefly", "Fascinate", "Fable", "Feather", "Flicker"
                )));
        dict.put('G',new TreeSet<>(Arrays.asList(
                "Gazebo", "Glimmer", "Grace", "Gentle", "Galaxy",
                "Glisten", "Garnet", "Gentleman", "Giggly", "Glitter"
                )));
        dict.put('H',new TreeSet<>(Arrays.asList(
                "Harmony", "Heavenly", "Honey", "Harbor", "Hope",
                "Heartfelt", "Halcyon", "Haven", "Halo", "Hyacinth"
                )));
        dict.put('I',new TreeSet<>(Arrays.asList(
                "Imagine", "Infinite", "Inspire", "Ivory", "Island", "Illuminate",
                "Impulse", "Incandescent", "Ingenious", "Ineffable"
                )));
        dict.put('J',new TreeSet<>(Arrays.asList(
                "Jubilant", "Jade", "Journey", "Joyful", "Jazz",
                "Jasmine", "Jovial", "Jigsaw", "Jubilee", "Jocular"
                )));
        dict.put('K',new TreeSet<>(Arrays.asList(
                "Kaleidoscope", "Kindle", "Kinetic", "Keen", "Kismet",
                "Kale", "Kudos", "Kiss", "Kittens", "Knight"
                )));
        dict.put('L',new TreeSet<>(Arrays.asList(
                "Lagoon", "Luminous", "Lullaby", "Lavender", "Lively",
                "Lunar", "Luscious", "Lyric", "Labyrinth", "Lilac"
                )));
        dict.put('M',new TreeSet<>(Arrays.asList(
                "Majestic", "Mystic", "Moonlight", "Melody", "Mirth",
                "Magenta", "Mosaic", "Mellow", "Miracle", "Majesty"
                )));
        dict.put('N',new TreeSet<>(Arrays.asList(
                "Nebula", "Nectar", "Nirvana", "Noble", "Nurturing",
                "Nautical", "Novel", "Nuance", "Nebulous", "Nestle"
                )));
        dict.put('O',new TreeSet<>(Arrays.asList(
                "Orchid", "Opulent", "Oasis", "Oceanic", "Optimistic",
                "Ornate", "Outstanding", "Overcome", "Overjoyed", "Onyx"
                )));
        dict.put('P',new TreeSet<>(Arrays.asList(
                "Peach", "Pristine", "Petal", "Panorama",
                "Pleasure", "Ponder", "Panache", "Peaceful", "Perfume", "Pinnacle"
                )));
        dict.put('Q',new TreeSet<>(Arrays.asList(
                "Quasar", "Quaint", "Quell", "Quest", "Quiver",
                "Quintessence", "Quirky", "Quiet", "Quintessential", "Quench"
                )));
        dict.put('R',new TreeSet<>(Arrays.asList(
                "Radiant", "Reverie", "Ripple", "Rustic", "Rendezvous",
                "Rhapsody", "Resplendent", "Rejoice", "Rose", "Rapture"
                )));
        dict.put('S',new TreeSet<>(Arrays.asList(
                "Serene", "Sapphire", "Serenade", "Symphony", "Sparkle",
                "Stellar", "Sublime", "Savor", "Sculpt", "Sylvan"
                )));
        dict.put('T',new TreeSet<>(Arrays.asList(
                "Tranquil", "Twilight", "Tender", "Tropical", "Talisman",
                "Tidal", "Traverse", "Timeless", "Tintinnabulation", "Treasure"
                )));
        dict.put('U',new TreeSet<>(Arrays.asList(
                "Umbra", "Utopia", "Unwind", "Uplift", "Utter",
                "Umbrella", "Unique", "Upbeat", "Universe", "Unity"
                )));
        dict.put('V',new TreeSet<>(Arrays.asList(
                "Velvet", "Vivid", "Vibrant", "Vanilla", "Valiant",
                "Vortex", "Verdant", "Verve", "Voyage", "Virtue"
                )));
        dict.put('W',new TreeSet<>(Arrays.asList(
                "Whisper", "Wander", "Wisp", "Willow", "Wavelength",
                "Wondrous", "Wishful", "Waltz", "Wonder", "Wildflower"
                )));
        dict.put('X',new TreeSet<>(Arrays.asList(
                "Xanadu", "Xylophone", "Xenon", "Xeric", "X-factor",
                "Xenial", "Xenophobe", "Xanthein", "Xenagogue", "Xerox"
                )));
        dict.put('Y',new TreeSet<>(Arrays.asList(
                "Yearning", "Yonder", "Yoga", "Yummy", "Yield",
                "Yarn", "Yonder", "Yaffle", "Yoga", "Yonder"
                )));
        dict.put('Z',new TreeSet<>(Arrays.asList(
                "Zephyr", "Zenith", "Zeal", "Zest", "Zing",
                "Zircon", "Zestful", "Zen", "Zeppelin", "Zany"
                )));
    }
    public  void printDict(){
        for (Map.Entry<Character, SortedSet<String>> entry : dict.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void wordsOfGivenLetter(char ch){
        if(checkChar(ch)){
        ch=Character.toUpperCase(ch);
        System.out.println(dict.get(ch));
        }
    }
    public void insert(TreeSet<String> str){
        if(!(str.isEmpty())){
            Iterator<String> it = str.iterator();
            while(it.hasNext()){
                String temp = it.next();
                if(checkString(temp)){
                // trim => remove all leading and tailing spaces
                if(temp != null && !temp.trim().isEmpty()){
                    char tmp = Character.toUpperCase(temp.charAt(0));
                    String s = temp.substring(0, 1).toUpperCase() + temp.substring(1);
                    dict.get(tmp).add(s);
                    System.out.println("Inserted Successfully");
                }
                }

            }
        }
        else {
            System.out.println("Can't insert values");
        }
    }
    public void search(String s){
        int count = 0;
        if(checkString(s)){
            for (Map.Entry<Character, SortedSet<String>> entry : dict.entrySet()) {
                Iterator<String> it = entry.getValue().iterator();
                String tmp = it.next();
                while(it.hasNext()){
                    if(tmp.toUpperCase().indexOf(s.toUpperCase()) != -1)
                    {
                        count++;
                }
                    tmp= it.next();
                }
            }
        }
        if(count == 0 )
        System.out.println("No such value");
    }
    public void removeKey(char ch){
        if(checkChar(ch)){
            if(dict.remove(Character.toUpperCase(ch))!=null)
                System.out.println("Key removed successfully");
            else
                System.out.println("No such Key");
    }
    }
    public void removeWord(String s) {
        if (checkString(s)) {
            SortedSet<String> temp = dict.get(Character.toUpperCase(s.charAt(0)));
            if (!temp.isEmpty() && temp.remove(s.substring(0, 1).toUpperCase() + s.substring(1))) {
                System.out.println("value removed Successfully");
            } else {
                System.out.println("No Such Value");
            }
        }
    }
}
