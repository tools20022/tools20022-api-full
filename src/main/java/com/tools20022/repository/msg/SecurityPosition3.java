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
import com.tools20022.repository.entity.InstructionForMeeting;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition3#mmIdentification
 * SecurityPosition3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition3#mmAccount
 * SecurityPosition3.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition3#mmVoteInstruction
 * SecurityPosition3.mmVoteInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition3#mmSecuritySubPosition
 * SecurityPosition3.mmSecuritySubPosition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityPosition3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityPosition3", propOrder = {"identification", "account", "voteInstruction", "securitySubPosition"})
public class SecurityPosition3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification3 identification;
	/**
	 * Security held in an account on which the balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3
	 * SecurityIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3
	 * SecurityPosition3}</li>
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
	 * "Security held in an account on which the balance is calculated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SecurityPosition3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Security held in an account on which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification3.mmObject();
		}
	};
	protected EligiblePosition1 account;
	/**
	 * Amount of securities that are eligible for the vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EligiblePosition1
	 * EligiblePosition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
	 * SecuritiesBalance.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3
	 * SecurityPosition3}</li>
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
	 * definition} = "Amount of securities that are eligible for the vote."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesAccount;
			componentContext_lazy = () -> SecurityPosition3.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Amount of securities that are eligible for the vote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EligiblePosition1.mmObject();
		}
	};
	protected VoteInstruction1 voteInstruction;
	/**
	 * Specifies how a party has voted for each agenda item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VoteInstruction1
	 * VoteInstruction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
	 * InstructionForMeeting.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3
	 * SecurityPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how a party has voted for each agenda item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteInstruction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmVoteInstruction;
			componentContext_lazy = () -> SecurityPosition3.mmObject();
			isDerived = false;
			xmlTag = "VoteInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstruction";
			definition = "Specifies how a party has voted for each agenda item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VoteInstruction1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecurityPosition4> securitySubPosition;
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityPosition4
	 * SecurityPosition4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3
	 * SecurityPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySubPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritySubPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subdivision of an account used to segregate specific holdings."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritySubPosition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> SecurityPosition3.mmObject();
			isDerived = false;
			xmlTag = "SctySubPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritySubPosition";
			definition = "Subdivision of an account used to segregate specific holdings.";
			maxOccurs = 1000;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityPosition4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityPosition3.mmIdentification, SecurityPosition3.mmAccount, SecurityPosition3.mmVoteInstruction, SecurityPosition3.mmSecuritySubPosition);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityPosition3";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public SecurityIdentification3 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.SecurityIdentification3 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Acct")
	public EligiblePosition1 getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.msg.EligiblePosition1 account) {
		this.account = account;
	}

	@XmlElement(name = "VoteInstr")
	public VoteInstruction1 getVoteInstruction() {
		return voteInstruction;
	}

	public void setVoteInstruction(com.tools20022.repository.msg.VoteInstruction1 voteInstruction) {
		this.voteInstruction = voteInstruction;
	}

	@XmlElement(name = "SctySubPos")
	public List<SecurityPosition4> getSecuritySubPosition() {
		return securitySubPosition;
	}

	public void setSecuritySubPosition(List<com.tools20022.repository.msg.SecurityPosition4> securitySubPosition) {
		this.securitySubPosition = securitySubPosition;
	}
}