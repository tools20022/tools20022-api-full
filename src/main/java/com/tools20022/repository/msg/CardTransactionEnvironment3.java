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
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmAcquirer
 * CardTransactionEnvironment3.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmCardSchemeIdentification
 * CardTransactionEnvironment3.mmCardSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmAcceptor
 * CardTransactionEnvironment3.mmAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmTerminalIdentification
 * CardTransactionEnvironment3.mmTerminalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmCard
 * CardTransactionEnvironment3.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmCustomerDevice
 * CardTransactionEnvironment3.mmCustomerDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmWallet
 * CardTransactionEnvironment3.mmWallet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmPaymentToken
 * CardTransactionEnvironment3.mmPaymentToken}</li>
 * </ul>
 * </li>
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
 * "CardTransactionEnvironment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
 * CardTransactionEnvironment1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionEnvironment3", propOrder = {"acquirer", "cardSchemeIdentification", "acceptor", "terminalIdentification", "card", "customerDevice", "wallet", "paymentToken"})
public class CardTransactionEnvironment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr", required = true)
	protected Acquirer6 acquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer6 Acquirer6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer of the card transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmAcquirer
	 * CardTransactionEnvironment1.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment3, Acquirer6> mmAcquirer = new MMMessageAssociationEnd<CardTransactionEnvironment3, Acquirer6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the card transaction.";
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Acquirer6.mmObject();
		}

		@Override
		public Acquirer6 getValue(CardTransactionEnvironment3 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, Acquirer6 value) {
			obj.setAcquirer(value);
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
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
	public static final MMMessageAttribute<CardTransactionEnvironment3, Optional<Max35Text>> mmCardSchemeIdentification = new MMMessageAttribute<CardTransactionEnvironment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
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
		public Optional<Max35Text> getValue(CardTransactionEnvironment3 obj) {
			return obj.getCardSchemeIdentification();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, Optional<Max35Text> value) {
			obj.setCardSchemeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Accptr", required = true)
	protected Organisation19 acceptor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation19
	 * Organisation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor performing the card transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmAcceptor
	 * CardTransactionEnvironment1.mmAcceptor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment3, Organisation19> mmAcceptor = new MMMessageAssociationEnd<CardTransactionEnvironment3, Organisation19>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
			isDerived = false;
			xmlTag = "Accptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acceptor";
			definition = "Acceptor performing the card transaction.";
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmAcceptor;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Organisation19.mmObject();
		}

		@Override
		public Organisation19 getValue(CardTransactionEnvironment3 obj) {
			return obj.getAcceptor();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, Organisation19 value) {
			obj.setAcceptor(value);
		}
	};
	@XmlElement(name = "TermnlId")
	protected GenericIdentification32 terminalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<GenericIdentification32>> mmTerminalIdentification = new MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<GenericIdentification32>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
			isDerived = false;
			xmlTag = "TermnlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalIdentification";
			definition = "Identification of the card terminal performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(CardTransactionEnvironment3 obj) {
			return obj.getTerminalIdentification();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, Optional<GenericIdentification32> value) {
			obj.setTerminalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Card", required = true)
	protected PaymentCard14 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard14
	 * PaymentCard14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmCard
	 * CardTransactionEnvironment1.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment3, PaymentCard14> mmCard = new MMMessageAssociationEnd<CardTransactionEnvironment3, PaymentCard14>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the transaction.";
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmCard;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentCard14.mmObject();
		}

		@Override
		public PaymentCard14 getValue(CardTransactionEnvironment3 obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, PaymentCard14 value) {
			obj.setCard(value);
		}
	};
	@XmlElement(name = "CstmrDvc")
	protected CustomerDevice1 customerDevice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrDvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Container of tenders used by the customer to perform the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmCustomerDevice
	 * CardTransactionEnvironment1.mmCustomerDevice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<CustomerDevice1>> mmCustomerDevice = new MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<CustomerDevice1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
			isDerived = false;
			xmlTag = "CstmrDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDevice";
			definition = "Container of tenders used by the customer to perform the payment.";
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmCustomerDevice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CustomerDevice1.mmObject();
		}

		@Override
		public Optional<CustomerDevice1> getValue(CardTransactionEnvironment3 obj) {
			return obj.getCustomerDevice();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, Optional<CustomerDevice1> value) {
			obj.setCustomerDevice(value.orElse(null));
		}
	};
	@XmlElement(name = "Wllt")
	protected CustomerDevice1 wallet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wllt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wallet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Container of tenders used by the customer to perform the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmWallet
	 * CardTransactionEnvironment1.mmWallet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<CustomerDevice1>> mmWallet = new MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<CustomerDevice1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
			isDerived = false;
			xmlTag = "Wllt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wallet";
			definition = "Container of tenders used by the customer to perform the payment.";
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmWallet;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CustomerDevice1.mmObject();
		}

		@Override
		public Optional<CustomerDevice1> getValue(CardTransactionEnvironment3 obj) {
			return obj.getWallet();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, Optional<CustomerDevice1> value) {
			obj.setWallet(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtTkn")
	protected CardPaymentToken4 paymentToken;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmPaymentToken
	 * CardTransactionEnvironment1.mmPaymentToken}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<CardPaymentToken4>> mmPaymentToken = new MMMessageAssociationEnd<CardTransactionEnvironment3, Optional<CardPaymentToken4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment3.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			previousVersion_lazy = () -> CardTransactionEnvironment1.mmPaymentToken;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentToken4.mmObject();
		}

		@Override
		public Optional<CardPaymentToken4> getValue(CardTransactionEnvironment3 obj) {
			return obj.getPaymentToken();
		}

		@Override
		public void setValue(CardTransactionEnvironment3 obj, Optional<CardPaymentToken4> value) {
			obj.setPaymentToken(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionEnvironment3.mmAcquirer, com.tools20022.repository.msg.CardTransactionEnvironment3.mmCardSchemeIdentification,
						com.tools20022.repository.msg.CardTransactionEnvironment3.mmAcceptor, com.tools20022.repository.msg.CardTransactionEnvironment3.mmTerminalIdentification,
						com.tools20022.repository.msg.CardTransactionEnvironment3.mmCard, com.tools20022.repository.msg.CardTransactionEnvironment3.mmCustomerDevice, com.tools20022.repository.msg.CardTransactionEnvironment3.mmWallet,
						com.tools20022.repository.msg.CardTransactionEnvironment3.mmPaymentToken);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionEnvironment3";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> CardTransactionEnvironment1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Acquirer6 getAcquirer() {
		return acquirer;
	}

	public CardTransactionEnvironment3 setAcquirer(Acquirer6 acquirer) {
		this.acquirer = Objects.requireNonNull(acquirer);
		return this;
	}

	public Optional<Max35Text> getCardSchemeIdentification() {
		return cardSchemeIdentification == null ? Optional.empty() : Optional.of(cardSchemeIdentification);
	}

	public CardTransactionEnvironment3 setCardSchemeIdentification(Max35Text cardSchemeIdentification) {
		this.cardSchemeIdentification = cardSchemeIdentification;
		return this;
	}

	public Organisation19 getAcceptor() {
		return acceptor;
	}

	public CardTransactionEnvironment3 setAcceptor(Organisation19 acceptor) {
		this.acceptor = Objects.requireNonNull(acceptor);
		return this;
	}

	public Optional<GenericIdentification32> getTerminalIdentification() {
		return terminalIdentification == null ? Optional.empty() : Optional.of(terminalIdentification);
	}

	public CardTransactionEnvironment3 setTerminalIdentification(GenericIdentification32 terminalIdentification) {
		this.terminalIdentification = terminalIdentification;
		return this;
	}

	public PaymentCard14 getCard() {
		return card;
	}

	public CardTransactionEnvironment3 setCard(PaymentCard14 card) {
		this.card = Objects.requireNonNull(card);
		return this;
	}

	public Optional<CustomerDevice1> getCustomerDevice() {
		return customerDevice == null ? Optional.empty() : Optional.of(customerDevice);
	}

	public CardTransactionEnvironment3 setCustomerDevice(CustomerDevice1 customerDevice) {
		this.customerDevice = customerDevice;
		return this;
	}

	public Optional<CustomerDevice1> getWallet() {
		return wallet == null ? Optional.empty() : Optional.of(wallet);
	}

	public CardTransactionEnvironment3 setWallet(CustomerDevice1 wallet) {
		this.wallet = wallet;
		return this;
	}

	public Optional<CardPaymentToken4> getPaymentToken() {
		return paymentToken == null ? Optional.empty() : Optional.of(paymentToken);
	}

	public CardTransactionEnvironment3 setPaymentToken(CardPaymentToken4 paymentToken) {
		this.paymentToken = paymentToken;
		return this;
	}
}