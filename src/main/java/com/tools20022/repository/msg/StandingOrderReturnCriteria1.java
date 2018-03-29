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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on standing orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmStandingOrderIdentificationIndicator
 * StandingOrderReturnCriteria1.mmStandingOrderIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmTypeIndicator
 * StandingOrderReturnCriteria1.mmTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmSystemMemberIndicator
 * StandingOrderReturnCriteria1.mmSystemMemberIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmResponsiblePartyIndicator
 * StandingOrderReturnCriteria1.mmResponsiblePartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmCurrencyIndicator
 * StandingOrderReturnCriteria1.mmCurrencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmDebtorAccountIndicator
 * StandingOrderReturnCriteria1.mmDebtorAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmCreditorAccountIndicator
 * StandingOrderReturnCriteria1.mmCreditorAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmAssociatedPoolAccount
 * StandingOrderReturnCriteria1.mmAssociatedPoolAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmFrequencyIndicator
 * StandingOrderReturnCriteria1.mmFrequencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmExecutionTypeIndicator
 * StandingOrderReturnCriteria1.mmExecutionTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmValidityFromIndicator
 * StandingOrderReturnCriteria1.mmValidityFromIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmValidToIndicator
 * StandingOrderReturnCriteria1.mmValidToIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmLinkSetIdentificationIndicator
 * StandingOrderReturnCriteria1.mmLinkSetIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmLinkSetOrderIdentificationIndicator
 * StandingOrderReturnCriteria1.mmLinkSetOrderIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmLinkSetOrderSequenceIndicator
 * StandingOrderReturnCriteria1.mmLinkSetOrderSequenceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmTotalAmountIndicator
 * StandingOrderReturnCriteria1.mmTotalAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmZeroSweepIndicator
 * StandingOrderReturnCriteria1.mmZeroSweepIndicator}</li>
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
 * "StandingOrderReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on standing orders."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrderReturnCriteria1", propOrder = {"standingOrderIdentificationIndicator", "typeIndicator", "systemMemberIndicator", "responsiblePartyIndicator", "currencyIndicator", "debtorAccountIndicator",
		"creditorAccountIndicator", "associatedPoolAccount", "frequencyIndicator", "executionTypeIndicator", "validityFromIndicator", "validToIndicator", "linkSetIdentificationIndicator", "linkSetOrderIdentificationIndicator",
		"linkSetOrderSequenceIndicator", "totalAmountIndicator", "zeroSweepIndicator"})
