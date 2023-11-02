package com.daeatdak.admin;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.admin.dao.AdminDAO;
import com.daeatdak.admin.dao.FileDAO;
import com.daeatdak.admin.dto.AdminDTO;
import com.daeatdak.admin.dto.FileDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class GoodsRegistOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServerException {
 
      String dynamicUR="";
   
      
      
      String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/upload");
      final int FILE_SIZE = 1024 * 1024 * 5; // 5MB

      MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());

      System.out.println(UPLOAD_PATH);
      
      FileDAO fileDAO = new FileDAO();
      FileDTO fileDTO = new FileDTO();
      AdminDTO adminDTO = new AdminDTO();
      AdminDAO adminDAO = new AdminDAO();
      int adminGoodsNumber=0;
  
      Result result = new Result();

      
   
      adminDTO.setCategoryNum(Integer.valueOf( multipartRequest.getParameter("goodsCategory")));
      adminDTO.setGoodsName(multipartRequest.getParameter("goodsName"));
      adminDTO.setGoodsQuantity(Integer.valueOf( multipartRequest.getParameter("goodsQuantity")));
      adminDTO.setGoodsPrice(Integer.valueOf(multipartRequest.getParameter("goodsPrice")));
//      adminDTO.setGoodsCategory(Integer.valueOf(multipartRequest.getParameter("goodsCategory")));
      adminDTO.setGoodsDetail(multipartRequest.getParameter("goodsDetail"));

      adminDAO.goodsRegist(adminDTO);
      adminGoodsNumber = adminDAO.getSequence();

      
      
      
   

      
      Enumeration<String> fileNames = multipartRequest.getFileNames();
      while(fileNames.hasMoreElements()) {
         String filePath = UPLOAD_PATH;
         String name = fileNames.nextElement();
         String fileSystemName = multipartRequest.getFilesystemName(name);
         String fileOriginalName = multipartRequest.getOriginalFileName(name);
         if(fileSystemName == null) {continue;}
         fileDTO.setFilePath(filePath);
         fileDTO.setFileSystemName(fileSystemName);
         fileDTO.setFileOriginalName(fileOriginalName);
         fileDTO.setGoodsNumber(adminGoodsNumber);
         
         System.out.println(fileDTO);

         fileDAO.insert(fileDTO);
         

      }
      

      
      result.setRedirect(true);
      result.setPath("/admin/adminProductInfo.jsp");
      
      return result;   }

}