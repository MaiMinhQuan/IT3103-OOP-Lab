//Mai Minh Quân - 20225661
//class "AIMS" (Main class)
package Lab2_3_4.AimsProject.src.aims;
import java.util.*;
import Lab2_3_4.AimsProject.src.aims.media.*;
import Lab2_3_4.AimsProject.src.aims.cart.Cart;
import Lab2_3_4.AimsProject.src.aims.store.Store;

public class AIMS {
    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc(1,
            "Orientalism", 
            "history",
            4.5f,
            "Said Edward",
            90);

        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Hey Jude",3));
        tracks.add(new Track("I Will Always Love You",4));
        
        CompactDisc cd = new CompactDisc(2,
            "Nhac hoai co", 
            "Nha nhac cung dinh Hue" , 
            3.5f,
            "various artist",
            tracks);

        List<String> authors = new ArrayList<String>();
        authors.add("Eminem");
        authors.add("The Beatles");
        
        Book book = new Book(3,
            "Things Fall Apart",
            "Novel",
            5.2f,
            authors);
        
        Store store = new Store();
        store.addMedia(cd);
        store.addMedia(dvd);
        store.addMedia(book);
        
        Cart cart = new Cart();
        
        Scanner scanner = new Scanner(System.in);
        showMenu(scanner, store, cart);
    }

    public static void showMenu(Scanner scanner, Store store, Cart cart) {
        while (true) {
            System.out.println(
                    """
                            Mai Minh Quân - 20225661               
                            AIMS:
                            --------------------------------
                            1. View store
                            2. Update store
                            3. See current cart
                            0. Exit
                            --------------------------------
                            Please choose a number: 0-1-2-3
                            Enter option: 
                                     """);
            int option = scanner.nextInt();
            switch (option) {
                case 0 -> {
                    scanner.close();
                    System.exit(0);
                }
                case 1 -> storeMenu(scanner, store, cart);
                case 2 -> updateStoreMenu(scanner, store);
                case 3 -> {
                    cart.print();
                    cartMenu(scanner,cart);
                }
            }
        }
    }

    public static void updateStoreMenu(Scanner scanner, Store store) {
        System.out.println("""
                Mai Minh Quân - 20225661
                ==========================
                1. add Media
                2. delete Media
                3. update Media in Store
                0. Back
                ==========================
                Option: """);
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> {
                System.out.println("""
                        Mai Minh Quân - 20225661
                        1.DigitalVideoDisc
                        2.CompactDisc
                        3.Book
                        -------
                        -> Your type:""");
                int option2 = scanner.nextInt();
                System.out.print("Mai Minh Quân - 20225661 - Enter id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Mai Minh Quân - 20225661 - Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Mai Minh Quân - 20225661 - Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Mai Minh Quân - 20225661 - Enter cost: ");
                float cost = scanner.nextFloat();
                scanner.nextLine();
                switch (option2) {
                    case 1 ->
                    {
                        System.out.print("Mai Minh Quân - 20225661 - Enter director's name: ");
                        String director = scanner.nextLine();
                        System.out.print("Mai Minh Quân - 20225661 - Enter dvd's length: ");
                        int length = scanner.nextInt();
                        scanner.nextLine();
                        store.addMedia(new DigitalVideoDisc(id,title,category,cost,director,length));
                    }
                    case 3 -> {
                        System.out.print("Mai Minh Quân - 20225661 - Enter author's name (Enter nothing to skip): ");
                        StringBuilder author = new StringBuilder(scanner.nextLine());
                        ArrayList<String> authors = new ArrayList<String>();
                        while (!author.isEmpty()) {
                            authors.add(author.toString());
                            System.out.print("Mai Minh Quân - 20225661 - Enter author's name (Enter nothing to skip): ");

                        }
                        store.addMedia(new Book(id,title,category,cost,authors));
                    }
                    case 2 -> {
                        System.out.print("Mai Minh Quân - 20225661 - Enter artist's name: ");
                        StringBuffer artist = new StringBuffer(scanner.nextLine());
                        System.out.print("Mai Minh Quân - 20225661 - Enter number of track: ");
                        int nbTrack = scanner.nextInt();scanner.nextLine();
                        ArrayList<Track> tracks = new ArrayList<Track>();
                        StringBuilder name = new StringBuilder();
                        for(int i = 0;i< nbTrack;i++) {
                            System.out.print("Mai Minh Quân - 20225661 - Enter Track[" + i + "]'s name: ");
                            name.replace(0,name.length(),scanner.nextLine());
                            System.out.print("Mai Minh Quân - 20225661 - Enter Track[" + i + "]'s length: ");
                            int length = scanner.nextInt();
                            tracks.add(new Track(name.toString(), length));
                            scanner.nextLine();

                        }
                        store.addMedia(new CompactDisc(id,title,category,cost,artist.toString(),tracks));
                    }
                }
            }
            case 2 -> {
                System.out.println("Mai Minh Quân - 20225661 - Enter item's title: ");
                scanner.nextLine();
                String title = scanner.nextLine();
                Iterator<Media> iter = store.getItemsInStore().iterator();
                while (iter.hasNext()) {
                    Media item = iter.next();
                    if(item.getTitle().equals(title)) {
                        iter.remove();
                        System.out.println(item.getClass().getSimpleName() + " " + item.getTitle() + "'ve been deleted from the store !");
                    }
                }

            }
            case 3 -> {
                System.out.println("Mai Minh Quân - 20225661 - Enter item's id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Mai Minh Quân - 20225661 - Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Mai Minh Quân - 20225661 - Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Mai Minh Quân - 20225661 - Enter cost: ");
                float cost = scanner.nextFloat();
                store.getItemsInStore().get(id).setCost(cost);
                store.getItemsInStore().get(id).setTitle(title);
                store.getItemsInStore().get(id).setCategory(category);
                System.out.println(store);
            }
        }
    }

    public static void mediaDetailsMenu(Scanner scanner, Store store, Cart cart) {
        System.out.print("Mai Minh Quân - 20225661 - Enter media's title: ");
        String title = scanner.nextLine();
        Media item = store.findMedia(title);
        if(item == null) {
            System.out.println("Mai Minh Quân - 20225661 - There is no such media !");
            return;
        }
        System.out.println(item);
        while (true) {
            System.out.println("""
                            Mai Minh Quân - 20225661 
                            Options:
                            --------------------------------
                            1. Add to cart
                            2. Play
                            0. Back
                            --------------------------------
                            Please choose a number: 0-1-2
                            Enter option: """);
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    cart.addMedia(item);
                }
                case 2 -> {
                    if (item.getClass().getSimpleName().equals("Book")) {
                        System.out.println("Mai Minh Quân - 20225661 - This media is unplayable");
                    } else {
                        if (item instanceof DigitalVideoDisc dvd) {
                            dvd.play();
                        }
                        if (item instanceof CompactDisc cd) {
                            cd.play();
                        }
                    }
                }
                case 0 -> {
                    return;
                }
            }
        }
    }

    public static void storeMenu(Scanner scanner, Store store, Cart cart) {
        System.out.println(store);
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            System.out.println("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> mediaDetailsMenu(scanner, store, cart);
                case 0 -> {
                    return;
                }
                case 2 -> {
                    System.out.print("Mai Minh Quân - 20225661 - Enter media's title: ");
                    String title = scanner.nextLine();
                    Media item = store.findMedia(title);
                    if (item == null) {
                        System.out.println("Mai Minh Quân - 20225661 - There is no such media !");
                    } else {
                        cart.addMedia(item);
                    }
                }
                case 3 -> {
                    System.out.print("Mai Minh Quân - 20225661 - Enter media's title: ");
                    String title = scanner.nextLine();
                    Media item = store.findMedia(title);
                    if (item == null) {
                        System.out.println("Mai Minh Quân - 20225661 - There is no such media !");
                    } else {
                        if (item.getClass().getSimpleName().equals("Book")) {
                            System.out.println("Mai Minh Quân - 20225661 - This media is unplayable");
                        } else {
                            if (item instanceof DigitalVideoDisc dvd) {
                                dvd.play();
                            }
                            if (item instanceof CompactDisc cd) {
                                cd.play();
                            }
                        }
                    }
                }
                case 4 -> {
                    cart.print();
                    cartMenu(scanner,cart);
                }
            }
        }
    }

    public static void cartMenu(Scanner scanner,Cart cart) {
        while (true) {
            System.out.println("""
                    Mai Minh Quân - 20225661 
                    Options:
                    --------------------------------
                    1. Filter medias in cart
                    2. Sort medias in cart
                    3. Remove media from cart
                    4. Play a media
                    5. Place order
                    0. Back
                    --------------------------------  
                    Please choose a number: 0-1-2-3-4-5
                    Enter option: """);
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("""
                            Mai Minh Quân - 20225661
                            1. Filter by id
                            2. Filter by title
                            ----------------
                            your option:
                            """);
                    int option2 = scanner.nextInt();
                    scanner.nextLine();
                    if (option2 == 1) {
                        System.out.println("Enter media's id");
                        int id = scanner.nextInt();
                        cart.searchById(id);
                    } else {
                        System.out.println("Enter media's title");
                        String title = scanner.nextLine();
                        cart.searchByTitle(title);
                    }
                }
                case  2 -> {
                    System.out.println("""
                            Mai Minh Quân - 20225661
                            1. sort by title cost
                            2. sort by cost title
                            ----------------
                            your option:
                            """);
                    int option2 = scanner.nextInt();
                    scanner.nextLine();
                    if (option2 == 1) {
                        cart.sortByTitleCost();
                        cart.print();
                    } else {
                        cart.sortByCostTitle();
                        cart.print();
                    }
                }
                case 3 -> {
                    System.out.print("Mai Minh Quân - 20225661 - Enter media's title: ");
                    String title = scanner.nextLine();
                    Media item = cart.findMedia(title);
                    if (item == null) {
                        System.out.println("Mai Minh Quân - 20225661 - There is no such media !");
                    } else {
                        cart.removeMedia(item);
                    }
                }
                case 4 -> {
                    System.out.print("Mai Minh Quân - 20225661 - Enter media's title: ");
                    String title = scanner.nextLine();
                    Media item = cart.findMedia(title);
                    if (item == null) {
                        System.out.println("Mai Minh Quân - 20225661 - There is no such media !");
                    } else {
                        if (item.getClass().getSimpleName().equals("Book")) {
                            System.out.println("Mai Minh Quân - 20225661 - This media is unplayable");
                        } else {
                            if (item instanceof DigitalVideoDisc dvd) {
                                dvd.play();
                            }
                            if (item instanceof CompactDisc cd) {
                                cd.play();
                            }
                        }
                    }
                }
                case  5 -> {
                    System.out.println("Mai Minh Quân - 20225661 - Your cart have been paid\nThanks for using our service");
                    cart.emptyCart();
                }
            }
        }
    }
}