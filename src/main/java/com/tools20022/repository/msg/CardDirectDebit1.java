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
import com.tools20022.repository.entity.CreditorRole;
import com.tools20022.repository.entity.DebtorRole;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Creditor3;
import com.tools20022.repository.msg.Debtor3;
import com.tools20022.repository.msg.MandateRelatedInformation13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Element containing all information needed for a card initiating direct debit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1#mmDebtorIdentification
 * CardDirectDebit1.mmDebtorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1#mmCreditorIdentification
 * CardDirectDebit1.mmCreditorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1#mmMandateRelatedInformation
 * CardDirectDebit1.mmMandateRelatedInformation}</li>
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
 * "CardDirectDebit1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Element containing all information needed for a card initiating direct debit."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardDirectDebit1", propOrder = {"debtorIdentification", "creditorIdentification", "mandateRelatedInformation"})
public class CardDirectDebit1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtrId")
	protected Debtor3 debtorIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Debtor3 Debtor3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebtorRole DebtorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1
	 * CardDirectDebit1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardDirectDebit1, Optional<Debtor3>> mmDebtorIdentification = new MMMessageAssociationEnd<CardDirectDebit1, Optional<Debtor3>>() {
		{
			businessComponentTrace_lazy = () -> DebtorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardDirectDebit1.mmObject();
			isDerived = false;
			xmlTag = "DbtrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorIdentification";
			definition = "Information related to the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Debtor3.mmObject();
		}

		@Override
		public Optional<Debtor3> getValue(CardDirectDebit1 obj) {
			return obj.getDebtorIdentification();
		}

		@Override
		public void setValue(CardDirectDebit1 obj, Optional<Debtor3> value) {
			obj.setDebtorIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrId", required = true)
	protected Creditor3 creditorIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Creditor3 Creditor3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditorRole CreditorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1
	 * CardDirectDebit1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardDirectDebit1, Creditor3> mmCreditorIdentification = new MMMessageAssociationEnd<CardDirectDebit1, Creditor3>() {
		{
			businessComponentTrace_lazy = () -> CreditorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardDirectDebit1.mmObject();
			isDerived = false;
			xmlTag = "CdtrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorIdentification";
			definition = "Information related to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Creditor3.mmObject();
		}

		@Override
		public Creditor3 getValue(CardDirectDebit1 obj) {
			return obj.getCreditorIdentification();
		}

		@Override
		public void setValue(CardDirectDebit1 obj, Creditor3 value) {
			obj.setCreditorIdentification(value);
		}
	};
	@XmlElement(name = "MndtRltdInf", required = true)
	protected MandateRelatedInformation13 mandateRelatedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation13
	 * MandateRelatedInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1
	 * CardDirectDebit1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtRltdInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateRelatedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides further details of the mandate signed between the creditor and the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardDirectDebit1, MandateRelatedInformation13> mmMandateRelatedInformation = new MMMessageAssociationEnd<CardDirectDebit1, MandateRelatedInformation13>() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardDirectDebit1.mmObject();
			isDerived = false;
			xmlTag = "MndtRltdInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRelatedInformation";
			definition = "Provides further details of the mandate signed between the creditor and the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MandateRelatedInformation13.mmObject();
		}

		@Override
		public MandateRelatedInformation13 getValue(CardDirectDebit1 obj) {
			return obj.getMandateRelatedInformation();
		}

		@Override
		public void setValue(CardDirectDebit1 obj, MandateRelatedInformation13 value) {
			obj.setMandateRelatedInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardDirectDebit1.mmDebtorIdentification, com.tools20022.repository.msg.CardDirectDebit1.mmCreditorIdentification,
						com.tools20022.repository.msg.CardDirectDebit1.mmMandateRelatedInformation);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDirectDebit1";
				definition = "Element containing all information needed for a card initiating direct debit.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Debtor3> getDebtorIdentification() {
		return debtorIdentification == null ? Optional.empty() : Optional.of(debtorIdentification);
	}

	public CardDirectDebit1 setDebtorIdentification(Debtor3 debtorIdentification) {
		this.debtorIdentification = debtorIdentification;
		return this;
	}

	public Creditor3 getCreditorIdentification() {
		return creditorIdentification;
	}

	public CardDirectDebit1 setCreditorIdentification(Creditor3 creditorIdentification) {
		this.creditorIdentification = Objects.requireNonNull(creditorIdentification);
		return this;
	}

	public MandateRelatedInformation13 getMandateRelatedInformation() {
		return mandateRelatedInformation;
	}

	public CardDirectDebit1 setMandateRelatedInformation(MandateRelatedInformation13 mandateRelatedInformation) {
		this.mandateRelatedInformation = Objects.requireNonNull(mandateRelatedInformation);
		return this;
	}
}