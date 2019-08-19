package com.testezaooo.testeeee.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.w3c.dom.Document
import com.testezaooo.testeeee.services.PdfServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.xhtmlrenderer.pdf.ITextRenderer

import javax.servlet.http.HttpServletResponse
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
@RestController
@RequestMapping("/pdf")
class PdfController {

    @Autowired
    PdfServices pdfServices;

    @GetMapping
    @ResponseStatus( HttpStatus.OK)
    @ResponseBody
    String createFIle(HttpServletResponse response) {
        try {

            String reportPDF = pdfServices.generateReportPDF();
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(reportPDF.getBytes("UTF-8")));

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocument(doc, null);
            renderer.layout();
            renderer.createPDF(baos);

            byte[] pdfBytes = baos.toByteArray()

            response.setContentType("application/pdf")
            response.setHeader("Content-disposition", "inline; filename=cotacao_${id}.pdf")
            response.setContentLength(pdfBytes.length)
            response.getOutputStream().write(pdfBytes)

            return null;

        }catch(Exception ex) {
            ex.printStackTrace()
        }

    }

}
