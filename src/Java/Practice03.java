package Java;

public class Practice03 {
    public static class animal{

        void sound(){
            System.out.println("Animal Sound");
        }

        static class dog extends animal{
            @Override
            void sound() {
//                super.sound();
                System.out.println("Dog barks");
            }
        }
        static class cat extends dog{
            @Override
            void sound() {
//                super.sound();
                System.out.println("Cat meow");
            }
        }

        public static void main(String[] args) {
            animal obj = new animal();
            obj.sound();

            System.out.println("");

            dog obj2 = new dog();
            obj2.sound();

            System.out.println("");

            cat obj3 = new cat();
            obj3.sound();

        }
    }
}
