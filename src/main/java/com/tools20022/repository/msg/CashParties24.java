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
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cash settlement chain parties and accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties24#mmCreditor
 * CashParties24.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties24#mmCreditorAgent
 * CashParties24.mmCreditorAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties24#mmIntermediary
 * CashParties24.mmIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties24#mmIntermediary2
 * CashParties24.mmIntermediary2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
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
 * "CashParties24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cash settlement chain parties and accounts."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashParties24", propOrder = {"creditor", "creditorAgent", "intermediary", "intermediary2"})
public class CashParties24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentificationAndAccount96 creditor;
	/**
	 * Party to which the payment amount must be ultimately delivered. In some
	 * cases, this may be a fund.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96
	 * PartyIdentificationAndAccount96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties24 CashParties24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the payment amount must be ultimately delivered. In some cases, this may be a fund.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CashParties24.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which the payment amount must be ultimately delivered. In some cases, this may be a fund.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount96.mmObject();
		}
	};
	protected PartyIdentificationAndAccount97 creditorAgent;
	/**
	 * Financial institution that services the cash account of the beneficiary
	 * (creditor). In some markets, this is also known as receiving agent. The
	 * creditor agent is the party where the payment amount must be ultimately
	 * delivered on behalf of the beneficiary (creditor), that is, the party
	 * where the beneficiary has its account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97
	 * PartyIdentificationAndAccount97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties24 CashParties24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that services the cash account of the beneficiary (creditor). In some markets, this is also known as receiving agent. The creditor agent is the party where the payment amount must be ultimately delivered on behalf of the beneficiary (creditor), that is, the party where the beneficiary has its account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CashParties24.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution that services the cash account of the beneficiary (creditor). In some markets, this is also known as receiving agent. The creditor agent is the party where the payment amount must be ultimately delivered on behalf of the beneficiary (creditor), that is, the party where the beneficiary has its account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount97.mmObject();
		}
	};
	protected PartyIdentificationAndAccount97 intermediary;
	/**
	 * Financial institution through which the transaction must pass to reach
	 * the account with institution (creditor agent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97
	 * PartyIdentificationAndAccount97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties24 CashParties24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution through which the transaction must pass to reach the account with institution (creditor agent)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CashParties24.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Financial institution through which the transaction must pass to reach the account with institution (creditor agent).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount97.mmObject();
		}
	};
	protected PartyIdentificationAndAccount97 intermediary2;
	/**
	 * Financial institution through which the transaction must pass to reach
	 * the account with institution (creditor agent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97
	 * PartyIdentificationAndAccount97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties24 CashParties24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution through which the transaction must pass to reach the account with institution (creditor agent)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediary2 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CashParties24.mmObject();
			isDerived = false;
			xmlTag = "Intrmy2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary2";
			definition = "Financial institution through which the transaction must pass to reach the account with institution (creditor agent).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount97.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashParties24.mmCreditor, CashParties24.mmCreditorAgent, CashParties24.mmIntermediary, CashParties24.mmIntermediary2);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashParties24";
				definition = "Cash settlement chain parties and accounts.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cdtr", required = true)
	public PartyIdentificationAndAccount96 getCreditor() {
		return creditor;
	}

	public void setCreditor(com.tools20022.repository.msg.PartyIdentificationAndAccount96 creditor) {
		this.creditor = creditor;
	}

	@XmlElement(name = "CdtrAgt", required = true)
	public PartyIdentificationAndAccount97 getCreditorAgent() {
		return creditorAgent;
	}

	public void setCreditorAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount97 creditorAgent) {
		this.creditorAgent = creditorAgent;
	}

	@XmlElement(name = "Intrmy")
	public PartyIdentificationAndAccount97 getIntermediary() {
		return intermediary;
	}

	public void setIntermediary(com.tools20022.repository.msg.PartyIdentificationAndAccount97 intermediary) {
		this.intermediary = intermediary;
	}

	@XmlElement(name = "Intrmy2")
	public PartyIdentificationAndAccount97 getIntermediary2() {
		return intermediary2;
	}

	public void setIntermediary2(com.tools20022.repository.msg.PartyIdentificationAndAccount97 intermediary2) {
		this.intermediary2 = intermediary2;
	}
}