public class StandingOrderReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StgOrdrIdInd")
	protected RequestedIndicator standingOrderIdentificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria used to report on a multilateral balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmStandingOrderIdentificationIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrIdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIdentificationIndicator";
			definition = "Defines the criteria used to report on a multilateral balance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getStandingOrderIdentificationIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setStandingOrderIdentificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TpInd")
	protected RequestedIndicator typeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the standing order type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmTypeIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the standing order type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getTypeIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SysMmbInd")
	protected RequestedIndicator systemMemberIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysMmbInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMemberIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the system member identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmSystemMemberIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SysMmbInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMemberIndicator";
			definition = "Indicates whether the system member identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getSystemMemberIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setSystemMemberIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnsblPtyInd")
	protected RequestedIndicator responsiblePartyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsiblePartyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the responsible party identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmResponsiblePartyIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsiblePartyIndicator";
			definition = "Indicates whether the responsible party identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getResponsiblePartyIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setResponsiblePartyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyInd")
	protected RequestedIndicator currencyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account currency is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmCurrencyIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CcyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyIndicator";
			definition = "Indicates whether the account currency is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getCurrencyIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setCurrencyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAcctInd")
	protected RequestedIndicator debtorAccountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmDebtorAccountIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccountIndicator";
			definition = "Indicates whether the account type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getDebtorAccountIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setDebtorAccountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAcctInd")
	protected RequestedIndicator creditorAccountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the multilateral limit is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmCreditorAccountIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccountIndicator";
			definition = "Indicates whether the multilateral limit is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getCreditorAccountIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setCreditorAccountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AssoctdPoolAcct")
	protected RequestedIndicator associatedPoolAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdPoolAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedPoolAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the associated pool account is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmAssociatedPoolAccount = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdPoolAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedPoolAccount";
			definition = "Indicates whether the associated pool account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getAssociatedPoolAccount();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setAssociatedPoolAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "FrqcyInd")
	protected RequestedIndicator frequencyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrqcyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrequencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the frequency is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmFrequencyIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FrqcyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyIndicator";
			definition = "Indicates whether the frequency is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getFrequencyIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setFrequencyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnTpInd")
	protected RequestedIndicator executionTypeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the execution type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmExecutionTypeIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ExctnTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionTypeIndicator";
			definition = "Indicates whether the execution type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getExecutionTypeIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setExecutionTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtyFrInd")
	protected RequestedIndicator validityFromIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyFrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityFromIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account standing order is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmValidityFromIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "VldtyFrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityFromIndicator";
			definition = "Indicates whether the account standing order is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getValidityFromIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setValidityFromIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "VldToInd")
	protected RequestedIndicator validToIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldToInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidToIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account owner information is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmValidToIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "VldToInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidToIndicator";
			definition = "Indicates whether the account owner information is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getValidToIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setValidToIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LkSetIdInd")
	protected RequestedIndicator linkSetIdentificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the link set identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmLinkSetIdentificationIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LkSetIdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetIdentificationIndicator";
			definition = "Indicates whether the link set identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getLinkSetIdentificationIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setLinkSetIdentificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LkSetOrdrIdInd")
	protected RequestedIndicator linkSetOrderIdentificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetOrdrIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetOrderIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the identification of a standing order within a link set is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmLinkSetOrderIdentificationIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LkSetOrdrIdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetOrderIdentificationIndicator";
			definition = "Indicates whether the identification of a standing order within a link set is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getLinkSetOrderIdentificationIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setLinkSetOrderIdentificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LkSetOrdrSeqInd")
	protected RequestedIndicator linkSetOrderSequenceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetOrdrSeqInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetOrderSequenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the sequence of a standing order within a link set is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmLinkSetOrderSequenceIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LkSetOrdrSeqInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetOrderSequenceIndicator";
			definition = "Indicates whether the sequence of a standing order within a link set is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getLinkSetOrderSequenceIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setLinkSetOrderSequenceIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAmtInd")
	protected RequestedIndicator totalAmountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the total amount per standing order type is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmTotalAmountIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountIndicator";
			definition = "Indicates whether the total amount per standing order type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getTotalAmountIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setTotalAmountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ZeroSweepInd")
	protected RequestedIndicator zeroSweepIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ZeroSweepInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroSweepIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the zero sweeping indicator is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>> mmZeroSweepIndicator = new MMMessageAttribute<StandingOrderReturnCriteria1, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ZeroSweepInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the zero sweeping indicator is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(StandingOrderReturnCriteria1 obj) {
			return obj.getZeroSweepIndicator();
		}

		@Override
		public void setValue(StandingOrderReturnCriteria1 obj, Optional<RequestedIndicator> value) {
			obj.setZeroSweepIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmStandingOrderIdentificationIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmTypeIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmSystemMemberIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmResponsiblePartyIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmCurrencyIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmDebtorAccountIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmCreditorAccountIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmAssociatedPoolAccount,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmFrequencyIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmExecutionTypeIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmValidityFromIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmValidToIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmLinkSetIdentificationIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmLinkSetOrderIdentificationIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmLinkSetOrderSequenceIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmTotalAmountIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmZeroSweepIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrderReturnCriteria1";
				definition = "Defines the criteria used to report on standing orders.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getStandingOrderIdentificationIndicator() {
		return standingOrderIdentificationIndicator == null ? Optional.empty() : Optional.of(standingOrderIdentificationIndicator);
	}

	public StandingOrderReturnCriteria1 setStandingOrderIdentificationIndicator(RequestedIndicator standingOrderIdentificationIndicator) {
		this.standingOrderIdentificationIndicator = standingOrderIdentificationIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getTypeIndicator() {
		return typeIndicator == null ? Optional.empty() : Optional.of(typeIndicator);
	}

	public StandingOrderReturnCriteria1 setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = typeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getSystemMemberIndicator() {
		return systemMemberIndicator == null ? Optional.empty() : Optional.of(systemMemberIndicator);
	}

	public StandingOrderReturnCriteria1 setSystemMemberIndicator(RequestedIndicator systemMemberIndicator) {
		this.systemMemberIndicator = systemMemberIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getResponsiblePartyIndicator() {
		return responsiblePartyIndicator == null ? Optional.empty() : Optional.of(responsiblePartyIndicator);
	}

	public StandingOrderReturnCriteria1 setResponsiblePartyIndicator(RequestedIndicator responsiblePartyIndicator) {
		this.responsiblePartyIndicator = responsiblePartyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCurrencyIndicator() {
		return currencyIndicator == null ? Optional.empty() : Optional.of(currencyIndicator);
	}

	public StandingOrderReturnCriteria1 setCurrencyIndicator(RequestedIndicator currencyIndicator) {
		this.currencyIndicator = currencyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getDebtorAccountIndicator() {
		return debtorAccountIndicator == null ? Optional.empty() : Optional.of(debtorAccountIndicator);
	}

	public StandingOrderReturnCriteria1 setDebtorAccountIndicator(RequestedIndicator debtorAccountIndicator) {
		this.debtorAccountIndicator = debtorAccountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCreditorAccountIndicator() {
		return creditorAccountIndicator == null ? Optional.empty() : Optional.of(creditorAccountIndicator);
	}

	public StandingOrderReturnCriteria1 setCreditorAccountIndicator(RequestedIndicator creditorAccountIndicator) {
		this.creditorAccountIndicator = creditorAccountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAssociatedPoolAccount() {
		return associatedPoolAccount == null ? Optional.empty() : Optional.of(associatedPoolAccount);
	}

	public StandingOrderReturnCriteria1 setAssociatedPoolAccount(RequestedIndicator associatedPoolAccount) {
		this.associatedPoolAccount = associatedPoolAccount;
		return this;
	}

	public Optional<RequestedIndicator> getFrequencyIndicator() {
		return frequencyIndicator == null ? Optional.empty() : Optional.of(frequencyIndicator);
	}

	public StandingOrderReturnCriteria1 setFrequencyIndicator(RequestedIndicator frequencyIndicator) {
		this.frequencyIndicator = frequencyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getExecutionTypeIndicator() {
		return executionTypeIndicator == null ? Optional.empty() : Optional.of(executionTypeIndicator);
	}

	public StandingOrderReturnCriteria1 setExecutionTypeIndicator(RequestedIndicator executionTypeIndicator) {
		this.executionTypeIndicator = executionTypeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getValidityFromIndicator() {
		return validityFromIndicator == null ? Optional.empty() : Optional.of(validityFromIndicator);
	}

	public StandingOrderReturnCriteria1 setValidityFromIndicator(RequestedIndicator validityFromIndicator) {
		this.validityFromIndicator = validityFromIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getValidToIndicator() {
		return validToIndicator == null ? Optional.empty() : Optional.of(validToIndicator);
	}

	public StandingOrderReturnCriteria1 setValidToIndicator(RequestedIndicator validToIndicator) {
		this.validToIndicator = validToIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getLinkSetIdentificationIndicator() {
		return linkSetIdentificationIndicator == null ? Optional.empty() : Optional.of(linkSetIdentificationIndicator);
	}

	public StandingOrderReturnCriteria1 setLinkSetIdentificationIndicator(RequestedIndicator linkSetIdentificationIndicator) {
		this.linkSetIdentificationIndicator = linkSetIdentificationIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getLinkSetOrderIdentificationIndicator() {
		return linkSetOrderIdentificationIndicator == null ? Optional.empty() : Optional.of(linkSetOrderIdentificationIndicator);
	}

	public StandingOrderReturnCriteria1 setLinkSetOrderIdentificationIndicator(RequestedIndicator linkSetOrderIdentificationIndicator) {
		this.linkSetOrderIdentificationIndicator = linkSetOrderIdentificationIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getLinkSetOrderSequenceIndicator() {
		return linkSetOrderSequenceIndicator == null ? Optional.empty() : Optional.of(linkSetOrderSequenceIndicator);
	}

	public StandingOrderReturnCriteria1 setLinkSetOrderSequenceIndicator(RequestedIndicator linkSetOrderSequenceIndicator) {
		this.linkSetOrderSequenceIndicator = linkSetOrderSequenceIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getTotalAmountIndicator() {
		return totalAmountIndicator == null ? Optional.empty() : Optional.of(totalAmountIndicator);
	}

	public StandingOrderReturnCriteria1 setTotalAmountIndicator(RequestedIndicator totalAmountIndicator) {
		this.totalAmountIndicator = totalAmountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getZeroSweepIndicator() {
		return zeroSweepIndicator == null ? Optional.empty() : Optional.of(zeroSweepIndicator);
	}

	public StandingOrderReturnCriteria1 setZeroSweepIndicator(RequestedIndicator zeroSweepIndicator) {
		this.zeroSweepIndicator = zeroSweepIndicator;
		return this;
	}
}