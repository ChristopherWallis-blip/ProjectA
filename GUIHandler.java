import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import animals.behaviours.*;
import animals.Animal;
import animals.ant.*;
import animals.bear.*;
import animals.chicken.*;
import animals.cow.*;
import animals.duck.*;
import animals.elephant.*;
import animals.goose.*;
import animals.lion.*;
import animals.parrot.*;
import animals.pig.*;
import animals.wolf.*;

public abstract class GUIHandler {

	private static Animal currentAnimal;
	private static ImageIcon image;
    private static JLabel titleLabel;
    private static JLabel outputLabel;

    private static void resetButtonListeners(JButton button) {

        for (ActionListener al : button.getActionListeners()) {
            button.removeActionListener(al);
        }
    }

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
		JButton species1Button = new JButton();
		JButton species2Button = new JButton();
		JButton species3Button = new JButton();
		specificListPanel.add(species1Button);
		specificListPanel.add(species2Button);
		specificListPanel.add(species3Button);

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
		image = new ImageIcon("resources/pokedex.jpg");
		JLabel imageLabel = new JLabel(image);
		imagePanel.add(imageLabel);
		JPanel titlePanel = new JPanel();
		titleLabel = new JLabel("Animal");
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
		outputLabel = new JLabel("Output");
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
                outputLabel.setText("");
				currentAnimal = new Bear();
                titleLabel.setText("Bear");
				image.setImage(new ImageIcon("resources/bear/bear.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Run");
				eatButton.setText("Eat");
				soundButton.setText("Roar");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Grizzly Bear");
				species2Button.setText("Black Bear");
				species3Button.setText("Panda Bear");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

                            outputLabel.setText("");
							currentAnimal = new GrizzlyBear();
                            titleLabel.setText("Grizzly Bear");
							image.setImage(new ImageIcon("resources/bear/grizzlyBear.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

							outputLabel.setText("");
                            currentAnimal = new BlackBear();
                            titleLabel.setText("Black Bear");
							image.setImage(new ImageIcon("resources/bear/blackBear.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

                            outputLabel.setText("");
							currentAnimal = new Panda();
                            titleLabel.setText("Panda Bear");
							image.setImage(new ImageIcon("resources/bear/panda.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		antButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
                outputLabel.setText("");
                currentAnimal = new Ant();
                titleLabel.setText("Ant");
				image.setImage(new ImageIcon("resources/ant/ant.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("March");
				eatButton.setText("Eat");
				soundButton.setText("Ant noise?");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Bullet Ant");
				species2Button.setText("Carpenter Ant");
				species3Button.setText("Fire Ant");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new BulletAnt();
                            titleLabel.setText("Bullet Ant");
							image.setImage(new ImageIcon("resources/ant/bulletAnt.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");				
                            currentAnimal = new CarpenterAnt();
                            titleLabel.setText("Carpenter Ant");
							image.setImage(new ImageIcon("resources/ant/carpenterAnt.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

                            outputLabel.setText("");
							currentAnimal = new FireAnt();
                            titleLabel.setText("Fire Ant");
							image.setImage(new ImageIcon("resources/ant/fireAnt.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		chickenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				outputLabel.setText("");
                currentAnimal = new Chicken();
                titleLabel.setText("Chicken");
				image.setImage(new ImageIcon("resources/chicken/chicken.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Walk");
				eatButton.setText("Eat");
				soundButton.setText("Chicken noise");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Brahma Chicken");
				species2Button.setText("Buckeye Chicken");
				species3Button.setText("Leghorn Chicken");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {
                            outputLabel.setText("");
							currentAnimal = new Brahma();
                            titleLabel.setText("Brahma Chicken");
							image.setImage(new ImageIcon("resources/chicken/brahma.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Buckeye();
                            titleLabel.setText("Buckeye Chicken");
							image.setImage(new ImageIcon("resources/chicken/buckeye.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Leghorn();
                            titleLabel.setText("Leghorn Chicken");
							image.setImage(new ImageIcon("resources/chicken/leghorn.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		cowButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

                outputLabel.setText("");
				currentAnimal = new Cow();
                titleLabel.setText("Cow");
				image.setImage(new ImageIcon("resources/cow/cow.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Walk");
				eatButton.setText("Eat");
				soundButton.setText("Moo");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Belgian Blue Cow");
				species2Button.setText("Hereford Cow");
				species3Button.setText("Holstein Cow");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

				            outputLabel.setText("");
                            currentAnimal = new BelgianBlue();
                            titleLabel.setText("Belgian Blue Cow");
							image.setImage(new ImageIcon("resources/cow/belgianBlue.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

							outputLabel.setText("");
                            currentAnimal = new Hereford();
                            titleLabel.setText("Hereford Cow");
							image.setImage(new ImageIcon("resources/cow/hereford.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Holstein();
                            titleLabel.setText("Holstein Cow");
							image.setImage(new ImageIcon("resources/cow/holstein.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		duckButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                outputLabel.setText("");
                currentAnimal = new Duck();
                titleLabel.setText("Duck");
				image.setImage(new ImageIcon("resources/duck/duck.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Swim");
				eatButton.setText("Eat");
				soundButton.setText("Quack");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Harlequin Duck");
				species2Button.setText("Mallard Duck");
				species3Button.setText("Muscovy Duck");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Harlequin();
                            titleLabel.setText("Harlequin Duck");
							image.setImage(new ImageIcon("resources/duck/harlequin.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Mallard();
                            titleLabel.setText("Mallard Duck");
							image.setImage(new ImageIcon("resources/duck/mallard.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Muscovy();
                            titleLabel.setText("Muscovy Duck");
							image.setImage(new ImageIcon("resources/duck/muscovy.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		elephantButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                outputLabel.setText("");
                currentAnimal = new Elephant();
                titleLabel.setText("Elephant");
				image.setImage(new ImageIcon("resources/elephant/elephant.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Lumber");
				eatButton.setText("Eat");
				soundButton.setText("Trumpet");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("African Elephant");
				species2Button.setText("Asian Elephant");
				species3Button.setText("Indian Elephant");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new AfricanElephant();
                            titleLabel.setText("African Elephant");
							image.setImage(new ImageIcon("resources/elephant/africanElephant.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}

				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new AsianElephant();
                            titleLabel.setText("Asian Elephant");
							image.setImage(new ImageIcon("resources/elephant/asianElephant.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}

				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");	
                            currentAnimal = new IndianElephant();
                            titleLabel.setText("Indian Elephant");
							image.setImage(new ImageIcon("resources/elephant/indianElephant.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}

				});
			}
		});

		gooseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                outputLabel.setText("");
                currentAnimal = new Goose();
                titleLabel.setText("Goose");
				image.setImage(new ImageIcon("resources/goose/goose.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Swim/Waddle");
				eatButton.setText("Eat");
				soundButton.setText("Honk");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Brent Goose");
				species2Button.setText("Greylag Goose");
				species3Button.setText("Swan Goose");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

                            outputLabel.setText("");
                            currentAnimal = new Brent();
                            titleLabel.setText("Brent Goose");
							image.setImage(new ImageIcon("resources/goose/brent.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Greylag();
                            titleLabel.setText("Greylag Goose");
							image.setImage(new ImageIcon("resources/goose/greylag.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new SwanGoose();
                            titleLabel.setText("Swan Goose");
							image.setImage(new ImageIcon("resources/goose/swanGoose.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}

				});
			}
		});

		lionButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                outputLabel.setText("");
                currentAnimal = new Lion();
                titleLabel.setText("Lion");
				image.setImage(new ImageIcon("resources/lion/lion.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Pad");
				eatButton.setText("Eat");
				soundButton.setText("Roar");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Cape Lion");
				species2Button.setText("Congo Lion");
				species3Button.setText("European Lion");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

							outputLabel.setText("");
                            currentAnimal = new CapeLion();
                            titleLabel.setText("Cape Lion");
							image.setImage(new ImageIcon("resources/lion/capeLion.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new CongoLion();
                            titleLabel.setText("Congo Lion");
							image.setImage(new ImageIcon("resources/lion/congoLion.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}

				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

							outputLabel.setText("");
                            currentAnimal = new EuropeanLion();
                            titleLabel.setText("European Lion");
							image.setImage(new ImageIcon("resources/lion/europeanLion.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}

				});
			}
		});

		parrotButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                outputLabel.setText("");
                currentAnimal = new Parrot();
                titleLabel.setText("Parrot");
				image.setImage(new ImageIcon("resources/parrot/parrot.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Fly");
				eatButton.setText("Eat");
				soundButton.setText("Squawk");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Cockatoo Parrot");
				species2Button.setText("Macaw Parrot");
				species3Button.setText("Quaker Parrot");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Cockatoo();
                            titleLabel.setText("Cockatoo Parrot");
							image.setImage(new ImageIcon("resources/parrot/cockatoo.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Macaw();
                            titleLabel.setText("Macaw Parrot");
							image.setImage(new ImageIcon("resources/parrot/macaw.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}

				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new Quaker();
                            titleLabel.setText("Quaker Parrot");
							image.setImage(new ImageIcon("resources/parrot/quaker.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		pigButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                outputLabel.setText("");
                currentAnimal = new Pig();
                titleLabel.setText("Pig");
				image.setImage(new ImageIcon("resources/pig/pig.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Wander");
				eatButton.setText("Eat");
				soundButton.setText("Oink");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Gilt Pig");
				species2Button.setText("Hampshire Pig");
				species3Button.setText("KuneKune Pig");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");	
                            currentAnimal = new Gilt();
                            titleLabel.setText("Gilt Pig");
							image.setImage(new ImageIcon("resources/pig/gilt.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

							outputLabel.setText("");
                            currentAnimal = new Hampshire();
                            titleLabel.setText("Hampshire Pig");
							image.setImage(new ImageIcon("resources/pig/hampshire.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new KuneKune();
                            titleLabel.setText("KuneKune Pig");
							image.setImage(new ImageIcon("resources/pig/kuneKune.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		wolfButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                outputLabel.setText("");
                currentAnimal = new Wolf();
                titleLabel.setText("Wolf");
				image.setImage(new ImageIcon("resources/wolf/wolf.jpg")
						.getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								java.awt.Image.SCALE_SMOOTH
							)
					);
				imageLabel.repaint();

				moveButton.setText("Wander");
				eatButton.setText("Eat");
				soundButton.setText("Howl");

                resetButtonListeners(species1Button);
                resetButtonListeners(species2Button);
                resetButtonListeners(species3Button);

				species1Button.setText("Arctic Wolf");
				species2Button.setText("Dingo Wolf");
				species3Button.setText("Eastern Wolf");

				species1Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new ArcticWolf();
                            titleLabel.setText("Arctic Wolf");
							image.setImage(new ImageIcon("resources/wolf/arcticWolf.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species2Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

							outputLabel.setText("");
                            currentAnimal = new Dingo();
                            titleLabel.setText("Dingo");
							image.setImage(new ImageIcon("resources/wolf/dingo.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});

				species3Button.addActionListener(new ActionListener() {
							
						@Override
						public void actionPerformed(ActionEvent e) {

			                outputLabel.setText("");
                            currentAnimal = new EasternWolf();
                            titleLabel.setText("Eastern Wolf");
							image.setImage(new ImageIcon("resources/wolf/easternWolf.jpg")
									.getImage()
									.getScaledInstance(
											imageLabel.getWidth(), 
											imageLabel.getHeight(), 
											java.awt.Image.SCALE_SMOOTH
										)
								);
							imageLabel.repaint();
						}
				});
			}
		});

		eatButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (currentAnimal != null) {
					String text = currentAnimal.performEat();
					outputLabel.removeAll();
					outputLabel.setText(text);
				} else {
					outputLabel.setText("Please select Animal first!");
				}
			}
		});

		moveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (currentAnimal != null) {
					String text = currentAnimal.performMove();
					outputLabel.removeAll();
					outputLabel.setText(text);
				} else {

					outputLabel.setText("Please select Animal first!");
				}
			}
		});

		soundButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (currentAnimal != null) {
					String text = currentAnimal.performSound();
					outputLabel.removeAll();
					outputLabel.setText(text);
				} else {
					outputLabel.setText("Please select Animal first!");
				}
			}
		});
	}
}
