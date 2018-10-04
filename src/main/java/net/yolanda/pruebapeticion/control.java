/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yolanda.pruebapeticion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yolanda
 */
public class control extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet control</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<ul>");
           
            out.println("<li><h3>1-request.getContextPath(): " + request.getContextPath() + "</h3></li>");
            out.println("<li><h3>2-request.getAuthType(): " + request.getAuthType() + "</h3></li>");
            out.println("<li><h3>3-request.getCharacterEncoding(): " + request.getCharacterEncoding() + "</h3></li>");
            out.println("<li><h3>4-request.getLocalAddr(): " + request.getLocalAddr() + "</h3></li>");
            out.println("<li><h3>5-request.getLocalName(): " + request.getLocalName() + "</h3></li>");
            out.println("<li><h3>6-request.getMethod(): " + request.getMethod() + "</h3></li>");
            out.println("<li><h3>7-request.getMethod(): " +request.getMethod() + "</h3></li>");
            out.println("<li><h3>8-request.getPathTranslated(): " + request.getPathTranslated() + "</h3></li>");
            out.println("<li><h3>9-request.getProtocol(): " + request.getProtocol() + "</h3></li>");
            out.println("<li><h3>10-request.getQueryString(): " + request.getQueryString() + "</h3></li>");
            out.println("<li><h3>11-request.getRemoteAddr(): " + request.getRemoteAddr() + "</h3></li>");
            out.println("<li><h3>12-request.getRemoteHost(): " + request.getRemoteHost() + "</h3></li>");
            out.println("<li><h3>13-request.getRemoteUser(): " + request.getRemoteUser() + "</h3></li>");
            out.println("<li><h3>14-request.getRequestURI(): " + request.getRequestURI() + "</h3></li>");
            out.println("<li><h3>15-request.getRequestedSessionId(): " + request.getRequestedSessionId() + "</h3></li>");
            out.println("<li><h3>16-request.getScheme(): " + request.getScheme() + "</h3></li>");
            out.println("<li><h3>17-request.getServerName(): " + request.getServerName() + "</h3></li>");
            out.println("<li><h3>18-request.getServletPath(): " + request.getServletPath() + "</h3></li>");
            out.println("<li><h3>19-request.getAsyncContext(): " + request.getAsyncContext() + "</h3></li>");
            out.println("<li><h3>20-request.getAttributeNames(): " + request.getAttributeNames() + "</h3></li>");
            out.println("<li><h3>21-request.getClass(): " + request.getClass() + "</h3></li>");
            out.println("<li><h3>22-request.getContentLength(): " + request.getContentLength() + "</h3></li>");
            out.println("<li><h3>23-request.getContentLengthLong() " + request.getContentLengthLong() + "</h3></li>");
            out.println("<li><h3>24-request.getCookies() " + request.getCookies() + "</h3></li>");
            out.println("<li><h3>25-request.getDispatcherType(): " + request.getDispatcherType() + "</h3></li>");
            out.println("<li><h3>26-request.getHeaderNames(): " + request.getHeaderNames() + "</h3></li>");
            out.println("<li><h3>27-request.getInputStream(): " + request.getInputStream() + "</h3></li>");
            out.println("<li><h3>28-request.getLocalPort(): " + request.getLocalPort() + "</h3></li>");
            out.println("<li><h3>29-request.getLocale(): " + request.getLocale() + "</h3></li>");
            out.println("<li><h3>30-request.getLocales(): " + request.getLocales() + "</h3></li>");
            out.println("<li><h3>31-request.getParameterMap(): " + request.getParameterMap() + "</h3></li>");
            out.println("<li><h3>32-request.getParameterNames(): " + request.getParameterNames() + "</h3></li>");
            out.println("<li><h3>33-request.getParts(): " + request.getParts() + "</h3></li>");
            out.println("<li><h3>34-request.getReader(): " + request.getReader() + "</h3></li>");
            out.println("<li><h3>35-request.getRemotePort(): " + request.getRemotePort() + "</h3></li>");
            out.println("<li><h3>36-request.getRequestURL(): " + request.getRequestURL() + "</h3></li>");
            out.println("<li><h3>37-request.getServerPort(): " + request.getServerPort() + "</h3></li>");
            out.println("<li><h3>38-request.getServletContext(): " + request.getServletContext() + "</h3></li>");
            out.println("<li><h3>39-request.getSession(): " + request.getSession() + "</h3></li>");
            out.println("<li><h3>40-request.getSession(true): " + request.getSession(true) + "</h3></li>");
            out.println("<li><h3>41-request.getUserPrincipal(): " + request.getUserPrincipal() + "</h3></li>");
//            out.println("<li><h3>42-Servlet control at " + request.getRequestDispatcher(path) + "</h3></li>");
//            out.println("<li><h3>43-Servlet control at " + request.getPart(name) + "</h3></li>");
//            out.println("<li><h3>44-Servlet control at " + request.getParameterValues(name) + "</h3></li>");
//            out.println("<li><h3>45-Servlet control at " + request.getIntHeader(name) + "</h3></li>");
//            out.println("<li><h3>46-request.getHeaders(name): " + request.getHeaders() + "</h3></li>");
//            out.println("<li><h3>47-Servlet control at " + request.getHeader(name) + "</h3></li>");
//            out.println("<li><h3>48-Servlet control at " + request.getDateHeader(name) + "</h3></li>");
//            out.println("<li><h3>49-Servlet control at " + request.getAttribute(name) + "</h3></li>");
//            out.println("<li><h3>50-Servlet control at " + request.getParameter(name) + "</h3></li>");
                            
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
