package ch14home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVacationRental extends
JFrame implements ItemListener
{
	final int BASE_PRICE = 0;
	final int PARK = 600;
	final int POOL = 750;
	final int LAKE = 825;
	final int ROOM = 75;
	final int ROOM2 = 150;
	final int ROOM3 = 225;
	final int MEAL = 200;
	int totalPrice = BASE_PRICE; 
	
	JCheckBox location = new JCheckBox
	("Parkside location $" + PARK, false);
	JCheckBox location2 = new JCheckBox
	("Poolside location $" + POOL, false);
	JCheckBox location3 = new JCheckBox
	("Lakeside location $" + LAKE, false);
	
	
	JCheckBox room = new JCheckBox
	("One bedroom $" + ROOM, false);
	JCheckBox room2 = new JCheckBox
	("Two bedrooms $" + ROOM2, false);
	JCheckBox room3 = new JCheckBox
	("Three bedrooms $" + ROOM3, false);
	
	
	JCheckBox meal = new JCheckBox
	("Meal $" + MEAL, false);
	
			
	JLabel titleLabel = new JLabel("Vacaton Rentals Calculator");
	JLabel priceLabel = new JLabel("The price is");
	JTextField totPrice = new JTextField(4);
	
	JLabel optionExplainLabel1 = new JLabel
	("Check the location you want.");
	JLabel optionExplainLabel2 = new JLabel
	("Check the number of room you want.");
	JLabel optionExplainLabel3 = new JLabel
	("Check the meal you want.");
	

public JVacationRental()
{
 super("Vacation Rental Estimator");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new FlowLayout());
 add(titleLabel);
 add(optionExplainLabel1);
 add(location);
 add(location2);
 add(location3);
 add(optionExplainLabel2);
 add(room);
 add(room2);
 add(room3);
 add(optionExplainLabel3);
 add(meal);
 add(priceLabel);
 add(totPrice);
 totPrice.setText("$" + totalPrice);
 location.addItemListener(this);
 location2.addItemListener(this);
 location3.addItemListener(this);
 room.addItemListener(this);
 room2.addItemListener(this);
 room3.addItemListener(this);
 meal.addItemListener(this);
}

@Override
public void itemStateChanged(ItemEvent event)
{
 Object source = event.getSource();
 int select = event.getStateChange();
 
 if(source == location)
	 if(select == ItemEvent.SELECTED)
	 totalPrice += PARK;
	 else
	 totalPrice -=  PARK;
 
	 else if(source == location2)
	 {
	 if(select == ItemEvent.SELECTED)
	 totalPrice += POOL;
	 else
	 totalPrice -= POOL;
	 }
 
	 else if(source == location3)
	 {
	 if(select == ItemEvent.SELECTED)
	 totalPrice += LAKE;
	 else
	 totalPrice -= LAKE;
	 }
 
	 else if(source == room)
	 {
	 if(select == ItemEvent.SELECTED)
	 totalPrice += ROOM;
	 else
	 totalPrice -= ROOM;
	 }
 
	 else if(source == room2)
	 {
	 if(select == ItemEvent.SELECTED)
	 totalPrice += ROOM2;
	 else
	 totalPrice -= ROOM2;
	 }
 
	 else if(source == room3)
	 {
	 if(select == ItemEvent.SELECTED)
	 totalPrice += ROOM3;
	 else
	 totalPrice -= ROOM3;
	 }
 
	 else
	 if(select == ItemEvent.SELECTED)
	 totalPrice += MEAL;
	 else
	 totalPrice -= MEAL;
	 totPrice.setText("$" + totalPrice);
	 
		 
	 }

	public static void main(String[] args) {
		{
			JVacationRental aFrame = new JVacationRental();
			final int WIDTH = 300;
			final int HEIGHT = 400;
			aFrame.setSize(WIDTH, HEIGHT);
			aFrame.setVisible(true); 


		}

}
}