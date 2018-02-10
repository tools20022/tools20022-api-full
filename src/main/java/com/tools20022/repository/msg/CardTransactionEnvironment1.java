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
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmAcquirer
 * CardTransactionEnvironment1.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmCardSchemeIdentification
 * CardTransactionEnvironment1.mmCardSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmAcceptor
 * CardTransactionEnvironment1.mmAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmTerminal
 * CardTransactionEnvironment1.mmTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmCard
 * CardTransactionEnvironment1.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmCustomerDevice
 * CardTransactionEnvironment1.mmCustomerDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmWallet
 * CardTransactionEnvironment1.mmWallet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmPaymentToken
 * CardTransactionEnvironment1.mmPaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmCardholder
 * CardTransactionEnvironment1.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1#mmProtectedCardholderData
 * CardTransactionEnvironment1.mmProtectedCardholderData}</li>
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
 * "CardTransactionEnvironment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
 * CardTransactionEnvironment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
 * CardTransactionEnvironment3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionEnvironment1", propOrder = {"acquirer", "cardSchemeIdentification", "acceptor", "terminal", "card", "customerDevice", "wallet", "paymentToken", "cardholder", "protectedCardholderData"})
public class CardTransactionEnvironment1 {

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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmAcquirer
	 * CardTransactionEnvironment3.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the card transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment3.mmAcquirer);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
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
	 * "Identification of the interconnected card scheme from which the request is coming."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardSchemeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "CardSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSchemeIdentification";
			definition = "Identification of the interconnected card scheme from which the request is coming.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Accptr")
	protected Organisation18 acceptor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation18
	 * Organisation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmAcceptor
	 * CardTransactionEnvironment3.mmAcceptor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcceptor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Accptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acceptor";
			definition = "Acceptor performing the card transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment3.mmAcceptor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation18.mmObject();
		}
	};
	@XmlElement(name = "Termnl")
	protected CardAcceptorTerminal1 terminal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAcceptorTerminal1
	 * CardAcceptorTerminal1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Termnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment terminal or ATM performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminal = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Termnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terminal";
			definition = "Payment terminal or ATM performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAcceptorTerminal1.mmObject();
		}
	};
	@XmlElement(name = "Card", required = true)
	protected PaymentCard12 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard12
	 * PaymentCard12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmCard
	 * CardTransactionEnvironment2.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmCard
	 * CardTransactionEnvironment3.mmCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCard = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment2.mmCard, CardTransactionEnvironment3.mmCard);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCard12.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmCustomerDevice
	 * CardTransactionEnvironment3.mmCustomerDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustomerDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "CstmrDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDevice";
			definition = "Container of tenders used by the customer to perform the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment3.mmCustomerDevice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CustomerDevice1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmWallet
	 * CardTransactionEnvironment3.mmWallet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWallet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Wllt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wallet";
			definition = "Container of tenders used by the customer to perform the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment3.mmWallet);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CustomerDevice1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2#mmPaymentToken
	 * CardTransactionEnvironment2.mmPaymentToken}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3#mmPaymentToken
	 * CardTransactionEnvironment3.mmPaymentToken}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentToken = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment2.mmPaymentToken, CardTransactionEnvironment3.mmPaymentToken);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
		}
	};
	@XmlElement(name = "Crdhldr")
	protected Cardholder9 cardholder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder9
	 * Cardholder9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Crdhldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cardholder involved in the card transaction. \r\nIt correspond partially to the ISO 8583: 2003, field number 49-71."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card transaction. \r\nIt correspond partially to the ISO 8583: 2003, field number 49-71.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cardholder9.mmObject();
		}
	};
	@XmlElement(name = "PrtctdCrdhldrData")
	protected ContentInformationType10 protectedCardholderData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCrdhldrData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardholderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Protection of cardholder sensitive data by a digital envelope using a cryptographic key."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardholderData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Protection of cardholder sensitive data by a digital envelope using a cryptographic key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionEnvironment1.mmAcquirer, com.tools20022.repository.msg.CardTransactionEnvironment1.mmCardSchemeIdentification,
						com.tools20022.repository.msg.CardTransactionEnvironment1.mmAcceptor, com.tools20022.repository.msg.CardTransactionEnvironment1.mmTerminal, com.tools20022.repository.msg.CardTransactionEnvironment1.mmCard,
						com.tools20022.repository.msg.CardTransactionEnvironment1.mmCustomerDevice, com.tools20022.repository.msg.CardTransactionEnvironment1.mmWallet,
						com.tools20022.repository.msg.CardTransactionEnvironment1.mmPaymentToken, com.tools20022.repository.msg.CardTransactionEnvironment1.mmCardholder,
						com.tools20022.repository.msg.CardTransactionEnvironment1.mmProtectedCardholderData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionEnvironment1";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment2.mmObject(), CardTransactionEnvironment3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Acquirer6 getAcquirer() {
		return acquirer;
	}

	public CardTransactionEnvironment1 setAcquirer(com.tools20022.repository.msg.Acquirer6 acquirer) {
		this.acquirer = Objects.requireNonNull(acquirer);
		return this;
	}

	public Optional<Max35Text> getCardSchemeIdentification() {
		return cardSchemeIdentification == null ? Optional.empty() : Optional.of(cardSchemeIdentification);
	}

	public CardTransactionEnvironment1 setCardSchemeIdentification(Max35Text cardSchemeIdentification) {
		this.cardSchemeIdentification = cardSchemeIdentification;
		return this;
	}

	public Optional<Organisation18> getAcceptor() {
		return acceptor == null ? Optional.empty() : Optional.of(acceptor);
	}

	public CardTransactionEnvironment1 setAcceptor(com.tools20022.repository.msg.Organisation18 acceptor) {
		this.acceptor = acceptor;
		return this;
	}

	public Optional<CardAcceptorTerminal1> getTerminal() {
		return terminal == null ? Optional.empty() : Optional.of(terminal);
	}

	public CardTransactionEnvironment1 setTerminal(com.tools20022.repository.msg.CardAcceptorTerminal1 terminal) {
		this.terminal = terminal;
		return this;
	}

	public PaymentCard12 getCard() {
		return card;
	}

	public CardTransactionEnvironment1 setCard(com.tools20022.repository.msg.PaymentCard12 card) {
		this.card = Objects.requireNonNull(card);
		return this;
	}

	public Optional<CustomerDevice1> getCustomerDevice() {
		return customerDevice == null ? Optional.empty() : Optional.of(customerDevice);
	}

	public CardTransactionEnvironment1 setCustomerDevice(com.tools20022.repository.msg.CustomerDevice1 customerDevice) {
		this.customerDevice = customerDevice;
		return this;
	}

	public Optional<CustomerDevice1> getWallet() {
		return wallet == null ? Optional.empty() : Optional.of(wallet);
	}

	public CardTransactionEnvironment1 setWallet(com.tools20022.repository.msg.CustomerDevice1 wallet) {
		this.wallet = wallet;
		return this;
	}

	public Optional<CardPaymentToken4> getPaymentToken() {
		return paymentToken == null ? Optional.empty() : Optional.of(paymentToken);
	}

	public CardTransactionEnvironment1 setPaymentToken(com.tools20022.repository.msg.CardPaymentToken4 paymentToken) {
		this.paymentToken = paymentToken;
		return this;
	}

	public Optional<Cardholder9> getCardholder() {
		return cardholder == null ? Optional.empty() : Optional.of(cardholder);
	}

	public CardTransactionEnvironment1 setCardholder(com.tools20022.repository.msg.Cardholder9 cardholder) {
		this.cardholder = cardholder;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedCardholderData() {
		return protectedCardholderData == null ? Optional.empty() : Optional.of(protectedCardholderData);
	}

	public CardTransactionEnvironment1 setProtectedCardholderData(com.tools20022.repository.msg.ContentInformationType10 protectedCardholderData) {
		this.protectedCardholderData = protectedCardholderData;
		return this;
	}
}