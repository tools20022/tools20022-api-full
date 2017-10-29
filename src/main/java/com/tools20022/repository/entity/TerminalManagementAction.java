/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Terminal management action to be performed by the point of interaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TerminalManagementAction"
 * src="doc-files/TerminalManagementAction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#Type
 * TerminalManagementAction.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#Trigger
 * TerminalManagementAction.Trigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#AdditionalProcess
 * TerminalManagementAction.AdditionalProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#ActionResult
 * TerminalManagementAction.ActionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#ActionToProcess
 * TerminalManagementAction.ActionToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#TerminalManagementSystem
 * TerminalManagementAction.TerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#Action
 * TerminalManagementSystem.Action}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#ErrorAction
 * TMSAction1.ErrorAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan1#DataSet
 * ManagementPlan1.DataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#ErrorAction
 * TMSAction2.ErrorAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan2#DataSet
 * ManagementPlan2.DataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan3#DataSet
 * ManagementPlan3.DataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#ErrorAction
 * TMSAction3.ErrorAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan4#DataSet
 * ManagementPlan4.DataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan5#DataSet
 * ManagementPlan5.DataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan6#DataSet
 * ManagementPlan6.DataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction1 ErrorAction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1 TMSAction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent1
 * ManagementPlanContent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan1
 * ManagementPlan1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction2 ErrorAction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2 TMSAction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent2
 * ManagementPlanContent2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet5
 * TerminalManagementDataSet5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan2
 * ManagementPlan2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSActionIdentification1
 * TMSActionIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent1 TMSEvent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSActionIdentification2
 * TMSActionIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent2 TMSEvent2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan3
 * ManagementPlan3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3 TMSAction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent3
 * ManagementPlanContent3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet10
 * TerminalManagementDataSet10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan4
 * ManagementPlan4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet15
 * TerminalManagementDataSet15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent4
 * ManagementPlanContent4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent3 TMSEvent3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSActionIdentification3
 * TMSActionIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4 TMSAction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan5
 * ManagementPlan5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent4 TMSEvent4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSActionIdentification4
 * TMSActionIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5 TMSAction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet18
 * TerminalManagementDataSet18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent5
 * ManagementPlanContent5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan6
 * ManagementPlan6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction3 ErrorAction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent6
 * ManagementPlanContent6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6 TMSAction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent5 TMSEvent5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet22
 * TerminalManagementDataSet22}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementAction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Terminal management action to be performed by the point of interaction."</li>
 * </ul>
 */
