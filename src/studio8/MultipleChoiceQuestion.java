package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String[] choices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		super(prompt, answer, points);
		this.choices= choices;
		
		
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for(int i=0;i<choices.length;i++) {
			System.out.println(i+1+". "+this.choices[i]);
			
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {

		return choices;
				}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		 String prompt="What is the capital of Missouri?";
		 String answer="Kansas City";
		 String[] choices= {"Kansas City", "Saint Louis", "Missouri", "Washington DC"};
	}

}
