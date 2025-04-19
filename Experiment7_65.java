// Generic Class
class Box<T> { // T is the type parameter
    private T content;

    // Method to set the value
    public void setContent(T content) {
        this.content = content;
    }

    // Method to get the value
    public T getContent() {
        return content;
    }
}

// Generic Method
class Utility {
    // Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the Generic Class
        Box<Integer> intBox = new Box<>();
        intBox.setContent(42);
        System.out.println("Integer Box contains: " + intBox.getContent());

        Box<String> strBox = new Box<>();
        strBox.setContent("Hello, Generics!");
        System.out.println("String Box contains: " + strBox.getContent());

        // Using the Generic Method
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Generics", "Are", "Awesome"};

        System.out.print("Integer Array: ");
        Utility.printArray(intArray);

        System.out.print("String Array: ");
        Utility.printArray(strArray);
    }
}
