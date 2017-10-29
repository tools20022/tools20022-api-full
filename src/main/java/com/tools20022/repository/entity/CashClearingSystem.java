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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CashClearingSystemCode;
import com.tools20022.repository.codeset.CashSettlementSystemCode;
import com.tools20022.repository.codeset.CashSystemTypeCode;
import com.tools20022.repository.entity.ClearingSystem;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Clearing system that processes only cash transfers.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashClearingSystem" src="doc-files/CashClearingSystem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#Identification
 * CashClearingSystem.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#TransactionAdministrator
 * CashClearingSystem.TransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#SystemRole
 * CashClearingSystem.SystemRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashClearingSystem#Type
 * CashClearingSystem.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#CashSettlementSystem
 * CashClearingSystem.CashSettlementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CashClearingSystem
 * TransactionAdministrator.CashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#System
 * SettlementInstructionSystemRole.System}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice#MarketInfrastructureIdentification
 * SystemIdentification2Choice.MarketInfrastructureIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemMember2#SystemIdentification
 * SystemMember2.SystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#ClearingSystem
 * SettlementInformation3.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#ClearingSystem
 * SettlementInformation1.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#ClearingSystem
 * SettlementInformation13.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation2#ClearingSystem
 * SettlementInformation2.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation14#ClearingSystem
 * SettlementInformation14.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#ClearingSystem
 * SettlementInformation16.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#PaymentScheme
 * RequestedModification.PaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation10#ClearingSystem
 * SettlementInformation10.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#ClearingSystem
 * SettlementInformation6.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation11#ClearingSystem
 * SettlementInformation11.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation12#ClearingSystem
 * SettlementInformation12.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#ClearingSystem
 * SettlementInformation8.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#ClearingSystem
 * SettlementInformation9.ClearingSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ClearingSystem
 * ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.SystemIdentificationChoice
 * SystemIdentificationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice
 * ClearingSystemIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice
 * ClearingSystemIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SystemIdentification2Choice
 * SystemIdentification2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice
 * ClearingSystemIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashSettlementSystem1Choice
 * CashSettlementSystem1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashSettlementSystem2Choice
 * CashSettlementSystem2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashSettlementSystem4Choice
 * CashSettlementSystem4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashSettlementSystem5Choice
 * CashSettlementSystem5Choice}</li>
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
 * "CashClearingSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Clearing system that processes only cash transfers."</li>
 * </ul>
 */
