package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlock {

    public static void main(String[] args) {

        try {
            System.out.println(100/0);
        }catch (ClassCastException e){
            System.out.println("Class Cast");
        }catch (NoSuchElementException e){
            System.out.println("No such element");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index is out of bound");
        }catch (ArithmeticException e){
            System.out.println("Aritmetic");
        }catch (RuntimeException e){
            System.out.println("Run Time");
        }




    }

}
