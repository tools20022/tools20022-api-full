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
import com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03;
import com.tools20022.repository.choice.AccountIdentificationFormatChoice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#mmIdentification
 * SubAccountIdentification36.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#mmActivityIndicator
 * SubAccountIdentification36.mmActivityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#mmTransactionOnSubAccount
 * SubAccountIdentification36.mmTransactionOnSubAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountIdentification
 * AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmSubAccountDetails
 * StatementOfInvestmentFundTransactionsV03.mmSubAccountDetails}</li>
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
 * "SubAccountIdentification36"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6
 * SubAccountIdentification6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SubAccountIdentification36", propOrder = {"identification", "activityIndicator", "transactionOnSubAccount"})
public class SubAccountIdentification36 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountIdentificationFormatChoice identification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36
	 * SubAccountIdentification36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6#mmIdentification
	 * SubAccountIdentification6.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> SubAccountIdentification36.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> SubAccountIdentification6.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}
	};
	protected YesNoIndicator activityIndicator;
	/**
	 * Indicates whether there is activity reported in the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36
	 * SubAccountIdentification36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity reported in the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6#mmActivityIndicator
	 * SubAccountIdentification6.mmActivityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SubAccountIdentification36.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity reported in the statement.";
			previousVersion_lazy = () -> SubAccountIdentification6.mmActivityIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentFundTransactionsByFund3> transactionOnSubAccount;
	/**
	 * Creation/cancellation of investment units on the books of the fund or its
	 * designated agent, as a result of executing an investment fund order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36
	 * SubAccountIdentification36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxOnSubAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnSubAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6#mmTransactionOnSubAccount
	 * SubAccountIdentification6.mmTransactionOnSubAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionOnSubAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundTransaction;
			componentContext_lazy = () -> SubAccountIdentification36.mmObject();
			isDerived = false;
			xmlTag = "TxOnSubAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnSubAccount";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			previousVersion_lazy = () -> SubAccountIdentification6.mmTransactionOnSubAccount;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SubAccountIdentification36.mmIdentification, SubAccountIdentification36.mmActivityIndicator, SubAccountIdentification36.mmTransactionOnSubAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactionsV03.mmSubAccountDetails);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubAccountIdentification36";
				definition = "Account to or from which a securities entry is made.";
				previousVersion_lazy = () -> SubAccountIdentification6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public AccountIdentificationFormatChoice getIdentification() {
		return identification;
	}

	public void setIdentification(AccountIdentificationFormatChoice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "ActvtyInd", required = true)
	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public void setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = activityIndicator;
	}

	@XmlElement(name = "TxOnSubAcct")
	public List<InvestmentFundTransactionsByFund3> getTransactionOnSubAccount() {
		return transactionOnSubAccount;
	}

	public void setTransactionOnSubAccount(List<com.tools20022.repository.msg.InvestmentFundTransactionsByFund3> transactionOnSubAccount) {
		this.transactionOnSubAccount = transactionOnSubAccount;
	}
}