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
import com.tools20022.repository.msg.PartyIdentificationAndAccount96;
import com.tools20022.repository.msg.PartyIdentificationAndAccount97;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashParties24", propOrder = {"creditor", "creditorAgent", "intermediary", "intermediary2"})
public class CashParties24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cdtr", required = true)
	protected PartyIdentificationAndAccount96 creditor;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<CashParties24, PartyIdentificationAndAccount96> mmCreditor = new MMMessageAssociationEnd<CashParties24, PartyIdentificationAndAccount96>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties24.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which the payment amount must be ultimately delivered. In some cases, this may be a fund.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount96.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount96 getValue(CashParties24 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(CashParties24 obj, PartyIdentificationAndAccount96 value) {
			obj.setCreditor(value);
		}
	};
	@XmlElement(name = "CdtrAgt", required = true)
	protected PartyIdentificationAndAccount97 creditorAgent;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<CashParties24, PartyIdentificationAndAccount97> mmCreditorAgent = new MMMessageAssociationEnd<CashParties24, PartyIdentificationAndAccount97>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties24.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution that services the cash account of the beneficiary (creditor). In some markets, this is also known as receiving agent. The creditor agent is the party where the payment amount must be ultimately delivered on behalf of the beneficiary (creditor), that is, the party where the beneficiary has its account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount97.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount97 getValue(CashParties24 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(CashParties24 obj, PartyIdentificationAndAccount97 value) {
			obj.setCreditorAgent(value);
		}
	};
	@XmlElement(name = "Intrmy")
	protected PartyIdentificationAndAccount97 intermediary;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CashParties24, Optional<PartyIdentificationAndAccount97>> mmIntermediary = new MMMessageAttribute<CashParties24, Optional<PartyIdentificationAndAccount97>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties24.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Financial institution through which the transaction must pass to reach the account with institution (creditor agent).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount97.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount97> getValue(CashParties24 obj) {
			return obj.getIntermediary();
		}

		@Override
		public void setValue(CashParties24 obj, Optional<PartyIdentificationAndAccount97> value) {
			obj.setIntermediary(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrmy2")
	protected PartyIdentificationAndAccount97 intermediary2;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CashParties24, Optional<PartyIdentificationAndAccount97>> mmIntermediary2 = new MMMessageAttribute<CashParties24, Optional<PartyIdentificationAndAccount97>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties24.mmObject();
			isDerived = false;
			xmlTag = "Intrmy2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary2";
			definition = "Financial institution through which the transaction must pass to reach the account with institution (creditor agent).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount97.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount97> getValue(CashParties24 obj) {
			return obj.getIntermediary2();
		}

		@Override
		public void setValue(CashParties24 obj, Optional<PartyIdentificationAndAccount97> value) {
			obj.setIntermediary2(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashParties24.mmCreditor, com.tools20022.repository.msg.CashParties24.mmCreditorAgent, com.tools20022.repository.msg.CashParties24.mmIntermediary,
						com.tools20022.repository.msg.CashParties24.mmIntermediary2);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashParties24";
				definition = "Cash settlement chain parties and accounts.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentificationAndAccount96 getCreditor() {
		return creditor;
	}

	public CashParties24 setCreditor(PartyIdentificationAndAccount96 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public PartyIdentificationAndAccount97 getCreditorAgent() {
		return creditorAgent;
	}

	public CashParties24 setCreditorAgent(PartyIdentificationAndAccount97 creditorAgent) {
		this.creditorAgent = Objects.requireNonNull(creditorAgent);
		return this;
	}

	public Optional<PartyIdentificationAndAccount97> getIntermediary() {
		return intermediary == null ? Optional.empty() : Optional.of(intermediary);
	}

	public CashParties24 setIntermediary(PartyIdentificationAndAccount97 intermediary) {
		this.intermediary = intermediary;
		return this;
	}

	public Optional<PartyIdentificationAndAccount97> getIntermediary2() {
		return intermediary2 == null ? Optional.empty() : Optional.of(intermediary2);
	}

	public CashParties24 setIntermediary2(PartyIdentificationAndAccount97 intermediary2) {
		this.intermediary2 = intermediary2;
		return this;
	}
}