public class CashClearingSystem extends ClearingSystem {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Information used to identify a cash clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice#ClearingSystemIdentification
	 * SystemIdentificationChoice.ClearingSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice#ClearingSystemIdentification
	 * ClearingSystemIdentification1Choice.ClearingSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice#Proprietary
	 * ClearingSystemIdentification1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice#Code
	 * ClearingSystemIdentification3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice#Proprietary
	 * ClearingSystemIdentification3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice#Code
	 * ClearingSystemIdentification2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice#Proprietary
	 * ClearingSystemIdentification2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#ClearingSystemIdentification
	 * ClearingSystemMemberIdentification2.ClearingSystemIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information used to identify a cash clearing system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SystemIdentificationChoice.ClearingSystemIdentification, com.tools20022.repository.choice.ClearingSystemIdentification1Choice.ClearingSystemIdentification,
					com.tools20022.repository.choice.ClearingSystemIdentification1Choice.Proprietary, com.tools20022.repository.choice.ClearingSystemIdentification3Choice.Code,
					com.tools20022.repository.choice.ClearingSystemIdentification3Choice.Proprietary, com.tools20022.repository.choice.ClearingSystemIdentification2Choice.Code,
					com.tools20022.repository.choice.ClearingSystemIdentification2Choice.Proprietary, com.tools20022.repository.msg.ClearingSystemMemberIdentification2.ClearingSystemIdentification);
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Information used to identify a cash clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashClearingSystemCode.mmObject();
		}
	};
	/**
	 * Set of integrated applications that provides centralised services such as
	 * clearing and settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CashClearingSystem
	 * TransactionAdministrator.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of integrated applications that provides centralised services such as clearing and settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionAdministrator";
			definition = "Set of integrated applications that provides centralised services such as clearing and settlement.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.CashClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role played by the cash clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#System
	 * SettlementInstructionSystemRole.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
	 * SettlementInstructionSystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role played by the cash clearing system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystemRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemRole";
			definition = "Specifies the role played by the cash clearing system.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SettlementInstructionSystemRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementInstructionSystemRole.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the category of cash clearing system, eg, cheque clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashSystemTypeCode
	 * CashSystemTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem1Choice#Code
	 * CashSettlementSystem1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem1Choice#Proprietary
	 * CashSettlementSystem1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem2Choice#Code
	 * CashSettlementSystem2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem2Choice#Proprietary
	 * CashSettlementSystem2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem3Choice#Code
	 * CashSettlementSystem3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem3Choice#Proprietary
	 * CashSettlementSystem3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem4Choice#Code
	 * CashSettlementSystem4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem4Choice#Proprietary
	 * CashSettlementSystem4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem5Choice#Code
	 * CashSettlementSystem5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem5Choice#Proprietary
	 * CashSettlementSystem5Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, eg, cheque clearing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CashSettlementSystem1Choice.Code, com.tools20022.repository.choice.CashSettlementSystem1Choice.Proprietary,
					com.tools20022.repository.choice.CashSettlementSystem2Choice.Code, com.tools20022.repository.choice.CashSettlementSystem2Choice.Proprietary, com.tools20022.repository.choice.CashSettlementSystem3Choice.Code,
					com.tools20022.repository.choice.CashSettlementSystem3Choice.Proprietary, com.tools20022.repository.choice.CashSettlementSystem4Choice.Code, com.tools20022.repository.choice.CashSettlementSystem4Choice.Proprietary,
					com.tools20022.repository.choice.CashSettlementSystem5Choice.Code, com.tools20022.repository.choice.CashSettlementSystem5Choice.Proprietary);
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the category of cash clearing system, eg, cheque clearing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashSystemTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the cash settlement system used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemSearch2#SystemIdentification
	 * SystemSearch2.SystemIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the cash settlement system used."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashSettlementSystem = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemSearch2.SystemIdentification);
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementSystem";
			definition = "Specifies the cash settlement system used.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashSettlementSystemCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystem";
				definition = "Clearing system that processes only cash transfers.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionAdministrator.CashClearingSystem, com.tools20022.repository.entity.SettlementInstructionSystemRole.System);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SystemIdentification2Choice.MarketInfrastructureIdentification, com.tools20022.repository.msg.SystemMember2.SystemIdentification,
						com.tools20022.repository.msg.SettlementInformation3.ClearingSystem, com.tools20022.repository.msg.SettlementInformation1.ClearingSystem, com.tools20022.repository.msg.SettlementInformation13.ClearingSystem,
						com.tools20022.repository.msg.SettlementInformation2.ClearingSystem, com.tools20022.repository.msg.SettlementInformation14.ClearingSystem, com.tools20022.repository.msg.SettlementInformation16.ClearingSystem,
						com.tools20022.repository.msg.RequestedModification.PaymentScheme, com.tools20022.repository.msg.SettlementInformation10.ClearingSystem, com.tools20022.repository.msg.SettlementInformation6.ClearingSystem,
						com.tools20022.repository.msg.SettlementInformation11.ClearingSystem, com.tools20022.repository.msg.SettlementInformation12.ClearingSystem, com.tools20022.repository.msg.SettlementInformation8.ClearingSystem,
						com.tools20022.repository.msg.SettlementInformation9.ClearingSystem);
				superType_lazy = () -> ClearingSystem.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.Identification, com.tools20022.repository.entity.CashClearingSystem.TransactionAdministrator,
						com.tools20022.repository.entity.CashClearingSystem.SystemRole, com.tools20022.repository.entity.CashClearingSystem.Type, com.tools20022.repository.entity.CashClearingSystem.CashSettlementSystem);
				derivationComponent_lazy = () -> Arrays.asList(SystemIdentificationChoice.mmObject(), ClearingSystemIdentification1Choice.mmObject(), ClearingSystemIdentification3Choice.mmObject(), SystemIdentification2Choice.mmObject(),
						ClearingSystemIdentification2Choice.mmObject(), CashSettlementSystem1Choice.mmObject(), CashSettlementSystem2Choice.mmObject(), CashSettlementSystem4Choice.mmObject(), CashSettlementSystem5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}