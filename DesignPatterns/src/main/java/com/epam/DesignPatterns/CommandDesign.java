package com.epam.DesignPatterns;

class SublimeText
{
  public void open()
  {
    System.out.println("Sublime Text is Opened");
  }
 
  public void edit()
  {
    System.out.println("Sublime Text is Edited");
  }
 
  public void save()
  {
    System.out.println("Sublime Text is Saved");
  }
 
  public void close()
  {
    System.out.println("Sublime Text is Closed");
  }
 
}
 interface Command
{
  public void execute();
}
 class OpenSublimeText implements Command
{
  private SublimeText sublimeText;
 
  public OpenSublimeText( SublimeText sublimeText )
  {
    this.sublimeText = sublimeText;
  }
 public void execute()
  {
    sublimeText.open();
  }
}
 class CloseSublimeText implements Command
 {
   private SublimeText sublimeText;
  
   public CloseSublimeText( SublimeText sublimeText )
   {
     this.sublimeText = sublimeText;
   }
  
   
   public void execute()
   {
     sublimeText.close();
   }
 }

 class Options
 {
   private Command openSublimeText;
   private Command closeSublimeText;
  
   public Options( Command open, Command close )
   {
     this.openSublimeText = open;
     this.closeSublimeText = close;
     
   }
  
   public void pressOpen()
   {
     openSublimeText.execute();
   }
  
   public void pressClose()
   {
     closeSublimeText.execute();
   }
  
 }

public class CommandDesign {
	
	public static void main( String[] args )
	  {
	    SublimeText sublimeText = new SublimeText();
	    Command openSublimeText = new OpenSublimeText(sublimeText);
	    Command closeSublimeText = new CloseSublimeText(sublimeText);
	    Options option = new Options(openSublimeText,closeSublimeText);
	    option.pressOpen();
	    option.pressClose();
	  }

}
