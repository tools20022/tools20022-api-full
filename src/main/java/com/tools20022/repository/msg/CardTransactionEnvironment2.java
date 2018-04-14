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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentToken2;
import com.tools20022.repository.msg.PaymentCard13;
import com.tools20022.repository.msg.PostalAddress18;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmAcquirerIdentification
 * CardTransactionEnvironment2.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmCardSchemeIdentification
 * CardTransactionEnvironment2.mmCardSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmAcceptorIdentification
 * CardTransactionEnvironment2.mmAcceptorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmTerminalIdentification
 * CardTransactionEnvironment2.mmTerminalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmCard
 * CardTransactionEnvironment2.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmPaymentToken
 * CardTransactionEnvironment2.mmPaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmShippingAddress
 * CardTransactionEnvironment2.mmShippingAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransactionEnvironment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionEnvironment4
 * CardTransactionEnvironment4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
 * CardTransactionEnvironment1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionEnvironment2", propOrder = {"acquirerIdentification", "cardSchemeIdentification", "acceptorIdentification", "terminalIdentification", "card", "paymentToken", "shippingAddress"})
public class CardTransactionEnvironment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcqrrId", required = true)
	protected Max35Text acquirerIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer identification of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment4#mmAcquirerIdentification
	 * CardTransactionEnvironment4.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransactionEnvironment2, Max35Text> mmAcquirerIdentification = new MMMessageAttribute<CardTransactionEnvironment2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Acquirer identification of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment4.mmAcquirerIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardTransactionEnvironment2 obj) {
			return obj.getAcquirerIdentification();
		}

		@Override
		public void setValue(CardTransactionEnvironment2 obj, Max35Text value) {
			obj.setAcquirerIdentification(value);
		}
	};
	@XmlElement(name = "CardSchmeId")
	protected Max35Text cardSchemeIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardSchmeId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the interconnected card scheme from which the response is coming."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransactionEnvironment2, Optional<Max35Text>> mmCardSchemeIdentification = new MMMessageAttribute<CardTransactionEnvironment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "CardSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSchemeIdentification";
			definition = "Identification of the interconnected card scheme from which the response is coming.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardTransactionEnvironment2 obj) {
			return obj.getCardSchemeIdentification();
		}

		@Override
		public void setValue(CardTransactionEnvironment2 obj, Optional<Max35Text> value) {
			obj.setCardSchemeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AccptrId")
	protected Max35Text acceptorIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the card acceptor performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment4#mmAcceptorIdentification
	 * CardTransactionEnvironment4.mmAcceptorIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransactionEnvironment2, Optional<Max35Text>> mmAcceptorIdentification = new MMMessageAttribute<CardTransactionEnvironment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "AccptrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorIdentification";
			definition = "Identification of the card acceptor performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment4.mmAcceptorIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardTransactionEnvironment2 obj) {
			return obj.getAcceptorIdentification();
		}

		@Override
		public void setValue(CardTransactionEnvironment2 obj, Optional<Max35Text> value) {
			obj.setAcceptorIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TermnlId")
	protected Max35Text terminalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the card terminal performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment4#mmTerminalIdentification
	 * CardTransactionEnvironment4.mmTerminalIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransactionEnvironment2, Optional<Max35Text>> mmTerminalIdentification = new MMMessageAttribute<CardTransactionEnvironment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "TermnlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalIdentification";
			definition = "Identification of the card terminal performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment4.mmTerminalIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardTransactionEnvironment2 obj) {
			return obj.getTerminalIdentification();
		}

		@Override
		public void setValue(CardTransactionEnvironment2 obj, Optional<Max35Text> value) {
			obj.setTerminalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Card", required = true)
	protected PaymentCard13 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard13
	 * PaymentCard13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment4#mmCard
	 * CardTransactionEnvironment4.mmCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmCard
	 * CardTransactionEnvironment1.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment2, PaymentCard13> mmCard = new MMMessageAssociationEnd<CardTransactionEnvironment2, PaymentCard13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment4.mmCard);
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmCard;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentCard13.mmObject();
		}

		@Override
		public PaymentCard13 getValue(CardTransactionEnvironment2 obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(CardTransactionEnvironment2 obj, PaymentCard13 value) {
			obj.setCard(value);
		}
	};
	@XmlElement(name = "PmtTkn")
	protected CardPaymentToken2 paymentToken;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentToken2
	 * CardPaymentToken2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTkn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment token information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment4#mmPaymentToken
	 * CardTransactionEnvironment4.mmPaymentToken}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmPaymentToken
	 * CardTransactionEnvironment1.mmPaymentToken}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment2, Optional<CardPaymentToken2>> mmPaymentToken = new MMMessageAssociationEnd<CardTransactionEnvironment2, Optional<CardPaymentToken2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment4.mmPaymentToken);
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmPaymentToken;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentToken2.mmObject();
		}

		@Override
		public Optional<CardPaymentToken2> getValue(CardTransactionEnvironment2 obj) {
			return obj.getPaymentToken();
		}

		@Override
		public void setValue(CardTransactionEnvironment2 obj, Optional<CardPaymentToken2> value) {
			obj.setPaymentToken(value.orElse(null));
		}
	};
	@XmlElement(name = "ShppgAdr")
	protected PostalAddress18 shippingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress18
	 * PostalAddress18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address for delivery of goods or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment2, Optional<PostalAddress18>> mmShippingAddress = new MMMessageAssociationEnd<CardTransactionEnvironment2, Optional<PostalAddress18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "ShppgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddress";
			definition = "Postal address for delivery of goods or services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress18.mmObject();
		}

		@Override
		public Optional<PostalAddress18> getValue(CardTransactionEnvironment2 obj) {
			return obj.getShippingAddress();
		}

		@Override
		public void setValue(CardTransactionEnvironment2 obj, Optional<PostalAddress18> value) {
			obj.setShippingAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.CardTransactionEnvironment2.mmAcquirerIdentification, com.tools20022.repository.msg.CardTransactionEnvironment2.mmCardSchemeIdentification,
								com.tools20022.repository.msg.CardTransactionEnvironment2.mmAcceptorIdentification, com.tools20022.repository.msg.CardTransactionEnvironment2.mmTerminalIdentification,
								com.tools20022.repository.msg.CardTransactionEnvironment2.mmCard, com.tools20022.repository.msg.CardTransactionEnvironment2.mmPaymentToken,
								com.tools20022.repository.msg.CardTransactionEnvironment2.mmShippingAddress);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionEnvironment2";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment4.mmObject());
				previousVersion_lazy = () -> CardTransactionEnvironment1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getAcquirerIdentification() {
		return acquirerIdentification;
	}

	public CardTransactionEnvironment2 setAcquirerIdentification(Max35Text acquirerIdentification) {
		this.acquirerIdentification = Objects.requireNonNull(acquirerIdentification);
		return this;
	}

	public Optional<Max35Text> getCardSchemeIdentification() {
		return cardSchemeIdentification == null ? Optional.empty() : Optional.of(cardSchemeIdentification);
	}

	public CardTransactionEnvironment2 setCardSchemeIdentification(Max35Text cardSchemeIdentification) {
		this.cardSchemeIdentification = cardSchemeIdentification;
		return this;
	}

	public Optional<Max35Text> getAcceptorIdentification() {
		return acceptorIdentification == null ? Optional.empty() : Optional.of(acceptorIdentification);
	}

	public CardTransactionEnvironment2 setAcceptorIdentification(Max35Text acceptorIdentification) {
		this.acceptorIdentification = acceptorIdentification;
		return this;
	}

	public Optional<Max35Text> getTerminalIdentification() {
		return terminalIdentification == null ? Optional.empty() : Optional.of(terminalIdentification);
	}

	public CardTransactionEnvironment2 setTerminalIdentification(Max35Text terminalIdentification) {
		this.terminalIdentification = terminalIdentification;
		return this;
	}

	public PaymentCard13 getCard() {
		return card;
	}

	public CardTransactionEnvironment2 setCard(PaymentCard13 card) {
		this.card = Objects.requireNonNull(card);
		return this;
	}

	public Optional<CardPaymentToken2> getPaymentToken() {
		return paymentToken == null ? Optional.empty() : Optional.of(paymentToken);
	}

	public CardTransactionEnvironment2 setPaymentToken(CardPaymentToken2 paymentToken) {
		this.paymentToken = paymentToken;
		return this;
	}

	public Optional<PostalAddress18> getShippingAddress() {
		return shippingAddress == null ? Optional.empty() : Optional.of(shippingAddress);
	}

	public CardTransactionEnvironment2 setShippingAddress(PostalAddress18 shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}
}