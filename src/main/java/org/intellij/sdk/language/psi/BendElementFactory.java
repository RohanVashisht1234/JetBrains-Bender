// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import org.intellij.sdk.language.BendFileType;

public class BendElementFactory {

  public static BendProperty createProperty(Project project, String name) {
    final BendFile file = createFile(project, name);
    return (BendProperty) file.getFirstChild();
  }

  public static BendFile createFile(Project project, String text) {
    String name = "dummy.bend";
    return (BendFile) PsiFileFactory.getInstance(project).createFileFromText(name, BendFileType.INSTANCE, text);
  }

  public static BendProperty createProperty(Project project, String name, String value) {
    final BendFile file = createFile(project, name + " = " + value);
    return (BendProperty) file.getFirstChild();
  }

  public static PsiElement createCRLF(Project project) {
    final BendFile file = createFile(project, "\n");
    return file.getFirstChild();
  }

}
