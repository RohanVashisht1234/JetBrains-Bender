// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class BendFileType extends LanguageFileType {

  public static final BendFileType INSTANCE = new BendFileType();

  private BendFileType() {
    super(BendLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Bend File";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Bend language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "bend";
  }

  @Override
  public Icon getIcon() {
    return BendIcons.FILE;
  }

}
