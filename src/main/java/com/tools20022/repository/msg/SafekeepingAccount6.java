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
import com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05;
import com.tools20022.repository.choice.PartyIdentification40Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmAccountIdentification
 * SafekeepingAccount6.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmAccountOwner
 * SafekeepingAccount6.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmSubAccountDetails
 * SafekeepingAccount6.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmInstructedBalance
 * SafekeepingAccount6.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmRightsHolder
 * SafekeepingAccount6.mmRightsHolder}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05#mmInstructedPosition
 * MeetingInstructionCancellationRequestV05.mmInstructedPosition}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forSafekeepingAccount6
 * ConstraintRightsHolderMultiplicty1Guideline.forSafekeepingAccount6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceQall1Rule#forSafekeepingAccount6
 * ConstraintBalanceQall1Rule.forSafekeepingAccount6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingAccount6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A safekeeping account is an account on which a securities entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
 * SafekeepingAccount4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SafekeepingAccount6", propOrder = {"accountIdentification", "accountOwner", "subAccountDetails", "instructedBalance", "rightsHolder"})
public class SafekeepingAccount6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected Max35Text accountIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmAccountIdentification
	 * SafekeepingAccount4.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingAccount6.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> SafekeepingAccount4.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification40Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmAccountOwner
	 * SafekeepingAccount4.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingAccount6.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> SafekeepingAccount4.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40Choice.mmObject();
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected SubAccount2 subAccountDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmSubAccountDetails
	 * SafekeepingAccount4.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingAccount6.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Identification of a subaccount within the safekeeping account";
			previousVersion_lazy = () -> SafekeepingAccount4.mmSubAccountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubAccount2.mmObject();
		}
	};
	@XmlElement(name = "InstdBal", required = true)
	protected List<com.tools20022.repository.msg.HoldingBalance8> instructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.HoldingBalance8
	 * HoldingBalance8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
	 * SecuritiesAccount.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmInstructedBalance
	 * SafekeepingAccount4.mmInstructedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingAccount6.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> SafekeepingAccount4.mmInstructedBalance;
			maxOccurs = 10;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.HoldingBalance8.mmObject();
		}
	};
	@XmlElement(name = "RghtsHldr")
	protected List<PartyIdentification40Choice> rightsHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmRightsHolder
	 * SafekeepingAccount4.mmRightsHolder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRightsHolder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingAccount6.mmObject();
			isDerived = false;
			xmlTag = "RghtsHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			definition = "Owner of the voting rights.";
			previousVersion_lazy = () -> SafekeepingAccount4.mmRightsHolder;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount6.mmAccountIdentification, com.tools20022.repository.msg.SafekeepingAccount6.mmAccountOwner,
						com.tools20022.repository.msg.SafekeepingAccount6.mmSubAccountDetails, com.tools20022.repository.msg.SafekeepingAccount6.mmInstructedBalance, com.tools20022.repository.msg.SafekeepingAccount6.mmRightsHolder);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV05.mmInstructedPosition);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forSafekeepingAccount6,
						com.tools20022.repository.constraints.ConstraintBalanceQall1Rule.forSafekeepingAccount6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingAccount6";
				definition = "A safekeeping account is an account on which a securities entry is made.";
				previousVersion_lazy = () -> SafekeepingAccount4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getAccountIdentification() {
		return accountIdentification;
	}

	public SafekeepingAccount6 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Optional<PartyIdentification40Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SafekeepingAccount6 setAccountOwner(PartyIdentification40Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<SubAccount2> getSubAccountDetails() {
		return subAccountDetails == null ? Optional.empty() : Optional.of(subAccountDetails);
	}

	public SafekeepingAccount6 setSubAccountDetails(com.tools20022.repository.msg.SubAccount2 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
		return this;
	}

	public List<HoldingBalance8> getInstructedBalance() {
		return instructedBalance == null ? instructedBalance = new ArrayList<>() : instructedBalance;
	}

	public SafekeepingAccount6 setInstructedBalance(List<com.tools20022.repository.msg.HoldingBalance8> instructedBalance) {
		this.instructedBalance = Objects.requireNonNull(instructedBalance);
		return this;
	}

	public List<PartyIdentification40Choice> getRightsHolder() {
		return rightsHolder == null ? rightsHolder = new ArrayList<>() : rightsHolder;
	}

	public SafekeepingAccount6 setRightsHolder(List<PartyIdentification40Choice> rightsHolder) {
		this.rightsHolder = Objects.requireNonNull(rightsHolder);
		return this;
	}
}