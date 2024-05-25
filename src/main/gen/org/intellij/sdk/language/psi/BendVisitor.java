// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class BendVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull BendProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull BendNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
