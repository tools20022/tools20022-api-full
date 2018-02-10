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
import com.tools20022.repository.entity.*;
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
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmAcquirer
 * CardPaymentEnvironment62.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmMerchant
 * CardPaymentEnvironment62.mmMerchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmPOI
 * CardPaymentEnvironment62.mmPOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmCard
 * CardPaymentEnvironment62.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmCustomerDevice
 * CardPaymentEnvironment62.mmCustomerDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmWallet
 * CardPaymentEnvironment62.mmWallet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmPaymentToken
 * CardPaymentEnvironment62.mmPaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmCardholder
 * CardPaymentEnvironment62.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmProtectedCardholderData
 * CardPaymentEnvironment62.mmProtectedCardholderData}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentEnvironment62"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53
 * CardPaymentEnvironment53}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentEnvironment62", propOrder = {"acquirer", "merchant", "pOI", "card", "customerDevice", "wallet", "paymentToken", "cardholder", "protectedCardholderData"})
public class CardPaymentEnvironment62 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr")
	protected Acquirer4 acquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer4 Acquirer4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
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
	 * definition} = "Acquirer involved in the card payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmAcquirer
	 * CardPaymentEnvironment53.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer4.mmObject();
		}
	};
	@XmlElement(name = "Mrchnt")
	protected Organisation25 merchant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation25
	 * Organisation25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mrchnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant performing the card payment transaction.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmMerchant
	 * CardPaymentEnvironment53.mmMerchant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchant = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MerchantRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "Mrchnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			definition = "Merchant performing the card payment transaction.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmMerchant;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation25.mmObject();
		}
	};
	@XmlElement(name = "POI")
	protected PointOfInteraction7 pOI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Point of interaction (POI) performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmPOI
	 * CardPaymentEnvironment53.mmPOI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Point of interaction (POI) performing the transaction.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmPOI;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
		}
	};
	@XmlElement(name = "Card", required = true)
	protected PaymentCard21 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentCard21
	 * PaymentCard21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
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
	 * definition} = "Payment card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmCard
	 * CardPaymentEnvironment53.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCard = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Payment card performing the transaction.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmCard;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentCard21.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
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
	 * "Device used by the customer to perform the payment transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmCustomerDevice
	 * CardPaymentEnvironment53.mmCustomerDevice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustomerDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "CstmrDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDevice";
			definition = "Device used by the customer to perform the payment transaction.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmCustomerDevice;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
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
	 * "Container for tenders used by the customer to perform the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmWallet
	 * CardPaymentEnvironment53.mmWallet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWallet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "Wllt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wallet";
			definition = "Container for tenders used by the customer to perform the payment transaction.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmWallet;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CustomerDevice1.mmObject();
		}
	};
	@XmlElement(name = "PmtTkn")
	protected CardPaymentToken1 paymentToken;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentToken1
	 * CardPaymentToken1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmPaymentToken
	 * CardPaymentEnvironment53.mmPaymentToken}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentToken = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmPaymentToken;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentToken1.mmObject();
		}
	};
	@XmlElement(name = "Crdhldr")
	protected Cardholder12 cardholder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder12
	 * Cardholder12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
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
	 * definition} = "Cardholder involved in the card payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmCardholder
	 * CardPaymentEnvironment53.mmCardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholder = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card payment.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmCardholder;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cardholder12.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
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
	 * "Replacement of the message element Cardholder by a digital envelope using a cryptographic key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmProtectedCardholderData
	 * CardPaymentEnvironment53.mmProtectedCardholderData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardholderData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment62.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Replacement of the message element Cardholder by a digital envelope using a cryptographic key.";
			previousVersion_lazy = () -> CardPaymentEnvironment53.mmProtectedCardholderData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment62.mmAcquirer, com.tools20022.repository.msg.CardPaymentEnvironment62.mmMerchant,
						com.tools20022.repository.msg.CardPaymentEnvironment62.mmPOI, com.tools20022.repository.msg.CardPaymentEnvironment62.mmCard, com.tools20022.repository.msg.CardPaymentEnvironment62.mmCustomerDevice,
						com.tools20022.repository.msg.CardPaymentEnvironment62.mmWallet, com.tools20022.repository.msg.CardPaymentEnvironment62.mmPaymentToken, com.tools20022.repository.msg.CardPaymentEnvironment62.mmCardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment62.mmProtectedCardholderData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment62";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> CardPaymentEnvironment53.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer4> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public CardPaymentEnvironment62 setAcquirer(com.tools20022.repository.msg.Acquirer4 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Organisation25> getMerchant() {
		return merchant == null ? Optional.empty() : Optional.of(merchant);
	}

	public CardPaymentEnvironment62 setMerchant(com.tools20022.repository.msg.Organisation25 merchant) {
		this.merchant = merchant;
		return this;
	}

	public Optional<PointOfInteraction7> getPOI() {
		return pOI == null ? Optional.empty() : Optional.of(pOI);
	}

	public CardPaymentEnvironment62 setPOI(com.tools20022.repository.msg.PointOfInteraction7 pOI) {
		this.pOI = pOI;
		return this;
	}

	public PaymentCard21 getCard() {
		return card;
	}

	public CardPaymentEnvironment62 setCard(com.tools20022.repository.msg.PaymentCard21 card) {
		this.card = Objects.requireNonNull(card);
		return this;
	}

	public Optional<CustomerDevice1> getCustomerDevice() {
		return customerDevice == null ? Optional.empty() : Optional.of(customerDevice);
	}

	public CardPaymentEnvironment62 setCustomerDevice(com.tools20022.repository.msg.CustomerDevice1 customerDevice) {
		this.customerDevice = customerDevice;
		return this;
	}

	public Optional<CustomerDevice1> getWallet() {
		return wallet == null ? Optional.empty() : Optional.of(wallet);
	}

	public CardPaymentEnvironment62 setWallet(com.tools20022.repository.msg.CustomerDevice1 wallet) {
		this.wallet = wallet;
		return this;
	}

	public Optional<CardPaymentToken1> getPaymentToken() {
		return paymentToken == null ? Optional.empty() : Optional.of(paymentToken);
	}

	public CardPaymentEnvironment62 setPaymentToken(com.tools20022.repository.msg.CardPaymentToken1 paymentToken) {
		this.paymentToken = paymentToken;
		return this;
	}

	public Optional<Cardholder12> getCardholder() {
		return cardholder == null ? Optional.empty() : Optional.of(cardholder);
	}

	public CardPaymentEnvironment62 setCardholder(com.tools20022.repository.msg.Cardholder12 cardholder) {
		this.cardholder = cardholder;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedCardholderData() {
		return protectedCardholderData == null ? Optional.empty() : Optional.of(protectedCardholderData);
	}

	public CardPaymentEnvironment62 setProtectedCardholderData(com.tools20022.repository.msg.ContentInformationType10 protectedCardholderData) {
		this.protectedCardholderData = protectedCardholderData;
		return this;
	}
}