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
import com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV03;
import com.tools20022.repository.choice.LinkedMessage2Choice;
import com.tools20022.repository.codeset.AccountManagementType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentAccount45;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the message reference of the account management instruction
 * message for which the status is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmLinkedReference
 * AccountManagementMessageReference2.mmLinkedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmStatusRequestType
 * AccountManagementMessageReference2.mmStatusRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmAccountApplicationIdentification
 * AccountManagementMessageReference2.mmAccountApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmInvestmentAccount
 * AccountManagementMessageReference2.mmInvestmentAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV03#mmRequestDetails
 * RequestForAccountManagementStatusReportV03.mmRequestDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementMessageReference2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the message reference of the account management instruction message for which the status is requested."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forAccountManagementMessageReference2
 * ConstraintOtherReferenceGuideline.forAccountManagementMessageReference2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline#forAccountManagementMessageReference2
 * ConstraintPreviousReferenceGuideline.forAccountManagementMessageReference2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule#forAccountManagementMessageReference2
 * ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.
 * forAccountManagementMessageReference2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
 * AccountManagementMessageReference3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference1
 * AccountManagementMessageReference1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountManagementMessageReference2", propOrder = {"linkedReference", "statusRequestType", "accountApplicationIdentification", "investmentAccount"})
public class AccountManagementMessageReference2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LkdRef")
	protected LinkedMessage2Choice linkedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage2Choice
	 * LinkedMessage2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2
	 * AccountManagementMessageReference2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmLinkedReference
	 * AccountManagementMessageReference3.mmLinkedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementMessageReference2, Optional<LinkedMessage2Choice>> mmLinkedReference = new MMMessageAssociationEnd<AccountManagementMessageReference2, Optional<LinkedMessage2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmObject();
			isDerived = false;
			xmlTag = "LkdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReference";
			definition = "Reference to a linked message.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementMessageReference3.mmLinkedReference);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LinkedMessage2Choice.mmObject();
		}

		@Override
		public Optional<LinkedMessage2Choice> getValue(AccountManagementMessageReference2 obj) {
			return obj.getLinkedReference();
		}

		@Override
		public void setValue(AccountManagementMessageReference2 obj, Optional<LinkedMessage2Choice> value) {
			obj.setLinkedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StsReqTp", required = true)
	protected AccountManagementType1Code statusRequestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType1Code
	 * AccountManagementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2
	 * AccountManagementMessageReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsReqTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the status request refers to an earlier account opening or modification instruction message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmStatusRequestType
	 * AccountManagementMessageReference3.mmStatusRequestType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference1#mmStatusRequestType
	 * AccountManagementMessageReference1.mmStatusRequestType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementMessageReference2, AccountManagementType1Code> mmStatusRequestType = new MMMessageAttribute<AccountManagementMessageReference2, AccountManagementType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmObject();
			isDerived = false;
			xmlTag = "StsReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRequestType";
			definition = "Specifies if the status request refers to an earlier account opening or modification instruction message.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementMessageReference3.mmStatusRequestType);
			previousVersion_lazy = () -> AccountManagementMessageReference1.mmStatusRequestType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementType1Code.mmObject();
		}

		@Override
		public AccountManagementType1Code getValue(AccountManagementMessageReference2 obj) {
			return obj.getStatusRequestType();
		}

		@Override
		public void setValue(AccountManagementMessageReference2 obj, AccountManagementType1Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2
	 * AccountManagementMessageReference2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmAccountApplicationIdentification
	 * AccountManagementMessageReference3.mmAccountApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference1#mmAccountApplicationIdentification
	 * AccountManagementMessageReference1.mmAccountApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementMessageReference2, Optional<Max35Text>> mmAccountApplicationIdentification = new MMMessageAttribute<AccountManagementMessageReference2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account opening or account modification instruction at application level.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementMessageReference3.mmAccountApplicationIdentification);
			previousVersion_lazy = () -> AccountManagementMessageReference1.mmAccountApplicationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AccountManagementMessageReference2 obj) {
			return obj.getAccountApplicationIdentification();
		}

		@Override
		public void setValue(AccountManagementMessageReference2 obj, Optional<Max35Text> value) {
			obj.setAccountApplicationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcct")
	protected InvestmentAccount45 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount45
	 * InvestmentAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2
	 * AccountManagementMessageReference2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmInvestmentAccount
	 * AccountManagementMessageReference3.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference1#mmInvestmentAccount
	 * AccountManagementMessageReference1.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementMessageReference2, Optional<InvestmentAccount45>> mmInvestmentAccount = new MMMessageAssociationEnd<AccountManagementMessageReference2, Optional<InvestmentAccount45>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Account information for which the status of an account management instruction is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementMessageReference3.mmInvestmentAccount);
			previousVersion_lazy = () -> AccountManagementMessageReference1.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount45.mmObject();
		}

		@Override
		public Optional<InvestmentAccount45> getValue(AccountManagementMessageReference2 obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(AccountManagementMessageReference2 obj, Optional<InvestmentAccount45> value) {
			obj.setInvestmentAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference2.mmLinkedReference, com.tools20022.repository.msg.AccountManagementMessageReference2.mmStatusRequestType,
						com.tools20022.repository.msg.AccountManagementMessageReference2.mmAccountApplicationIdentification, com.tools20022.repository.msg.AccountManagementMessageReference2.mmInvestmentAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(RequestForAccountManagementStatusReportV03.mmRequestDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forAccountManagementMessageReference2,
						com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline.forAccountManagementMessageReference2,
						com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.forAccountManagementMessageReference2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountManagementMessageReference2";
				definition = "Information about the message reference of the account management instruction message for which the status is requested.";
				nextVersions_lazy = () -> Arrays.asList(AccountManagementMessageReference3.mmObject());
				previousVersion_lazy = () -> AccountManagementMessageReference1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<LinkedMessage2Choice> getLinkedReference() {
		return linkedReference == null ? Optional.empty() : Optional.of(linkedReference);
	}

	public AccountManagementMessageReference2 setLinkedReference(LinkedMessage2Choice linkedReference) {
		this.linkedReference = linkedReference;
		return this;
	}

	public AccountManagementType1Code getStatusRequestType() {
		return statusRequestType;
	}

	public AccountManagementMessageReference2 setStatusRequestType(AccountManagementType1Code statusRequestType) {
		this.statusRequestType = Objects.requireNonNull(statusRequestType);
		return this;
	}

	public Optional<Max35Text> getAccountApplicationIdentification() {
		return accountApplicationIdentification == null ? Optional.empty() : Optional.of(accountApplicationIdentification);
	}

	public AccountManagementMessageReference2 setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
		return this;
	}

	public Optional<InvestmentAccount45> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public AccountManagementMessageReference2 setInvestmentAccount(InvestmentAccount45 investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}
}