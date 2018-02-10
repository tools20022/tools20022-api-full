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
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmAcquirer
 * CardPaymentEnvironment47.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmMerchant
 * CardPaymentEnvironment47.mmMerchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmPOI
 * CardPaymentEnvironment47.mmPOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCard
 * CardPaymentEnvironment47.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCustomerDevice
 * CardPaymentEnvironment47.mmCustomerDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmWallet
 * CardPaymentEnvironment47.mmWallet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmPaymentToken
 * CardPaymentEnvironment47.mmPaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCardholder
 * CardPaymentEnvironment47.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmProtectedCardholderData
 * CardPaymentEnvironment47.mmProtectedCardholderData}</li>
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
 * "CardPaymentEnvironment47"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60
 * CardPaymentEnvironment60}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
 * CardPaymentEnvironment34}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentEnvironment47", propOrder = {"acquirer", "merchant", "pOI", "card", "customerDevice", "wallet", "paymentToken", "cardholder", "protectedCardholderData"})
public class CardPaymentEnvironment47 {

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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmAcquirer
	 * CardPaymentEnvironment60.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmAcquirer
	 * CardPaymentEnvironment34.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmAcquirer);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmAcquirer;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * "Merchant performing the card payment.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmMerchant
	 * CardPaymentEnvironment60.mmMerchant}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmMerchant
	 * CardPaymentEnvironment34.mmMerchant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchant = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MerchantRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "Mrchnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			definition = "Merchant performing the card payment.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmMerchant);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmMerchant;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation25.mmObject();
		}
	};
	@XmlElement(name = "POI", required = true)
	protected PointOfInteraction5 pOI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmPOI
	 * CardPaymentEnvironment60.mmPOI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmPOI
	 * CardPaymentEnvironment34.mmPOI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Point of interaction (POI) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmPOI);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmPOI;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteraction5.mmObject();
		}
	};
	@XmlElement(name = "Card")
	protected PaymentCard20 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentCard20
	 * PaymentCard20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmCard
	 * CardPaymentEnvironment60.mmCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCard
	 * CardPaymentEnvironment34.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCard = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Payment card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmCard);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmCard;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentCard20.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * definition} = "Device used by the customer to perform the payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmCustomerDevice
	 * CardPaymentEnvironment60.mmCustomerDevice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCustomerDevice
	 * CardPaymentEnvironment34.mmCustomerDevice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustomerDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "CstmrDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDevice";
			definition = "Device used by the customer to perform the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmCustomerDevice);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmCustomerDevice;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmWallet
	 * CardPaymentEnvironment60.mmWallet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmWallet
	 * CardPaymentEnvironment34.mmWallet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWallet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "Wllt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wallet";
			definition = "Container of tenders used by the customer to perform the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmWallet);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmWallet;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CustomerDevice1.mmObject();
		}
	};
	@XmlElement(name = "PmtTkn")
	protected CardPaymentToken3 paymentToken;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentToken3
	 * CardPaymentToken3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmPaymentToken
	 * CardPaymentEnvironment60.mmPaymentToken}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmPaymentToken
	 * CardPaymentEnvironment34.mmPaymentToken}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentToken = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmPaymentToken);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmPaymentToken;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentToken3.mmObject();
		}
	};
	@XmlElement(name = "Crdhldr")
	protected Cardholder11 cardholder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder11
	 * Cardholder11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmCardholder
	 * CardPaymentEnvironment60.mmCardholder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCardholder
	 * CardPaymentEnvironment34.mmCardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholder = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmCardholder);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmCardholder;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmProtectedCardholderData
	 * CardPaymentEnvironment60.mmProtectedCardholderData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmProtectedCardholderData
	 * CardPaymentEnvironment34.mmProtectedCardholderData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardholderData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Replacement of the message element Cardholder by a digital envelope using a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmProtectedCardholderData);
			previousVersion_lazy = () -> CardPaymentEnvironment34.mmProtectedCardholderData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment47.mmAcquirer, com.tools20022.repository.msg.CardPaymentEnvironment47.mmMerchant,
						com.tools20022.repository.msg.CardPaymentEnvironment47.mmPOI, com.tools20022.repository.msg.CardPaymentEnvironment47.mmCard, com.tools20022.repository.msg.CardPaymentEnvironment47.mmCustomerDevice,
						com.tools20022.repository.msg.CardPaymentEnvironment47.mmWallet, com.tools20022.repository.msg.CardPaymentEnvironment47.mmPaymentToken, com.tools20022.repository.msg.CardPaymentEnvironment47.mmCardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment47.mmProtectedCardholderData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment47";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment34.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer4> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public CardPaymentEnvironment47 setAcquirer(com.tools20022.repository.msg.Acquirer4 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Organisation25> getMerchant() {
		return merchant == null ? Optional.empty() : Optional.of(merchant);
	}

	public CardPaymentEnvironment47 setMerchant(com.tools20022.repository.msg.Organisation25 merchant) {
		this.merchant = merchant;
		return this;
	}

	public PointOfInteraction5 getPOI() {
		return pOI;
	}

	public CardPaymentEnvironment47 setPOI(com.tools20022.repository.msg.PointOfInteraction5 pOI) {
		this.pOI = Objects.requireNonNull(pOI);
		return this;
	}

	public Optional<PaymentCard20> getCard() {
		return card == null ? Optional.empty() : Optional.of(card);
	}

	public CardPaymentEnvironment47 setCard(com.tools20022.repository.msg.PaymentCard20 card) {
		this.card = card;
		return this;
	}

	public Optional<CustomerDevice1> getCustomerDevice() {
		return customerDevice == null ? Optional.empty() : Optional.of(customerDevice);
	}

	public CardPaymentEnvironment47 setCustomerDevice(com.tools20022.repository.msg.CustomerDevice1 customerDevice) {
		this.customerDevice = customerDevice;
		return this;
	}

	public Optional<CustomerDevice1> getWallet() {
		return wallet == null ? Optional.empty() : Optional.of(wallet);
	}

	public CardPaymentEnvironment47 setWallet(com.tools20022.repository.msg.CustomerDevice1 wallet) {
		this.wallet = wallet;
		return this;
	}

	public Optional<CardPaymentToken3> getPaymentToken() {
		return paymentToken == null ? Optional.empty() : Optional.of(paymentToken);
	}

	public CardPaymentEnvironment47 setPaymentToken(com.tools20022.repository.msg.CardPaymentToken3 paymentToken) {
		this.paymentToken = paymentToken;
		return this;
	}

	public Optional<Cardholder11> getCardholder() {
		return cardholder == null ? Optional.empty() : Optional.of(cardholder);
	}

	public CardPaymentEnvironment47 setCardholder(com.tools20022.repository.msg.Cardholder11 cardholder) {
		this.cardholder = cardholder;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedCardholderData() {
		return protectedCardholderData == null ? Optional.empty() : Optional.of(protectedCardholderData);
	}

	public CardPaymentEnvironment47 setProtectedCardholderData(com.tools20022.repository.msg.ContentInformationType10 protectedCardholderData) {
		this.protectedCardholderData = protectedCardholderData;
		return this;
	}
}