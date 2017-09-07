package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.sample.legacyfsm.fsm.AssignValueAction;
import org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.FsmFactory;
import org.gemoc.sample.legacyfsm.fsm.FsmPackage;
import org.gemoc.sample.legacyfsm.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.fsm.State;
import org.gemoc.sample.legacyfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private FSMMTAdaptersFactory adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  
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
    return org.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE;
  }
}