public class TerminalManagementAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Types of terminal management action to be performed by a point of
	 * interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#Type
	 * TMSAction1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#Type
	 * TMSAction2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification1#ActionType
	 * TMSActionIdentification1.ActionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification2#ActionType
	 * TMSActionIdentification2.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#Type
	 * TMSAction3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification3#ActionType
	 * TMSActionIdentification3.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#Type
	 * TMSAction4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4#ActionType
	 * TMSActionIdentification4.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#Type
	 * TMSAction5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#Type
	 * TMSAction6.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of terminal management action to be performed by a point of interaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction1.Type, com.tools20022.repository.msg.TMSAction2.Type, com.tools20022.repository.msg.TMSActionIdentification1.ActionType,
					com.tools20022.repository.msg.TMSActionIdentification2.ActionType, com.tools20022.repository.msg.TMSAction3.Type, com.tools20022.repository.msg.TMSActionIdentification3.ActionType,
					com.tools20022.repository.msg.TMSAction4.Type, com.tools20022.repository.msg.TMSActionIdentification4.ActionType, com.tools20022.repository.msg.TMSAction5.Type, com.tools20022.repository.msg.TMSAction6.Type);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Types of terminal management action to be performed by a point of interaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionCode.mmObject();
		}
	};
	/**
	 * Event to start the terminal management action by the point of interaction
	 * (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode
	 * TerminalManagementActionTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#Trigger
	 * TMSAction1.Trigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#Trigger
	 * TMSAction2.Trigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#Trigger
	 * TMSAction3.Trigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#Trigger
	 * TMSAction4.Trigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#Trigger
	 * TMSAction5.Trigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#Trigger
	 * TMSAction6.Trigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event to start the terminal management action by the point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Trigger = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction1.Trigger, com.tools20022.repository.msg.TMSAction2.Trigger, com.tools20022.repository.msg.TMSAction3.Trigger,
					com.tools20022.repository.msg.TMSAction4.Trigger, com.tools20022.repository.msg.TMSAction5.Trigger, com.tools20022.repository.msg.TMSAction6.Trigger);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Event to start the terminal management action by the point of interaction (POI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
		}
	};
	/**
	 * Additional process to perform before starting or after the terminal
	 * management action by the point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode
	 * TerminalManagementAdditionalProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction1#AdditionalProcess
	 * TMSAction1.AdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction2#AdditionalProcess
	 * TMSAction2.AdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#AdditionalProcess
	 * TMSAction3.AdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction4#AdditionalProcess
	 * TMSAction4.AdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#AdditionalProcess
	 * TMSAction5.AdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction6#AdditionalProcess
	 * TMSAction6.AdditionalProcess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional process to perform before starting or after the terminal management action by the point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdditionalProcess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction1.AdditionalProcess, com.tools20022.repository.msg.TMSAction2.AdditionalProcess, com.tools20022.repository.msg.TMSAction3.AdditionalProcess,
					com.tools20022.repository.msg.TMSAction4.AdditionalProcess, com.tools20022.repository.msg.TMSAction5.AdditionalProcess, com.tools20022.repository.msg.TMSAction6.AdditionalProcess);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after the terminal management action by the point of interaction (POI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
		}
	};
	/**
	 * List of action result codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction1#ActionResult
	 * ErrorAction1.ActionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction2#ActionResult
	 * ErrorAction2.ActionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent1#Result
	 * TMSEvent1.Result}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent2#Result
	 * TMSEvent2.Result}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent3#Result
	 * TMSEvent3.Result}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand5#Result
	 * ATMCommand5.Result}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent4#Result
	 * TMSEvent4.Result}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand8#Result
	 * ATMCommand8.Result}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction3#ActionResult
	 * ErrorAction3.ActionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent5#Result
	 * TMSEvent5.Result}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of action result codes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionResult = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ErrorAction1.ActionResult, com.tools20022.repository.msg.ErrorAction2.ActionResult, com.tools20022.repository.msg.TMSEvent1.Result,
					com.tools20022.repository.msg.TMSEvent2.Result, com.tools20022.repository.msg.TMSEvent3.Result, com.tools20022.repository.msg.ATMCommand5.Result, com.tools20022.repository.msg.TMSEvent4.Result,
					com.tools20022.repository.msg.ATMCommand8.Result, com.tools20022.repository.msg.ErrorAction3.ActionResult, com.tools20022.repository.msg.TMSEvent5.Result);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionResult";
			definition = "List of action result codes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResultCode.mmObject();
		}
	};
	/**
	 * Action to be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction1#ActionToProcess
	 * ErrorAction1.ActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction2#ActionToProcess
	 * ErrorAction2.ActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction3#ActionToProcess
	 * ErrorAction3.ActionToProcess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Action to be processed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionToProcess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ErrorAction1.ActionToProcess, com.tools20022.repository.msg.ErrorAction2.ActionToProcess, com.tools20022.repository.msg.ErrorAction3.ActionToProcess);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorActionCode.mmObject();
		}
	};
	/**
	 * Terminal management system from which an action took place
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#Action
	 * TerminalManagementSystem.Action}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system from which an action took place"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system from which an action took place";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.Action;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction";
				definition = "Terminal management action to be performed by the point of interaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.Action);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction1.ErrorAction, com.tools20022.repository.msg.ManagementPlan1.DataSet, com.tools20022.repository.msg.TMSAction2.ErrorAction,
						com.tools20022.repository.msg.ManagementPlan2.DataSet, com.tools20022.repository.msg.ManagementPlan3.DataSet, com.tools20022.repository.msg.TMSAction3.ErrorAction,
						com.tools20022.repository.msg.ManagementPlan4.DataSet, com.tools20022.repository.msg.ManagementPlan5.DataSet, com.tools20022.repository.msg.ManagementPlan6.DataSet);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementAction.Type, com.tools20022.repository.entity.TerminalManagementAction.Trigger,
						com.tools20022.repository.entity.TerminalManagementAction.AdditionalProcess, com.tools20022.repository.entity.TerminalManagementAction.ActionResult,
						com.tools20022.repository.entity.TerminalManagementAction.ActionToProcess, com.tools20022.repository.entity.TerminalManagementAction.TerminalManagementSystem);
				derivationComponent_lazy = () -> Arrays.asList(ErrorAction1.mmObject(), TMSAction1.mmObject(), ManagementPlanContent1.mmObject(), ManagementPlan1.mmObject(), ErrorAction2.mmObject(), TMSAction2.mmObject(),
						ManagementPlanContent2.mmObject(), TerminalManagementDataSet5.mmObject(), ManagementPlan2.mmObject(), TMSActionIdentification1.mmObject(), TMSEvent1.mmObject(), TMSActionIdentification2.mmObject(),
						TMSEvent2.mmObject(), ManagementPlan3.mmObject(), TMSAction3.mmObject(), ManagementPlanContent3.mmObject(), TerminalManagementDataSet10.mmObject(), ManagementPlan4.mmObject(), TerminalManagementDataSet15.mmObject(),
						ManagementPlanContent4.mmObject(), TMSEvent3.mmObject(), TMSActionIdentification3.mmObject(), TMSAction4.mmObject(), ManagementPlan5.mmObject(), TMSEvent4.mmObject(), TMSActionIdentification4.mmObject(),
						TMSAction5.mmObject(), TerminalManagementDataSet18.mmObject(), ManagementPlanContent5.mmObject(), ManagementPlan6.mmObject(), ErrorAction3.mmObject(), ManagementPlanContent6.mmObject(), TMSAction6.mmObject(),
						TMSEvent5.mmObject(), TerminalManagementDataSet22.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}