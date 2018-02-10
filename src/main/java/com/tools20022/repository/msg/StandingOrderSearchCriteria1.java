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
import com.tools20022.repository.choice.DatePeriodDetails2Choice;
import com.tools20022.repository.choice.StandingOrderType1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
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
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria which are used to search for standing orders defined
 * within the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmKeyAttributesIndicator
 * StandingOrderSearchCriteria1.mmKeyAttributesIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmStandingOrderIdentification
 * StandingOrderSearchCriteria1.mmStandingOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmType
 * StandingOrderSearchCriteria1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmAccount
 * StandingOrderSearchCriteria1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmCurrency
 * StandingOrderSearchCriteria1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmValidityPeriod
 * StandingOrderSearchCriteria1.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmSystemMember
 * StandingOrderSearchCriteria1.mmSystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmResponsibleParty
 * StandingOrderSearchCriteria1.mmResponsibleParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmAssociatedPoolAccount
 * StandingOrderSearchCriteria1.mmAssociatedPoolAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmLinkSetIdentification
 * StandingOrderSearchCriteria1.mmLinkSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmLinkSetOrderIdentification
 * StandingOrderSearchCriteria1.mmLinkSetOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmLinkSetOrderSequence
 * StandingOrderSearchCriteria1.mmLinkSetOrderSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmZeroSweepIndicator
 * StandingOrderSearchCriteria1.mmZeroSweepIndicator}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for standing orders defined within the system."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrderSearchCriteria1", propOrder = {"keyAttributesIndicator", "standingOrderIdentification", "type", "account", "currency", "validityPeriod", "systemMember", "responsibleParty", "associatedPoolAccount",
		"linkSetIdentification", "linkSetOrderIdentification", "linkSetOrderSequence", "zeroSweepIndicator"})
