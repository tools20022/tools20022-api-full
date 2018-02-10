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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.choice.ExecutionType1Choice;
import com.tools20022.repository.choice.StandingOrderType1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.Frequency2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.StandingOrder;
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
 * Defines the detailed attributes of a standing order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmAmount
 * StandingOrder2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmCreditDebitIndicator
 * StandingOrder2.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmCurrency
 * StandingOrder2.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmType
 * StandingOrder2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmAssociatedPoolAccount
 * StandingOrder2.mmAssociatedPoolAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmReference
 * StandingOrder2.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmFrequency
 * StandingOrder2.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmValidityPeriod
 * StandingOrder2.mmValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmSystemMember
 * StandingOrder2.mmSystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmResponsibleParty
 * StandingOrder2.mmResponsibleParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmLinkSetIdentification
 * StandingOrder2.mmLinkSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmLinkSetOrderIdentification
 * StandingOrder2.mmLinkSetOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmLinkSetOrderSequence
 * StandingOrder2.mmLinkSetOrderSequence}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmExecutionType
 * StandingOrder2.mmExecutionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmCreditorAccount
 * StandingOrder2.mmCreditorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmDebtorAccount
 * StandingOrder2.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmTotalsPerStandingOrder
 * StandingOrder2.mmTotalsPerStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmZeroSweepIndicator
 * StandingOrder2.mmZeroSweepIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
 * CashStandingOrder}</li>
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
 * "StandingOrder2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the detailed attributes of a standing order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrder2", propOrder = {"amount", "creditDebitIndicator", "currency", "type", "associatedPoolAccount", "reference", "frequency", "validityPeriod", "systemMember", "responsibleParty", "linkSetIdentification",
		"linkSetOrderIdentification", "linkSetOrderSequence", "executionType", "creditorAccount", "debtorAccount", "totalsPerStandingOrder", "zeroSweepIndicator"})
