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
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.LimitStatus1Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Limit;
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
 * Details on the limits.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmAmount
 * Limit4.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmCreditDebitIndicator
 * Limit4.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmStatus
 * Limit4.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmStartDateTime
 * Limit4.mmStartDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmUsedAmount
 * Limit4.mmUsedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Limit4#mmUsedAmountCreditDebitIndicator
 * Limit4.mmUsedAmountCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmUsedPercentage
 * Limit4.mmUsedPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmRemainingAmount
 * Limit4.mmRemainingAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
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
 * "Limit4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details on the limits."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Limit7 Limit7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Limit4", propOrder = {"amount", "creditDebitIndicator", "status", "startDateTime", "usedAmount", "usedAmountCreditDebitIndicator", "usedPercentage", "remainingAmount"})
public class Limit4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected Amount2Choice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount2Choice Amount2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
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
	 * "Amount of money of the limit, expressed in an eligible currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmAmount
	 * Limit7.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Amount2Choice> mmAmount = new MMMessageAttribute<Limit4, Amount2Choice>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in an eligible currency.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Amount2Choice getValue(Limit4 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Limit4 obj, Amount2Choice value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCreditDebitIndicator
	 * Limit.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if a limit is a debit limit or a credit limit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit7#mmCreditDebitIndicator
	 * Limit7.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<Limit4, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmCreditDebitIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(Limit4 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Limit4 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected LimitStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LimitStatus1Code
	 * LimitStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmLimitStatus
	 * Limit.mmLimitStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the limit, such as enabled or disabled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmStatus
	 * Limit7.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Optional<LimitStatus1Code>> mmStatus = new MMMessageAttribute<Limit4, Optional<LimitStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmLimitStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the limit, such as enabled or disabled.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LimitStatus1Code.mmObject();
		}

		@Override
		public Optional<LimitStatus1Code> getValue(Limit4 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Limit4 obj, Optional<LimitStatus1Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "StartDtTm")
	protected DateAndDateTimeChoice startDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the limit becomes effective."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmStartDateTime
	 * Limit7.mmStartDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Optional<DateAndDateTimeChoice>> mmStartDateTime = new MMMessageAttribute<Limit4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "StartDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDateTime";
			definition = "Date and time at which the limit becomes effective.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmStartDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(Limit4 obj) {
			return obj.getStartDateTime();
		}

		@Override
		public void setValue(Limit4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setStartDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "UsdAmt")
	protected Amount2Choice usedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount2Choice Amount2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmUsedAmount
	 * Limit.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as an amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmUsedAmount
	 * Limit7.mmUsedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Optional<Amount2Choice>> mmUsedAmount = new MMMessageAttribute<Limit4, Optional<Amount2Choice>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmUsedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "UsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmUsedAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Optional<Amount2Choice> getValue(Limit4 obj) {
			return obj.getUsedAmount();
		}

		@Override
		public void setValue(Limit4 obj, Optional<Amount2Choice> value) {
			obj.setUsedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "UsdAmtCdtDbtInd")
	protected CreditDebitCode usedAmountCreditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCreditDebitIndicator
	 * Limit.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsdAmtCdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountCreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the used amount of the limit is a debit amount or a credit amount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit7#mmUsedAmountCreditDebitIndicator
	 * Limit7.mmUsedAmountCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Optional<CreditDebitCode>> mmUsedAmountCreditDebitIndicator = new MMMessageAttribute<Limit4, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "UsdAmtCdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountCreditDebitIndicator";
			definition = "Specifies if the used amount of the limit is a debit amount or a credit amount.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmUsedAmountCreditDebitIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(Limit4 obj) {
			return obj.getUsedAmountCreditDebitIndicator();
		}

		@Override
		public void setValue(Limit4 obj, Optional<CreditDebitCode> value) {
			obj.setUsedAmountCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "UsdPctg")
	protected PercentageRate usedPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmPercentage
	 * Limit.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsdPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as a percentage."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmUsedPercentage
	 * Limit7.mmUsedPercentage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Optional<PercentageRate>> mmUsedPercentage = new MMMessageAttribute<Limit4, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "UsdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmUsedPercentage);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Limit4 obj) {
			return obj.getUsedPercentage();
		}

		@Override
		public void setValue(Limit4 obj, Optional<PercentageRate> value) {
			obj.setUsedPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngAmt")
	protected Amount2Choice remainingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount2Choice Amount2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limit4
	 * Limit4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as an amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmRemainingAmount
	 * Limit7.mmRemainingAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Limit4, Optional<Amount2Choice>> mmRemainingAmount = new MMMessageAttribute<Limit4, Optional<Amount2Choice>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Limit4.mmObject();
			isDerived = false;
			xmlTag = "RmngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			nextVersions_lazy = () -> Arrays.asList(Limit7.mmRemainingAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Optional<Amount2Choice> getValue(Limit4 obj) {
			return obj.getRemainingAmount();
		}

		@Override
		public void setValue(Limit4 obj, Optional<Amount2Choice> value) {
			obj.setRemainingAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Limit4.mmAmount, com.tools20022.repository.msg.Limit4.mmCreditDebitIndicator, com.tools20022.repository.msg.Limit4.mmStatus,
						com.tools20022.repository.msg.Limit4.mmStartDateTime, com.tools20022.repository.msg.Limit4.mmUsedAmount, com.tools20022.repository.msg.Limit4.mmUsedAmountCreditDebitIndicator,
						com.tools20022.repository.msg.Limit4.mmUsedPercentage, com.tools20022.repository.msg.Limit4.mmRemainingAmount);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Limit4";
				definition = "Details on the limits.";
				nextVersions_lazy = () -> Arrays.asList(Limit7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Amount2Choice getAmount() {
		return amount;
	}

	public Limit4 setAmount(Amount2Choice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public Limit4 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<LimitStatus1Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public Limit4 setStatus(LimitStatus1Code status) {
		this.status = status;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getStartDateTime() {
		return startDateTime == null ? Optional.empty() : Optional.of(startDateTime);
	}

	public Limit4 setStartDateTime(DateAndDateTimeChoice startDateTime) {
		this.startDateTime = startDateTime;
		return this;
	}

	public Optional<Amount2Choice> getUsedAmount() {
		return usedAmount == null ? Optional.empty() : Optional.of(usedAmount);
	}

	public Limit4 setUsedAmount(Amount2Choice usedAmount) {
		this.usedAmount = usedAmount;
		return this;
	}

	public Optional<CreditDebitCode> getUsedAmountCreditDebitIndicator() {
		return usedAmountCreditDebitIndicator == null ? Optional.empty() : Optional.of(usedAmountCreditDebitIndicator);
	}

	public Limit4 setUsedAmountCreditDebitIndicator(CreditDebitCode usedAmountCreditDebitIndicator) {
		this.usedAmountCreditDebitIndicator = usedAmountCreditDebitIndicator;
		return this;
	}

	public Optional<PercentageRate> getUsedPercentage() {
		return usedPercentage == null ? Optional.empty() : Optional.of(usedPercentage);
	}

	public Limit4 setUsedPercentage(PercentageRate usedPercentage) {
		this.usedPercentage = usedPercentage;
		return this;
	}

	public Optional<Amount2Choice> getRemainingAmount() {
		return remainingAmount == null ? Optional.empty() : Optional.of(remainingAmount);
	}

	public Limit4 setRemainingAmount(Amount2Choice remainingAmount) {
		this.remainingAmount = remainingAmount;
		return this;
	}
}