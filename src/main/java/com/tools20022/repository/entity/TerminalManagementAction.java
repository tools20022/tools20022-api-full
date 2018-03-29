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
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan7#mmDataSet
 * ManagementPlan7.mmDataSet}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan7
 * ManagementPlan7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction4 ErrorAction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7 TMSAction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet24
 * TerminalManagementDataSet24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent7
 * ManagementPlanContent7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSActionIdentification5
 * TMSActionIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent6 TMSEvent6}</li>
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
	protected TerminalManagementActionCode type;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmType
	 * TMSAction7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification5#mmActionType
	 * TMSActionIdentification5.mmActionType}</li>
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
	public static final MMBusinessAttribute<TerminalManagementAction, TerminalManagementActionCode> mmType = new MMBusinessAttribute<TerminalManagementAction, TerminalManagementActionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TMSAction1.mmType, TMSAction2.mmType, TMSActionIdentification1.mmActionType, TMSActionIdentification2.mmActionType, TMSAction3.mmType, TMSActionIdentification3.mmActionType,
					TMSAction4.mmType, TMSActionIdentification4.mmActionType, TMSAction5.mmType, TMSAction6.mmType, TMSAction7.mmType, TMSActionIdentification5.mmActionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Types of terminal management action to be performed by a point of interaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionCode.mmObject();
		}

		@Override
		public TerminalManagementActionCode getValue(TerminalManagementAction obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TerminalManagementAction obj, TerminalManagementActionCode value) {
			obj.setType(value);
		}
	};
	protected TerminalManagementActionTriggerCode trigger;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmTrigger
	 * TMSAction7.mmTrigger}</li>
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
	public static final MMBusinessAttribute<TerminalManagementAction, TerminalManagementActionTriggerCode> mmTrigger = new MMBusinessAttribute<TerminalManagementAction, TerminalManagementActionTriggerCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TMSAction1.mmTrigger, TMSAction2.mmTrigger, TMSAction3.mmTrigger, TMSAction4.mmTrigger, TMSAction5.mmTrigger, TMSAction6.mmTrigger, TMSAction7.mmTrigger);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Event to start the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
		}

		@Override
		public TerminalManagementActionTriggerCode getValue(TerminalManagementAction obj) {
			return obj.getTrigger();
		}

		@Override
		public void setValue(TerminalManagementAction obj, TerminalManagementActionTriggerCode value) {
			obj.setTrigger(value);
		}
	};
	protected TerminalManagementAdditionalProcessCode additionalProcess;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmAdditionalProcess
	 * TMSAction7.mmAdditionalProcess}</li>
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
	public static final MMBusinessAttribute<TerminalManagementAction, TerminalManagementAdditionalProcessCode> mmAdditionalProcess = new MMBusinessAttribute<TerminalManagementAction, TerminalManagementAdditionalProcessCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TMSAction1.mmAdditionalProcess, TMSAction2.mmAdditionalProcess, TMSAction3.mmAdditionalProcess, TMSAction4.mmAdditionalProcess, TMSAction5.mmAdditionalProcess,
					TMSAction6.mmAdditionalProcess, TMSAction7.mmAdditionalProcess);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
		}

		@Override
		public TerminalManagementAdditionalProcessCode getValue(TerminalManagementAction obj) {
			return obj.getAdditionalProcess();
		}

		@Override
		public void setValue(TerminalManagementAction obj, TerminalManagementAdditionalProcessCode value) {
			obj.setAdditionalProcess(value);
		}
	};
	protected TerminalManagementActionResultCode actionResult;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction4#mmActionResult
	 * ErrorAction4.mmActionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent6#mmResult
	 * TMSEvent6.mmResult}</li>
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
	public static final MMBusinessAttribute<TerminalManagementAction, TerminalManagementActionResultCode> mmActionResult = new MMBusinessAttribute<TerminalManagementAction, TerminalManagementActionResultCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ErrorAction1.mmActionResult, ErrorAction2.mmActionResult, TMSEvent1.mmResult, TMSEvent2.mmResult, TMSEvent3.mmResult, ATMCommand5.mmResult, TMSEvent4.mmResult, ATMCommand8.mmResult,
					ErrorAction3.mmActionResult, TMSEvent5.mmResult, ErrorAction4.mmActionResult, TMSEvent6.mmResult);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionResult";
			definition = "List of action result codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResultCode.mmObject();
		}

		@Override
		public TerminalManagementActionResultCode getValue(TerminalManagementAction obj) {
			return obj.getActionResult();
		}

		@Override
		public void setValue(TerminalManagementAction obj, TerminalManagementActionResultCode value) {
			obj.setActionResult(value);
		}
	};
	protected TerminalManagementErrorActionCode actionToProcess;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ErrorAction1#mmActionToProcess
	 * ErrorAction1.mmActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction2#mmActionToProcess
	 * ErrorAction2.mmActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction3#mmActionToProcess
	 * ErrorAction3.mmActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction4#mmActionToProcess
	 * ErrorAction4.mmActionToProcess}</li>
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
	public static final MMBusinessAttribute<TerminalManagementAction, TerminalManagementErrorActionCode> mmActionToProcess = new MMBusinessAttribute<TerminalManagementAction, TerminalManagementErrorActionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ErrorAction1.mmActionToProcess, ErrorAction2.mmActionToProcess, ErrorAction3.mmActionToProcess, ErrorAction4.mmActionToProcess);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorActionCode.mmObject();
		}

		@Override
		public TerminalManagementErrorActionCode getValue(TerminalManagementAction obj) {
			return obj.getActionToProcess();
		}

		@Override
		public void setValue(TerminalManagementAction obj, TerminalManagementErrorActionCode value) {
			obj.setActionToProcess(value);
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<TerminalManagementAction, Optional<TerminalManagementSystem>> mmTerminalManagementSystem = new MMBusinessAssociationEnd<TerminalManagementAction, Optional<TerminalManagementSystem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system from which an action took place";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TerminalManagementSystem.mmAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TerminalManagementSystem.mmObject();
		}

		@Override
		public Optional<TerminalManagementSystem> getValue(TerminalManagementAction obj) {
			return obj.getTerminalManagementSystem();
		}

		@Override
		public void setValue(TerminalManagementAction obj, Optional<TerminalManagementSystem> value) {
			obj.setTerminalManagementSystem(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction";
				definition = "Terminal management action to be performed by the point of interaction.";
				associationDomain_lazy = () -> Arrays.asList(TerminalManagementSystem.mmAction);
				derivationElement_lazy = () -> Arrays.asList(TMSAction1.mmErrorAction, ManagementPlan1.mmDataSet, TMSAction2.mmErrorAction, ManagementPlan2.mmDataSet, ManagementPlan3.mmDataSet, TMSAction3.mmErrorAction,
						ManagementPlan4.mmDataSet, ManagementPlan5.mmDataSet, ManagementPlan6.mmDataSet, ManagementPlan7.mmDataSet);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementAction.mmType, com.tools20022.repository.entity.TerminalManagementAction.mmTrigger,
						com.tools20022.repository.entity.TerminalManagementAction.mmAdditionalProcess, com.tools20022.repository.entity.TerminalManagementAction.mmActionResult,
						com.tools20022.repository.entity.TerminalManagementAction.mmActionToProcess, com.tools20022.repository.entity.TerminalManagementAction.mmTerminalManagementSystem);
				derivationComponent_lazy = () -> Arrays.asList(ErrorAction1.mmObject(), TMSAction1.mmObject(), ManagementPlanContent1.mmObject(), ManagementPlan1.mmObject(), ErrorAction2.mmObject(), TMSAction2.mmObject(),
						ManagementPlanContent2.mmObject(), TerminalManagementDataSet5.mmObject(), ManagementPlan2.mmObject(), TMSActionIdentification1.mmObject(), TMSEvent1.mmObject(), TMSActionIdentification2.mmObject(),
						TMSEvent2.mmObject(), ManagementPlan3.mmObject(), TMSAction3.mmObject(), ManagementPlanContent3.mmObject(), TerminalManagementDataSet10.mmObject(), ManagementPlan4.mmObject(), TerminalManagementDataSet15.mmObject(),
						ManagementPlanContent4.mmObject(), TMSEvent3.mmObject(), TMSActionIdentification3.mmObject(), TMSAction4.mmObject(), ManagementPlan5.mmObject(), TMSEvent4.mmObject(), TMSActionIdentification4.mmObject(),
						TMSAction5.mmObject(), TerminalManagementDataSet18.mmObject(), ManagementPlanContent5.mmObject(), ManagementPlan6.mmObject(), ErrorAction3.mmObject(), ManagementPlanContent6.mmObject(), TMSAction6.mmObject(),
						TMSEvent5.mmObject(), TerminalManagementDataSet22.mmObject(), ManagementPlan7.mmObject(), ErrorAction4.mmObject(), TMSAction7.mmObject(), TerminalManagementDataSet24.mmObject(), ManagementPlanContent7.mmObject(),
						TMSActionIdentification5.mmObject(), TMSEvent6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TerminalManagementAction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementActionCode getType() {
		return type;
	}

	public TerminalManagementAction setType(TerminalManagementActionCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public TerminalManagementActionTriggerCode getTrigger() {
		return trigger;
	}

	public TerminalManagementAction setTrigger(TerminalManagementActionTriggerCode trigger) {
		this.trigger = Objects.requireNonNull(trigger);
		return this;
	}

	public TerminalManagementAdditionalProcessCode getAdditionalProcess() {
		return additionalProcess;
	}

	public TerminalManagementAction setAdditionalProcess(TerminalManagementAdditionalProcessCode additionalProcess) {
		this.additionalProcess = Objects.requireNonNull(additionalProcess);
		return this;
	}

	public TerminalManagementActionResultCode getActionResult() {
		return actionResult;
	}

	public TerminalManagementAction setActionResult(TerminalManagementActionResultCode actionResult) {
		this.actionResult = Objects.requireNonNull(actionResult);
		return this;
	}

	public TerminalManagementErrorActionCode getActionToProcess() {
		return actionToProcess;
	}

	public TerminalManagementAction setActionToProcess(TerminalManagementErrorActionCode actionToProcess) {
		this.actionToProcess = Objects.requireNonNull(actionToProcess);
		return this;
	}

	public Optional<TerminalManagementSystem> getTerminalManagementSystem() {
		return terminalManagementSystem == null ? Optional.empty() : Optional.of(terminalManagementSystem);
	}

	public TerminalManagementAction setTerminalManagementSystem(TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
		return this;
	}
}