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
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.OriginalItem3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the account notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmAccount
 * OriginalNotificationReference4.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmAccountOwner
 * OriginalNotificationReference4.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmAccountServicer
 * OriginalNotificationReference4.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmRelatedAccount
 * OriginalNotificationReference4.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmTotalAmount
 * OriginalNotificationReference4.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmExpectedValueDate
 * OriginalNotificationReference4.mmExpectedValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmDebtor
 * OriginalNotificationReference4.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmDebtorAgent
 * OriginalNotificationReference4.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmIntermediaryAgent
 * OriginalNotificationReference4.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmOriginalItem
 * OriginalNotificationReference4.mmOriginalItem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalNotificationReference4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the account notification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorRule#forOriginalNotificationReference4
 * ConstraintDebtorRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference4
 * ConstraintDebtorAgentRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgentRule#forOriginalNotificationReference4
 * ConstraintIntermediaryAgentRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMandatoryDebtorRule#forOriginalNotificationReference4
 * ConstraintMandatoryDebtorRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgentAndDebtorAgentRule#forOriginalNotificationReference4
 * ConstraintIntermediaryAgentAndDebtorAgentRule.
 * forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalAmountAndAmount1Rule#forOriginalNotificationReference4
 * ConstraintTotalAmountAndAmount1Rule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountAndCurrencyRule#forOriginalNotificationReference4
 * ConstraintAccountAndCurrencyRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalAmountAndAmount2Rule#forOriginalNotificationReference4
 * ConstraintTotalAmountAndAmount2Rule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountRule#forOriginalNotificationReference4
 * ConstraintAccountRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference4
 * ConstraintAccountOwnerRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountServicerRule#forOriginalNotificationReference4
 * ConstraintAccountServicerRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExpectedValueDateRule#forOriginalNotificationReference4
 * ConstraintExpectedValueDateRule.forOriginalNotificationReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedAccountRule#forOriginalNotificationReference4
 * ConstraintRelatedAccountRule.forOriginalNotificationReference4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference6
 * OriginalNotificationReference6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalNotificationReference4", propOrder = {"account", "accountOwner", "accountServicer", "relatedAccount", "totalAmount", "expectedValueDate", "debtor", "debtorAgent", "intermediaryAgent", "originalItem"})
