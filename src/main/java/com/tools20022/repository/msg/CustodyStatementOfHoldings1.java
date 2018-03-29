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
import com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a custody statement of holdings.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmMessagePagination
 * CustodyStatementOfHoldings1.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmStatementGeneralDetails
 * CustodyStatementOfHoldings1.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmAccountDetails
 * CustodyStatementOfHoldings1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmBalanceForAccount
 * CustodyStatementOfHoldings1.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmSubAccountDetails
 * CustodyStatementOfHoldings1.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmTotalValues
 * CustodyStatementOfHoldings1.mmTotalValues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmExtension
 * CustodyStatementOfHoldings1.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmStatementToBeCancelled
 * CustodyStatementOfHoldingsCancellation.mmStatementToBeCancelled}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#forCustodyStatementOfHoldings1
 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
 * forCustodyStatementOfHoldings1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodyStatementOfHoldings1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a custody statement of holdings."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustodyStatementOfHoldings1", propOrder = {"messagePagination", "statementGeneralDetails", "accountDetails", "balanceForAccount", "subAccountDetails", "totalValues", "extension"})
public class CustodyStatementOfHoldings1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgPgntn", required = true)
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pagination Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustodyStatementOfHoldings1, Pagination> mmMessagePagination = new MMMessageAssociationEnd<CustodyStatementOfHoldings1, Pagination>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmObject();
			isDerived = false;
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(CustodyStatementOfHoldings1 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(CustodyStatementOfHoldings1 obj, Pagination value) {
			obj.setMessagePagination(value);
		}
	};
	@XmlElement(name = "StmtGnlDtls")
	protected Statement3 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Statement3 Statement3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the custody statement of holdings that is being cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustodyStatementOfHoldings1, Optional<Statement3>> mmStatementGeneralDetails = new MMMessageAssociationEnd<CustodyStatementOfHoldings1, Optional<Statement3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmObject();
			isDerived = false;
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "General information related to the custody statement of holdings that is being cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Statement3.mmObject();
		}

		@Override
		public Optional<Statement3> getValue(CustodyStatementOfHoldings1 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(CustodyStatementOfHoldings1 obj, Optional<Statement3> value) {
			obj.setStatementGeneralDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctDtls")
	protected SafekeepingAccount1 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafekeepingAccount1
	 * SafekeepingAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
	 * SecuritiesBalance.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping or investment account of the statement that is being cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustodyStatementOfHoldings1, Optional<SafekeepingAccount1>> mmAccountDetails = new MMMessageAssociationEnd<CustodyStatementOfHoldings1, Optional<SafekeepingAccount1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Safekeeping or investment account of the statement that is being cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingAccount1.mmObject();
		}

		@Override
		public Optional<SafekeepingAccount1> getValue(CustodyStatementOfHoldings1 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CustodyStatementOfHoldings1 obj, Optional<SafekeepingAccount1> value) {
			obj.setAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "BalForAcct")
	protected List<AggregateBalanceInformation1> balanceForAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1
	 * AggregateBalanceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalForAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustodyStatementOfHoldings1, List<AggregateBalanceInformation1>> mmBalanceForAccount = new MMMessageAssociationEnd<CustodyStatementOfHoldings1, List<AggregateBalanceInformation1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmObject();
			isDerived = false;
			xmlTag = "BalForAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccount";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregateBalanceInformation1.mmObject();
		}

		@Override
		public List<AggregateBalanceInformation1> getValue(CustodyStatementOfHoldings1 obj) {
			return obj.getBalanceForAccount();
		}

		@Override
		public void setValue(CustodyStatementOfHoldings1 obj, List<AggregateBalanceInformation1> value) {
			obj.setBalanceForAccount(value);
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected List<SubAccountIdentification1> subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1
	 * SubAccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-account of the safekeeping or investment account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustodyStatementOfHoldings1, List<SubAccountIdentification1>> mmSubAccountDetails = new MMMessageAssociationEnd<CustodyStatementOfHoldings1, List<SubAccountIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the safekeeping or investment account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccountIdentification1.mmObject();
		}

		@Override
		public List<SubAccountIdentification1> getValue(CustodyStatementOfHoldings1 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(CustodyStatementOfHoldings1 obj, List<SubAccountIdentification1> value) {
			obj.setSubAccountDetails(value);
		}
	};
	@XmlElement(name = "TtlVals")
	protected TotalValueInPageAndStatement totalValues;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement
	 * TotalValueInPageAndStatement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlVals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalValues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of total holdings reported."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustodyStatementOfHoldings1, Optional<TotalValueInPageAndStatement>> mmTotalValues = new MMMessageAssociationEnd<CustodyStatementOfHoldings1, Optional<TotalValueInPageAndStatement>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmObject();
			isDerived = false;
			xmlTag = "TtlVals";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalValues";
			definition = "Value of total holdings reported.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalValueInPageAndStatement.mmObject();
		}

		@Override
		public Optional<TotalValueInPageAndStatement> getValue(CustodyStatementOfHoldings1 obj) {
			return obj.getTotalValues();
		}

		@Override
		public void setValue(CustodyStatementOfHoldings1 obj, Optional<TotalValueInPageAndStatement> value) {
			obj.setTotalValues(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustodyStatementOfHoldings1, List<Extension1>> mmExtension = new MMMessageAssociationEnd<CustodyStatementOfHoldings1, List<Extension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(CustodyStatementOfHoldings1 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(CustodyStatementOfHoldings1 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmMessagePagination, com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmStatementGeneralDetails,
						com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmAccountDetails, com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmBalanceForAccount,
						com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmSubAccountDetails, com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmTotalValues,
						com.tools20022.repository.msg.CustodyStatementOfHoldings1.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustodyStatementOfHoldingsCancellation.mmStatementToBeCancelled);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.forCustodyStatementOfHoldings1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodyStatementOfHoldings1";
				definition = "Information about a custody statement of holdings.";
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public CustodyStatementOfHoldings1 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Optional<Statement3> getStatementGeneralDetails() {
		return statementGeneralDetails == null ? Optional.empty() : Optional.of(statementGeneralDetails);
	}

	public CustodyStatementOfHoldings1 setStatementGeneralDetails(Statement3 statementGeneralDetails) {
		this.statementGeneralDetails = statementGeneralDetails;
		return this;
	}

	public Optional<SafekeepingAccount1> getAccountDetails() {
		return accountDetails == null ? Optional.empty() : Optional.of(accountDetails);
	}

	public CustodyStatementOfHoldings1 setAccountDetails(SafekeepingAccount1 accountDetails) {
		this.accountDetails = accountDetails;
		return this;
	}

	public List<AggregateBalanceInformation1> getBalanceForAccount() {
		return balanceForAccount == null ? balanceForAccount = new ArrayList<>() : balanceForAccount;
	}

	public CustodyStatementOfHoldings1 setBalanceForAccount(List<AggregateBalanceInformation1> balanceForAccount) {
		this.balanceForAccount = Objects.requireNonNull(balanceForAccount);
		return this;
	}

	public List<SubAccountIdentification1> getSubAccountDetails() {
		return subAccountDetails == null ? subAccountDetails = new ArrayList<>() : subAccountDetails;
	}

	public CustodyStatementOfHoldings1 setSubAccountDetails(List<SubAccountIdentification1> subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	public Optional<TotalValueInPageAndStatement> getTotalValues() {
		return totalValues == null ? Optional.empty() : Optional.of(totalValues);
	}

	public CustodyStatementOfHoldings1 setTotalValues(TotalValueInPageAndStatement totalValues) {
		this.totalValues = totalValues;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public CustodyStatementOfHoldings1 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}