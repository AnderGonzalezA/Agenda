package com.zubiri.agenda;

public class Note {
	private String text="";
	/**

     * Note full constructor

     * @param text The text

     */
	public Note(String text) {
		this.text=text;
	}
	/**

     * Text setter method

     * @param text The new text

     */
	public void setText(String text) {
		this.text=text;
	}
	/**

     * Text getter method

     * @return The text

     */
	public String getText() {
		return text;
	}
}
