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
import com.tools20022.repository.choice.LinkedMessage3Choice;
import com.tools20022.repository.codeset.AccountManagementType1Code;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmLinkedReference
 * AccountManagementMessageReference3.mmLinkedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmStatusRequestType
 * AccountManagementMessageReference3.mmStatusRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmAccountApplicationIdentification
 * AccountManagementMessageReference3.mmAccountApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmExistingAccountIdentification
 * AccountManagementMessageReference3.mmExistingAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3#mmInvestmentAccount
 * AccountManagementMessageReference3.mmInvestmentAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV04#mmRequestDetails
 * RequestForAccountManagementStatusReportV04.mmRequestDetails}</li>
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
 * "AccountManagementMessageReference3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the references of an account management instruction message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4
 * AccountManagementMessageReference4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2
 * AccountManagementMessageReference2}</li>
 * </ul>
 */
public class AccountManagementMessageReference3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected LinkedMessage3Choice linkedReference;
	/**
	 * Reference to a linked message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage3Choice
	 * LinkedMessage3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
	 * AccountManagementMessageReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmLinkedReference
	 * AccountManagementMessageReference4.mmLinkedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmLinkedReference
	 * AccountManagementMessageReference2.mmLinkedReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkedReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountManagementMessageReference3.mmObject();
			isDerived = false;
			xmlTag = "LkdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReference";
			definition = "Reference to a linked message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference4.mmLinkedReference);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmLinkedReference;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LinkedMessage3Choice.mmObject();
		}
	};
	protected AccountManagementType1Code statusRequestType;
	/**
	 * Specifies if the status request refers to an earlier account opening or
	 * modification instruction message.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
	 * AccountManagementMessageReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsReqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the status request refers to an earlier account opening or modification instruction message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmStatusRequestType
	 * AccountManagementMessageReference4.mmStatusRequestType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmStatusRequestType
	 * AccountManagementMessageReference2.mmStatusRequestType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusRequestType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementMessageReference3.mmObject();
			isDerived = false;
			xmlTag = "StsReqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRequestType";
			definition = "Specifies if the status request refers to an earlier account opening or modification instruction message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference4.mmStatusRequestType);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmStatusRequestType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementType1Code.mmObject();
		}
	};
	protected Max35Text accountApplicationIdentification;
	/**
	 * Unique and unambiguous identifier of the account opening or account
	 * modification instruction at application level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
	 * AccountManagementMessageReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the account opening or account modification instruction at application level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmAccountApplicationIdentification
	 * AccountManagementMessageReference4.mmAccountApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmAccountApplicationIdentification
	 * AccountManagementMessageReference2.mmAccountApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountApplicationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementMessageReference3.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account opening or account modification instruction at application level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference4.mmAccountApplicationIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmAccountApplicationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text existingAccountIdentification;
	/**
	 * Account to which the account opening is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
	 * AccountManagementMessageReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExstgAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to which the account opening is related."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmExistingAccountIdentification
	 * AccountManagementMessageReference4.mmExistingAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExistingAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementMessageReference3.mmObject();
			isDerived = false;
			xmlTag = "ExstgAcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingAccountIdentification";
			definition = "Account to which the account opening is related.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference4.mmExistingAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected InvestmentAccount53 investmentAccount;
	/**
	 * Account information for which the status of an account management
	 * instruction is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount53
	 * InvestmentAccount53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
	 * AccountManagementMessageReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account information for which the status of an account management instruction is requested."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4#mmInvestmentAccount
	 * AccountManagementMessageReference4.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2#mmInvestmentAccount
	 * AccountManagementMessageReference2.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountManagementMessageReference3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Account information for which the status of an account management instruction is requested.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference4.mmInvestmentAccount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AccountManagementMessageReference2.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount53.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementMessageReference3.mmLinkedReference, com.tools20022.repository.msg.AccountManagementMessageReference3.mmStatusRequestType,
						com.tools20022.repository.msg.AccountManagementMessageReference3.mmAccountApplicationIdentification, com.tools20022.repository.msg.AccountManagementMessageReference3.mmExistingAccountIdentification,
						com.tools20022.repository.msg.AccountManagementMessageReference3.mmInvestmentAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV04.mmRequestDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountManagementMessageReference3";
				definition = "Information about the references of an account management instruction message.";
				nextVersions_lazy = () -> Arrays.asList(AccountManagementMessageReference4.mmObject());
				previousVersion_lazy = () -> AccountManagementMessageReference2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public LinkedMessage3Choice getLinkedReference() {
		return linkedReference;
	}

	public void setLinkedReference(LinkedMessage3Choice linkedReference) {
		this.linkedReference = linkedReference;
	}

	public AccountManagementType1Code getStatusRequestType() {
		return statusRequestType;
	}

	public void setStatusRequestType(AccountManagementType1Code statusRequestType) {
		this.statusRequestType = statusRequestType;
	}

	public Max35Text getAccountApplicationIdentification() {
		return accountApplicationIdentification;
	}

	public void setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
	}

	public Max35Text getExistingAccountIdentification() {
		return existingAccountIdentification;
	}

	public void setExistingAccountIdentification(Max35Text existingAccountIdentification) {
		this.existingAccountIdentification = existingAccountIdentification;
	}

	public InvestmentAccount53 getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(com.tools20022.repository.msg.InvestmentAccount53 investmentAccount) {
		this.investmentAccount = investmentAccount;
	}
}