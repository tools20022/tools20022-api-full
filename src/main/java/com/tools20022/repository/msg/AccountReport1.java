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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.AccountReportV01;
import com.tools20022.repository.entity.AccountServicerRole;
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Message used to report to a corporate on the actual set up up of the account,
 * related services and mandates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport1#mmAccount
 * AccountReport1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport1#mmUnderlyingMasterAgreement
 * AccountReport1.mmUnderlyingMasterAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport1#mmContractDates
 * AccountReport1.mmContractDates}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport1#mmMandate
 * AccountReport1.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport1#mmReferenceAccount
 * AccountReport1.mmReferenceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport1#mmBalanceTransferAccount
 * AccountReport1.mmBalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport1#mmTransferAccountServicerIdentification
 * AccountReport1.mmTransferAccountServicerIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV01#mmReport
 * AccountReportV01.mmReport}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintContractDates1Rule#forAccountReport1
 * ConstraintContractDates1Rule.forAccountReport1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintContractDates2Rule#forAccountReport1
 * ConstraintContractDates2Rule.forAccountReport1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message used to report to a corporate on the actual set up up of the account, related services and mandates."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15
 * AccountReport15}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountReport1", propOrder = {"account", "underlyingMasterAgreement", "contractDates", "mandate", "referenceAccount", "balanceTransferAccount", "transferAccountServicerIdentification"})
