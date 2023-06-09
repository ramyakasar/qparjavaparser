//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> ( "static" )?
 * f1 -> Type()
 * f2 -> Identifier()
 * f3 -> ";"
 */
public class FieldDeclaration implements Node {
   public NodeOptional f0;
   public Type f1;
   public Identifier f2;
   public NodeToken f3;

   public FieldDeclaration(NodeOptional n0, Type n1, Identifier n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public FieldDeclaration(NodeOptional n0, Type n1, Identifier n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = new NodeToken(";");
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

