package com.tts.techtalenttwitter.model;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class Guest {
		
		@NotEmpty(message = "Tweet cannot be empty")
		@Length(max = 280, message = "Tweet cannot have more than 280 characters")
		private String guestmsg;

		public String getGuestmsg() {
			return guestmsg;
		}

		public void setGuestmsg(String guestmsg) {
			this.guestmsg = guestmsg;
		}

		@Override
		public String toString() {
			return "Guest [guestmsg=" + guestmsg + "]";
		}	
}
