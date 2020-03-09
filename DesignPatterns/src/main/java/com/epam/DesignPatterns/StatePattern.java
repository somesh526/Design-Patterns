package com.epam.DesignPatterns;

interface SmartTvState
{
 
  void switchOnOffSmartTv();
 
}
 class SmartTvSwitchOffState implements SmartTvState
{
 
 public void switchOnOffSmartTv()
 {
 System.out.println("Smart TV is Switched OFf");
 }
 
}
class SmartTvSwitchOnState implements SmartTvState
{
 
 public void switchOnOffSmartTv()
 {
 System.out.println("Smart TV is Switched On");
 }
 
}
class SmartTv implements SmartTvState
{
 
 private SmartTvState smartTvState;
 
 public SmartTvState getSmartTvState()
 {
 return smartTvState;
 }
 
 public void setSmartTvState(SmartTvState smartTvState)
 {
 this.smartTvState = smartTvState;
 
 }
 
 public void switchOnOffSmartTv()
 {
 System.out.println("Current state Of Smart Tv : " + smartTvState.getClass().getName());
 smartTvState.switchOnOffSmartTv();
 
 }
 
}
public class StatePattern {
	public static void main( String[] args )
	 {
	 SmartTv smartTv= new SmartTv();
	 SmartTvState smartTvSwitchOnState = new SmartTvSwitchOnState();
	 SmartTvState smartTvSwitchOffState = new SmartTvSwitchOffState ();
	 
	 smartTv.setSmartTvState(smartTvSwitchOnState);
	 smartTv.switchOnOffSmartTv();
	 
	 smartTv.setSmartTvState(smartTvSwitchOffState);
	 smartTv.switchOnOffSmartTv();
	 }

}
