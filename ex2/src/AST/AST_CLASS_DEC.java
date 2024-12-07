package AST;


public class AST_CLASS_DEC extends AST_DEC {
    public String className;  
    public String parentClass;
    public AST_FIELD_LIST fields; 

    public AST_CLASS_DEC(String className, String parentClass, AST_FIELD_LIST fields) {
        this.className = className;
        this.parentClass = parentClass;
        this.fields = fields;
        SerialNumber = AST_Node_Serial_Number.getFresh();

    }

    @Override
    public void PrintMe() {
        if (parentClass != null) {
        } else {
        }
        for (AST_FIELD field : fields.list) {
            field.PrintMe();
        }
    }
}
