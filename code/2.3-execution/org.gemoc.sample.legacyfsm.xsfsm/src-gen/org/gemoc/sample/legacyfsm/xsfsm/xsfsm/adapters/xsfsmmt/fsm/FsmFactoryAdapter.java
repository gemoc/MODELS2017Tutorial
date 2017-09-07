package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.AssignValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private XSFSMMTAdaptersFactory adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
  
  private org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmFactory fsmAdaptee = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmFactory.eINSTANCE;
  
  @Override
  public StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(fsmAdaptee.createStateMachine(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition(), null);
  }
  
  @Override
  public NumberVariable createNumberVariable() {
    return adaptersFactory.createNumberVariableAdapter(fsmAdaptee.createNumberVariable(), null);
  }
  
  @Override
  public EqualNumberGuard createEqualNumberGuard() {
    return adaptersFactory.createEqualNumberGuardAdapter(fsmAdaptee.createEqualNumberGuard(), null);
  }
  
  @Override
  public AssignValueAction createAssignValueAction() {
    return adaptersFactory.createAssignValueActionAdapter(fsmAdaptee.createAssignValueAction(), null);
  }
  
  @Override
  public LessThanNumberGuard createLessThanNumberGuard() {
    return adaptersFactory.createLessThanNumberGuardAdapter(fsmAdaptee.createLessThanNumberGuard(), null);
  }
  
  @Override
  public GreaterThanNumberGuard createGreaterThanNumberGuard() {
    return adaptersFactory.createGreaterThanNumberGuardAdapter(fsmAdaptee.createGreaterThanNumberGuard(), null);
  }
  
  @Override
  public IncreaseValueAction createIncreaseValueAction() {
    return adaptersFactory.createIncreaseValueActionAdapter(fsmAdaptee.createIncreaseValueAction(), null);
  }
  
  @Override
  public DecreaseValueAction createDecreaseValueAction() {
    return adaptersFactory.createDecreaseValueActionAdapter(fsmAdaptee.createDecreaseValueAction(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE;
  }
}