public class AccountReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acct", required = true)
	protected CustomerAccount1 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerAccount1
	 * CustomerAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
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
	 * definition} = "Characteristics of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport1, CustomerAccount1> mmAccount = new MMMessageAssociationEnd<AccountReport1, CustomerAccount1>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Characteristics of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CustomerAccount1.mmObject();
		}

		@Override
		public CustomerAccount1 getValue(AccountReport1 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountReport1 obj, CustomerAccount1 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "UndrlygMstrAgrmt")
	protected ContractDocument1 underlyingMasterAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygMstrAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport1, Optional<ContractDocument1>> mmUnderlyingMasterAgreement = new MMMessageAssociationEnd<AccountReport1, Optional<ContractDocument1>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygMstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingMasterAgreement";
			definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContractDocument1.mmObject();
		}

		@Override
		public Optional<ContractDocument1> getValue(AccountReport1 obj) {
			return obj.getUnderlyingMasterAgreement();
		}

		@Override
		public void setValue(AccountReport1 obj, Optional<ContractDocument1> value) {
			obj.setUnderlyingMasterAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctDts")
	protected AccountContract3 contractDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies target and actual dates."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport1, Optional<AccountContract3>> mmContractDates = new MMMessageAssociationEnd<AccountReport1, Optional<AccountContract3>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport1.mmObject();
			isDerived = false;
			xmlTag = "CtrctDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates";
			definition = "Specifies target and actual dates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountContract3.mmObject();
		}

		@Override
		public Optional<AccountContract3> getValue(AccountReport1 obj) {
			return obj.getContractDates();
		}

		@Override
		public void setValue(AccountReport1 obj, Optional<AccountContract3> value) {
			obj.setContractDates(value.orElse(null));
		}
	};
	@XmlElement(name = "Mndt")
	protected List<OperationMandate1> mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OperationMandate1
	 * OperationMandate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountMandate
	 * CashAccountService.mmCashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specifying the account mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport1, List<OperationMandate1>> mmMandate = new MMMessageAssociationEnd<AccountReport1, List<OperationMandate1>>() {
		{
			businessElementTrace_lazy = () -> CashAccountService.mmCashAccountMandate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport1.mmObject();
			isDerived = false;
			xmlTag = "Mndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Information specifying the account mandate.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OperationMandate1.mmObject();
		}

		@Override
		public List<OperationMandate1> getValue(AccountReport1 obj) {
			return obj.getMandate();
		}

		@Override
		public void setValue(AccountReport1 obj, List<OperationMandate1> value) {
			obj.setMandate(value);
		}
	};
	@XmlElement(name = "RefAcct")
	protected CashAccount16 referenceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account used as a reference for the opening of another account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport1, Optional<CashAccount16>> mmReferenceAccount = new MMMessageAssociationEnd<AccountReport1, Optional<CashAccount16>>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport1.mmObject();
			isDerived = false;
			xmlTag = "RefAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccount";
			definition = "Unique and unambiguous identification of the account used as a reference for the opening of another account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public Optional<CashAccount16> getValue(AccountReport1 obj) {
			return obj.getReferenceAccount();
		}

		@Override
		public void setValue(AccountReport1 obj, Optional<CashAccount16> value) {
			obj.setReferenceAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "BalTrfAcct")
	protected AccountForAction1 balanceTransferAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrfAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account where to transfer the balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport1, Optional<AccountForAction1>> mmBalanceTransferAccount = new MMMessageAssociationEnd<AccountReport1, Optional<AccountForAction1>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport1.mmObject();
			isDerived = false;
			xmlTag = "BalTrfAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferAccount";
			definition = "Unique and unambiguous identification of the account where to transfer the balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountForAction1.mmObject();
		}

		@Override
		public Optional<AccountForAction1> getValue(AccountReport1 obj) {
			return obj.getBalanceTransferAccount();
		}

		@Override
		public void setValue(AccountReport1 obj, Optional<AccountForAction1> value) {
			obj.setBalanceTransferAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfAcctSvcrId")
	protected BranchAndFinancialInstitutionIdentification4 transferAccountServicerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountServicerRole
	 * AccountServicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfAcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the transfer account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport1, Optional<BranchAndFinancialInstitutionIdentification4>> mmTransferAccountServicerIdentification = new MMMessageAssociationEnd<AccountReport1, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			businessComponentTrace_lazy = () -> AccountServicerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport1.mmObject();
			isDerived = false;
			xmlTag = "TrfAcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAccountServicerIdentification";
			definition = "Identification of the transfer account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(AccountReport1 obj) {
			return obj.getTransferAccountServicerIdentification();
		}

		@Override
		public void setValue(AccountReport1 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setTransferAccountServicerIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport1.mmAccount, com.tools20022.repository.msg.AccountReport1.mmUnderlyingMasterAgreement,
						com.tools20022.repository.msg.AccountReport1.mmContractDates, com.tools20022.repository.msg.AccountReport1.mmMandate, com.tools20022.repository.msg.AccountReport1.mmReferenceAccount,
						com.tools20022.repository.msg.AccountReport1.mmBalanceTransferAccount, com.tools20022.repository.msg.AccountReport1.mmTransferAccountServicerIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountReportV01.mmReport);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintContractDates1Rule.forAccountReport1, com.tools20022.repository.constraints.ConstraintContractDates2Rule.forAccountReport1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountReport1";
				definition = "Message used to report to a corporate on the actual set up up of the account, related services and mandates.";
				nextVersions_lazy = () -> Arrays.asList(AccountReport15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CustomerAccount1 getAccount() {
		return account;
	}

	public AccountReport1 setAccount(CustomerAccount1 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return underlyingMasterAgreement == null ? Optional.empty() : Optional.of(underlyingMasterAgreement);
	}

	public AccountReport1 setUnderlyingMasterAgreement(ContractDocument1 underlyingMasterAgreement) {
		this.underlyingMasterAgreement = underlyingMasterAgreement;
		return this;
	}

	public Optional<AccountContract3> getContractDates() {
		return contractDates == null ? Optional.empty() : Optional.of(contractDates);
	}

	public AccountReport1 setContractDates(AccountContract3 contractDates) {
		this.contractDates = contractDates;
		return this;
	}

	public List<OperationMandate1> getMandate() {
		return mandate == null ? mandate = new ArrayList<>() : mandate;
	}

	public AccountReport1 setMandate(List<OperationMandate1> mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public Optional<CashAccount16> getReferenceAccount() {
		return referenceAccount == null ? Optional.empty() : Optional.of(referenceAccount);
	}

	public AccountReport1 setReferenceAccount(CashAccount16 referenceAccount) {
		this.referenceAccount = referenceAccount;
		return this;
	}

	public Optional<AccountForAction1> getBalanceTransferAccount() {
		return balanceTransferAccount == null ? Optional.empty() : Optional.of(balanceTransferAccount);
	}

	public AccountReport1 setBalanceTransferAccount(AccountForAction1 balanceTransferAccount) {
		this.balanceTransferAccount = balanceTransferAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getTransferAccountServicerIdentification() {
		return transferAccountServicerIdentification == null ? Optional.empty() : Optional.of(transferAccountServicerIdentification);
	}

	public AccountReport1 setTransferAccountServicerIdentification(BranchAndFinancialInstitutionIdentification4 transferAccountServicerIdentification) {
		this.transferAccountServicerIdentification = transferAccountServicerIdentification;
		return this;
	}
}