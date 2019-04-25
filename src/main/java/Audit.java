public class Audit {
    private String audit_cluster_name;
    private String audit_node_name;

    public String getAudit_cluster_name() {
        return audit_cluster_name;
    }

    public void setAudit_cluster_name(String audit_cluster_name) {
        this.audit_cluster_name = audit_cluster_name;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "audit_cluster_name='" + audit_cluster_name + '\'' +
                ", audit_node_name='" + audit_node_name + '\'' +
                ", audit_request_exception_stacktrace='" + audit_request_exception_stacktrace + '\'' +
                '}';
    }

    public void setAudit_node_name(String audit_node_name) {
        this.audit_node_name = audit_node_name;
    }

    public void setAudit_request_exception_stacktrace(String audit_request_exception_stacktrace) {
        this.audit_request_exception_stacktrace = audit_request_exception_stacktrace;
    }

    public String getAudit_node_name() {
        return audit_node_name;

    }

    public String getAudit_request_exception_stacktrace() {
        return audit_request_exception_stacktrace;
    }

    private String audit_request_exception_stacktrace;
}
