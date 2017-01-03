package com.heyhi.arduino;


import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;


public class Arduino {
     CommPortIdentifier portIdentifier;
	  CommPort commPort;
	 SerialPort serialPort;
	  SerialDataSender sds ;
	
	 public Arduino()
	   {
		
		 sds = new SerialDataSender();
         try{
        	 portIdentifier = CommPortIdentifier.getPortIdentifier("COM4");
        	 commPort = portIdentifier.open(this.getClass().getName(),2000);
        	 if ( commPort instanceof SerialPort )
             {
                 serialPort = (SerialPort) commPort;
                 serialPort.setSerialPortParams(9600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
             }
         }catch(Exception ex){
        	 System.out.println(ex.getStackTrace());
         }
	}
	public void sendXY(int x, int y){
	sds.SendDataToArduino(x, y);
	}
}
