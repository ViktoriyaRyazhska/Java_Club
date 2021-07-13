public class task36 {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int result = 0;
    for (int i = 0; i < arrayOfSheeps.length; i++) {
      if (arrayOfSheeps[i] != null && arrayOfSheeps[i])
        result++;
    }
    return result;
  }
}
