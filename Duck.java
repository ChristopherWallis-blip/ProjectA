public class Duck extends Animal
{
    public Duck()
    {
        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Duck swimming...";
            }
            
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Ducks are omnivores...eating bread and insects";
         } 

        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "QUACK!";
            }
        });

    
    }
}