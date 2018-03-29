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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.ClearingMemberRole;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification167;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Requirement for a clearing member to post collateral at a central
 * counterparty with respect to a default fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1#mmClearingMemberIdentification
 * DefaultFundRequirement1.mmClearingMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1#mmServiceIdentification
 * DefaultFundRequirement1.mmServiceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1#mmAmount
 * DefaultFundRequirement1.mmAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
 * ClearingMemberRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01#mmDefaultFundRequirement
 * CCPMemberRequirementsReportV01.mmDefaultFundRequirement}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DefaultFundRequirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Requirement for a clearing member to post collateral at a central counterparty with respect to a default fund."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DefaultFundRequirement1", propOrder = {"clearingMemberIdentification", "serviceIdentification", "amount"})
public class DefaultFundRequirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrMmbId", required = true)
	protected GenericIdentification167 clearingMemberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification167
	 * GenericIdentification167}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
	 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1
	 * DefaultFundRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmbId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the clearing member."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultFundRequirement1, GenericIdentification167> mmClearingMemberIdentification = new MMMessageAssociationEnd<DefaultFundRequirement1, GenericIdentification167>() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmClearingSystemMemberIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFundRequirement1.mmObject();
			isDerived = false;
			xmlTag = "ClrMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMemberIdentification";
			definition = "Identification of the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification167.mmObject();
		}

		@Override
		public GenericIdentification167 getValue(DefaultFundRequirement1 obj) {
			return obj.getClearingMemberIdentification();
		}

		@Override
		public void setValue(DefaultFundRequirement1 obj, GenericIdentification167 value) {
			obj.setClearingMemberIdentification(value);
		}
	};
	@XmlElement(name = "SvcId")
	protected Max35Text serviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1
	 * DefaultFundRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Central counterparty's identification of the service where default fund contributions are made at the service level.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DefaultFundRequirement1, Optional<Max35Text>> mmServiceIdentification = new MMMessageAttribute<DefaultFundRequirement1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFundRequirement1.mmObject();
			isDerived = false;
			xmlTag = "SvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceIdentification";
			definition = "Central counterparty's identification of the service where default fund contributions are made at the service level.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DefaultFundRequirement1 obj) {
			return obj.getServiceIdentification();
		}

		@Override
		public void setValue(DefaultFundRequirement1 obj, Optional<Max35Text> value) {
			obj.setServiceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1
	 * DefaultFundRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing member's pre-funded default fund requirement for the default fund at the central counterparty.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DefaultFundRequirement1, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<DefaultFundRequirement1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFundRequirement1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Clearing member's pre-funded default fund requirement for the default fund at the central counterparty.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(DefaultFundRequirement1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(DefaultFundRequirement1 obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DefaultFundRequirement1.mmClearingMemberIdentification, com.tools20022.repository.msg.DefaultFundRequirement1.mmServiceIdentification,
						com.tools20022.repository.msg.DefaultFundRequirement1.mmAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPMemberRequirementsReportV01.mmDefaultFundRequirement);
				trace_lazy = () -> ClearingMemberRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DefaultFundRequirement1";
				definition = "Requirement for a clearing member to post collateral at a central counterparty with respect to a default fund.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification167 getClearingMemberIdentification() {
		return clearingMemberIdentification;
	}

	public DefaultFundRequirement1 setClearingMemberIdentification(GenericIdentification167 clearingMemberIdentification) {
		this.clearingMemberIdentification = Objects.requireNonNull(clearingMemberIdentification);
		return this;
	}

	public Optional<Max35Text> getServiceIdentification() {
		return serviceIdentification == null ? Optional.empty() : Optional.of(serviceIdentification);
	}

	public DefaultFundRequirement1 setServiceIdentification(Max35Text serviceIdentification) {
		this.serviceIdentification = serviceIdentification;
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public DefaultFundRequirement1 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}
}