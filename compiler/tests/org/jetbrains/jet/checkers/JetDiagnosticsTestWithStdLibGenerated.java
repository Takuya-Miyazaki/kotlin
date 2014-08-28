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

package org.jetbrains.jet.checkers;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithStdLib")
@InnerTestClasses({JetDiagnosticsTestWithStdLibGenerated.Annotations.class, JetDiagnosticsTestWithStdLibGenerated.CallableReference.class, JetDiagnosticsTestWithStdLibGenerated.DuplicateJvmSignature.class, JetDiagnosticsTestWithStdLibGenerated.FunctionLiterals.class, JetDiagnosticsTestWithStdLibGenerated.KotlinSignature.class, JetDiagnosticsTestWithStdLibGenerated.NonLocalReturns.class})
public class JetDiagnosticsTestWithStdLibGenerated extends AbstractJetDiagnosticsTestWithStdLib {
    public void testAllFilesPresentInTestsWithStdLib() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/annotations")
    @InnerTestClasses({Annotations.AnnotationApplicability.class, Annotations.AnnotationParameterMustBeConstant.class})
    public static class Annotations extends AbstractJetDiagnosticsTestWithStdLib {
        public void testAllFilesPresentInAnnotations() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/annotations"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("ClassObjectAnnotatedWithItsClass.kt")
        public void testClassObjectAnnotatedWithItsClass() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/annotations/ClassObjectAnnotatedWithItsClass.kt");
        }
        
        @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationApplicability")
        public static class AnnotationApplicability extends AbstractJetDiagnosticsTestWithStdLib {
            public void testAllFilesPresentInAnnotationApplicability() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationApplicability"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("illegalPlatformName.kt")
            public void testIllegalPlatformName() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationApplicability/illegalPlatformName.kt");
            }
            
            @TestMetadata("platformName.kt")
            public void testPlatformName() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationApplicability/platformName.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationParameterMustBeConstant")
        public static class AnnotationParameterMustBeConstant extends AbstractJetDiagnosticsTestWithStdLib {
            public void testAllFilesPresentInAnnotationParameterMustBeConstant() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationParameterMustBeConstant"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("array.kt")
            public void testArray() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationParameterMustBeConstant/array.kt");
            }
            
