/**
 * Abstract Animal class, defines shared fields and methods for all animals
 */
abstract class Animal {
    private MovementBehavior movementBehavior;
    private SoundBehavior soundBehavior;
    private DietBehavior dietBehavior;

    public void setMovementBehavior(MovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;}

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;}

    public void setDietBehavior(DietBehavior dietBehavior) {
        this.dietBehavior = dietBehavior;}

    public void performMove() {
        this.movementBehavior.move();}

    public void performSound() {
        this.soundBehavior.makeSound();}

    public void performEat() {
        this.dietBehavior.eat();}
 }