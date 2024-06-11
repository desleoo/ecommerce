package it.unirc.pwm.EntityMappingHB;

import java.util.Arrays;

public class ImmagineProdotto {
		
	private String imgTname;
	private String path;
	
	public String getImgTname() {
		return imgTname;
	}
	public void setImgTname(String imgTname) {
		this.imgTname = imgTname;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "ImmagineProdotto [imgTname=" + imgTname + ", path=" + path + "]";
	}
	public ImmagineProdotto(String imgTname, String path) {
		super();
		this.imgTname = imgTname;
		this.path = path;
	}
	public ImmagineProdotto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
