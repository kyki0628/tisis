package net.tis.book;

import java.sql.Date;

public class EventDTO {
	
	private int num, participants, popu;
	private String title, writer, winner;
	private Date writedate, eventdate;
	
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	
	public int getParticipants() { return participants; }
	public void setParticipants(int participants) { this.participants = participants; }
	
	public int getPopu() { return popu; }
	public void setPopu(int popu) { this.popu = popu; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getWriter() { return writer; }
	public void setWriter(String writer) { this.writer = writer; }
	
	public String getWinner() {	return winner; }
	public void setWinner(String winner) { this.winner = winner; }
	
	public Date getWritedate() { return writedate; }
	public void setWritedate(Date writedate) { this.writedate = writedate; }
	
	public Date getEventdate() { return eventdate; }
	public void setEventdate(Date eventdate) { this.eventdate = eventdate; }
	
}//class END