public class StandingOrderSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "KeyAttrbtsInd")
	protected TrueFalseIndicator keyAttributesIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyAttrbtsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyAttributesIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the key fields or business attributes defined within the system must be returned."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyAttributesIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "KeyAttrbtsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyAttributesIndicator";
			definition = "Indicates whether the key fields or business attributes defined within the system must be returned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "StgOrdrId")
	protected Max35Text standingOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identify the standing order used to initiate the liquidity transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandingOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIdentification";
			definition = "Unique identification to unambiguously identify the standing order used to initiate the liquidity transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
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
	@XmlElement(name = "Acct")
	protected CashAccount24 account;
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
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCashAccount
	 * CashStandingOrder.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liquidity transfer origin or destination account within the pool of accounts under management of the requestor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashStandingOrder.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Liquidity transfer origin or destination account within the pool of accounts under management of the requestor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
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
	@XmlElement(name = "VldtyPrd")
	protected DatePeriodDetails2Choice validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DatePeriodDetails2Choice
	 * DatePeriodDetails2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
	 * StandingOrder.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
	 * definition} = "Dates during which the standing order is in effect. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidityPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmValidityPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails2Choice.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
	 * definition} = "Entity involved in an activity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponsibleParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsibleParty";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
	 * "Unique identification to unambiguously identiy the link set in which the standing order is defined. The link set is a collection of standing order defined in a specific sequence."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSetIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmLinkSetIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LkSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetIdentification";
			definition = "Unique identification to unambiguously identiy the link set in which the standing order is defined. The link set is a collection of standing order defined in a specific sequence.";
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
	 * StandingOrderSearchCriteria1}</li>
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
	 * "Indicates whether the query shall return all liquidity transfer standing orders defined as zero sweeping orders.\r\nWhen the indicator is set to true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmZeroSweepIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashStandingOrder.mmZeroSweepIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ZeroSweepInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the query shall return all liquidity transfer standing orders defined as zero sweeping orders.\r\nWhen the indicator is set to true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmKeyAttributesIndicator, com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmStandingOrderIdentification,
						com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmType, com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmAccount, com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmCurrency,
						com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmValidityPeriod, com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmSystemMember,
						com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmResponsibleParty, com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmAssociatedPoolAccount,
						com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmLinkSetIdentification, com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmLinkSetOrderIdentification,
						com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmLinkSetOrderSequence, com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmZeroSweepIndicator);
				trace_lazy = () -> CashStandingOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StandingOrderSearchCriteria1";
				definition = "Defines the criteria which are used to search for standing orders defined within the system.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getKeyAttributesIndicator() {
		return keyAttributesIndicator == null ? Optional.empty() : Optional.of(keyAttributesIndicator);
	}

	public StandingOrderSearchCriteria1 setKeyAttributesIndicator(TrueFalseIndicator keyAttributesIndicator) {
		this.keyAttributesIndicator = keyAttributesIndicator;
		return this;
	}

	public Optional<Max35Text> getStandingOrderIdentification() {
		return standingOrderIdentification == null ? Optional.empty() : Optional.of(standingOrderIdentification);
	}

	public StandingOrderSearchCriteria1 setStandingOrderIdentification(Max35Text standingOrderIdentification) {
		this.standingOrderIdentification = standingOrderIdentification;
		return this;
	}

	public Optional<StandingOrderType1Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public StandingOrderSearchCriteria1 setType(StandingOrderType1Choice type) {
		this.type = type;
		return this;
	}

	public Optional<CashAccount24> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public StandingOrderSearchCriteria1 setAccount(com.tools20022.repository.msg.CashAccount24 account) {
		this.account = account;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public StandingOrderSearchCriteria1 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<DatePeriodDetails2Choice> getValidityPeriod() {
		return validityPeriod == null ? Optional.empty() : Optional.of(validityPeriod);
	}

	public StandingOrderSearchCriteria1 setValidityPeriod(DatePeriodDetails2Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getSystemMember() {
		return systemMember == null ? Optional.empty() : Optional.of(systemMember);
	}

	public StandingOrderSearchCriteria1 setSystemMember(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 systemMember) {
		this.systemMember = systemMember;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getResponsibleParty() {
		return responsibleParty == null ? Optional.empty() : Optional.of(responsibleParty);
	}

	public StandingOrderSearchCriteria1 setResponsibleParty(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 responsibleParty) {
		this.responsibleParty = responsibleParty;
		return this;
	}

	public Optional<AccountIdentification4Choice> getAssociatedPoolAccount() {
		return associatedPoolAccount == null ? Optional.empty() : Optional.of(associatedPoolAccount);
	}

	public StandingOrderSearchCriteria1 setAssociatedPoolAccount(AccountIdentification4Choice associatedPoolAccount) {
		this.associatedPoolAccount = associatedPoolAccount;
		return this;
	}

	public Optional<Max35Text> getLinkSetIdentification() {
		return linkSetIdentification == null ? Optional.empty() : Optional.of(linkSetIdentification);
	}

	public StandingOrderSearchCriteria1 setLinkSetIdentification(Max35Text linkSetIdentification) {
		this.linkSetIdentification = linkSetIdentification;
		return this;
	}

	public Optional<Max35Text> getLinkSetOrderIdentification() {
		return linkSetOrderIdentification == null ? Optional.empty() : Optional.of(linkSetOrderIdentification);
	}

	public StandingOrderSearchCriteria1 setLinkSetOrderIdentification(Max35Text linkSetOrderIdentification) {
		this.linkSetOrderIdentification = linkSetOrderIdentification;
		return this;
	}

	public Optional<Number> getLinkSetOrderSequence() {
		return linkSetOrderSequence == null ? Optional.empty() : Optional.of(linkSetOrderSequence);
	}

	public StandingOrderSearchCriteria1 setLinkSetOrderSequence(Number linkSetOrderSequence) {
		this.linkSetOrderSequence = linkSetOrderSequence;
		return this;
	}

	public Optional<TrueFalseIndicator> getZeroSweepIndicator() {
		return zeroSweepIndicator == null ? Optional.empty() : Optional.of(zeroSweepIndicator);
	}

	public StandingOrderSearchCriteria1 setZeroSweepIndicator(TrueFalseIndicator zeroSweepIndicator) {
		this.zeroSweepIndicator = zeroSweepIndicator;
		return this;
	}
}