package com.testezaooo.testeeee.services

import org.slf4j.LoggerFactory
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service

@Service
class PdfServices {

    static final log = LoggerFactory.getLogger(this.class);



    String generateReportPDF() throws Exception {

        StringBuilder report = new StringBuilder();
        log.info("... MONTANDO PDF ...");
        report.append(mountHeader())
        log.info("header pdf [OK]");
        report.append(mountBody());
        log.info("BODY pdf [OK]");
        return report.toString();
    }

    String mountHeader () {

        String svg = '';
        StringBuilder sbHeader = new StringBuilder();

        //String fileURLB2wLogo = new ClassPathResource("images/b2wLogo.png").resolveURL();
        //String fileURLEmpLogo = new ClassPathResource("images/empLogo.png").resolveURL();
//                String fileURLAcomLogo = new ClassPathResource("images/acomLogo.png").resolveURL();
//                String fileURLShopLogo = new ClassPathResource("images/shopLogo.png").resolveURL();
//                String fileURLSubaLogo = new ClassPathResource("images/subaLogo.png").resolveURL();



        sbHeader.append("<!DOCTYPE html>\n"+
                "<html lang='en'>\n"+
                "<head>\n"+
                "<meta charset=\"UTF-8\" />\n"+
                "<title>Cotação: Vendas Corporativas</title>"
        );


        sbHeader.append( "</head>\n"+
                "<body style=\"background: #f1f1f1;\">\n"+
                "<style>" +
                "/*.it-qd {\n" +
                "  grid-template-columns: 1fr 7fr;\n" +
                "}\n" +
                ".it-qp .code-prd .lbl,\n" +
                ".it-qp .qtd .lbl,\n" +
                ".it-qp .value-u .lbl,\n" +
                ".it-qp .value-l .lbl,\n" +
                ".it-qp .tax .lbl {\n" +
                "  display: inline-block;\n" +
                "}*/\n" +
                "\n" +
                "* {\n" +
                "  margin: -1px;\n" +
                "  padding: 0;\n" +
                "  border: 0;\n" +
                "  font: inherit;\n" +
                "  font-size: 9pt;\n" +
                "  vertical-align: baseline;\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "html {\n" +
                "  line-height: 1.2;\n" +
                "}\n" +
                "\n" +
                "ol, ul {\n" +
                "  list-style: none;\n" +
                "}\n" +
                "\n" +
                "table {\n" +
                "  border-collapse: collapse;\n" +
                "  border-spacing: 0;\n" +
                "}\n" +
                "\n" +
                "caption, th, td {\n" +
                "  text-align: left;\n" +
                "  font-weight: normal;\n" +
                "  vertical-align: middle;\n" +
                "}\n" +
                "\n" +
                "address {\n" +
                "  display: inline;\n" +
                "}\n" +
                "\n" +
                "q, blockquote {\n" +
                "  quotes: none;\n" +
                "}\n" +
                "\n" +
                "q:before, q:after, blockquote:before, blockquote:after {\n" +
                "  content: \"\";\n" +
                "  content: none;\n" +
                "}\n" +
                "\n" +
                "a, img, fieldset {\n" +
                "  border: none;\n" +
                "}\n" +
                "\n" +
                "article, aside, figcaption, figure, footer, header, main, section, picture {\n" +
                "  display: block;\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "  font: 400 100% \"helvetica neue\", helvetica, arial, sans-serif;\n" +
                "  -moz-osx-font-smoothing: grayscale;\n" +
                "}\n" +
                "\n" +
                "h1, h2, h3, h4, h5, h6 {\n" +
                "  font-family: \"helvetica neue\", helvetica, arial, sans-serif;\n" +
                "  font-weight: 400;\n" +
                "}\n" +
                "\n" +
                ".hidden {\n" +
                "  display: none;\n" +
                "}\n" +
                "\n" +
                ".is-hidden {\n" +
                "  opacity: 0;\n" +
                "  visibility: hidden;\n" +
                "  height: 0;\n" +
                "  width: 0;\n" +
                "}\n" +
                "\n" +
                "html {\n" +
                "  background: #f1f1f1;\n" +
                "}\n" +
                "\n" +
                "#page {\n" +
                "  min-width: 320px;\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".svg-icon {\n" +
                "  display: inline-block;\n" +
                "  height: 20px;\n" +
                "  width: 20px;\n" +
                "  -webkit-touch-callout: none;\n" +
                "  -webkit-user-select: none;\n" +
                "  -moz-user-select: none;\n" +
                "  -ms-user-select: none;\n" +
                "  user-select: none;\n" +
                "  pointer-events: none;\n" +
                "}\n" +
                "\n" +
                ".svg-icon text {\n" +
                "  -webkit-touch-callout: none;\n" +
                "  -webkit-user-select: none;\n" +
                "  -moz-user-select: none;\n" +
                "  -ms-user-select: none;\n" +
                "  user-select: none;\n" +
                "  pointer-events: none;\n" +
                "}\n" +
                ".quote-products table thead {\n" +
                "  border-bottom-style: solid;\n" +
                "  border-bottom-color: #171717;\n" +
                "  border-bottom-width: 2px;\n" +
                "}\n" +
                "header {\n" +
                "  background: #e61f12!Important;\n" +
                "  color: white;\n" +
                "}\n" +
                "\n" +
                ".nb {\n" +
                "  white-space: nowrap;\n" +
                "}\n" +
                "\n" +
                ".box {\n" +
                "  border-radius: 5px;\n" +
                "  background: white;\n" +
                "  border: 1px solid #cccccc;\n" +
                "  padding: 10px;\n" +
                "}\n" +
                "\n" +
                ".svg-logo {\n" +
                "  display: block;\n" +
                "  max-width: 200px;\n" +
                "  height: 40px;\n" +
                "  fill: white;\n" +
                "  margin: 0 auto;\n" +
                "}\n" +
                "\n" +
                ".wrp-header,\n" +
                ".wrp-main {\n" +
                "  max-width: 80em;\n" +
                "  margin: 0 auto;\n" +
                "}\n" +
                "\n" +
                ".wrp-header {\n" +
                "  padding: 10px;\n" +
                "}\n" +
                "\n" +
                ".wrp-main {\n" +
                "  color: #666666;\n" +
                "  padding: 20px 50px;\n" +
                "}\n" +
                "\n" +
                ".wrp-main h1 {\n" +
                "  font-size: 18px;\n" +
                "  font-weight: 600;\n" +
                "  text-align: center;\n" +
                "  margin: 0 0 10px;\n" +
                "}\n" +
                "\n" +
                ".it-qd {\n" +
                "  padding: 5px 0;\n" +
                "  border-top: 1px solid #cccccc;\n" +
                "}\n" +
                "\n" +
                ".it-qd .lbl {\n" +
                "  display: block;\n" +
                "  font-weight: 600;\n" +
                "  color: #333333;\n" +
                "}\n" +
                "\n" +
                ".it-qd {\n" +
                "  display: flex;\n" +
                "  border-top: 0;\n" +
                "\n" +
                "  padding-top: 0;\n" +
                "}\n" +
                "\n" +
                ".lst-val {\n" +
                "  display: inline-block;\n" +
                "  vertical-align: top;\n" +
                "}\n" +
                "\n" +
                ".lst-val .lbl {\n" +
                "  font-weight: 500;\n" +
                "}\n" +
                "\n" +
                ".quote-data {\n" +
                "  margin-bottom: 10px;\n" +
                "}\n" +
                "\n" +
                ".quote-products:after {\n" +
                "  content: \" \";\n" +
                "  display: block;\n" +
                "  clear: both;\n" +
                "}\n" +
                "\n" +
                ".lst-qp-head {\n" +
                "  display: flex;\n" +
                "  flex-direction: row;\n" +
                "\n" +
                "  border-bottom: 2px solid #666666;\n" +
                "  color: #333333;\n" +
                "  font-weight: 600;\n" +
                "  padding: 10px;\n" +
                "}\n" +
                "\n" +
                ".lst-quote-products {\n" +
                "  display: grid;\n" +
                "  grid-gap: 3px;\n" +
                "}\n" +
                "\n" +
                ".it-qp {\n" +
                "  padding: 10px;\n" +
                "  background: white;\n" +
                "  border-radius: 5px;\n" +
                "  border: 1px solid #cccccc;\n" +
                "}\n" +
                "\n" +
                ".it-qp .td {\n" +
                "  display: block;\n" +
                "  padding: 5px 0;\n" +
                "}\n" +
                "\n" +
                ".it-qp .td:first-child {\n" +
                "  padding-top: 0;\n" +
                "  border-top: 0;\n" +
                "}\n" +
                ".thread{\n" +
                "  border-bottom: 2px solid #666666;\n" +
                "}\n" +
                ".it-qp:first-child {\n" +
                "  border-radius: 5px 5px 0 0;\n" +
                "}\n" +
                "\n" +
                ".it-qp:last-child {\n" +
                "  border-radius: 0 0 5px 5px;\n" +
                "}\n" +
                "\n" +
                ".it-qp .value-qp {\n" +
                "  display: block;\n" +
                "}\n" +
                "\n" +
                ".it-qp .lbl {\n" +
                "  font-weight: 500;\n" +
                "  color: #333333;\n" +
                "}\n" +
                "\n" +
                ".it-qp .freight-c .lbl,\n" +
                ".it-qp .value-subtotal .lbl {\n" +
                "  display: block;\n" +
                "}\n" +
                "\n" +
                ".lst-quote-info {\n" +
                "  text-align: right;\n" +
                "  border: 1px solid #cccccc;\n" +
                "  padding: 10px;\n" +
                "  background: white;\n" +
                "  border-radius: 5px;\n" +
                "  margin-top: 10px;\n" +
                "}\n" +
                "\n" +
                ".lst-quote-info .lbl {\n" +
                "  font-weight: 500;\n" +
                "  color: #333333;\n" +
                "}\n" +
                "\n" +
                ".lst-quote-info .val {\n" +
                "  text-align: left;\n" +
                "}\n" +
                "\n" +
                ".lst-quote-info .it-qi {\n" +
                "  border-top: 1px solid #cccccc;\n" +
                "  padding-top: 10px;\n" +
                "  margin-top: 10px;\n" +
                "  display: grid;\n" +
                "  grid-template-columns: repeat(2, 1fr);\n" +
                "  grid-gap: 5px;\n" +
                "}\n" +
                "\n" +
                ".lst-quote-info .it-qi:first-child {\n" +
                "  padding-top: 0;\n" +
                "  border-top: 0;\n" +
                "  margin-top: 0;\n" +
                "}\n" +
                "</style>"+
                "<div id='page'>\n"+
                "<header  background-color=\" #e61f12\" >\n"+
                "<div class=\"wrp-header\">\n"+
                "</div>\n"+
                "</header>\n"+
                "<main> <div class='wrp-main'>\n"+
                "<h1>Cotação: Vendas Corporativas</h1>\n"+
                "<div class=\"box quote-data\">\n"+
                "<ul class=\"lst-quote-data\">\n"+
                "<li  class=\"it-qd\">\n"+
                " <br/>\n"+
                "<span class=\"lbl\">Data: </span>\n"+
                "<span style=\"position:absolute;margin-left:15%; margin-top:-2%;\" class=\"val\">55555</span>\n"+
                " <br/>\n"+
                "<hr style=\"background: #cccccc;width: 100%;height: 1px;\" />\n"+
                "</li>\n"+
                " <br/>\n"+
                "<li  class=\"it-qd\">\n" +
                "<span class=\"lbl\">Cliente: </span>");


        sbHeader.append(

                "<li style=\"padding: 5px 0px 40px;\"  class=\"it-qd\">\n"+
                        "<span class=\"lbl\">Contato: </span> \n"+
                        "<ul style=\"border-bottom-style:black;border-bottom-width:100%; margin-left:15%; margin-top:-2%;\" class=\"lst-val\">\n"+
                        " <li   class=\"it-val\">\n"+
                        "<span class=\"lbl\">Nome: </span> <span style=\"position:absolute;margin-top:-2%; margin-left:28%;\"  class=\"val\">fgjfghjfghjfghjfhjf</span>\n"+
                        "</li>\n"+
                        " <li style=\"border-bottom-style:black;border-bottom-width:100%;\" class=\"it-val\">\n"+
                        "<span class=\"lbl\">Telefone: </span> <span style=\"position:absolute;margin-top:-2%; margin-left:28%;\"  class=\"val\"> agsfgasfdgsdfgfdsgdfgsdf </span>\n"+
                        "</li>\n"+
                        "<li style=\"border-bottom-style:black;border-bottom-width:100%;\" class=\"it-val\">\n"+
                        "<span class=\"lbl\">E-mail: </span> <span  style=\"position:absolute;margin-top:-2%; margin-left:28%;\"  class=\"val\">fgafdgafgsfgsdfgsgsdfgdgdf</span>\n"+
                        "</li>\n"+
                        "</ul>\n"+
                        "<br/>\n"+
                        "<br/>\n"+
                        "<hr style=\"background: #cccccc;width: 100%;height: 1px;\" />\n"+
                         "<li style=\"border-bottom-style:black;border-bottom-width:100%;\" class=\"it-qd\">\n"+
                        "<br/>\n"+
                        "<span class=\"lbl\">Validade: </span>\n"+
                        "<span style=\"position:absolute;margin-top:-2%; margin-left:18%\" class=\"val\">3 dias corridos ou enquanto durarem os estoques</span>\n"+
                        "<br/>\n"+
                        "<br/>\n"+
                        "<hr style=\"background: #cccccc;width: 100%;height: 1px;\" />\n"+
                        "<br/>\n"+
                        "</li>\n"+
                        "<li style=\"border-bottom-style:black;border-bottom-width:100%;\" class=\"it-qd\">\n"+
                        "<span class=\"lbl\">Disponibilidade: </span>\n"+
                        "<span style=\"position:absolute; margin-top:-2%; margin-left:25%\" class=\"val\">O estoque disponível informado nesta planilha não garante <br/>disponibilidade do item no  momento da aprovação da cotação</span>\n"+
                        "<br/>\n"+
                        "<br/>\n"+
                        "<hr style=\"background: #cccccc;width: 100%;height: 1px;\" />\n"+
                        "<br/>\n"+
                        "<br/>\n"+
                        "</li>\n"+
                        "<li style=\"border-bottom-style:black;border-bottom-width:100%;\" class=\"it-qd\">\n"+
                        "<span class=\"lbl\">Prazo de Entrega: </span>\n"+
                        "<span  style=\"position:absolute; margin-top:-2%; margin-left:25%\" class=\"val\">Após confirmação de pagamento</span>\n"+
                        "<br/>\n"+
                        "<hr style=\"background: #cccccc;width: 100%;height: 1px;\" />\n"+
                        "<br/>\n"+
                        "</li>\n"+
                        "<li class=\"it-qd\">"  );



            sbHeader.append( "<li class=\"it-val\"> <span class=\"lbl\">Prazo de Pagamento: </span>\n"+
                    "<span class=\"val\">Antecipado.</span> \n</li>\n");


        sbHeader.append(
                "<span class=\"lbl\">Pagamento: </span>\n" +
                        "<ul class=\"lst-val\">\n" +
                        "<li  class=\"it-val\">\n" +
                        "<span style=\"position:absolute; margin-top:-2%; margin-left:20%\" class=\"lbl\">Forma de Pagamento: </span>\n <br/><br/>"+
                        "<span style=\"position:absolute; margin-top:-4%; margin-left:20%\" class=\"val\">drtytrydrty</span>\n" +

                        "</li>\n"+
                        "</ul>\n"+
                        "<br/>\n"+
                        "<hr style=\"background: #cccccc;width: 100%;height: 1px;\" />\n"+
                        "</li>\n"+
                        "<li class=\"it-qd\">\n"+
                        "<br/>\n"+
                        "<span class=\"lbl\">Obs: </span>\n"+
                        "<span  style=\"position:absolute; margin-top:-2%; margin-left:14%\" class=\"val\">Pedidos com mais de um produto não necessariamente serão entregues juntos.<br/>Dependerá do estoque  de cada item</span>\n"+
                        "<br/>\n"+
                        "<br/>\n"+
                        "<hr style=\"background: #cccccc;width: 100%;height: 1px;\" />\n"+
                        "<br/>\n"+
                        "</li>\n"+
                        "<li class=\"it-qd\">\n"+
                        "<span class=\"lbl\">DFAL: </span>\n"+
                        "<span style=\"position:absolute; margin-top:-2%; margin-left:15%\" class=\"val\">Se o produto estiver sujeito a Substituição Tributária (ST) ou diferencial de Alíquota (DIFAL) de ICMS,<br/> a legislação vigente estender a obrigatoriedade do recolhimento do ICMS antecipado ao remetente,<br/> haverá  destaque do imposto em nota que refletirá no valor total do documento fiscal</span>\n"+
                        "<br/>\n"+
                        "<br/>\n"+
                        "</li>\n" +
                        "</ul>\n" +
                        "<br/>\n"+
                        "</div>");


        return sbHeader.toString();

    }



    String mountBody () {

        StringBuilder sbBody = new StringBuilder();

            sbBody.append(" <div class=\"quote-products\">" +
                    "<hr style=\"position:absolute;background: black; width:86.5%;margin-left:6.5%;margin-top:7%; height:3px\" />\n"+
                    "<table style=\" border: solid 0.5px #cccccc;border-collapse: collapse;\" >\n" +
                    "        <thead style=\" border:none;\" class=\"thead\" >\n" +
                    "            <tr style=\" text-align:center;border-bottom-style:solid;border-bottom-color: black; height: 52px;padding:10px 10px;  font-size: 15pt; font-family: sans-serif; \">\n" +
                    "                <th style=\"border-right-style: none;width: 20px;font-size: 11pt;color: black;font-weight: 600;\" > \n" +
                    "                    Pedido \n" +
                    "                </th>\n" +
                    "                <th style=\"text-align:center; border-right-style: none;width: 20px;font-size: 11pt;color: black;font-weight: 600;\" >\n" +
                    "                    Estoque\n" +
                    "                </th>\n" +
                    "              <th style=\"border-right-style: none; padding: 10px 14px;width: 250px;font-size: 11pt;color: black;font-weight: 600;\"  >\n" +
                    "                  Produto\n" +
                    "                </th>\n" +
                    "                <th style=\"text-align:center;border-right-style: none;width: 20px;font-size: 11pt;color: black;font-weight: 600;\" >\n" +
                    "                    Valor\n" +
                    "                </th>\n" +
                    "                <th style=\"text-align:center;border-right-style: none;width: 20px;font-size: 11pt;color: black;font-weight: 600;\"  >\n" +
                    "                    Default\n" +
                    "                </th>\n" +
                    "                <th style=\"text-align:center;border-right-style: none;width: 20px;font-size: 11pt;color: black;font-weight: 600;\" >\n" +
                    "                    Frete Unit.\n" +
                    "                </th>\n" +
                    "               <th  style=\"text-align:center;border-right-style: none;width: 20px;font-size: 11pt;color: black;font-weight: 600;\" >\n" +
                    "                    Subtotal.\n" +
                    "                </th>\n" +
                    "</tr>\n"+
                    "        </thead>\n" +
                    "        <tbody style=\"border:none;\" >\n" +
                    "            <tr  style=\"font-family: sans-serif;  border-top:solid black 2px;font-size: 15pt; height: 20px;border: solid 0.5px #cccccc;background: white;\n" +
                    "    border-right: none;\n" +
                    "    border-left: none;\n" +
                    "    padding: 10px 18px 10px;\">\n" +
                    "                <td style=\"border:  solid 0.5px #cccccc;width: 94px;border-right-style: none;border-left-style: none;height: 20px;padding: 13px 26px 10px 14px;\">44444444444</td>\n" +
                    "                <td style=\"border:  solid 0.5px #cccccc;width: 94px;border-right-style: none;border-left-style: none;height: 20px;padding: 13px 26px 10px 14px;\">455555898</td>\n" +
                    "                <td style=\"border:  solid 0.5px #cccccc;width: 250px;border-right-style: none;border-left: none;padding: 13px 26px 10px 14px;\"><span> fadfasdfasd</span><br/>  " +
                    "<span style=\"white-space:nowrap;\" class=\"lbl\">Código do produto: 55555555555</span> <br/> \n" +
                    "<span  style=\"white-space:nowrap;\"   class=\"lbl\">Quantidade: 55 </span>\n"+
                    "</td>\n" +
                    "<td style=\"border:  solid 0.5px #cccccc;width: 94px;border-right-style: none;height: 20px;border-left-style: none;padding: 13px 26px 10px 39px;\"><span  class=\"nb\"> 54555556</span></td>\n" +
                    "<td style=\"border:  solid 0.5px #cccccc;width: 94px;border-right-style: none;height: 20px;border-left-style: none;padding: 13px 26px 10px 14px;\"><span class=\"nb\"> 44444444</span></td>\n" +
                    "                <td style=\"border:  solid 0.5px #cccccc; width: 94px; border-left: none;border-right: none; height: 20px; \">55555</td>\n" +
                    "                <td style=\"border:  solid 0.5px #cccccc; width: 94px;border-left: none;border-right: none; height: 20px; \">55555</td>\n" +
                    "            </tr>\n" +
                    "        </tbody>\n" +
                    "    </table>")



        sbBody.append("<ul style=\" width: 36%;margin-left: 60%; display: flex;flex-direction: column;\" class=\"lst-quote-info\">\n" +
                "<li class=\"it-qi qi-prd-total\">\n" +
                "<span class=\"lbl\">Total de Produtos: </span>\n" +
                "<span class=\"val\">55555</span>\n" +
                "</li>\n" +
                "<li class=\"it-qi qi-freight-total\">\n" +
                "<span class=\"lbl\">Total de Frete: </span>\n" +
                "<span class=\"val\">44444444</span>\n" +
                "</li>\n" +
                "<li class=\"it-qi qi-tax\">\n" +
                "<span class=\"lbl\">DIFAL: </span>\n" +
                "<span class=\"val\">555555</span>\n" +
                "</li>\n" +
                "<li class=\"it-qi qi-total\">\n" +
                "<span class=\"lbl\">Total: </span>\n" +
                "<span class=\"val\">4444444</span>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "</div>\n" +
                "</main>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");



    }

}
