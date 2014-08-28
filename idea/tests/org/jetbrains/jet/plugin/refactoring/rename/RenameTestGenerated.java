/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.refactoring.rename;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/refactoring/rename")
public class RenameTestGenerated extends AbstractRenameTest {
    public void testAllFilesPresentInRename() throws Exception {
        JetTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/rename"), Pattern.compile("^(.+)\\.test$"));
    }
    
    @TestMetadata("renameCompareTo/compareTo.test")
    public void testRenameCompareTo_CompareTo() throws Exception {
        doTest("idea/testData/refactoring/rename/renameCompareTo/compareTo.test");
    }
    
    @TestMetadata("renameContains/contains.test")
    public void testRenameContains_Contains() throws Exception {
        doTest("idea/testData/refactoring/rename/renameContains/contains.test");
    }
    
    @TestMetadata("renameContainsWithConflicts/containsWithConflicts.test")
    public void testRenameContainsWithConflicts_ContainsWithConflicts() throws Exception {
        doTest("idea/testData/refactoring/rename/renameContainsWithConflicts/containsWithConflicts.test");
    }
    
    @TestMetadata("renameEquals/equals.test")
    public void testRenameEquals_Equals() throws Exception {
        doTest("idea/testData/refactoring/rename/renameEquals/equals.test");
    }
    
    @TestMetadata("renameExplicitComponentFunction/explicitComponentFunction.test")
    public void testRenameExplicitComponentFunction_ExplicitComponentFunction() throws Exception {
        doTest("idea/testData/refactoring/rename/renameExplicitComponentFunction/explicitComponentFunction.test");
    }
    
    @TestMetadata("renameGet/get.test")
    public void testRenameGet_Get() throws Exception {
        doTest("idea/testData/refactoring/rename/renameGet/get.test");
    }
    
    @TestMetadata("renameInc/inc.test")
    public void testRenameInc_Inc() throws Exception {
        doTest("idea/testData/refactoring/rename/renameInc/inc.test");
    }
    
    @TestMetadata("renameInvoke/invoke.test")
    public void testRenameInvoke_Invoke() throws Exception {
        doTest("idea/testData/refactoring/rename/renameInvoke/invoke.test");
    }
    
    @TestMetadata("renameIterator/iterator.test")
    public void testRenameIterator_Iterator() throws Exception {
        doTest("idea/testData/refactoring/rename/renameIterator/iterator.test");
    }
    
    @TestMetadata("renameJavaClass/renameJavaClass.test")
    public void testRenameJavaClass_RenameJavaClass() throws Exception {
        doTest("idea/testData/refactoring/rename/renameJavaClass/renameJavaClass.test");
    }
    
    @TestMetadata("renameJavaInterface/renameJavaInterface.test")
    public void testRenameJavaInterface_RenameJavaInterface() throws Exception {
        doTest("idea/testData/refactoring/rename/renameJavaInterface/renameJavaInterface.test");
    }
    
    @TestMetadata("renameJavaMethod/javaBaseMethod.test")
    public void testRenameJavaMethod_JavaBaseMethod() throws Exception {
        doTest("idea/testData/refactoring/rename/renameJavaMethod/javaBaseMethod.test");
    }
    
    @TestMetadata("renameJavaMethod/kotlinOverridenMethod.test")
    public void testRenameJavaMethod_KotlinOverridenMethod() throws Exception {
        doTest("idea/testData/refactoring/rename/renameJavaMethod/kotlinOverridenMethod.test");
    }
    
