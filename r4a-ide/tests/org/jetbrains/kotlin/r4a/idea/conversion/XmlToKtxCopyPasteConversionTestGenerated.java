/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.r4a.idea.conversion;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/r4a/r4a-ide/testData/conversion")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class XmlToKtxCopyPasteConversionTestGenerated extends AbstractXmlToKtxCopyPasteConversionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInConversion() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/r4a/r4a-ide/testData/conversion"), Pattern.compile("^([^\\.]+)\\.to.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("PasteAttributesInKtxElement.to.kt")
    public void testPasteAttributesInKtxElement() throws Exception {
        runTest("plugins/r4a/r4a-ide/testData/conversion/PasteAttributesInKtxElement.to.kt");
    }

    @TestMetadata("PasteInClass.to.kt")
    public void testPasteInClass() throws Exception {
        runTest("plugins/r4a/r4a-ide/testData/conversion/PasteInClass.to.kt");
    }

    @TestMetadata("PasteInFile.to.kt")
    public void testPasteInFile() throws Exception {
        runTest("plugins/r4a/r4a-ide/testData/conversion/PasteInFile.to.kt");
    }

    @TestMetadata("PasteInFunction.to.kt")
    public void testPasteInFunction() throws Exception {
        runTest("plugins/r4a/r4a-ide/testData/conversion/PasteInFunction.to.kt");
    }

    @TestMetadata("PasteInLambda.to.kt")
    public void testPasteInLambda() throws Exception {
        runTest("plugins/r4a/r4a-ide/testData/conversion/PasteInLambda.to.kt");
    }
}
