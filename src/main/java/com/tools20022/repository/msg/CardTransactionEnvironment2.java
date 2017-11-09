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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransactionEnvironment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
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
public class CardTransactionEnvironment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text acquirerIdentification;
	/**
	 * Acquirer identification of the transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer identification of the transaction."</li>
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
	public static final MMMessageAttribute mmAcquirerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransactionEnvironment2.mmObject();
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
	};
	protected Max35Text cardSchemeIdentification;
	/**
	 * Identification of the interconnected card scheme from which the response
	 * is coming.
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the interconnected card scheme from which the response is coming."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardSchemeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "CardSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSchemeIdentification";
			definition = "Identification of the interconnected card scheme from which the response is coming.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text acceptorIdentification;
	/**
	 * Identification of the card acceptor performing the transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the card acceptor performing the transaction."</li>
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
	public static final MMMessageAttribute mmAcceptorIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransactionEnvironment2.mmObject();
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
	};
	protected Max35Text terminalIdentification;
	/**
	 * Identification of the card terminal performing the transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the card terminal performing the transaction."</li>
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
	public static final MMMessageAttribute mmTerminalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransactionEnvironment2.mmObject();
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
	};
	protected PaymentCard13 card;
	/**
	 * Card performing the transaction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card performing the transaction."</li>
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
	public static final MMMessageAssociationEnd mmCard = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransactionEnvironment2.mmObject();
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
			type_lazy = () -> com.tools20022.repository.msg.PaymentCard13.mmObject();
		}
	};
	protected CardPaymentToken2 paymentToken;
	/**
	 * Payment token information.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment token information."</li>
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
	public static final MMMessageAssociationEnd mmPaymentToken = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransactionEnvironment2.mmObject();
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
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentToken2.mmObject();
		}
	};
	protected PostalAddress18 shippingAddress;
	/**
	 * Postal address for delivery of goods or services.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address for delivery of goods or services."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShippingAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransactionEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "ShppgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddress";
			definition = "Postal address for delivery of goods or services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress18.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardTransactionEnvironment2.mmAcquirerIdentification, CardTransactionEnvironment2.mmCardSchemeIdentification, CardTransactionEnvironment2.mmAcceptorIdentification,
						CardTransactionEnvironment2.mmTerminalIdentification, CardTransactionEnvironment2.mmCard, CardTransactionEnvironment2.mmPaymentToken, CardTransactionEnvironment2.mmShippingAddress);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setAcquirerIdentification(Max35Text acquirerIdentification) {
		this.acquirerIdentification = acquirerIdentification;
	}

	public Max35Text getCardSchemeIdentification() {
		return cardSchemeIdentification;
	}

	public void setCardSchemeIdentification(Max35Text cardSchemeIdentification) {
		this.cardSchemeIdentification = cardSchemeIdentification;
	}

	public Max35Text getAcceptorIdentification() {
		return acceptorIdentification;
	}

	public void setAcceptorIdentification(Max35Text acceptorIdentification) {
		this.acceptorIdentification = acceptorIdentification;
	}

	public Max35Text getTerminalIdentification() {
		return terminalIdentification;
	}

	public void setTerminalIdentification(Max35Text terminalIdentification) {
		this.terminalIdentification = terminalIdentification;
	}

	public PaymentCard13 getCard() {
		return card;
	}

	public void setCard(com.tools20022.repository.msg.PaymentCard13 card) {
		this.card = card;
	}

	public CardPaymentToken2 getPaymentToken() {
		return paymentToken;
	}

	public void setPaymentToken(com.tools20022.repository.msg.CardPaymentToken2 paymentToken) {
		this.paymentToken = paymentToken;
	}

	public PostalAddress18 getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(com.tools20022.repository.msg.PostalAddress18 shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}