package CSV;

import java.util.List;

public interface Csv <CSV>{
    void Write (CSV obiect) throws Exception;
    List<CSV> Read() throws Exception;
}
