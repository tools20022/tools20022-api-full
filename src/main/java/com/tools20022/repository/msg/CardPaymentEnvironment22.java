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
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmAcquirer
 * CardPaymentEnvironment22.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmMerchant
 * CardPaymentEnvironment22.mmMerchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmPOI
 * CardPaymentEnvironment22.mmPOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmCard
 * CardPaymentEnvironment22.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmCardholder
 * CardPaymentEnvironment22.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmProtectedCardholderData
 * CardPaymentEnvironment22.mmProtectedCardholderData}</li>
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
 * "CardPaymentEnvironment22"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
 * CardPaymentEnvironment34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54
 * CardPaymentEnvironment54}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10
 * CardPaymentEnvironment10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentEnvironment22", propOrder = {"acquirer", "merchant", "pOI", "card", "cardholder", "protectedCardholderData"})
public class CardPaymentEnvironment22 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr")
	protected Acquirer2 acquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer2 Acquirer2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
	 * CardPaymentEnvironment22}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmAcquirer
	 * CardPaymentEnvironment34.mmAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmAcquirerIdentification
	 * CardPaymentEnvironment54.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmAcquirer
	 * CardPaymentEnvironment10.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment22.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmAcquirer, CardPaymentEnvironment54.mmAcquirerIdentification);
			previousVersion_lazy = () -> CardPaymentEnvironment10.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer2.mmObject();
		}
	};
	@XmlElement(name = "Mrchnt")
	protected Organisation8 merchant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation8
	 * Organisation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
	 * CardPaymentEnvironment22}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmMerchant
	 * CardPaymentEnvironment34.mmMerchant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmMerchantIdentification
	 * CardPaymentEnvironment54.mmMerchantIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmMerchant
	 * CardPaymentEnvironment10.mmMerchant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchant = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MerchantRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment22.mmObject();
			isDerived = false;
			xmlTag = "Mrchnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			definition = "Merchant performing the card payment.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmMerchant, CardPaymentEnvironment54.mmMerchantIdentification);
			previousVersion_lazy = () -> CardPaymentEnvironment10.mmMerchant;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation8.mmObject();
		}
	};
	@XmlElement(name = "POI", required = true)
	protected PointOfInteraction3 pOI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction3
	 * PointOfInteraction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
	 * CardPaymentEnvironment22}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmPOI
	 * CardPaymentEnvironment34.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmPOIIdentification
	 * CardPaymentEnvironment54.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmPOI
	 * CardPaymentEnvironment10.mmPOI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment22.mmObject();
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Point of interaction (POI) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmPOI, CardPaymentEnvironment54.mmPOIIdentification);
			previousVersion_lazy = () -> CardPaymentEnvironment10.mmPOI;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteraction3.mmObject();
		}
	};
	@XmlElement(name = "Card")
	protected PaymentCard8 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentCard8
	 * PaymentCard8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
	 * CardPaymentEnvironment22}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCard
	 * CardPaymentEnvironment34.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmCard
	 * CardPaymentEnvironment54.mmCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmCard
	 * CardPaymentEnvironment10.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCard = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment22.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Payment card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmCard, CardPaymentEnvironment54.mmCard);
			previousVersion_lazy = () -> CardPaymentEnvironment10.mmCard;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
		}
	};
	@XmlElement(name = "Crdhldr")
	protected Cardholder6 cardholder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder6
	 * Cardholder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
	 * CardPaymentEnvironment22}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCardholder
	 * CardPaymentEnvironment34.mmCardholder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmCardholder
	 * CardPaymentEnvironment10.mmCardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholder = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment22.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmCardholder);
			previousVersion_lazy = () -> CardPaymentEnvironment10.mmCardholder;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cardholder6.mmObject();
		}
	};
	@XmlElement(name = "PrtctdCrdhldrData")
	protected ContentInformationType7 protectedCardholderData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7
	 * ContentInformationType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
	 * CardPaymentEnvironment22}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmProtectedCardholderData
	 * CardPaymentEnvironment34.mmProtectedCardholderData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardholderData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment22.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Replacement of the message element Cardholder by a digital envelope using a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmProtectedCardholderData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment22.mmAcquirer, com.tools20022.repository.msg.CardPaymentEnvironment22.mmMerchant,
						com.tools20022.repository.msg.CardPaymentEnvironment22.mmPOI, com.tools20022.repository.msg.CardPaymentEnvironment22.mmCard, com.tools20022.repository.msg.CardPaymentEnvironment22.mmCardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment22.mmProtectedCardholderData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment22";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmObject(), CardPaymentEnvironment54.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer2> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public CardPaymentEnvironment22 setAcquirer(com.tools20022.repository.msg.Acquirer2 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Organisation8> getMerchant() {
		return merchant == null ? Optional.empty() : Optional.of(merchant);
	}

	public CardPaymentEnvironment22 setMerchant(com.tools20022.repository.msg.Organisation8 merchant) {
		this.merchant = merchant;
		return this;
	}

	public PointOfInteraction3 getPOI() {
		return pOI;
	}

	public CardPaymentEnvironment22 setPOI(com.tools20022.repository.msg.PointOfInteraction3 pOI) {
		this.pOI = Objects.requireNonNull(pOI);
		return this;
	}

	public Optional<PaymentCard8> getCard() {
		return card == null ? Optional.empty() : Optional.of(card);
	}

	public CardPaymentEnvironment22 setCard(com.tools20022.repository.msg.PaymentCard8 card) {
		this.card = card;
		return this;
	}

	public Optional<Cardholder6> getCardholder() {
		return cardholder == null ? Optional.empty() : Optional.of(cardholder);
	}

	public CardPaymentEnvironment22 setCardholder(com.tools20022.repository.msg.Cardholder6 cardholder) {
		this.cardholder = cardholder;
		return this;
	}

	public Optional<ContentInformationType7> getProtectedCardholderData() {
		return protectedCardholderData == null ? Optional.empty() : Optional.of(protectedCardholderData);
	}

	public CardPaymentEnvironment22 setProtectedCardholderData(com.tools20022.repository.msg.ContentInformationType7 protectedCardholderData) {
		this.protectedCardholderData = protectedCardholderData;
		return this;
	}
}