/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Filtra las paginas para que los carácteres especiales se muestren correctamente
 * @author jesus
 */
@WebFilter(filterName = "capitalizacionfilter", urlPatterns = {"/CapitalizacionServlet"})
public class capitalizacionfilter implements Filter {

    /**
     *
     * @param fConfig Parámetro inicial
     * @throws ServletException Excepción
     */
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
    }

    /**
     *
     * @param request Petición
     * @param response Respuesta
     * @param chain Cambio
     * @throws IOException Excepción de entrada/salida
     * @throws ServletException Excepción
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");

        if(nombre == null || apellido == null) {
            chain.doFilter(request, response);
        }else{
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
        apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1, apellido.length()).toLowerCase();
        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);

        chain.doFilter(request, response);
        }

        }

    /**
     *
     */
    @Override
    public void destroy() {
    }
}