package Dsa;

public class Lambda {

        interface Calc {
            int add ( int i,int j);
        }
        class Demo {
            public static void main(String[] args) {
              Calc obj = new Calc() {
                  @Override
                  public int add(int i, int j) {
                      return i+j;
                  }
              };
              int results=obj .add(4,5);
                System.out.println();

            }
        }
}
//