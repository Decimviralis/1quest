import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.util.List;

/**
 * Created by Максим on 13.10.2016.
 */


public class Reader {
    XStream xstream = new XStream();
    Person newPerson = (Person)xstream.fromXML("C:\\users.xml");
    Band newBand = (Band)xstream.fromXML("C:\\users.xml");
}

