/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package g.try_catch;

/**
 *
 * @author zafer
 */
public class Try_catch {

    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[4]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.err.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(exception);
        } catch (Exception exception) {
            System.out.println("Loglandı:" + exception);
        } finally {
            System.out.println("Ben her türlü çalışırım");
        }

    }
}
