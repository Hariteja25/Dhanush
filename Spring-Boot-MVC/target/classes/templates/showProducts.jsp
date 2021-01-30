<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  
 <h2>Show All Products</h2>
<table border="2" width="70%" cellpadding="2">  
<tr>
<th>Id</th>
<th>Title</th>
<th>Category</th>

</tr>  
   
   <c:forEach var="pdt" items="${pdts}">   
	   <tr>  
	   <td>${pdt.articleId}</td>  
	   <td>${pdt.title}</td>  
	   <td>${pdt.category}</td>  
	   </tr>
	   
   </c:forEach>  
   
   </table>  
  