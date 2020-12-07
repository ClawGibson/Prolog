package src;

import javax.swing.JOptionPane;
import org.jpl7.Query;

/**
 *
 * @author Gamaliel Bernal
 */
public class Permutations extends Connection {

    boolean flag = false;

    public void Permutaciones() {

    }

    public boolean Perm2(String[] elem, String act, int n, int r, int a) {
        if (n == 0) {
            if (!flag) {
                flag = evaluar(act, a);
            }
            //System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) {
                    Perm2(elem, act + elem[i] + "*", n - 1, r, a);
                }
            }
        }
        return flag;
    }

    private boolean evaluar(String cad, int n) {
        String[] ar = cad.split("\\*");
        Conn();
        if (ar.length == 4) {
            Query query = new Query("conocimiento(X,['" + ar[0] + "'," + "'" + ar[1] + "'," + "'" + ar[2] + "'," + "'" + ar[3] + "']).");
            if (query.hasSolution()) {
                JOptionPane.showMessageDialog(null, query.nextSolution());
                return true;
            } else {
                return false;
            }
        }
        Query query = new Query("conocimiento(X,['" + ar[0] + "'," + "'" + ar[1] + "'," + "'" + ar[2] + "']).");
        if (query.hasSolution()) {
            JOptionPane.showMessageDialog(null, query.nextSolution());
            return true;
        } else {
            return false;
        }
    }
}
