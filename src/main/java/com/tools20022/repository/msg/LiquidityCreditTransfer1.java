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
import com.tools20022.repository.area.camt.LiquidityCreditTransferV04;
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.PaymentIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details specific to the liquidity credit transfer, used to transfer
 * an amount of money from the debtor to the creditor, where both are financial
 * institutions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmLiquidityTransferIdentification
 * LiquidityCreditTransfer1.mmLiquidityTransferIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmCreditor
 * LiquidityCreditTransfer1.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmCreditorAccount
 * LiquidityCreditTransfer1.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmTransferredAmount
 * LiquidityCreditTransfer1.mmTransferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmDebtor
 * LiquidityCreditTransfer1.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmDebtorAccount
 * LiquidityCreditTransfer1.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmSettlementDate
 * LiquidityCreditTransfer1.mmSettlementDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityCreditTransferV04#mmLiquidityCreditTransfer
 * LiquidityCreditTransferV04.mmLiquidityCreditTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditAccountRule#forLiquidityCreditTransfer1
 * ConstraintCreditAccountRule.forLiquidityCreditTransfer1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityCreditTransfer1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details specific to the liquidity credit transfer, used to transfer an amount of money from the debtor to the creditor, where both are financial institutions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityCreditTransfer1", propOrder = {"liquidityTransferIdentification", "creditor", "creditorAccount", "transferredAmount", "debtor", "debtorAccount", "settlementDate"})
public class LiquidityCreditTransfer1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LqdtyTrfId")
	protected PaymentIdentification1 liquidityTransferIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentIdentification1
	 * PaymentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyTrfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransferIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used to uniquely identify the liquidity transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<PaymentIdentification1>> mmLiquidityTransferIdentification = new MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<PaymentIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityCreditTransfer1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyTrfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityTransferIdentification";
			definition = "Used to uniquely identify the liquidity transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentIdentification1.mmObject();
		}

		@Override
		public Optional<PaymentIdentification1> getValue(LiquidityCreditTransfer1 obj) {
			return obj.getLiquidityTransferIdentification();
		}

		@Override
		public void setValue(LiquidityCreditTransfer1 obj, Optional<PaymentIdentification1> value) {
			obj.setLiquidityTransferIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr")
	protected BranchAndFinancialInstitutionIdentification5 creditor;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account to be credited."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<BranchAndFinancialInstitutionIdentification5>> mmCreditor = new MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityCreditTransfer1.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Owner of the account to be credited.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(LiquidityCreditTransfer1 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(LiquidityCreditTransfer1 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setCreditor(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
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
	 * definition} =
	 * "Account to be credited as a result of a transfer of liquidity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<CashAccount24>> mmCreditorAccount = new MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityCreditTransfer1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Account to be credited as a result of a transfer of liquidity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(LiquidityCreditTransfer1 obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(LiquidityCreditTransfer1 obj, Optional<CashAccount24> value) {
			obj.setCreditorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfdAmt", required = true)
	protected Amount2Choice transferredAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Amount2Choice
	 * Amount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmNetAmount
	 * CreditInstrument.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that the transaction administrator transfers from one account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityCreditTransfer1, Amount2Choice> mmTransferredAmount = new MMMessageAssociationEnd<LiquidityCreditTransfer1, Amount2Choice>() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityCreditTransfer1.mmObject();
			isDerived = false;
			xmlTag = "TrfdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferredAmount";
			definition = "Amount of money that the transaction administrator transfers from one account to another.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Amount2Choice getValue(LiquidityCreditTransfer1 obj) {
			return obj.getTransferredAmount();
		}

		@Override
		public void setValue(LiquidityCreditTransfer1 obj, Amount2Choice value) {
			obj.setTransferredAmount(value);
		}
	};
	@XmlElement(name = "Dbtr")
	protected BranchAndFinancialInstitutionIdentification5 debtor;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account to be debited."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<BranchAndFinancialInstitutionIdentification5>> mmDebtor = new MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityCreditTransfer1.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Owner of the account to be debited.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(LiquidityCreditTransfer1 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(LiquidityCreditTransfer1 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setDebtor(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
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
	 * definition} =
	 * "Account to be debited as a result of a transfer of liquidity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<CashAccount24>> mmDebtorAccount = new MMMessageAssociationEnd<LiquidityCreditTransfer1, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityCreditTransfer1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Account to be debited as a result of a transfer of liquidity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(LiquidityCreditTransfer1 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(LiquidityCreditTransfer1 obj, Optional<CashAccount24> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt")
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmValueDate
	 * Entry.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityCreditTransfer1, Optional<ISODate>> mmSettlementDate = new MMMessageAttribute<LiquidityCreditTransfer1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityCreditTransfer1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(LiquidityCreditTransfer1 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(LiquidityCreditTransfer1 obj, Optional<ISODate> value) {
			obj.setSettlementDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityCreditTransfer1.mmLiquidityTransferIdentification, com.tools20022.repository.msg.LiquidityCreditTransfer1.mmCreditor,
						com.tools20022.repository.msg.LiquidityCreditTransfer1.mmCreditorAccount, com.tools20022.repository.msg.LiquidityCreditTransfer1.mmTransferredAmount, com.tools20022.repository.msg.LiquidityCreditTransfer1.mmDebtor,
						com.tools20022.repository.msg.LiquidityCreditTransfer1.mmDebtorAccount, com.tools20022.repository.msg.LiquidityCreditTransfer1.mmSettlementDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(LiquidityCreditTransferV04.mmLiquidityCreditTransfer);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditAccountRule.forLiquidityCreditTransfer1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LiquidityCreditTransfer1";
				definition = "Provides details specific to the liquidity credit transfer, used to transfer an amount of money from the debtor to the creditor, where both are financial institutions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentIdentification1> getLiquidityTransferIdentification() {
		return liquidityTransferIdentification == null ? Optional.empty() : Optional.of(liquidityTransferIdentification);
	}

	public LiquidityCreditTransfer1 setLiquidityTransferIdentification(PaymentIdentification1 liquidityTransferIdentification) {
		this.liquidityTransferIdentification = liquidityTransferIdentification;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public LiquidityCreditTransfer1 setCreditor(BranchAndFinancialInstitutionIdentification5 creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<CashAccount24> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public LiquidityCreditTransfer1 setCreditorAccount(CashAccount24 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Amount2Choice getTransferredAmount() {
		return transferredAmount;
	}

	public LiquidityCreditTransfer1 setTransferredAmount(Amount2Choice transferredAmount) {
		this.transferredAmount = Objects.requireNonNull(transferredAmount);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public LiquidityCreditTransfer1 setDebtor(BranchAndFinancialInstitutionIdentification5 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<CashAccount24> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public LiquidityCreditTransfer1 setDebtorAccount(CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<ISODate> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public LiquidityCreditTransfer1 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}
}