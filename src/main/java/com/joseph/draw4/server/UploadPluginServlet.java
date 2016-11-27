package com.joseph.draw4.server;

import gwtupload.server.UploadAction;
import gwtupload.server.exceptions.UploadActionException;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;

public class UploadPluginServlet extends UploadAction {

	
	@Override
	public String executeAction(HttpServletRequest request, List<FileItem> sessionFiles) throws UploadActionException {
		FileItem fileItem = null;
		String name = null;
		for(FileItem item : sessionFiles) {
			if(item.isFormField()) {
				System.out.println("");
				switch (item.getFieldName()) {
				case "name":
					name = item.getString();
					break;
				}
			} else {
				fileItem = item;
			}
		}
		if(fileItem == null) throw new UploadActionException("there's no param named file");
		if(name == null) throw new UploadActionException("there's no param named name");
		try {
			fileItem.write(new File("plugins/" + name));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return super.executeAction(request, sessionFiles);
	}
}
