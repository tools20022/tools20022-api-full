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
import com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.entity.SecuritiesEntry;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmStatementGeneralDetails
 * CustodyStatementOfHoldings2.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmAccountDetails
 * CustodyStatementOfHoldings2.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmBalanceForAccount
 * CustodyStatementOfHoldings2.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmSubAccountDetails
 * CustodyStatementOfHoldings2.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmTotalValues
 * CustodyStatementOfHoldings2.mmTotalValues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmExtension
 * CustodyStatementOfHoldings2.mmExtension}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmStatementToBeCancelled
 * CustodyStatementOfHoldingsCancellationV02.mmStatementToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodyStatementOfHoldings2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a custody statement of holdings."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CustodyStatementOfHoldings2", propOrder = {"statementGeneralDetails", "accountDetails", "balanceForAccount", "subAccountDetails", "totalValues", "extension"})
public class CustodyStatementOfHoldings2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Statement7 statementGeneralDetails;
	/**
	 * General information related to the custody statement of holdings that is
	 * being cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Statement7 Statement7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
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
	public static final MMMessageAssociationEnd mmStatementGeneralDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CustodyStatementOfHoldings2.mmObject();
			isDerived = false;
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "General information related to the custody statement of holdings that is being cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Statement7.mmObject();
		}
	};
	protected SafekeepingAccount2 accountDetails;
	/**
	 * Safekeeping or investment account of the statement that is being
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafekeepingAccount2
	 * SafekeepingAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesAccount
	 * SecuritiesEntry.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
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
	public static final MMMessageAssociationEnd mmAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesEntry.mmSecuritiesAccount;
			componentContext_lazy = () -> CustodyStatementOfHoldings2.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Safekeeping or investment account of the statement that is being cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SafekeepingAccount2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AggregateBalanceInformation4> balanceForAccount;
	/**
	 * Net position of a segregated holding, in a single security, within the
	 * overall position held in a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4
	 * AggregateBalanceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
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
	public static final MMMessageAssociationEnd mmBalanceForAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> CustodyStatementOfHoldings2.mmObject();
			isDerived = false;
			xmlTag = "BalForAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccount";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SubAccountIdentification5> subAccountDetails;
	/**
	 * Sub-account of the safekeeping or investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5
	 * SubAccountIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
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
	public static final MMMessageAssociationEnd mmSubAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CustodyStatementOfHoldings2.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the safekeeping or investment account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubAccountIdentification5.mmObject();
		}
	};
	protected TotalValueInPageAndStatement totalValues;
	/**
	 * Value of total holdings reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement
	 * TotalValueInPageAndStatement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
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
	public static final MMMessageAssociationEnd mmTotalValues = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CustodyStatementOfHoldings2.mmObject();
			isDerived = false;
			xmlTag = "TtlVals";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalValues";
			definition = "Value of total holdings reported.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
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
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CustodyStatementOfHoldings2.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CustodyStatementOfHoldings2.mmStatementGeneralDetails, CustodyStatementOfHoldings2.mmAccountDetails, CustodyStatementOfHoldings2.mmBalanceForAccount,
						CustodyStatementOfHoldings2.mmSubAccountDetails, CustodyStatementOfHoldings2.mmTotalValues, CustodyStatementOfHoldings2.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustodyStatementOfHoldingsCancellationV02.mmStatementToBeCancelled);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodyStatementOfHoldings2";
				definition = "Information about a custody statement of holdings.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StmtGnlDtls")
	public Statement7 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public void setStatementGeneralDetails(com.tools20022.repository.msg.Statement7 statementGeneralDetails) {
		this.statementGeneralDetails = statementGeneralDetails;
	}

	@XmlElement(name = "AcctDtls")
	public SafekeepingAccount2 getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(com.tools20022.repository.msg.SafekeepingAccount2 accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "BalForAcct")
	public List<AggregateBalanceInformation4> getBalanceForAccount() {
		return balanceForAccount;
	}

	public void setBalanceForAccount(List<com.tools20022.repository.msg.AggregateBalanceInformation4> balanceForAccount) {
		this.balanceForAccount = balanceForAccount;
	}

	@XmlElement(name = "SubAcctDtls")
	public List<SubAccountIdentification5> getSubAccountDetails() {
		return subAccountDetails;
	}

	public void setSubAccountDetails(List<com.tools20022.repository.msg.SubAccountIdentification5> subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
	}

	@XmlElement(name = "TtlVals")
	public TotalValueInPageAndStatement getTotalValues() {
		return totalValues;
	}

	public void setTotalValues(com.tools20022.repository.msg.TotalValueInPageAndStatement totalValues) {
		this.totalValues = totalValues;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = extension;
	}
}