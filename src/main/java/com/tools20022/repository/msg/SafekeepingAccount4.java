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
import com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03;
import com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A safekeeping account is an account on which a securities entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmAccountIdentification
 * SafekeepingAccount4.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmAccountOwner
 * SafekeepingAccount4.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmSubAccountDetails
 * SafekeepingAccount4.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmInstructedBalance
 * SafekeepingAccount4.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmRightsHolder
 * SafekeepingAccount4.mmRightsHolder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmInstructedPosition
 * MeetingInstructionCancellationRequestV03.mmInstructedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmInstructedPosition
 * MeetingInstructionCancellationRequestV04.mmInstructedPosition}</li>
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
 * "SafekeepingAccount4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A safekeeping account is an account on which a securities entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount6
 * SafekeepingAccount6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SafekeepingAccount4", propOrder = {"accountIdentification", "accountOwner", "subAccountDetails", "instructedBalance", "rightsHolder"})
public class SafekeepingAccount4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmAccountIdentification
	 * SafekeepingAccount6.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> SafekeepingAccount4.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingAccount6.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification9Choice accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmAccountOwner
	 * SafekeepingAccount6.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SafekeepingAccount4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingAccount6.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification9Choice.mmObject();
		}
	};
	protected SubAccount2 subAccountDetails;
	/**
	 * Identification of a subaccount within the safekeeping account
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount2
	 * SubAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
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
	 * definition} =
	 * "Identification of a subaccount within the safekeeping account"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmSubAccountDetails
	 * SafekeepingAccount6.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> SafekeepingAccount4.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Identification of a subaccount within the safekeeping account";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingAccount6.mmSubAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubAccount2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.HoldingBalance5> instructedBalance;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.HoldingBalance5
	 * HoldingBalance5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
	 * SecuritiesAccount.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmInstructedBalance
	 * SafekeepingAccount6.mmInstructedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesBalance;
			componentContext_lazy = () -> SafekeepingAccount4.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingAccount6.mmInstructedBalance);
			maxOccurs = 10;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.HoldingBalance5.mmObject();
		}
	};
	protected List<PartyIdentification9Choice> rightsHolder;
	/**
	 * Owner of the voting rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the voting rights."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmRightsHolder
	 * SafekeepingAccount6.mmRightsHolder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRightsHolder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SafekeepingAccount4.mmObject();
			isDerived = false;
			xmlTag = "RghtsHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			definition = "Owner of the voting rights.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingAccount6.mmRightsHolder);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification9Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SafekeepingAccount4.mmAccountIdentification, SafekeepingAccount4.mmAccountOwner, SafekeepingAccount4.mmSubAccountDetails, SafekeepingAccount4.mmInstructedBalance,
						SafekeepingAccount4.mmRightsHolder);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV03.mmInstructedPosition, MeetingInstructionCancellationRequestV04.mmInstructedPosition);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingAccount4";
				definition = "A safekeeping account is an account on which a securities entry is made.";
				nextVersions_lazy = () -> Arrays.asList(SafekeepingAccount6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctId", required = true)
	public Max35Text getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification9Choice getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification9Choice accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SubAcctDtls")
	public SubAccount2 getSubAccountDetails() {
		return subAccountDetails;
	}

	public void setSubAccountDetails(com.tools20022.repository.msg.SubAccount2 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
	}

	@XmlElement(name = "InstdBal", required = true)
	public List<HoldingBalance5> getInstructedBalance() {
		return instructedBalance;
	}

	public void setInstructedBalance(List<com.tools20022.repository.msg.HoldingBalance5> instructedBalance) {
		this.instructedBalance = instructedBalance;
	}

	@XmlElement(name = "RghtsHldr")
	public List<PartyIdentification9Choice> getRightsHolder() {
		return rightsHolder;
	}

	public void setRightsHolder(List<PartyIdentification9Choice> rightsHolder) {
		this.rightsHolder = rightsHolder;
	}
}