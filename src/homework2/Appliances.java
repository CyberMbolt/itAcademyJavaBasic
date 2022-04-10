package homework2;
// Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
// Создать несколько объектов описанных классов, часть из них включить в розетку.
// Иерархия должна иметь хотя бы три уровня.

  public class Appliances {
      public static void main (String[] args) {
          LargeHomeAppliances ll = new Refrigerator("Неман");
          ll.LargeHA();
          LargeHomeAppliances l = new WashMachine("Bosh");
          l.LargeHA();
    }
}
  abstract class Household {
      String name;

      public Household(String name) {
          this.name = name;
    }
    @Override
      public String toString() {
          return name;
    }
}
  interface LargeHomeAppliances {
      void LargeHA();
}
  class Refrigerator extends Household implements LargeHomeAppliances {
      public Refrigerator(String name) {
          super(name);
    }
      public void LargeHA() {
          System.out.println(this+" холодильник включен в розетку");
    }
}
  class WashMachine extends Household implements LargeHomeAppliances {
      public WashMachine(String name) {
          super(name);
    }
      public void LargeHA() {
          System.out.println(this+" стиральная машина включена в розетку");
    }
}

