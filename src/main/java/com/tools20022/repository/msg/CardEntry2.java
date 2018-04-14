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
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardAggregated1;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.PaymentCard4;
import com.tools20022.repository.msg.PointOfInteraction1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card transaction entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmCard
 * CardEntry2.mmCard}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmPOI
 * CardEntry2.mmPOI}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmAggregatedEntry
 * CardEntry2.mmAggregatedEntry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmPrePaidAccount
 * CardEntry2.mmPrePaidAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardEntry2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card transaction entry."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3 CardEntry3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CardEntry1
 * CardEntry1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardEntry2", propOrder = {"card", "pOI", "aggregatedEntry", "prePaidAccount"})
public class CardEntry2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Card")
	protected PaymentCard4 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard4
	 * PaymentCard4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3#mmCard
	 * CardEntry3.mmCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardEntry1#mmCard
	 * CardEntry1.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry2, Optional<PaymentCard4>> mmCard = new MMMessageAssociationEnd<CardEntry2, Optional<PaymentCard4>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardEntry2.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.";
			nextVersions_lazy = () -> Arrays.asList(CardEntry3.mmCard);
			previousVersion_lazy = () -> CardEntry1.mmCard;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentCard4.mmObject();
		}

		@Override
		public Optional<PaymentCard4> getValue(CardEntry2 obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(CardEntry2 obj, Optional<PaymentCard4> value) {
			obj.setCard(value.orElse(null));
		}
	};
	@XmlElement(name = "POI")
	protected PointOfInteraction1 pOI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical or logical card payment terminal containing software and hardware components."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3#mmPOI
	 * CardEntry3.mmPOI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardEntry1#mmPOI
	 * CardEntry1.mmPOI}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry2, Optional<PointOfInteraction1>> mmPOI = new MMMessageAssociationEnd<CardEntry2, Optional<PointOfInteraction1>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardEntry2.mmObject();
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Physical or logical card payment terminal containing software and hardware components.";
			nextVersions_lazy = () -> Arrays.asList(CardEntry3.mmPOI);
			previousVersion_lazy = () -> CardEntry1.mmPOI;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteraction1.mmObject();
		}

		@Override
		public Optional<PointOfInteraction1> getValue(CardEntry2 obj) {
			return obj.getPOI();
		}

		@Override
		public void setValue(CardEntry2 obj, Optional<PointOfInteraction1> value) {
			obj.setPOI(value.orElse(null));
		}
	};
	@XmlElement(name = "AggtdNtry")
	protected CardAggregated1 aggregatedEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtdNtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatedEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card entry details, based on card transaction aggregated data performed by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardEntry3#mmAggregatedEntry
	 * CardEntry3.mmAggregatedEntry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardEntry1#mmAggregatedEntry
	 * CardEntry1.mmAggregatedEntry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry2, Optional<CardAggregated1>> mmAggregatedEntry = new MMMessageAssociationEnd<CardEntry2, Optional<CardAggregated1>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardEntry2.mmObject();
			isDerived = false;
			xmlTag = "AggtdNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatedEntry";
			definition = "Card entry details, based on card transaction aggregated data performed by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(CardEntry3.mmAggregatedEntry);
			previousVersion_lazy = () -> CardEntry1.mmAggregatedEntry;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAggregated1.mmObject();
		}

		@Override
		public Optional<CardAggregated1> getValue(CardEntry2 obj) {
			return obj.getAggregatedEntry();
		}

		@Override
		public void setValue(CardEntry2 obj, Optional<CardAggregated1> value) {
			obj.setAggregatedEntry(value.orElse(null));
		}
	};
	@XmlElement(name = "PrePdAcct")
	protected CashAccount24 prePaidAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccount
	 * PaymentCard.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrePdAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaidAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Prepaid account for the transfer or loading of an amount of money."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardEntry3#mmPrePaidAccount
	 * CardEntry3.mmPrePaidAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry2, Optional<CashAccount24>> mmPrePaidAccount = new MMMessageAssociationEnd<CardEntry2, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmRelatedAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardEntry2.mmObject();
			isDerived = false;
			xmlTag = "PrePdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaidAccount";
			definition = "Prepaid account for the transfer or loading of an amount of money.";
			nextVersions_lazy = () -> Arrays.asList(CardEntry3.mmPrePaidAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(CardEntry2 obj) {
			return obj.getPrePaidAccount();
		}

		@Override
		public void setValue(CardEntry2 obj, Optional<CashAccount24> value) {
			obj.setPrePaidAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry2.mmCard, com.tools20022.repository.msg.CardEntry2.mmPOI, com.tools20022.repository.msg.CardEntry2.mmAggregatedEntry,
						com.tools20022.repository.msg.CardEntry2.mmPrePaidAccount);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardEntry2";
				definition = "Card transaction entry.";
				nextVersions_lazy = () -> Arrays.asList(CardEntry3.mmObject());
				previousVersion_lazy = () -> CardEntry1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentCard4> getCard() {
		return card == null ? Optional.empty() : Optional.of(card);
	}

	public CardEntry2 setCard(PaymentCard4 card) {
		this.card = card;
		return this;
	}

	public Optional<PointOfInteraction1> getPOI() {
		return pOI == null ? Optional.empty() : Optional.of(pOI);
	}

	public CardEntry2 setPOI(PointOfInteraction1 pOI) {
		this.pOI = pOI;
		return this;
	}

	public Optional<CardAggregated1> getAggregatedEntry() {
		return aggregatedEntry == null ? Optional.empty() : Optional.of(aggregatedEntry);
	}

	public CardEntry2 setAggregatedEntry(CardAggregated1 aggregatedEntry) {
		this.aggregatedEntry = aggregatedEntry;
		return this;
	}

	public Optional<CashAccount24> getPrePaidAccount() {
		return prePaidAccount == null ? Optional.empty() : Optional.of(prePaidAccount);
	}

	public CardEntry2 setPrePaidAccount(CashAccount24 prePaidAccount) {
		this.prePaidAccount = prePaidAccount;
		return this;
	}
}