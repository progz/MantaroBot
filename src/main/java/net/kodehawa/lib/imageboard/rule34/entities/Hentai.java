package net.kodehawa.lib.imageboard.rule34.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "posts")
public class Hentai {

	@JacksonXmlProperty(isAttribute = true)
	public String file_url = null;

	public String tags = null;
	public Integer height = null;
	public Integer width = null;

	public String getFile_url() {
		return file_url;
	}

	public String getTags() {
		return tags;
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getWidth() {
		return width;
	}
}
