// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface BendTypes {

  IElementType PROPERTY = new BendElementType("PROPERTY");

  IElementType COMMENT = new BendTokenType("COMMENT");
  IElementType CRLF = new BendTokenType("CRLF");
  IElementType KEY = new BendTokenType("KEY");
  IElementType SEPARATOR = new BendTokenType("SEPARATOR");
  IElementType VALUE = new BendTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new BendPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
