// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language;

import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.sdk.language.psi.BendFile;
import org.intellij.sdk.language.psi.BendProperty;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class BendUtil {

  /**
   * Searches the entire project for Bend language files with instances of the Bend property with the given key.
   *
   * @param project current project
   * @param key     to check
   * @return matching properties
   */
  public static List<BendProperty> findProperties(Project project, String key) {
    List<BendProperty> result = new ArrayList<>();
    Collection<VirtualFile> virtualFiles =
        FileTypeIndex.getFiles(BendFileType.INSTANCE, GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      BendFile bendFile = (BendFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (bendFile != null) {
        BendProperty[] properties = PsiTreeUtil.getChildrenOfType(bendFile, BendProperty.class);
        if (properties != null) {
          for (BendProperty property : properties) {
            if (key.equals(property.getKey())) {
              result.add(property);
            }
          }
        }
      }
    }
    return result;
  }

  public static List<BendProperty> findProperties(Project project) {
    List<BendProperty> result = new ArrayList<>();
    Collection<VirtualFile> virtualFiles =
        FileTypeIndex.getFiles(BendFileType.INSTANCE, GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      BendFile bendFile = (BendFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (bendFile != null) {
        BendProperty[] properties = PsiTreeUtil.getChildrenOfType(bendFile, BendProperty.class);
        if (properties != null) {
          Collections.addAll(result, properties);
        }
      }
    }
    return result;
  }

  /**
   * Attempts to collect any comment elements above the Bend key/value pair.
   */
  public static @NotNull String findDocumentationComment(BendProperty property) {
    List<String> result = new LinkedList<>();
    PsiElement element = property.getPrevSibling();
    while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
      if (element instanceof PsiComment) {
        String commentText = element.getText().replaceFirst("[!# ]+", "");
        result.add(commentText);
      }
      element = element.getPrevSibling();
    }
    return StringUtil.join(Lists.reverse(result), "\n ");
  }

}
