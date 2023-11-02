//package com.daeatdak.admin;
//
//import java.io.IOException;
//import java.rmi.ServerException;
//import java.util.Enumeration;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.daeatdak.Execute;
//import com.daeatdak.Result;
//import com.daeatdak.admin.dao.AdminDAO;
//import com.daeatdak.admin.dao.FileDAO;
//import com.daeatdak.admin.dao.ImageDAO;
//import com.daeatdak.admin.dto.AdminDTO;
//import com.daeatdak.admin.dto.FileDTO;
//import com.daeatdak.admin.dto.ImageDTO;
//import com.oreilly.servlet.MultipartRequest;
//import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
//
//public class GoodsRegistOkController5 implements Execute {
//
//	@Override
//	public Result execute(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServerException {
// 
//		String dynamicUR="";
//	
//		
//		
//		String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/" + dynamicUR;
//		final int FILE_SIZE = 1024 * 1024 * 5; // 5MB
////		final String UPLOAD_PATH = "/WebContent/upload/";
//
//		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
////		MultipartRequest multipartRequest2 = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
//
//		System.out.println(UPLOAD_PATH);
//		
//		FileDAO fileDAO = new FileDAO();
//		FileDTO fileDTO = new FileDTO();
//		ImageDTO imageDTO = new ImageDTO();
//		AdminDTO adminDTO = new AdminDTO();
//		AdminDAO adminDAO = new AdminDAO();
//		ImageDAO imageDAO = new ImageDAO();
//		int adminGoodsNumber=0;
//		/*
//		 * ImageDAO imageDAO = new ImageDAO(); ImageDTO imageDTO = new ImageDTO();
//		 */
//		Result result = new Result();
//
//		
//	
//		adminDTO.setCategoryNum(Integer.valueOf( multipartRequest.getParameter("goodsCategory")));
//		adminDTO.setGoodsName(multipartRequest.getParameter("goodsName"));
//		adminDTO.setGoodsQuantity(Integer.valueOf( multipartRequest.getParameter("goodsQuantity")));
//		adminDTO.setGoodsPrice(Integer.valueOf(multipartRequest.getParameter("goodsPrice")));
//		adminDTO.setGoodsCategory(Integer.valueOf(multipartRequest.getParameter("goodsCategory")));
//
//		adminDAO.goodsRegist(adminDTO);
//		adminGoodsNumber = adminDAO.getSequence();
//
//		
//		
//		
//	
//
//		
//		Enumeration<String> fileNames = multipartRequest.getFileNames();
//		while(fileNames.hasMoreElements()) {
//			String filePath = UPLOAD_PATH;
//			String name = fileNames.nextElement();
//			String fileSystemName = multipartRequest.getFilesystemName(name);
//			String fileOriginalName = multipartRequest.getOriginalFileName(name);
//			
//			
//			String files5 = request.getParameter("goodsDetailImg5");
//			String filename5 = multipartRequest.getFilesystemName(files5);
//			String fileoriginname5 = multipartRequest.getOriginalFileName(files5);
//				
//				
//			String files4 = request.getParameter("goodsDetailImg4");
//			String filename4 = multipartRequest.getFilesystemName(files4);
//			String fileoriginname4 = multipartRequest.getOriginalFileName(files4);
//
//				
//			String files3 = request.getParameter("goodsDetailImg3");
//			String filename3 = multipartRequest.getFilesystemName(files3);
//			String fileoriginname3 = multipartRequest.getOriginalFileName(files3);
//
//
//
//			String files2 = request.getParameter("goodsDetailImg2");
//			String filename2 = multipartRequest.getFilesystemName(files2);
//			String fileoriginname2 = multipartRequest.getOriginalFileName(files2);
//
//
//			String files1 = request.getParameter("goodsDetailImg1");
//			String filename1 = multipartRequest.getFilesystemName(files1);
//			String fileoriginname1 = multipartRequest.getOriginalFileName(files1);
//
//			
//			
//			
//			
//			
//			
//			if(fileSystemName == null) {continue;}
//			fileDTO.setFilePath(filePath);
//			fileDTO.setFileSystemName(fileSystemName);
//			fileDTO.setFileOriginalName(fileOriginalName);
//			fileDTO.setGoodsNumber(adminGoodsNumber);
//			fileDTO.setGoodsDetailImg1(filename1 + "_"+ fileoriginname1);
//			fileDTO.setGoodsDetailImg2(filename2 + "_"+ fileoriginname2);
//			fileDTO.setGoodsDetailImg3(filename3 + "_"+ fileoriginname3);
//			fileDTO.setGoodsDetailImg4(filename4 + "_"+ fileoriginname4);
//			fileDTO.setGoodsDetailImg5(filename5 + "_"+ fileoriginname5);
//			
//			
//			System.out.println(fileDTO);
//
//			fileDAO.insert(fileDTO);
//			
//
//		}
//		
//
////		imageDAO.goodsRegist(imageDTO);
//		
//		result.setRedirect(true);
//		result.setPath("/admin/adminProductInfo.jsp");
//		
//		return result;	}
//
//}
