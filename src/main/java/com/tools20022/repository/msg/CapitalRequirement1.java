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
import com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report of the breakdown of the components for the capital requirement for
 * central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1#mmWindingDownOrRestructuringRisk
 * CapitalRequirement1.mmWindingDownOrRestructuringRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1#mmOperationalAndLegalRisk
 * CapitalRequirement1.mmOperationalAndLegalRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1#mmCreditRisk
 * CapitalRequirement1.mmCreditRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1#mmCounterPartyRisk
 * CapitalRequirement1.mmCounterPartyRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1#mmMarketRisk
 * CapitalRequirement1.mmMarketRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1#mmBusinessRisk
 * CapitalRequirement1.mmBusinessRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1#mmNotificationBuffer
 * CapitalRequirement1.mmNotificationBuffer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmCapitalRequirements
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmCapitalRequirements}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CapitalRequirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Report of the breakdown of the components for the capital requirement for central counterparty."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CapitalRequirement1", propOrder = {"windingDownOrRestructuringRisk", "operationalAndLegalRisk", "creditRisk", "counterPartyRisk", "marketRisk", "businessRisk", "notificationBuffer"})
public class CapitalRequirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "WndgDwnOrRstrgRsk", required = true)
	protected ActiveCurrencyAndAmount windingDownOrRestructuringRisk;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WndgDwnOrRstrgRsk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WindingDownOrRestructuringRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the capital necessary to cover the winding down or restructuring of activities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount> mmWindingDownOrRestructuringRisk = new MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CapitalRequirement1.mmObject();
			isDerived = false;
			xmlTag = "WndgDwnOrRstrgRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WindingDownOrRestructuringRisk";
			definition = "Indicates the capital necessary to cover the winding down or restructuring of activities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CapitalRequirement1 obj) {
			return obj.getWindingDownOrRestructuringRisk();
		}

		@Override
		public void setValue(CapitalRequirement1 obj, ActiveCurrencyAndAmount value) {
			obj.setWindingDownOrRestructuringRisk(value);
		}
	};
	@XmlElement(name = "OprlAndLglRsk", required = true)
	protected ActiveCurrencyAndAmount operationalAndLegalRisk;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlAndLglRsk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalAndLegalRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the capital necessary to cover the overall operational and legal risks.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount> mmOperationalAndLegalRisk = new MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CapitalRequirement1.mmObject();
			isDerived = false;
			xmlTag = "OprlAndLglRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalAndLegalRisk";
			definition = "Indicates the capital necessary to cover the overall operational and legal risks.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CapitalRequirement1 obj) {
			return obj.getOperationalAndLegalRisk();
		}

		@Override
		public void setValue(CapitalRequirement1 obj, ActiveCurrencyAndAmount value) {
			obj.setOperationalAndLegalRisk(value);
		}
	};
	@XmlElement(name = "CdtRsk", required = true)
	protected ActiveCurrencyAndAmount creditRisk;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtRsk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the capital necessary to cover credit risks not already covered by other financial resources, such as risks stemming from clearing activity.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount> mmCreditRisk = new MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CapitalRequirement1.mmObject();
			isDerived = false;
			xmlTag = "CdtRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditRisk";
			definition = "Indicates the capital necessary to cover credit risks not already covered by other financial resources, such as risks stemming from clearing activity.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CapitalRequirement1 obj) {
			return obj.getCreditRisk();
		}

		@Override
		public void setValue(CapitalRequirement1 obj, ActiveCurrencyAndAmount value) {
			obj.setCreditRisk(value);
		}
	};
	@XmlElement(name = "CntrPtyRsk", required = true)
	protected ActiveCurrencyAndAmount counterPartyRisk;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrPtyRsk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterPartyRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the capital necessary to cover counterparty credit risks not already covered by other financial resources, such as risks stemming from clearing activity.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount> mmCounterPartyRisk = new MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CapitalRequirement1.mmObject();
			isDerived = false;
			xmlTag = "CntrPtyRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterPartyRisk";
			definition = "Indicates the capital necessary to cover counterparty credit risks not already covered by other financial resources, such as risks stemming from clearing activity.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CapitalRequirement1 obj) {
			return obj.getCounterPartyRisk();
		}

		@Override
		public void setValue(CapitalRequirement1 obj, ActiveCurrencyAndAmount value) {
			obj.setCounterPartyRisk(value);
		}
	};
	@XmlElement(name = "MktRsk", required = true)
	protected ActiveCurrencyAndAmount marketRisk;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktRsk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the capital necessary to cover counterparty market risks not already covered by other financial resources, such as risks stemming from clearing activity.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount> mmMarketRisk = new MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CapitalRequirement1.mmObject();
			isDerived = false;
			xmlTag = "MktRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketRisk";
			definition = "Indicates the capital necessary to cover counterparty market risks not already covered by other financial resources, such as risks stemming from clearing activity.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CapitalRequirement1 obj) {
			return obj.getMarketRisk();
		}

		@Override
		public void setValue(CapitalRequirement1 obj, ActiveCurrencyAndAmount value) {
			obj.setMarketRisk(value);
		}
	};
	@XmlElement(name = "BizRsk", required = true)
	protected ActiveCurrencyAndAmount businessRisk;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizRsk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the capital necessary to cover business risk.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount> mmBusinessRisk = new MMMessageAttribute<CapitalRequirement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CapitalRequirement1.mmObject();
			isDerived = false;
			xmlTag = "BizRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessRisk";
			definition = "Indicates the capital necessary to cover business risk.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CapitalRequirement1 obj) {
			return obj.getBusinessRisk();
		}

		@Override
		public void setValue(CapitalRequirement1 obj, ActiveCurrencyAndAmount value) {
			obj.setBusinessRisk(value);
		}
	};
	@XmlElement(name = "NtfctnBffr")
	protected BaseOneRate notificationBuffer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnBffr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationBuffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the percentage above 100 percent of the CCP’s required capital requiring notification to the CCP’s National Competent Authority threshold.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CapitalRequirement1, Optional<BaseOneRate>> mmNotificationBuffer = new MMMessageAttribute<CapitalRequirement1, Optional<BaseOneRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CapitalRequirement1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnBffr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationBuffer";
			definition = "Indicates the percentage above 100 percent of the CCP’s required capital requiring notification to the CCP’s National Competent Authority threshold.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(CapitalRequirement1 obj) {
			return obj.getNotificationBuffer();
		}

		@Override
		public void setValue(CapitalRequirement1 obj, Optional<BaseOneRate> value) {
			obj.setNotificationBuffer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CapitalRequirement1.mmWindingDownOrRestructuringRisk, com.tools20022.repository.msg.CapitalRequirement1.mmOperationalAndLegalRisk,
						com.tools20022.repository.msg.CapitalRequirement1.mmCreditRisk, com.tools20022.repository.msg.CapitalRequirement1.mmCounterPartyRisk, com.tools20022.repository.msg.CapitalRequirement1.mmMarketRisk,
						com.tools20022.repository.msg.CapitalRequirement1.mmBusinessRisk, com.tools20022.repository.msg.CapitalRequirement1.mmNotificationBuffer);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPIncomeStatementAndCapitalAdequacyReportV01.mmCapitalRequirements);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CapitalRequirement1";
				definition = "Report of the breakdown of the components for the capital requirement for central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getWindingDownOrRestructuringRisk() {
		return windingDownOrRestructuringRisk;
	}

	public CapitalRequirement1 setWindingDownOrRestructuringRisk(ActiveCurrencyAndAmount windingDownOrRestructuringRisk) {
		this.windingDownOrRestructuringRisk = Objects.requireNonNull(windingDownOrRestructuringRisk);
		return this;
	}

	public ActiveCurrencyAndAmount getOperationalAndLegalRisk() {
		return operationalAndLegalRisk;
	}

	public CapitalRequirement1 setOperationalAndLegalRisk(ActiveCurrencyAndAmount operationalAndLegalRisk) {
		this.operationalAndLegalRisk = Objects.requireNonNull(operationalAndLegalRisk);
		return this;
	}

	public ActiveCurrencyAndAmount getCreditRisk() {
		return creditRisk;
	}

	public CapitalRequirement1 setCreditRisk(ActiveCurrencyAndAmount creditRisk) {
		this.creditRisk = Objects.requireNonNull(creditRisk);
		return this;
	}

	public ActiveCurrencyAndAmount getCounterPartyRisk() {
		return counterPartyRisk;
	}

	public CapitalRequirement1 setCounterPartyRisk(ActiveCurrencyAndAmount counterPartyRisk) {
		this.counterPartyRisk = Objects.requireNonNull(counterPartyRisk);
		return this;
	}

	public ActiveCurrencyAndAmount getMarketRisk() {
		return marketRisk;
	}

	public CapitalRequirement1 setMarketRisk(ActiveCurrencyAndAmount marketRisk) {
		this.marketRisk = Objects.requireNonNull(marketRisk);
		return this;
	}

	public ActiveCurrencyAndAmount getBusinessRisk() {
		return businessRisk;
	}

	public CapitalRequirement1 setBusinessRisk(ActiveCurrencyAndAmount businessRisk) {
		this.businessRisk = Objects.requireNonNull(businessRisk);
		return this;
	}

	public Optional<BaseOneRate> getNotificationBuffer() {
		return notificationBuffer == null ? Optional.empty() : Optional.of(notificationBuffer);
	}

	public CapitalRequirement1 setNotificationBuffer(BaseOneRate notificationBuffer) {
		this.notificationBuffer = notificationBuffer;
		return this;
	}
}