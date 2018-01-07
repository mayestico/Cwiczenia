public class ListOfNotes {
    String pointedBook;
    int books;
    int nrOfElectronics;
    int nrOfComputers;
    String computerName;
    String teaType;

    int sumOfThings (int books, int nrOfElectronics, int nrOfComputers) {
        int result = books+nrOfElectronics+nrOfComputers;
        System.out.println("Total sum of electronics things = "+result);
        return result;
    }


    void printInfo(int nrOfElectronics, int nrOfComputers, String computerName) {
        System.out.println("You have nr of Electronic Gadgets" + nrOfElectronics + " and nr of Computers" + nrOfComputers +
                "Brand " + computerName);
    }


    void ListOfBooks(int books, String teaType) {
        System.out.println("like book nr " + books + " read with tea " + teaType);
    }

    void SpecifiedTypeOfBook(String pointedBook, String teaType) {
        System.out.println("like's reading a book named " + pointedBook + " with tea type " + teaType);
    }

}


class EngineOfList {
    public static void main(String[] args) {
        ListOfNotes Rafal = new ListOfNotes();
        Rafal.ListOfBooks(1, "Lemon");
        Rafal.ListOfBooks(2, "Black");
        Rafal.SpecifiedTypeOfBook("Rio Anaconda", "Red Tea");
        Rafal.printInfo(10, 1, "Asus");
        Rafal.sumOfThings(5,15,56);

        ListOfNotes RedWolf = new ListOfNotes();
        RedWolf.ListOfBooks(1, "Tea with Lemon");
        RedWolf.SpecifiedTypeOfBook("Shantarama", "Lemon Tea with Honey");
        RedWolf.printInfo(15, 0, "Lenovo");
        RedWolf.sumOfThings(55,11,55);
    }
}