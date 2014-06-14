// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class FunctionBlockImpl extends ASTWrapperPsiElement implements FunctionBlock {

  public FunctionBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitFunctionBlock(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Statement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Statement.class);
  }

}