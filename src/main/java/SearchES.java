import com.amazon.opendistroforelasticsearch.jdbc.ElasticsearchDataSource;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.*;
import java.util.function.Consumer;

public class SearchES {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:elasticsearch://https://localhost:9200?trustSelfSigned=true";
        ElasticsearchDataSource ds = new ElasticsearchDataSource();
        ds.setUrl(url);
        Connection con = ds.getConnection("admin","admin");
        Statement st = con.createStatement();
        ResultSet resultSet= st.executeQuery("select * from security-auditlog-2019.04.25");
        BeanListHandler<Audit> bh  =new BeanListHandler<Audit>(Audit.class);
        bh.handle(resultSet).forEach(audit -> System.out.println(audit.toString()));
        con.close();
    }
}
