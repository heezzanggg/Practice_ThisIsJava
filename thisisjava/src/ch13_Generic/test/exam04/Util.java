package ch13_Generic.test.exam04;

public class Util {
  // public static <K, V> V getValue(Pair<K, V> p, K k) {
  // System.out.println(p.getKey());
  // System.out.println(k);
  // if (p.getKey() == k) {
  // return p.getValue();
  // }
  // return null;
  // }

  public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
    if (p.getKey() == k) {
      return p.getValue();
    }
    return null;
  }
}
