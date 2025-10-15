import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class GUIHandler {

	private static Animal currentAnimal;
	private static ImageIcon image;

	public static void startUp() {

		JFrame frame = new JFrame("Zoo Simulation App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setResizable(false);

		JPanel animalListPanel = new JPanel();
		animalListPanel.setBackground(Color.LIGHT_GRAY);
		animalListPanel.setLayout(new FlowLayout());
		animalListPanel.setMinimumSize(new Dimension(200, 300));

		JButton antButton = new JButton("Ant");
		JButton bearButton = new JButton("Bear");
		JButton chickenButton = new JButton("Chicken");
		JButton cowButton = new JButton("Cow");
		JButton duckButton = new JButton("Duck");
		JButton elephantButton = new JButton("Elephant");
		JButton gooseButton = new JButton("Goose");
		JButton lionButton = new JButton("Lion");
		JButton parrotButton = new JButton("Parrot");
		JButton pigButton = new JButton("Pig");
		JButton wolfButton = new JButton("Wolf");
		animalListPanel.add(antButton);
		animalListPanel.add(bearButton);
		animalListPanel.add(chickenButton);
		animalListPanel.add(cowButton);
		animalListPanel.add(duckButton);
		animalListPanel.add(elephantButton);
		animalListPanel.add(gooseButton);
		animalListPanel.add(lionButton);
		animalListPanel.add(parrotButton);
		animalListPanel.add(pigButton);
		animalListPanel.add(wolfButton);

		JPanel specificListPanel = new JPanel();
		specificListPanel.setLayout(new FlowLayout());
		JButton test1Button = new JButton("Test 1");
		JButton test2Button = new JButton("Test 2");
		JButton test3Button = new JButton("Test 3");
		specificListPanel.add(test1Button);
		specificListPanel.add(test2Button);
		specificListPanel.add(test3Button);

		JSplitPane leftSide = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT,
				true,
				animalListPanel,
				specificListPanel
			);
		leftSide.setDividerLocation(0.4);
		leftSide.setEnabled(false);
		leftSide.setDividerSize(2);
		leftSide.setMinimumSize(new Dimension(200, 300));
		leftSide.setMaximumSize(new Dimension(400, 600));

		JPanel imagePanel = new JPanel();
		image = new ImageIcon("storage/pokedex.jpg");
		JLabel imageLabel = new JLabel(image);
		imagePanel.add(imageLabel);
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("Animal");
		titlePanel.add(titleLabel);
		JSplitPane topOutput = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT, 
				true,
				titlePanel,
				imagePanel
			);
		topOutput.setDividerLocation(0.2);
		topOutput.setEnabled(false);
		topOutput.setDividerSize(2);

		JPanel outputPanel = new JPanel();
		JLabel outputLabel = new JLabel("Output");
		outputPanel.add(outputLabel);
		JPanel buttonPanel = new JPanel();
		JLabel actionLabel = new JLabel();
		JButton eatButton = new JButton("Eat");
		JButton moveButton = new JButton("Move");
		JButton soundButton = new JButton("Sound");
		buttonPanel.add(eatButton);
		buttonPanel.add(moveButton);
		buttonPanel.add(soundButton);
		JSplitPane bottomOutput = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT,
				true,
				buttonPanel,
				outputPanel
			);
		bottomOutput.setDividerLocation(0.5);
		bottomOutput.setEnabled(false);
		bottomOutput.setDividerSize(2);

		JSplitPane rightSide = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT,
				true,
				topOutput,
				bottomOutput
			);
		rightSide.setDividerLocation(0.7);
		rightSide.setEnabled(false);
		rightSide.setDividerSize(2);
		
		JSplitPane totalPane = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT,
				true,
				leftSide,
				rightSide
			);
		totalPane.setDividerLocation(0.3);
		totalPane.setEnabled(false);
		totalPane.setDividerSize(2);

		frame.add(totalPane, BorderLayout.CENTER);
		frame.setVisible(true);


		//animal buttons
		bearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Bear();
				image.setImage(new ImageIcon("storage/Bear.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Run");
				eatButton.setText("Omnivore");
				soundButton.setText("Roar");
			}
			
		});

		antButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Ant();
				image.setImage(new ImageIcon("storage/fireAnt.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("March");
				eatButton.setText("Omnivore");
				soundButton.setText("Ant noise?");
			}
			
		});

		chickenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Chicken();
				image.setImage(new ImageIcon("storage/Chicken.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Walk");
				eatButton.setText("Omnivore");
				soundButton.setText("Chicken noise");
			}
			
		});

		cowButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Cow();
				image.setImage(new ImageIcon("storage/Cow.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Walk");
				eatButton.setText("Herbivore");
				soundButton.setText("Moo");
			}
			
		});

		duckButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Duck();
				image.setImage(new ImageIcon("storage/Duck.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Swim");
				eatButton.setText("Omnivore");
				soundButton.setText("Quack");
			}
			
		});

		elephantButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Elephant();
				image.setImage(new ImageIcon("storage/Elephant.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Lumber");
				eatButton.setText("Herbivore");
				soundButton.setText("Trumpet");
			}
			
		});

		gooseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Goose();
				image.setImage(new ImageIcon("storage/Goose.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Swim/Waddle");
				eatButton.setText("Herbivore");
				soundButton.setText("Honk");
			}
			
		});

		lionButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Lion();
				image.setImage(new ImageIcon("storage/Lion.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Pad");
				eatButton.setText("Carnivore");
				soundButton.setText("Roar");
			}
			
		});

		parrotButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Parrot();
				image.setImage(new ImageIcon("storage/Parrot.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Fly");
				eatButton.setText("Omnivore");
				soundButton.setText("Squawk");
			}
			
		});

		pigButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Pig();
				image.setImage(new ImageIcon("storage/Pig.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Wander");
				eatButton.setText("Omnivore");
				soundButton.setText("Oink");
			}
			
		});

		wolfButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currentAnimal = new Wolf();
				image.setImage(new ImageIcon("storage/Wolf.jpg").getImage());
				imageLabel.repaint();

				moveButton.setText("Wander");
				eatButton.setText("Carnivore");
				soundButton.setText("Howl");
			}
			
		});
		//action buttons
		eatButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentAnimal != null)
				{
					String text = currentAnimal.performEat();
					outputLabel.removeAll();
					outputLabel.setText(text);
				}
				else
				{
					outputLabel.setText("Please select Animal first!");
				}
			}
			
		});

		moveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentAnimal != null)
				{
					String text = currentAnimal.performMove();
					outputLabel.removeAll();
					outputLabel.setText(text);
				}
				else
				{
					outputLabel.setText("Please select Animal first!");
				}
			}
			
		});

		soundButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentAnimal != null)
				{
					String text = currentAnimal.performSound();
					outputLabel.removeAll();
					outputLabel.setText(text);
				}
				else
				{
					outputLabel.setText("Please select Animal first!");
				}
			}
			
		});
	}
}
