// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.intellij.sdk.language.psi.BendElementFactory;
import org.intellij.sdk.language.psi.BendProperty;
import org.intellij.sdk.language.psi.BendTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BendPsiImplUtil {

  public static String getKey(BendProperty element) {
    ASTNode keyNode = element.getNode().findChildByType(BendTypes.KEY);
    if (keyNode != null) {
      // IMPORTANT: Convert embedded escaped spaces to bend spaces
      return keyNode.getText().replaceAll("\\\\ ", " ");
    } else {
      return null;
    }
  }

  public static String getValue(BendProperty element) {
    ASTNode valueNode = element.getNode().findChildByType(BendTypes.VALUE);
    if (valueNode != null) {
      return valueNode.getText();
    } else {
      return null;
    }
  }

  public static String getName(BendProperty element) {
    return getKey(element);
  }

  public static PsiElement setName(BendProperty element, String newName) {
    ASTNode keyNode = element.getNode().findChildByType(BendTypes.KEY);
    if (keyNode != null) {
      BendProperty property = BendElementFactory.createProperty(element.getProject(), newName);
      ASTNode newKeyNode = property.getFirstChild().getNode();
      element.getNode().replaceChild(keyNode, newKeyNode);
    }
    return element;
  }

  public static PsiElement getNameIdentifier(BendProperty element) {
    ASTNode keyNode = element.getNode().findChildByType(BendTypes.KEY);
    if (keyNode != null) {
      return keyNode.getPsi();
    } else {
      return null;
    }
  }

  public static ItemPresentation getPresentation(final BendProperty element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return element.getKey();
      }

      @Nullable
      @Override
      public String getLocationString() {
        PsiFile containingFile = element.getContainingFile();
        return containingFile == null ? null : containingFile.getName();
      }

      @Override
      public Icon getIcon(boolean unused) {
        return element.getIcon(0);
      }
    };
  }

}
