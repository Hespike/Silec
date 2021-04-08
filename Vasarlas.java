public class Vasarlas {

    static boolean vasarlas(int penzmennyiseg, int ar) {
        if (penzmennyiseg >= ar) {
            return true;
        } else {
            return false;
        }
    }
}


/* elegansabb megoldas
public class Vasarlas {

    static boolean vasarlas(int penzmennyiseg, int ar) {
        return penzmennyiseg >= ar;
    }

}
*/
