public class Wolf extends Animal
{
    public Wolf()
    {
        setMovementBehavior(new MovementBehavior() 
        {
            @Override
            public String move()
            {
                return "Wolves wandering around...";
            }
        });

        setDietBehavior(new DietBehavior()
        {
            @Override
            public String eat()
            {
                return "Wolves are carnivores...\nEating rabbits";
            }
        });

        setSoundBehavior(new SoundBehavior()
        {
            @Override
            public String makeSound()
            {
                return "HOWL";
            }
        });
    }
}    

