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
import com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV05;
import com.tools20022.repository.choice.LinkedMessage4Choice;
import com.tools20022.repository.codeset.AccountManagementType3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Account23;
import com.tools20022.repository.msg.InvestmentAccount53;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the references of an account management instruction
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmLinkedReference
 * AccountManagementMessageReference4.mmLinkedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmStatusRequestType
 * AccountManagementMessageReference4.mmStatusRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmAccountApplicationIdentification
 * AccountManagementMessageReference4.mmAccountApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmExistingAccountIdentification
 * AccountManagementMessageReference4.mmExistingAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmInvestmentAccount
 * AccountManagementMessageReference4.mmInvestmentAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV05#mmRequestDetails
 * RequestForAccountManagementStatusReportV05.mmRequestDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementMessageReference4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the references of an account management instruction message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule#forAccountManagementMessageReference4
 * ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.
 * forAccountManagementMessageReference4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
 * AccountManagementMessageReference3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountManagementMessageReference4", propOrder = {"linkedReference", "statusRequestType", "accountApplicationIdentification", "existingAccountIdentification", "investmentAccount"})
public class AccountManagementMessageReference4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LkdRef")
	protected LinkedMessage4Choice linkedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage4Choice
	 * LinkedMessage4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4
	 * AccountManagementMessageReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmLinkedReference
	 * AccountManagementMessageReference3.mmLinkedReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementMessageReference4, Optional<LinkedMessage4Choice>> mmLinkedReference = new MMMessageAssociationEnd<AccountManagementMessageReference4, Optional<LinkedMessage4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference4.mmObject();
			isDerived = false;
			xmlTag = "LkdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReference";
			definition = "Reference to a linked message.";
			previousVersion_lazy = () -> AccountManagementMessageReference3.mmLinkedReference;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LinkedMessage4Choice.mmObject();
		}

		@Override
		public Optional<LinkedMessage4Choice> getValue(AccountManagementMessageReference4 obj) {
			return obj.getLinkedReference();
		}

		@Override
		public void setValue(AccountManagementMessageReference4 obj, Optional<LinkedMessage4Choice> value) {
			obj.setLinkedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StsReqTp", required = true)
	protected AccountManagementType3Code statusRequestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code
	 * AccountManagementType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4
	 * AccountManagementMessageReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsReqTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of account management instruction for which the status is requested or a request to know the status of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmStatusRequestType
	 * AccountManagementMessageReference3.mmStatusRequestType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementMessageReference4, AccountManagementType3Code> mmStatusRequestType = new MMMessageAttribute<AccountManagementMessageReference4, AccountManagementType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference4.mmObject();
			isDerived = false;
			xmlTag = "StsReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRequestType";
			definition = "Type of account management instruction for which the status is requested or a request to know the status of the account.";
			previousVersion_lazy = () -> AccountManagementMessageReference3.mmStatusRequestType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementType3Code.mmObject();
		}

		@Override
		public AccountManagementType3Code getValue(AccountManagementMessageReference4 obj) {
			return obj.getStatusRequestType();
		}

		@Override
		public void setValue(AccountManagementMessageReference4 obj, AccountManagementType3Code value) {
			obj.setStatusRequestType(value);
		}
	};
	@XmlElement(name = "AcctApplId")
	protected Max35Text accountApplicationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4
	 * AccountManagementMessageReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctApplId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the account opening or account modification instruction at application level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmAccountApplicationIdentification
	 * AccountManagementMessageReference3.mmAccountApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementMessageReference4, Optional<Max35Text>> mmAccountApplicationIdentification = new MMMessageAttribute<AccountManagementMessageReference4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference4.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account opening or account modification instruction at application level.";
			previousVersion_lazy = () -> AccountManagementMessageReference3.mmAccountApplicationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AccountManagementMessageReference4 obj) {
			return obj.getAccountApplicationIdentification();
		}

		@Override
		public void setValue(AccountManagementMessageReference4 obj, Optional<Max35Text> value) {
			obj.setAccountApplicationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ExstgAcctId")
	protected Account23 existingAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account23 Account23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4
	 * AccountManagementMessageReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExstgAcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to which the account opening is related."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmExistingAccountIdentification
	 * AccountManagementMessageReference3.mmExistingAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementMessageReference4, Optional<Account23>> mmExistingAccountIdentification = new MMMessageAssociationEnd<AccountManagementMessageReference4, Optional<Account23>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference4.mmObject();
			isDerived = false;
			xmlTag = "ExstgAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingAccountIdentification";
			definition = "Account to which the account opening is related.";
			previousVersion_lazy = () -> AccountManagementMessageReference3.mmExistingAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Account23.mmObject();
		}

		@Override
		public Optional<Account23> getValue(AccountManagementMessageReference4 obj) {
			return obj.getExistingAccountIdentification();
		}

		@Override
		public void setValue(AccountManagementMessageReference4 obj, Optional<Account23> value) {
			obj.setExistingAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcct")
	protected InvestmentAccount53 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount53
	 * InvestmentAccount53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4
	 * AccountManagementMessageReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account information for which the status of an account management instruction is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmInvestmentAccount
	 * AccountManagementMessageReference3.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementMessageReference4, Optional<InvestmentAccount53>> mmInvestmentAccount = new MMMessageAssociationEnd<AccountManagementMessageReference4, Optional<InvestmentAccount53>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Account information for which the status of an account management instruction is requested.";
			previousVersion_lazy = () -> AccountManagementMessageReference3.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount53.mmObject();
		}

		@Override
		public Optional<InvestmentAccount53> getValue(AccountManagementMessageReference4 obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(AccountManagementMessageReference4 obj, Optional<InvestmentAccount53> value) {
			obj.setInvestmentAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference4.mmLinkedReference, com.tools20022.repository.msg.AccountManagementMessageReference4.mmStatusRequestType,
						com.tools20022.repository.msg.AccountManagementMessageReference4.mmAccountApplicationIdentification, com.tools20022.repository.msg.AccountManagementMessageReference4.mmExistingAccountIdentification,
						com.tools20022.repository.msg.AccountManagementMessageReference4.mmInvestmentAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(RequestForAccountManagementStatusReportV05.mmRequestDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.forAccountManagementMessageReference4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementMessageReference4";
				definition = "Information about the references of an account management instruction message.";
				previousVersion_lazy = () -> AccountManagementMessageReference3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<LinkedMessage4Choice> getLinkedReference() {
		return linkedReference == null ? Optional.empty() : Optional.of(linkedReference);
	}

	public AccountManagementMessageReference4 setLinkedReference(LinkedMessage4Choice linkedReference) {
		this.linkedReference = linkedReference;
		return this;
	}

	public AccountManagementType3Code getStatusRequestType() {
		return statusRequestType;
	}

	public AccountManagementMessageReference4 setStatusRequestType(AccountManagementType3Code statusRequestType) {
		this.statusRequestType = Objects.requireNonNull(statusRequestType);
		return this;
	}

	public Optional<Max35Text> getAccountApplicationIdentification() {
		return accountApplicationIdentification == null ? Optional.empty() : Optional.of(accountApplicationIdentification);
	}

	public AccountManagementMessageReference4 setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
		return this;
	}

	public Optional<Account23> getExistingAccountIdentification() {
		return existingAccountIdentification == null ? Optional.empty() : Optional.of(existingAccountIdentification);
	}

	public AccountManagementMessageReference4 setExistingAccountIdentification(Account23 existingAccountIdentification) {
		this.existingAccountIdentification = existingAccountIdentification;
		return this;
	}

	public Optional<InvestmentAccount53> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public AccountManagementMessageReference4 setInvestmentAccount(InvestmentAccount53 investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}
}