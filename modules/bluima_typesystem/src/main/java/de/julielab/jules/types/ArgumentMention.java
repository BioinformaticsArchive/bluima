

/* First created by JCasGen Wed Oct 19 19:10:28 CEST 2011 */
package de.julielab.jules.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Jun 04 18:01:57 CEST 2014
 * XML source: /Users/richarde/dev/bluebrain/git/Bluima/modules/bluima_typesystem/src/main/resources/typeSystem/bbp-types.xml
 * @generated */
public class ArgumentMention extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ArgumentMention.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ArgumentMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ArgumentMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ArgumentMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ArgumentMention(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   * @generated modifiable 
   */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: ref

  /** getter for ref - gets Reference to the Annotation Object that acts as a argument here
   * @generated
   * @return value of the feature 
   */
  public Annotation getRef() {
    if (ArgumentMention_Type.featOkTst && ((ArgumentMention_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "de.julielab.jules.types.ArgumentMention");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgumentMention_Type)jcasType).casFeatCode_ref)));}
    
  /** setter for ref - sets Reference to the Annotation Object that acts as a argument here 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRef(Annotation v) {
    if (ArgumentMention_Type.featOkTst && ((ArgumentMention_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "de.julielab.jules.types.ArgumentMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ArgumentMention_Type)jcasType).casFeatCode_ref, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: role

  /** getter for role - gets the role of the argument
   * @generated
   * @return value of the feature 
   */
  public String getRole() {
    if (ArgumentMention_Type.featOkTst && ((ArgumentMention_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "de.julielab.jules.types.ArgumentMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentMention_Type)jcasType).casFeatCode_role);}
    
  /** setter for role - sets the role of the argument 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    if (ArgumentMention_Type.featOkTst && ((ArgumentMention_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "de.julielab.jules.types.ArgumentMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentMention_Type)jcasType).casFeatCode_role, v);}    
  }

    