public class StandingOrder2 {

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
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmAmount
	 * StandingOrder.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
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
	 * "Amount of money and currency to be transferred when a payment instruction is created as a result of a standing order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency to be transferred when a payment instruction is created as a result of a standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
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
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCreditDebitIndicator
	 * CashStandingOrder.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
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
	 * definition} =
	 * "Specifies if the account is debited or credited by the standing order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashStandingOrder.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if the account is debited or credited by the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "Tp")
	protected StandingOrderType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StandingOrderType1Choice
	 * StandingOrderType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmType
	 * StandingOrder.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the standing order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the standing order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingOrderType1Choice.mmObject();
		}
	};
	@XmlElement(name = "AssoctdPoolAcct")
	protected AccountIdentification4Choice associatedPoolAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
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
	 * "Liquidity transfer origin or destination account within the pool of accounts under management of the requestor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssociatedPoolAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "AssoctdPoolAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedPoolAccount";
			definition = "Liquidity transfer origin or destination account within the pool of accounts under management of the requestor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	@XmlElement(name = "Ref")
	protected Max35Text reference;
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
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIdentification
	 * StandingOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Frqcy")
	protected Frequency2Code frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency2Code
	 * Frequency2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmFrequency
	 * StandingOrder.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which payment instructions are to be created and processed as a result of the standing order, such as daily, weekly, or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which payment instructions are to be created and processed as a result of the standing order, such as daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency2Code.mmObject();
		}
	};
	@XmlElement(name = "VldtyPrd")
	protected DatePeriodDetails1 validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1
	 * DatePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
	 * StandingOrder.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dates during which the standing order is in effect."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidityPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmValidityPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails1.mmObject();
		}
	};
	@XmlElement(name = "SysMmb")
	protected BranchAndFinancialInstitutionIdentification5 systemMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the account is debited or credited by the standing order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSystemMember = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "SysMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMember";
			definition = "Specifies if the account is debited or credited by the standing order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "RspnsblPty")
	protected BranchAndFinancialInstitutionIdentification5 responsibleParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsibleParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponsibleParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsibleParty";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "LkSetId")
	protected Max35Text linkSetIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSetIdentification
	 * StandingOrder.mmLinkSetIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identify the link set in which the standing order is defined. The link set is a collection of standing order defined in a specific sequence."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSetIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmLinkSetIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "LkSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetIdentification";
			definition = "Unique identification to unambiguously identify the link set in which the standing order is defined. The link set is a collection of standing order defined in a specific sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "LkSetOrdrId")
	protected Max35Text linkSetOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIdentification
	 * StandingOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identify liquidity transfer standing order within the link set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSetOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "LkSetOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetOrderIdentification";
			definition = "Unique identification to unambiguously identify liquidity transfer standing order within the link set.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "LkSetOrdrSeq")
	protected Number linkSetOrderSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmStandingOrderSequence
	 * StandingOrder.mmStandingOrderSequence}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetOrdrSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetOrderSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSetOrderSequence = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmStandingOrderSequence;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "LkSetOrdrSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetOrderSequence";
			definition = "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "ExctnTp")
	protected ExecutionType1Choice executionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExecutionType1Choice
	 * ExecutionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmType
	 * StandingOrder.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines whether the standing order is executed through a time-based or an event-based trigger."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "ExctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionType";
			definition = "Defines whether the standing order is executed through a time-based or an event-based trigger.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExecutionType1Choice.mmObject();
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount24 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account credited from a standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Cash account credited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount24 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmDebitAccount
	 * StandingOrder.mmDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account debited from a standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmDebitAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Cash account debited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "TtlsPerStgOrdr")
	protected StandingOrderTotalAmount1 totalsPerStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1
	 * StandingOrderTotalAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlsPerStgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall amount of \"not yet executed\" predefined liquidity transfer orders or \"defined\" by a system participant in its sphere of responsibility within the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalsPerStandingOrder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "TtlsPerStgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsPerStandingOrder";
			definition = "Overall amount of \"not yet executed\" predefined liquidity transfer orders or \"defined\" by a system participant in its sphere of responsibility within the system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StandingOrderTotalAmount1.mmObject();
		}
	};
	@XmlElement(name = "ZeroSweepInd")
	protected TrueFalseIndicator zeroSweepIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmZeroSweepIndicator
	 * CashStandingOrder.mmZeroSweepIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
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
	 * "Indicates whether the liquidity transfer standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is zero."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmZeroSweepIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashStandingOrder.mmZeroSweepIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder2.mmObject();
			isDerived = false;
			xmlTag = "ZeroSweepInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the liquidity transfer standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is zero.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrder2.mmAmount, com.tools20022.repository.msg.StandingOrder2.mmCreditDebitIndicator, com.tools20022.repository.msg.StandingOrder2.mmCurrency,
						com.tools20022.repository.msg.StandingOrder2.mmType, com.tools20022.repository.msg.StandingOrder2.mmAssociatedPoolAccount, com.tools20022.repository.msg.StandingOrder2.mmReference,
						com.tools20022.repository.msg.StandingOrder2.mmFrequency, com.tools20022.repository.msg.StandingOrder2.mmValidityPeriod, com.tools20022.repository.msg.StandingOrder2.mmSystemMember,
						com.tools20022.repository.msg.StandingOrder2.mmResponsibleParty, com.tools20022.repository.msg.StandingOrder2.mmLinkSetIdentification, com.tools20022.repository.msg.StandingOrder2.mmLinkSetOrderIdentification,
						com.tools20022.repository.msg.StandingOrder2.mmLinkSetOrderSequence, com.tools20022.repository.msg.StandingOrder2.mmExecutionType, com.tools20022.repository.msg.StandingOrder2.mmCreditorAccount,
						com.tools20022.repository.msg.StandingOrder2.mmDebtorAccount, com.tools20022.repository.msg.StandingOrder2.mmTotalsPerStandingOrder, com.tools20022.repository.msg.StandingOrder2.mmZeroSweepIndicator);
				trace_lazy = () -> CashStandingOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrder2";
				definition = "Defines the detailed attributes of a standing order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Amount2Choice getAmount() {
		return amount;
	}

	public StandingOrder2 setAmount(Amount2Choice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public StandingOrder2 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public StandingOrder2 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<StandingOrderType1Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public StandingOrder2 setType(StandingOrderType1Choice type) {
		this.type = type;
		return this;
	}

	public Optional<AccountIdentification4Choice> getAssociatedPoolAccount() {
		return associatedPoolAccount == null ? Optional.empty() : Optional.of(associatedPoolAccount);
	}

	public StandingOrder2 setAssociatedPoolAccount(AccountIdentification4Choice associatedPoolAccount) {
		this.associatedPoolAccount = associatedPoolAccount;
		return this;
	}

	public Optional<Max35Text> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public StandingOrder2 setReference(Max35Text reference) {
		this.reference = reference;
		return this;
	}

	public Optional<Frequency2Code> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public StandingOrder2 setFrequency(Frequency2Code frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<DatePeriodDetails1> getValidityPeriod() {
		return validityPeriod == null ? Optional.empty() : Optional.of(validityPeriod);
	}

	public StandingOrder2 setValidityPeriod(com.tools20022.repository.msg.DatePeriodDetails1 validityPeriod) {
		this.validityPeriod = validityPeriod;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getSystemMember() {
		return systemMember == null ? Optional.empty() : Optional.of(systemMember);
	}

	public StandingOrder2 setSystemMember(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 systemMember) {
		this.systemMember = systemMember;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getResponsibleParty() {
		return responsibleParty == null ? Optional.empty() : Optional.of(responsibleParty);
	}

	public StandingOrder2 setResponsibleParty(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 responsibleParty) {
		this.responsibleParty = responsibleParty;
		return this;
	}

	public Optional<Max35Text> getLinkSetIdentification() {
		return linkSetIdentification == null ? Optional.empty() : Optional.of(linkSetIdentification);
	}

	public StandingOrder2 setLinkSetIdentification(Max35Text linkSetIdentification) {
		this.linkSetIdentification = linkSetIdentification;
		return this;
	}

	public Optional<Max35Text> getLinkSetOrderIdentification() {
		return linkSetOrderIdentification == null ? Optional.empty() : Optional.of(linkSetOrderIdentification);
	}

	public StandingOrder2 setLinkSetOrderIdentification(Max35Text linkSetOrderIdentification) {
		this.linkSetOrderIdentification = linkSetOrderIdentification;
		return this;
	}

	public Optional<Number> getLinkSetOrderSequence() {
		return linkSetOrderSequence == null ? Optional.empty() : Optional.of(linkSetOrderSequence);
	}

	public StandingOrder2 setLinkSetOrderSequence(Number linkSetOrderSequence) {
		this.linkSetOrderSequence = linkSetOrderSequence;
		return this;
	}

	public Optional<ExecutionType1Choice> getExecutionType() {
		return executionType == null ? Optional.empty() : Optional.of(executionType);
	}

	public StandingOrder2 setExecutionType(ExecutionType1Choice executionType) {
		this.executionType = executionType;
		return this;
	}

	public Optional<CashAccount24> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public StandingOrder2 setCreditorAccount(com.tools20022.repository.msg.CashAccount24 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<CashAccount24> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public StandingOrder2 setDebtorAccount(com.tools20022.repository.msg.CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<StandingOrderTotalAmount1> getTotalsPerStandingOrder() {
		return totalsPerStandingOrder == null ? Optional.empty() : Optional.of(totalsPerStandingOrder);
	}

	public StandingOrder2 setTotalsPerStandingOrder(com.tools20022.repository.msg.StandingOrderTotalAmount1 totalsPerStandingOrder) {
		this.totalsPerStandingOrder = totalsPerStandingOrder;
		return this;
	}

	public Optional<TrueFalseIndicator> getZeroSweepIndicator() {
		return zeroSweepIndicator == null ? Optional.empty() : Optional.of(zeroSweepIndicator);
	}

	public StandingOrder2 setZeroSweepIndicator(TrueFalseIndicator zeroSweepIndicator) {
		this.zeroSweepIndicator = zeroSweepIndicator;
		return this;
	}
}