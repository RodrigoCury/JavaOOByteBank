public class testaContaComExcecaoChecked {

  public static void main(String[] args){
    Conta c = new Conta();
    try {
      c.deposita(12.0);
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}