public class OriginalNotificationReference4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the account to be credited with the incoming amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmAccount
	 * OriginalNotificationReference6.mmAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, Optional<CashAccount24>> mmAccount = new MMMessageAssociationEnd<OriginalNotificationReference4, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Identifies the account to be credited with the incoming amount of money.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(OriginalNotificationReference4 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<CashAccount24> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected Party12Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmAccountOwner
	 * OriginalNotificationReference6.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, Optional<Party12Choice>> mmAccountOwner = new MMMessageAssociationEnd<OriginalNotificationReference4, Optional<Party12Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}

		@Override
		public Optional<Party12Choice> getValue(OriginalNotificationReference4 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<Party12Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmAccountServicer
	 * OriginalNotificationReference6.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, Optional<BranchAndFinancialInstitutionIdentification5>> mmAccountServicer = new MMMessageAssociationEnd<OriginalNotificationReference4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(OriginalNotificationReference4 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdAcct")
	protected CashAccount24 relatedAccount;
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the parent account of the account to be credited with the incoming amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmRelatedAccount
	 * OriginalNotificationReference6.mmRelatedAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, Optional<CashAccount24>> mmRelatedAccount = new MMMessageAssociationEnd<OriginalNotificationReference4, Optional<CashAccount24>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "RltdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAccount";
			definition = "Identifies the parent account of the account to be credited with the incoming amount of money.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmRelatedAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(OriginalNotificationReference4 obj) {
			return obj.getRelatedAccount();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<CashAccount24> value) {
			obj.setRelatedAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAmt")
	protected ActiveOrHistoricCurrencyAndAmount totalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum of the amounts in all the Item entries."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmTotalAmount
	 * OriginalNotificationReference6.mmTotalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotificationReference4, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalAmount = new MMMessageAttribute<OriginalNotificationReference4, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Sum of the amounts in all the Item entries.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmTotalAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(OriginalNotificationReference4 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdValDt")
	protected ISODate expectedValueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the first agent expects the cash to be available to the final agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmExpectedValueDate
	 * OriginalNotificationReference6.mmExpectedValueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotificationReference4, Optional<ISODate>> mmExpectedValueDate = new MMMessageAttribute<OriginalNotificationReference4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "XpctdValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedValueDate";
			definition = "Date on which the first agent expects the cash to be available to the final agent.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmExpectedValueDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(OriginalNotificationReference4 obj) {
			return obj.getExpectedValueDate();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<ISODate> value) {
			obj.setExpectedValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr")
	protected Party12Choice debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmDebtor
	 * OriginalNotificationReference6.mmDebtor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, Optional<Party12Choice>> mmDebtor = new MMMessageAssociationEnd<OriginalNotificationReference4, Optional<Party12Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmDebtor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}

		@Override
		public Optional<Party12Choice> getValue(OriginalNotificationReference4 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<Party12Choice> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt")
	protected BranchAndFinancialInstitutionIdentification5 debtorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmDebtorAgent
	 * OriginalNotificationReference6.mmDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, Optional<BranchAndFinancialInstitutionIdentification5>> mmDebtorAgent = new MMMessageAssociationEnd<OriginalNotificationReference4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmDebtorAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(OriginalNotificationReference4 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmIntermediaryAgent
	 * OriginalNotificationReference6.mmIntermediaryAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, Optional<BranchAndFinancialInstitutionIdentification5>> mmIntermediaryAgent = new MMMessageAssociationEnd<OriginalNotificationReference4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			definition = "Agent between the debtor's agent and the creditor's agent.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmIntermediaryAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(OriginalNotificationReference4 obj) {
			return obj.getIntermediaryAgent();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIntermediaryAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlItm", required = true)
	protected List<OriginalItem3> originalItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalItem3
	 * OriginalItem3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlItm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the expected amount on the account serviced by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmOriginalItem
	 * OriginalNotificationReference6.mmOriginalItem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotificationReference4, List<OriginalItem3>> mmOriginalItem = new MMMessageAssociationEnd<OriginalNotificationReference4, List<OriginalItem3>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotificationReference4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalItem";
			definition = "Provides details of the expected amount on the account serviced by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmOriginalItem);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalItem3.mmObject();
		}

		@Override
		public List<OriginalItem3> getValue(OriginalNotificationReference4 obj) {
			return obj.getOriginalItem();
		}

		@Override
		public void setValue(OriginalNotificationReference4 obj, List<OriginalItem3> value) {
			obj.setOriginalItem(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotificationReference4.mmAccount, com.tools20022.repository.msg.OriginalNotificationReference4.mmAccountOwner,
						com.tools20022.repository.msg.OriginalNotificationReference4.mmAccountServicer, com.tools20022.repository.msg.OriginalNotificationReference4.mmRelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference4.mmTotalAmount, com.tools20022.repository.msg.OriginalNotificationReference4.mmExpectedValueDate,
						com.tools20022.repository.msg.OriginalNotificationReference4.mmDebtor, com.tools20022.repository.msg.OriginalNotificationReference4.mmDebtorAgent,
						com.tools20022.repository.msg.OriginalNotificationReference4.mmIntermediaryAgent, com.tools20022.repository.msg.OriginalNotificationReference4.mmOriginalItem);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebtorRule.forOriginalNotificationReference4,
						com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference4, com.tools20022.repository.constraints.ConstraintIntermediaryAgentRule.forOriginalNotificationReference4,
						com.tools20022.repository.constraints.ConstraintMandatoryDebtorRule.forOriginalNotificationReference4,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgentAndDebtorAgentRule.forOriginalNotificationReference4,
						com.tools20022.repository.constraints.ConstraintTotalAmountAndAmount1Rule.forOriginalNotificationReference4, com.tools20022.repository.constraints.ConstraintAccountAndCurrencyRule.forOriginalNotificationReference4,
						com.tools20022.repository.constraints.ConstraintTotalAmountAndAmount2Rule.forOriginalNotificationReference4, com.tools20022.repository.constraints.ConstraintAccountRule.forOriginalNotificationReference4,
						com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference4, com.tools20022.repository.constraints.ConstraintAccountServicerRule.forOriginalNotificationReference4,
						com.tools20022.repository.constraints.ConstraintExpectedValueDateRule.forOriginalNotificationReference4, com.tools20022.repository.constraints.ConstraintRelatedAccountRule.forOriginalNotificationReference4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalNotificationReference4";
				definition = "Provides details on the account notification.";
				nextVersions_lazy = () -> Arrays.asList(OriginalNotificationReference6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CashAccount24> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public OriginalNotificationReference4 setAccount(CashAccount24 account) {
		this.account = account;
		return this;
	}

	public Optional<Party12Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public OriginalNotificationReference4 setAccountOwner(Party12Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public OriginalNotificationReference4 setAccountServicer(BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<CashAccount24> getRelatedAccount() {
		return relatedAccount == null ? Optional.empty() : Optional.of(relatedAccount);
	}

	public OriginalNotificationReference4 setRelatedAccount(CashAccount24 relatedAccount) {
		this.relatedAccount = relatedAccount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalAmount() {
		return totalAmount == null ? Optional.empty() : Optional.of(totalAmount);
	}

	public OriginalNotificationReference4 setTotalAmount(ActiveOrHistoricCurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public Optional<ISODate> getExpectedValueDate() {
		return expectedValueDate == null ? Optional.empty() : Optional.of(expectedValueDate);
	}

	public OriginalNotificationReference4 setExpectedValueDate(ISODate expectedValueDate) {
		this.expectedValueDate = expectedValueDate;
		return this;
	}

	public Optional<Party12Choice> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public OriginalNotificationReference4 setDebtor(Party12Choice debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public OriginalNotificationReference4 setDebtorAgent(BranchAndFinancialInstitutionIdentification5 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent() {
		return intermediaryAgent == null ? Optional.empty() : Optional.of(intermediaryAgent);
	}

	public OriginalNotificationReference4 setIntermediaryAgent(BranchAndFinancialInstitutionIdentification5 intermediaryAgent) {
		this.intermediaryAgent = intermediaryAgent;
		return this;
	}

	public List<OriginalItem3> getOriginalItem() {
		return originalItem == null ? originalItem = new ArrayList<>() : originalItem;
	}

	public OriginalNotificationReference4 setOriginalItem(List<OriginalItem3> originalItem) {
		this.originalItem = Objects.requireNonNull(originalItem);
		return this;
	}
}