    @TestMetadata("renameKotlinBaseMethod/javaWrapperForBaseFunction.test")
    public void testRenameKotlinBaseMethod_JavaWrapperForBaseFunction() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinBaseMethod/javaWrapperForBaseFunction.test");
    }
    
    @TestMetadata("renameKotlinBaseMethod/javaWrapperForOverridenFunctionWithKotlinBase.test")
    public void testRenameKotlinBaseMethod_JavaWrapperForOverridenFunctionWithKotlinBase() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinBaseMethod/javaWrapperForOverridenFunctionWithKotlinBase.test");
    }
    
    @TestMetadata("renameKotlinBaseMethod/kotlinBaseFunction.test")
    public void testRenameKotlinBaseMethod_KotlinBaseFunction() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinBaseMethod/kotlinBaseFunction.test");
    }
    
    @TestMetadata("renameKotlinClass/javaWrapperForKotlinClass.test")
    public void testRenameKotlinClass_JavaWrapperForKotlinClass() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinClass/javaWrapperForKotlinClass.test");
    }
    
    @TestMetadata("renameKotlinClass/kotlinClass.test")
    public void testRenameKotlinClass_KotlinClass() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinClass/kotlinClass.test");
    }
    
    @TestMetadata("renameKotlinClassConstructor/renameKotlinConstructor.test")
    public void testRenameKotlinClassConstructor_RenameKotlinConstructor() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinClassConstructor/renameKotlinConstructor.test");
    }
    
    @TestMetadata("renameKotlinClassWithFile/javaClassWrapper.test")
    public void testRenameKotlinClassWithFile_JavaClassWrapper() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinClassWithFile/javaClassWrapper.test");
    }
    
    @TestMetadata("renameKotlinClassWithFile/kotlinClass.test")
    public void testRenameKotlinClassWithFile_KotlinClass() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinClassWithFile/kotlinClass.test");
    }
    
    @TestMetadata("renameKotlinMethod/javaWrapperForKotlinMethod.test")
    public void testRenameKotlinMethod_JavaWrapperForKotlinMethod() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinMethod/javaWrapperForKotlinMethod.test");
    }
    
    @TestMetadata("renameKotlinMethod/renameKotlinMethod.test")
    public void testRenameKotlinMethod_RenameKotlinMethod() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinMethod/renameKotlinMethod.test");
    }
    
    @TestMetadata("renameKotlinPackage/renameInOtherFile.test")
    public void testRenameKotlinPackage_RenameInOtherFile() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinPackage/renameInOtherFile.test");
    }
    
    @TestMetadata("renameKotlinPackage/renameKotlinPackage.test")
    public void testRenameKotlinPackage_RenameKotlinPackage() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinPackage/renameKotlinPackage.test");
    }
    
    @TestMetadata("renameKotlinPackageClass/javaWrapperForKotlinPackageClass.test")
    public void testRenameKotlinPackageClass_JavaWrapperForKotlinPackageClass() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinPackageClass/javaWrapperForKotlinPackageClass.test");
    }
    
    @TestMetadata("renameKotlinPackageFunctionFromJava/renameKotlinPackageFunctionFromJava.test")
    public void testRenameKotlinPackageFunctionFromJava_RenameKotlinPackageFunctionFromJava() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinPackageFunctionFromJava/renameKotlinPackageFunctionFromJava.test");
    }
    
    @TestMetadata("renameKotlinValProperty/renameAsJavaGetterForExplicitGetter.test")
    public void testRenameKotlinValProperty_RenameAsJavaGetterForExplicitGetter() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinValProperty/renameAsJavaGetterForExplicitGetter.test");
    }
    
    @TestMetadata("renameKotlinValProperty/renameBase.test")
    public void testRenameKotlinValProperty_RenameBase() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinValProperty/renameBase.test");
    }
    
    @TestMetadata("renameKotlinValProperty/renameOverriden.test")
    public void testRenameKotlinValProperty_RenameOverriden() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinValProperty/renameOverriden.test");
    }
    
    @TestMetadata("renameKotlinVarProperty/renameAsJavaGetter.test")
    public void testRenameKotlinVarProperty_RenameAsJavaGetter() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinVarProperty/renameAsJavaGetter.test");
    }
    
    @TestMetadata("renameKotlinVarProperty/renameAsJavaSetter.test")
    public void testRenameKotlinVarProperty_RenameAsJavaSetter() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinVarProperty/renameAsJavaSetter.test");
    }
    
    @TestMetadata("renameKotlinVarProperty/renameBase.test")
    public void testRenameKotlinVarProperty_RenameBase() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinVarProperty/renameBase.test");
    }
    
    @TestMetadata("renameKotlinVarProperty/renameOverriden.test")
    public void testRenameKotlinVarProperty_RenameOverriden() throws Exception {
        doTest("idea/testData/refactoring/rename/renameKotlinVarProperty/renameOverriden.test");
    }
    
    @TestMetadata("renamePlus/plus.test")
    public void testRenamePlus_Plus() throws Exception {
        doTest("idea/testData/refactoring/rename/renamePlus/plus.test");
    }
    
    @TestMetadata("renamePlusAssign/plusAssign.test")
    public void testRenamePlusAssign_PlusAssign() throws Exception {
        doTest("idea/testData/refactoring/rename/renamePlusAssign/plusAssign.test");
    }
    
    @TestMetadata("renameSet/set.test")
    public void testRenameSet_Set() throws Exception {
        doTest("idea/testData/refactoring/rename/renameSet/set.test");
    }
    
    @TestMetadata("renameSynthesizedComponentFunction/synthesizedComponentFunction.test")
    public void testRenameSynthesizedComponentFunction_SynthesizedComponentFunction() throws Exception {
        doTest("idea/testData/refactoring/rename/renameSynthesizedComponentFunction/synthesizedComponentFunction.test");
    }
    
    @TestMetadata("renameUnaryMinus/unaryMinus.test")
    public void testRenameUnaryMinus_UnaryMinus() throws Exception {
        doTest("idea/testData/refactoring/rename/renameUnaryMinus/unaryMinus.test");
    }
    
}
