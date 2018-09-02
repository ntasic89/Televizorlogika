package classes;

import enums.Stanje;
import interfaces.IOperations;

/**
 * Televizor class. Basic television operations, changing channels and volume
 * Kolokvijum 09.02.2018.
 * @author Nemanja Tasic SI 41/16
 *
 */
public class Televizor implements IOperations {
	
	protected int channel;
	protected int vol;
	
	protected Stanje _stanje;

	/**
	 * Constructor for Televizor class
	 */

	public Televizor() {
		
		this.channel =0;
		this.vol = 0;
		this._stanje = Stanje.sOFF;
	}

	
	
    /**
	 * @return the channel
	 */
	public int getChannel() {
		return channel;
	}



	/**
	 * @param channel the channel to set
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}



	/**
	 * @return the vol
	 */
	public int getVol() {
		return vol;
	}



	/**
	 * @param vol the vol to set
	 */
	public void setVol(int vol) {
		this.vol = vol;
	}



	/**
	 * @return the _stanje
	 */
	public Stanje get_stanje() {
		return _stanje;
	}



	/**
	 * @param _stanje the _stanje to set
	 */
	public void set_stanje(Stanje _stanje) {
		this._stanje = _stanje;
	}

	/**
	 * @param stanje setting ON, channel to 1, vol to 10
	 */

	public void setON(){
    	set_stanje(Stanje.sON);
    	setChannel(1);
    	setVol(10);
    }
	
	/**
	 * @param stanje setting OFF, channel to 0, vol to 0
	 */
    public void setOFF(){
    	set_stanje(Stanje.sOFF);
    	setChannel(0);
    	setVol(0);
    }

	/**
	 * @param stanje setting OUT, channel to 0, vol to 0
	 */
    public void setOUT(){
    	set_stanje(Stanje.sOUT);
    	setChannel(0);
    	setVol(0);
    }
    
    /**
	 * @param channel increments channel by 1
	 */
	
	public void PlusChannel() {
		// TODO Auto-generated method stub
		if(this.channel<16){
			setChannel(this.channel=this.channel+1);
		}
	}
	
	  /**
		 * @param channel decrements channel by 1
		 */

	
	public void MinusChannel() {
		// TODO Auto-generated method stub
		if(this.channel>1){
			setChannel(this.channel=this.channel-1);
		}
	}
	  /**
		 * @param vol increments vol by 1
		 */
	
	public void PlusVol() {
		// TODO Auto-generated method stub
		if(this.vol<20){
			setVol(this.vol=this.vol+1);
		}
	}
	/**
	 * @param vol decrements vol by 1
	 */
	
	public void MinusVol() {
		// TODO Auto-generated method stub
		if(this.vol>0){
			setVol(this.vol=this.vol-1);
		}
	}

	
}
