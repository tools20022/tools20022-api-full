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
import com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a statement of investment fund transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmStatementGeneralDetails
 * StatementOfInvestmentFundTransactions3.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmInvestmentAccountDetails
 * StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmTransactionOnAccount
 * StatementOfInvestmentFundTransactions3.mmTransactionOnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmSubAccountDetails
 * StatementOfInvestmentFundTransactions3.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmExtension
 * StatementOfInvestmentFundTransactions3.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmStatementToBeCancelled
 * StatementOfInvestmentFundTransactionsCancellationV03.mmStatementToBeCancelled
 * }</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionOnAccountOrSubAccountDetailsRule#forStatementOfInvestmentFundTransactions3
 * ConstraintTransactionOnAccountOrSubAccountDetailsRule.
 * forStatementOfInvestmentFundTransactions3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementOfInvestmentFundTransactions3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about a statement of investment fund transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2
 * StatementOfInvestmentFundTransactions2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementOfInvestmentFundTransactions3", propOrder = {"statementGeneralDetails", "investmentAccountDetails", "transactionOnAccount", "subAccountDetails", "extension"})
public class StatementOfInvestmentFundTransactions3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtGnlDtls")
	protected Statement8 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Statement8 Statement8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
	 * StatementOfInvestmentFundTransactions3}</li>
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
	 * "General information related to the investment fund statement of transactions that is being cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmStatementGeneralDetails
	 * StatementOfInvestmentFundTransactions2.mmStatementGeneralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, Optional<Statement8>> mmStatementGeneralDetails = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, Optional<Statement8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmObject();
			isDerived = false;
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "General information related to the investment fund statement of transactions that is being cancelled.";
			previousVersion_lazy = () -> StatementOfInvestmentFundTransactions2.mmStatementGeneralDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Statement8.mmObject();
		}

		@Override
		public Optional<Statement8> getValue(StatementOfInvestmentFundTransactions3 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions3 obj, Optional<Statement8> value) {
			obj.setStatementGeneralDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount43 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount43
	 * InvestmentAccount43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
	 * StatementOfInvestmentFundTransactions3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to an investment account of the statement that is being cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmInvestmentAccountDetails
	 * StatementOfInvestmentFundTransactions2.mmInvestmentAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, Optional<InvestmentAccount43>> mmInvestmentAccountDetails = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, Optional<InvestmentAccount43>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Information related to an investment account of the statement that is being cancelled.";
			previousVersion_lazy = () -> StatementOfInvestmentFundTransactions2.mmInvestmentAccountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount43.mmObject();
		}

		@Override
		public Optional<InvestmentAccount43> getValue(StatementOfInvestmentFundTransactions3 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions3 obj, Optional<InvestmentAccount43> value) {
			obj.setInvestmentAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TxOnAcct")
	protected List<InvestmentFundTransactionsByFund3> transactionOnAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3
	 * InvestmentFundTransactionsByFund3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
	 * InvestmentAccount.mmInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
	 * StatementOfInvestmentFundTransactions3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxOnAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmTransactionOnAccount
	 * StatementOfInvestmentFundTransactions2.mmTransactionOnAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, List<InvestmentFundTransactionsByFund3>> mmTransactionOnAccount = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, List<InvestmentFundTransactionsByFund3>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmObject();
			isDerived = false;
			xmlTag = "TxOnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnAccount";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			previousVersion_lazy = () -> StatementOfInvestmentFundTransactions2.mmTransactionOnAccount;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFundTransactionsByFund3.mmObject();
		}

		@Override
		public List<InvestmentFundTransactionsByFund3> getValue(StatementOfInvestmentFundTransactions3 obj) {
			return obj.getTransactionOnAccount();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions3 obj, List<InvestmentFundTransactionsByFund3> value) {
			obj.setTransactionOnAccount(value);
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected List<SubAccountIdentification36> subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36
	 * SubAccountIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
	 * StatementOfInvestmentFundTransactions3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmSubAccountDetails
	 * StatementOfInvestmentFundTransactions2.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, List<SubAccountIdentification36>> mmSubAccountDetails = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, List<SubAccountIdentification36>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the safekeeping or investment account.";
			previousVersion_lazy = () -> StatementOfInvestmentFundTransactions2.mmSubAccountDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccountIdentification36.mmObject();
		}

		@Override
		public List<SubAccountIdentification36> getValue(StatementOfInvestmentFundTransactions3 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions3 obj, List<SubAccountIdentification36> value) {
			obj.setSubAccountDetails(value);
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
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
	 * StatementOfInvestmentFundTransactions3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmExtension
	 * StatementOfInvestmentFundTransactions2.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, List<Extension1>> mmExtension = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions3, List<Extension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> StatementOfInvestmentFundTransactions2.mmExtension;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(StatementOfInvestmentFundTransactions3 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions3 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmStatementGeneralDetails,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmTransactionOnAccount,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmSubAccountDetails, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactionsCancellationV03.mmStatementToBeCancelled);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionOnAccountOrSubAccountDetailsRule.forStatementOfInvestmentFundTransactions3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementOfInvestmentFundTransactions3";
				definition = "Information about a statement of investment fund transactions.";
				previousVersion_lazy = () -> StatementOfInvestmentFundTransactions2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Statement8> getStatementGeneralDetails() {
		return statementGeneralDetails == null ? Optional.empty() : Optional.of(statementGeneralDetails);
	}

	public StatementOfInvestmentFundTransactions3 setStatementGeneralDetails(Statement8 statementGeneralDetails) {
		this.statementGeneralDetails = statementGeneralDetails;
		return this;
	}

	public Optional<InvestmentAccount43> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public StatementOfInvestmentFundTransactions3 setInvestmentAccountDetails(InvestmentAccount43 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public List<InvestmentFundTransactionsByFund3> getTransactionOnAccount() {
		return transactionOnAccount == null ? transactionOnAccount = new ArrayList<>() : transactionOnAccount;
	}

	public StatementOfInvestmentFundTransactions3 setTransactionOnAccount(List<InvestmentFundTransactionsByFund3> transactionOnAccount) {
		this.transactionOnAccount = Objects.requireNonNull(transactionOnAccount);
		return this;
	}

	public List<SubAccountIdentification36> getSubAccountDetails() {
		return subAccountDetails == null ? subAccountDetails = new ArrayList<>() : subAccountDetails;
	}

	public StatementOfInvestmentFundTransactions3 setSubAccountDetails(List<SubAccountIdentification36> subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public StatementOfInvestmentFundTransactions3 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}