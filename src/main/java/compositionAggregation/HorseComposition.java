package compositionAggregation;
/*
COMPOSITION!
Об'єкт класу Halter створюється в конструкторі, що означає більш теснsq зв'язок між об'єктами.
Об'єкт класу Halter не може існувати без створеного його об'єкта Horse:
 */

public class HorseComposition {
        private Halter halter;

        public HorseComposition() {
            this.halter = new Halter();
        }
    }

