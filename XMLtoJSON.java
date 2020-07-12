import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XMLtoJSON {

    public static void main(String[] args) {


        XMLtoJSON.ConvertXmltoJson();
    }

    private static String ConvertXmltoJson() {
        String xmltojsonstring="";
        int PRETTY_PRINT_INDENT_FACTOR=4;

        String XMLstring="<Root><glossary><title>example glossary</title><GlossDiv><GlossList>" +
                "<GlossEntry><GlossTerm>Standard Generalized Markup Language</GlossTerm>" +
                "<GlossSee>markup</GlossSee><SortAs>SGML</SortAs><GlossDef>" +
                "<para>A meta-markup language, used to create markup languages such as DocBook.</para>" +
                "<GlossSeeAlso>GML</GlossSeeAlso><GlossSeeAlso>XML</GlossSeeAlso></GlossDef><ID>SGML</ID><Acronym>SGML</Acronym>" +
                "<Abbrev>ISO 8879:1986</Abbrev></GlossEntry></GlossList><title>S</title></GlossDiv></glossary></Root>";
        try {
            JSONObject jsonObject= XML.toJSONObject(XMLstring);
            xmltojsonstring=jsonObject.toString(PRETTY_PRINT_INDENT_FACTOR);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println(xmltojsonstring);
        return xmltojsonstring;
    }
}
