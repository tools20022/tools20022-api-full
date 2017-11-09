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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAction
 * TerminalManagementSystem.mmAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmErrorAction
 * TMSAction1.mmErrorAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan1#mmDataSet
 * ManagementPlan1.mmDataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmErrorAction
 * TMSAction2.mmErrorAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan2#mmDataSet
 * ManagementPlan2.mmDataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan3#mmDataSet
 * ManagementPlan3.mmDataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmErrorAction
 * TMSAction3.mmErrorAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan4#mmDataSet
 * ManagementPlan4.mmDataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan5#mmDataSet
 * ManagementPlan5.mmDataSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan6#mmDataSet
 * ManagementPlan6.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
 * TerminalManagementAction.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTrigger
 * TerminalManagementAction.mmTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmAdditionalProcess
 * TerminalManagementAction.mmAdditionalProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionResult
 * TerminalManagementAction.mmActionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionToProcess
 * TerminalManagementAction.mmActionToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTerminalManagementSystem
 * TerminalManagementAction.mmTerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected TerminalManagementActionCode type;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmType
	 * TMSAction1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmType
	 * TMSAction2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification1#mmActionType
	 * TMSActionIdentification1.mmActionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification2#mmActionType
	 * TMSActionIdentification2.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmType
	 * TMSAction3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification3#mmActionType
	 * TMSActionIdentification3.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmType
	 * TMSAction4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4#mmActionType
	 * TMSActionIdentification4.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmType
	 * TMSAction5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmType
	 * TMSAction6.mmType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TMSAction1.mmType, TMSAction2.mmType, TMSActionIdentification1.mmActionType, TMSActionIdentification2.mmActionType, TMSAction3.mmType, TMSActionIdentification3.mmActionType,
					TMSAction4.mmType, TMSActionIdentification4.mmActionType, TMSAction5.mmType, TMSAction6.mmType);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Types of terminal management action to be performed by a point of interaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionCode.mmObject();
		}
	};
	protected TerminalManagementActionTriggerCode trigger;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmTrigger
	 * TMSAction1.mmTrigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmTrigger
	 * TMSAction2.mmTrigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmTrigger
	 * TMSAction3.mmTrigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmTrigger
	 * TMSAction4.mmTrigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmTrigger
	 * TMSAction5.mmTrigger}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmTrigger
	 * TMSAction6.mmTrigger}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTrigger = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TMSAction1.mmTrigger, TMSAction2.mmTrigger, TMSAction3.mmTrigger, TMSAction4.mmTrigger, TMSAction5.mmTrigger, TMSAction6.mmTrigger);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Event to start the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
		}
	};
	protected TerminalManagementAdditionalProcessCode additionalProcess;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction1#mmAdditionalProcess
	 * TMSAction1.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction2#mmAdditionalProcess
	 * TMSAction2.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmAdditionalProcess
	 * TMSAction3.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmAdditionalProcess
	 * TMSAction4.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmAdditionalProcess
	 * TMSAction5.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmAdditionalProcess
	 * TMSAction6.mmAdditionalProcess}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAdditionalProcess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TMSAction1.mmAdditionalProcess, TMSAction2.mmAdditionalProcess, TMSAction3.mmAdditionalProcess, TMSAction4.mmAdditionalProcess, TMSAction5.mmAdditionalProcess,
					TMSAction6.mmAdditionalProcess);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
		}
	};
	protected TerminalManagementActionResultCode actionResult;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction1#mmActionResult
	 * ErrorAction1.mmActionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction2#mmActionResult
	 * ErrorAction2.mmActionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent1#mmResult
	 * TMSEvent1.mmResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent2#mmResult
	 * TMSEvent2.mmResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent3#mmResult
	 * TMSEvent3.mmResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand5#mmResult
	 * ATMCommand5.mmResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent4#mmResult
	 * TMSEvent4.mmResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand8#mmResult
	 * ATMCommand8.mmResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction3#mmActionResult
	 * ErrorAction3.mmActionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent5#mmResult
	 * TMSEvent5.mmResult}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmActionResult = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ErrorAction1.mmActionResult, ErrorAction2.mmActionResult, TMSEvent1.mmResult, TMSEvent2.mmResult, TMSEvent3.mmResult, ATMCommand5.mmResult, TMSEvent4.mmResult, ATMCommand8.mmResult,
					ErrorAction3.mmActionResult, TMSEvent5.mmResult);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionResult";
			definition = "List of action result codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResultCode.mmObject();
		}
	};
	protected TerminalManagementErrorActionCode actionToProcess;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction1#mmActionToProcess
	 * ErrorAction1.mmActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction2#mmActionToProcess
	 * ErrorAction2.mmActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction3#mmActionToProcess
	 * ErrorAction3.mmActionToProcess}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmActionToProcess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ErrorAction1.mmActionToProcess, ErrorAction2.mmActionToProcess, ErrorAction3.mmActionToProcess);
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorActionCode.mmObject();
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * Terminal management system from which an action took place
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAction
	 * TerminalManagementSystem.mmAction}</li>
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
	public static final MMBusinessAssociationEnd mmTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system from which an action took place";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction";
				definition = "Terminal management action to be performed by the point of interaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.mmAction);
				derivationElement_lazy = () -> Arrays.asList(TMSAction1.mmErrorAction, ManagementPlan1.mmDataSet, TMSAction2.mmErrorAction, ManagementPlan2.mmDataSet, ManagementPlan3.mmDataSet, TMSAction3.mmErrorAction,
						ManagementPlan4.mmDataSet, ManagementPlan5.mmDataSet, ManagementPlan6.mmDataSet);
				element_lazy = () -> Arrays.asList(TerminalManagementAction.mmType, TerminalManagementAction.mmTrigger, TerminalManagementAction.mmAdditionalProcess, TerminalManagementAction.mmActionResult,
						TerminalManagementAction.mmActionToProcess, TerminalManagementAction.mmTerminalManagementSystem);
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

	public TerminalManagementActionCode getType() {
		return type;
	}

	public void setType(TerminalManagementActionCode type) {
		this.type = type;
	}

	public TerminalManagementActionTriggerCode getTrigger() {
		return trigger;
	}

	public void setTrigger(TerminalManagementActionTriggerCode trigger) {
		this.trigger = trigger;
	}

	public TerminalManagementAdditionalProcessCode getAdditionalProcess() {
		return additionalProcess;
	}

	public void setAdditionalProcess(TerminalManagementAdditionalProcessCode additionalProcess) {
		this.additionalProcess = additionalProcess;
	}

	public TerminalManagementActionResultCode getActionResult() {
		return actionResult;
	}

	public void setActionResult(TerminalManagementActionResultCode actionResult) {
		this.actionResult = actionResult;
	}

	public TerminalManagementErrorActionCode getActionToProcess() {
		return actionToProcess;
	}

	public void setActionToProcess(TerminalManagementErrorActionCode actionToProcess) {
		this.actionToProcess = actionToProcess;
	}

	public TerminalManagementSystem getTerminalManagementSystem() {
		return terminalManagementSystem;
	}

	public void setTerminalManagementSystem(com.tools20022.repository.entity.TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
	}
}