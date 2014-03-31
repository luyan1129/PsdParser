package com.psdparser.model.layer.additional;

import java.util.List;

import com.psdparser.model.common.Descriptor;
import com.psdparser.model.layer.AdditionalLayer;

public class ColorLookup extends AdditionalLayer {

	private Integer version;
	private Integer descriptorVersion;
	private List<Descriptor> descriptors;
	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getDescriptorVersion() {
		return descriptorVersion;
	}
	public void setDescriptorVersion(Integer descriptorVersion) {
		this.descriptorVersion = descriptorVersion;
	}
	public List<Descriptor> getDescriptors() {
		return descriptors;
	}
	public void setDescriptors(List<Descriptor> descriptors) {
		this.descriptors = descriptors;
	}
	
}
