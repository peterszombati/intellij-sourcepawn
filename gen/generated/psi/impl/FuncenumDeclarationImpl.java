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

public class FuncenumDeclarationImpl extends ASTWrapperPsiElement implements FuncenumDeclaration {

  public FuncenumDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitFuncenumDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FuncenumBlock getFuncenumBlock() {
    return findChildByClass(FuncenumBlock.class);
  }

  @Override
  @Nullable
  public Identifier getIdentifier() {
    return findChildByClass(Identifier.class);
  }

}