            @TestMetadata("classLiteral.kt")
            public void testClassLiteral() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationParameterMustBeConstant/classLiteral.kt");
            }
            
            @TestMetadata("simple.kt")
            public void testSimple() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationParameterMustBeConstant/simple.kt");
            }
            
            @TestMetadata("vararg.kt")
            public void testVararg() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/annotations/annotationParameterMustBeConstant/vararg.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Annotations");
            suite.addTestSuite(Annotations.class);
            suite.addTestSuite(AnnotationApplicability.class);
            suite.addTestSuite(AnnotationParameterMustBeConstant.class);
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/callableReference")
    @InnerTestClasses({CallableReference.Function.class, CallableReference.Property.class})
    public static class CallableReference extends AbstractJetDiagnosticsTestWithStdLib {
        public void testAllFilesPresentInCallableReference() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/callableReference"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("unused.kt")
        public void testUnused() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/unused.kt");
        }
        
        @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/callableReference/function")
        public static class Function extends AbstractJetDiagnosticsTestWithStdLib {
            @TestMetadata("abstractClassConstructors.kt")
            public void testAbstractClassConstructors() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/abstractClassConstructors.kt");
            }
            
            public void testAllFilesPresentInFunction() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/callableReference/function"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("ambiguityTopLevelVsTopLevel.kt")
            public void testAmbiguityTopLevelVsTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/ambiguityTopLevelVsTopLevel.kt");
            }
            
            @TestMetadata("constructorFromClass.kt")
            public void testConstructorFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/constructorFromClass.kt");
            }
            
            @TestMetadata("constructorFromExtension.kt")
            public void testConstructorFromExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/constructorFromExtension.kt");
            }
            
            @TestMetadata("constructorFromExtensionInClass.kt")
            public void testConstructorFromExtensionInClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/constructorFromExtensionInClass.kt");
            }
            
            @TestMetadata("constructorFromTopLevel.kt")
            public void testConstructorFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/constructorFromTopLevel.kt");
            }
            
            @TestMetadata("differentPackageClass.kt")
            public void testDifferentPackageClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/differentPackageClass.kt");
            }
            
            @TestMetadata("differentPackageExtension.kt")
            public void testDifferentPackageExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/differentPackageExtension.kt");
            }
            
            @TestMetadata("differentPackageTopLevel.kt")
            public void testDifferentPackageTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/differentPackageTopLevel.kt");
            }
            
            @TestMetadata("empty.kt")
            public void testEmpty() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/empty.kt");
            }
            
            @TestMetadata("extensionFromClass.kt")
            public void testExtensionFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/extensionFromClass.kt");
            }
            
            @TestMetadata("extensionFromExtension.kt")
            public void testExtensionFromExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/extensionFromExtension.kt");
            }
            
            @TestMetadata("extensionFromExtensionInClass.kt")
            public void testExtensionFromExtensionInClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/extensionFromExtensionInClass.kt");
            }
            
            @TestMetadata("extensionFromTopLevel.kt")
            public void testExtensionFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/extensionFromTopLevel.kt");
            }
            
            @TestMetadata("extensionInClassDisallowed.kt")
            public void testExtensionInClassDisallowed() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/extensionInClassDisallowed.kt");
            }
            
            @TestMetadata("extensionOnNullable.kt")
            public void testExtensionOnNullable() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/extensionOnNullable.kt");
            }
            
            @TestMetadata("genericClassFromTopLevel.kt")
            public void testGenericClassFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/genericClassFromTopLevel.kt");
            }
            
            @TestMetadata("importedInnerConstructor.kt")
            public void testImportedInnerConstructor() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/importedInnerConstructor.kt");
            }
            
            @TestMetadata("innerConstructorFromClass.kt")
            public void testInnerConstructorFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/innerConstructorFromClass.kt");
            }
            
            @TestMetadata("innerConstructorFromExtension.kt")
            public void testInnerConstructorFromExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/innerConstructorFromExtension.kt");
            }
            
            @TestMetadata("innerConstructorFromTopLevel.kt")
            public void testInnerConstructorFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/innerConstructorFromTopLevel.kt");
            }
            
            @TestMetadata("lhsNotAClass.kt")
            public void testLhsNotAClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/lhsNotAClass.kt");
            }
            
            @TestMetadata("localConstructor.kt")
            public void testLocalConstructor() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localConstructor.kt");
            }
            
            @TestMetadata("localConstructorFromExtensionInLocalClass.kt")
            public void testLocalConstructorFromExtensionInLocalClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localConstructorFromExtensionInLocalClass.kt");
            }
            
            @TestMetadata("localConstructorFromLocalClass.kt")
            public void testLocalConstructorFromLocalClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localConstructorFromLocalClass.kt");
            }
            
            @TestMetadata("localConstructorFromLocalExtension.kt")
            public void testLocalConstructorFromLocalExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localConstructorFromLocalExtension.kt");
            }
            
            @TestMetadata("localNamedFun.kt")
            public void testLocalNamedFun() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localNamedFun.kt");
            }
            
            @TestMetadata("localNamedFunFromExtensionInLocalClass.kt")
            public void testLocalNamedFunFromExtensionInLocalClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localNamedFunFromExtensionInLocalClass.kt");
            }
            
            @TestMetadata("localNamedFunFromLocalClass.kt")
            public void testLocalNamedFunFromLocalClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localNamedFunFromLocalClass.kt");
            }
            
            @TestMetadata("localNamedFunFromLocalExtension.kt")
            public void testLocalNamedFunFromLocalExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/localNamedFunFromLocalExtension.kt");
            }
            
            @TestMetadata("longQualifiedName.kt")
            public void testLongQualifiedName() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/longQualifiedName.kt");
            }
            
            @TestMetadata("longQualifiedNameGeneric.kt")
            public void testLongQualifiedNameGeneric() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/longQualifiedNameGeneric.kt");
            }
            
            @TestMetadata("memberFromClass.kt")
            public void testMemberFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/memberFromClass.kt");
            }
            
            @TestMetadata("memberFromExtension.kt")
            public void testMemberFromExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/memberFromExtension.kt");
            }
            
            @TestMetadata("memberFromExtensionInClass.kt")
            public void testMemberFromExtensionInClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/memberFromExtensionInClass.kt");
            }
            
            @TestMetadata("memberFromTopLevel.kt")
            public void testMemberFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/memberFromTopLevel.kt");
            }
            
            @TestMetadata("nestedConstructorFromClass.kt")
            public void testNestedConstructorFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/nestedConstructorFromClass.kt");
            }
            
            @TestMetadata("nestedConstructorFromExtension.kt")
            public void testNestedConstructorFromExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/nestedConstructorFromExtension.kt");
            }
            
            @TestMetadata("nestedConstructorFromTopLevel.kt")
            public void testNestedConstructorFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/nestedConstructorFromTopLevel.kt");
            }
            
            @TestMetadata("noAmbiguityLocalVsTopLevel.kt")
            public void testNoAmbiguityLocalVsTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/noAmbiguityLocalVsTopLevel.kt");
            }
            
            @TestMetadata("noAmbiguityMemberVsExtension.kt")
            public void testNoAmbiguityMemberVsExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/noAmbiguityMemberVsExtension.kt");
            }
            
            @TestMetadata("noAmbiguityMemberVsTopLevel.kt")
            public void testNoAmbiguityMemberVsTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/noAmbiguityMemberVsTopLevel.kt");
            }
            
            @TestMetadata("renameOnImport.kt")
            public void testRenameOnImport() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/renameOnImport.kt");
            }
            
            @TestMetadata("topLevelFromClass.kt")
            public void testTopLevelFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/topLevelFromClass.kt");
            }
            
            @TestMetadata("topLevelFromExtension.kt")
            public void testTopLevelFromExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/topLevelFromExtension.kt");
            }
            
            @TestMetadata("topLevelFromExtensionInClass.kt")
            public void testTopLevelFromExtensionInClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/topLevelFromExtensionInClass.kt");
            }
            
            @TestMetadata("topLevelFromTopLevel.kt")
            public void testTopLevelFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/topLevelFromTopLevel.kt");
            }
            
            @TestMetadata("unresolved.kt")
            public void testUnresolved() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/function/unresolved.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/callableReference/property")
        public static class Property extends AbstractJetDiagnosticsTestWithStdLib {
            @TestMetadata("abstractPropertyViaSubclasses.kt")
            public void testAbstractPropertyViaSubclasses() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/abstractPropertyViaSubclasses.kt");
            }
            
            @TestMetadata("accessViaSubclass.kt")
            public void testAccessViaSubclass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/accessViaSubclass.kt");
            }
            
            public void testAllFilesPresentInProperty() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/callableReference/property"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("classFromClass.kt")
            public void testClassFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/classFromClass.kt");
            }
            
            @TestMetadata("extensionFromClass.kt")
            public void testExtensionFromClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/extensionFromClass.kt");
            }
            
            @TestMetadata("extensionFromTopLevel.kt")
            public void testExtensionFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/extensionFromTopLevel.kt");
            }
            
            @TestMetadata("extensionPropertyOnNullable.kt")
            public void testExtensionPropertyOnNullable() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/extensionPropertyOnNullable.kt");
            }
            
            @TestMetadata("genericClass.kt")
            public void testGenericClass() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/genericClass.kt");
            }
            
            @TestMetadata("javaInstanceField.kt")
            public void testJavaInstanceField() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/javaInstanceField.kt");
            }
            
            @TestMetadata("javaStaticFieldViaImport.kt")
            public void testJavaStaticFieldViaImport() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/javaStaticFieldViaImport.kt");
            }
            
            @TestMetadata("localVariable.kt")
            public void testLocalVariable() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/localVariable.kt");
            }
            
            @TestMetadata("memberFromExtension.kt")
            public void testMemberFromExtension() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/memberFromExtension.kt");
            }
            
            @TestMetadata("memberFromTopLevel.kt")
            public void testMemberFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/memberFromTopLevel.kt");
            }
            
            @TestMetadata("topLevelFromTopLevel.kt")
            public void testTopLevelFromTopLevel() throws Exception {
                doTest("compiler/testData/diagnostics/testsWithStdLib/callableReference/property/topLevelFromTopLevel.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("CallableReference");
            suite.addTestSuite(CallableReference.class);
            suite.addTestSuite(Function.class);
            suite.addTestSuite(Property.class);
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/duplicateJvmSignature")
    public static class DuplicateJvmSignature extends AbstractJetDiagnosticsTestWithStdLib {
        public void testAllFilesPresentInDuplicateJvmSignature() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/duplicateJvmSignature"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("delegatedProperty.kt")
        public void testDelegatedProperty() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/duplicateJvmSignature/delegatedProperty.kt");
        }
        
        @TestMetadata("platformNames.kt")
        public void testPlatformNames() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/duplicateJvmSignature/platformNames.kt");
        }
        
        @TestMetadata("platformNamesDuplicate.kt")
        public void testPlatformNamesDuplicate() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/duplicateJvmSignature/platformNamesDuplicate.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/functionLiterals")
    public static class FunctionLiterals extends AbstractJetDiagnosticsTestWithStdLib {
        public void testAllFilesPresentInFunctionLiterals() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/functionLiterals"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("pseudocodeMemoryOverhead.kt")
        public void testPseudocodeMemoryOverhead() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/functionLiterals/pseudocodeMemoryOverhead.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/kotlinSignature")
    public static class KotlinSignature extends AbstractJetDiagnosticsTestWithStdLib {
        public void testAllFilesPresentInKotlinSignature() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/kotlinSignature"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("constructorNamedArguments.kt")
        public void testConstructorNamedArguments() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/kotlinSignature/constructorNamedArguments.kt");
        }
        
        @TestMetadata("parameterNames.kt")
        public void testParameterNames() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/kotlinSignature/parameterNames.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/diagnostics/testsWithStdLib/nonLocalReturns")
    public static class NonLocalReturns extends AbstractJetDiagnosticsTestWithStdLib {
        public void testAllFilesPresentInNonLocalReturns() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithStdLib/nonLocalReturns"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("prohibitNonLocalReturnOutOfTryCatchFinally.kt")
        public void testProhibitNonLocalReturnOutOfTryCatchFinally() throws Exception {
            doTest("compiler/testData/diagnostics/testsWithStdLib/nonLocalReturns/prohibitNonLocalReturnOutOfTryCatchFinally.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JetDiagnosticsTestWithStdLibGenerated");
        suite.addTestSuite(JetDiagnosticsTestWithStdLibGenerated.class);
        suite.addTest(Annotations.innerSuite());
        suite.addTest(CallableReference.innerSuite());
        suite.addTestSuite(DuplicateJvmSignature.class);
        suite.addTestSuite(FunctionLiterals.class);
        suite.addTestSuite(KotlinSignature.class);
        suite.addTestSuite(NonLocalReturns.class);
        return suite;
    }
}
