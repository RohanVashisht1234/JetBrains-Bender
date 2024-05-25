// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.intellij.sdk.language.psi.BendProperty;
import org.intellij.sdk.language.psi.BendVisitor;
import org.jetbrains.annotations.NotNull;

public class BendPropertyImpl extends BendNamedElementImpl implements BendProperty {

  public BendPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return BendPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return BendPsiImplUtil.getValue(this);
  }

  @Override
  public String getName() {
    return BendPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(@NotNull String newName) {
    return BendPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return BendPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return BendPsiImplUtil.getPresentation(this);
  }

}
