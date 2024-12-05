package AST;

public class AST_BINOP extends AST_NODE
{
	String op;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_BINOP(String OP)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.print("====================== bin -> op\n");

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.OP = OP;
	}
	
	/*************************************************/
	/* The printing message for a binop AST node */
	/*************************************************/
	public void PrintMe()
	{
		/*************************************/
		/* AST NODE TYPE = AST BINOP */
		/*************************************/
		System.out.print("AST NODE BINOP \n");

		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("BINOP(%s)",OP));
	}
}