/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
	private int id;
	private String playerAnswer;
	private int chosenPath;
	private GUIManager gui;
	private Scanner reader;
	static private int lastId = -1;

	/** Constructor */
	public Event() 
	{}

	public Event(GUIManager gui, String data)
	{
		super(data);
		this.gui = gui;
		reader = gui.getInputReader();
		id = ++lastId;
		chosenPath = -1;
		playerAnswer = ERROR_MSG_UNEXPECTED_END;
	}

	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() 
	{
		return playerAnswer;
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) 
	{
		this.playerAnswer = playerAnswer;
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() 
	{
		return reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) 
	{
		this.reader = reader;
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() 
	{
		return chosenPath;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) 
	{
		this.chosenPath = chosenPath;
	}

	/* Methods */
	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() 
	{
		return this.toString();
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	public void setData(String data) 
	{
		this.setData(data);
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	@Override
	public Event getDaughter(int i) 
	{
		
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 * @param daughter
	 * @param i
	 */
	public void setDaughter(Event daughter, int i) 
	{
		
	}

	/**
	 * @return the gui
	 */
	public GUIManager getGui() 
	{
		/* TO BE COMPLETED */
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) 
	{
		/* TO BE COMPLETED */
	}

	/**
	 * @return the id
	 */
	public int getId() 
	{
		/* TO BE COMPLETED */
	}

	/* Methods */
	public Event run()
	{
		gui.outputln(getData());
		gui.output(PROMPT_ANSWER);
		playerAnswer = reader.next();
		chosenPath = InterpretAnswer();
		return getDaughter(chosenPath);
	}
}

// eof