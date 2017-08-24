<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ermolaev
  Date: 23.08.2017
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body style="margin: 20px">
<form action="/search" method="get" enctype="text/plain" style="text-align: center">
  Find questions: <input type="text" name="line" value="${line}">
  <input type="submit" value="Submit"/>
</form>
<c:if test="${questions!= null}">
  <c:if test="${questions.items.size()>0}">
    <c:forEach items="${questions.items}" var="question">
      <row class="col-md-12">
        <div class="col-md-2">
          Owned by: <br>
          <a href="${question.owner.link}">
            <c:if test="${question.owner.profileImage!=null}">
              <img src="${question.owner.profileImage}" style="width:50px;height:50px;">
            </c:if>
              ${question.owner.displayName}</a>
        </div>
        <div class="col-md-2">
          <span style="color: green"> Question create date:</span> <br>
            ${question.creationDate}<br>
          <c:if test="${question.closedDate != null}">
            <span style="color: red">Question close date:</span> <br>
            ${question.creationDate}<br>
          </c:if>
        </div>
        <div class="col-md-6">
          <a style="color: #2e6da4;font-size: 20px" href="${question.link}">${question.title}</a><br>
          Tags:
          <c:forEach items="${question.tags}" var="tag">
            ${tag}
          </c:forEach>
        </div>
        <div class="col-md-2">
          <c:choose>
            <c:when test="${question.answerCount > 0}">
              <c:if test="${question.acceptedAnswerId != null}">
                <div
                    style="color: white;font-size: 20px;background-color: green;width: 125px;height: 30px;text-align: center;"
                    title="has accepted answer"> ${question.answerCount} answers
                </div>
              </c:if>
              <c:if test="${question.acceptedAnswerId == null}">
                <div style="font-size: 20px;width: 125px;height: 30px;text-align: center;border: 1px solid green;"><span
                    style="color: green;">${question.answerCount}</span> answers
                </div>
              </c:if>
            </c:when>
            <c:otherwise>
              ${question.answerCount} answers
            </c:otherwise>
          </c:choose>
        </div>
      </row>

      <hr class="col-md-12">
    </c:forEach>
  </c:if>
  <c:if test="${questions.items.size()==0}">
    <div class="col-md-12" style="text-align: center">
      <span style="font-size: 20px"> No matches found</span>
    </div>
  </c:if>
</c:if>
</body>
</html>
