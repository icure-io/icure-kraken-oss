/*
 *  iCure Data Stack. Copyright (c) 2020 Taktik SA
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public
 *     License along with this program.  If not, see
 *     <https://www.gnu.org/licenses/>.
 */

package org.taktik.icure.services.external.http;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.HttpRequestMethodNotSupportedException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * Based on org.springframework.web.context.support.HttpRequestHandlerServlet, without WebApplicationContext dependency
 */
public class HttpRequestHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HttpRequestHandler httpRequestHandler;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocaleContextHolder.setLocale(request.getLocale());
		try {
			if (httpRequestHandler != null) {
				this.httpRequestHandler.handleRequest(request, response);
			}
		} catch (HttpRequestMethodNotSupportedException ex) {
			String[] supportedMethods = ex.getSupportedMethods();
			if (supportedMethods != null) {
				response.setHeader("Allow", StringUtils.arrayToDelimitedString(supportedMethods, ", "));
			}
			response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, ex.getMessage());
		} finally {
			LocaleContextHolder.resetLocaleContext();
		}
	}

	public void setHttpRequestHandler(HttpRequestHandler httpRequestHandler) {
		this.httpRequestHandler = httpRequestHandler;
	}
}
