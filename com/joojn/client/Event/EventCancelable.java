package com.joojn.client.Event;

public class EventCancelable extends Event{
	private boolean cancelled = false;

	public boolean isCancelled() {
		return cancelled;
	}
	
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

}