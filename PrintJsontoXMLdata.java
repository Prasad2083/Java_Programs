import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class PrintJsontoXMLdata {

    public static void main(String[] args) {

PrintJsontoXMLdata.Converttoxml();

    }

    private static String Converttoxml() {

        String xml="<Root>";

        String jsondata = "{\"glossary\":{\"title\":\"example glossary\",\"GlossDiv\":" +
                "{\"title\":\"S\",\"GlossList\":{\"GlossEntry\":" +
                "{\"ID\":\"SGML\",\"SortAs\":\"SGML\",\"GlossTerm\":\"Standard Generalized Markup Language\"," +
                "\"Acronym\":\"SGML\",\"Abbrev\":\"ISO 8879:1986\",\"GlossDef\":" +
                "{\"para\":\"A meta-markup language," +
                " used to create markup languages such as DocBook.\",\"GlossSeeAlso\":[\"GML\",\"XML\"]},\"GlossSee\":\"markup\"}}}}}";

        try {
            JSONObject jsonObject=new JSONObject(jsondata);

            xml=xml+XML.toString(jsonObject);

        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        xml=xml+"</Root>";

        System.out.println(xml);
        return xml;
    }

}
