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
import com.tools20022.repository.codeset.CardProductType1Code;
import com.tools20022.repository.datatype.Max30Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment card performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard15#mmProtectedCardData
 * PaymentCard15.mmProtectedCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard15#mmPlainCardData
 * PaymentCard15.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard15#mmMaskedPAN
 * PaymentCard15.mmMaskedPAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard15#mmCardProductType
 * PaymentCard15.mmCardProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard15#mmCardProductName
 * PaymentCard15.mmCardProductName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
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
 * "PaymentCard15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCard13
 * PaymentCard13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard15", propOrder = {"protectedCardData", "plainCardData", "maskedPAN", "cardProductType", "cardProductName"})
public class PaymentCard15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrtctdCardData")
	protected ContentInformationType10 protectedCardData;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard15 PaymentCard15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard13#mmProtectedCardData
	 * PaymentCard13.mmProtectedCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard15.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key.";
			previousVersion_lazy = () -> PaymentCard13.mmProtectedCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData12 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData12
	 * PlainCardData12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard15 PaymentCard15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data associated with the card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard13#mmPlainCardData
	 * PaymentCard13.mmPlainCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlainCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard15.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			previousVersion_lazy = () -> PaymentCard13.mmPlainCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlainCardData12.mmObject();
		}
	};
	@XmlElement(name = "MskdPAN")
	protected Max30Text maskedPAN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard15 PaymentCard15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MskdPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaskedPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Masked PAN to be printed the payment receipts or displayed to the cardholder. Masked digits may be absent or replaced by another character as '*'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard13#mmMaskedPAN
	 * PaymentCard13.mmMaskedPAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaskedPAN = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard15.mmObject();
			isDerived = false;
			xmlTag = "MskdPAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaskedPAN";
			definition = "Masked PAN to be printed the payment receipts or displayed to the cardholder. Masked digits may be absent or replaced by another character as '*'.";
			previousVersion_lazy = () -> PaymentCard13.mmMaskedPAN;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}
	};
	@XmlElement(name = "CardPdctTp")
	protected CardProductType1Code cardProductType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardProductType1Code
	 * CardProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard15 PaymentCard15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of card product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard13#mmCardProductType
	 * PaymentCard13.mmCardProductType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardProductType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard15.mmObject();
			isDerived = false;
			xmlTag = "CardPdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductType";
			definition = "Type of card product.";
			previousVersion_lazy = () -> PaymentCard13.mmCardProductType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardProductType1Code.mmObject();
		}
	};
	@XmlElement(name = "CardPdctNm")
	protected Max35Text cardProductName;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard15 PaymentCard15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of card product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard13#mmCardProductName
	 * PaymentCard13.mmCardProductName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardProductName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard15.mmObject();
			isDerived = false;
			xmlTag = "CardPdctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductName";
			definition = "Name of card product.";
			previousVersion_lazy = () -> PaymentCard13.mmCardProductName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard15.mmProtectedCardData, com.tools20022.repository.msg.PaymentCard15.mmPlainCardData,
						com.tools20022.repository.msg.PaymentCard15.mmMaskedPAN, com.tools20022.repository.msg.PaymentCard15.mmCardProductType, com.tools20022.repository.msg.PaymentCard15.mmCardProductName);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard15";
				definition = "Payment card performing the transaction.";
				previousVersion_lazy = () -> PaymentCard13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType10> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public PaymentCard15 setProtectedCardData(com.tools20022.repository.msg.ContentInformationType10 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData12> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public PaymentCard15 setPlainCardData(com.tools20022.repository.msg.PlainCardData12 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}

	public Optional<Max30Text> getMaskedPAN() {
		return maskedPAN == null ? Optional.empty() : Optional.of(maskedPAN);
	}

	public PaymentCard15 setMaskedPAN(Max30Text maskedPAN) {
		this.maskedPAN = maskedPAN;
		return this;
	}

	public Optional<CardProductType1Code> getCardProductType() {
		return cardProductType == null ? Optional.empty() : Optional.of(cardProductType);
	}

	public PaymentCard15 setCardProductType(CardProductType1Code cardProductType) {
		this.cardProductType = cardProductType;
		return this;
	}

	public Optional<Max35Text> getCardProductName() {
		return cardProductName == null ? Optional.empty() : Optional.of(cardProductName);
	}

	public PaymentCard15 setCardProductName(Max35Text cardProductName) {
		this.cardProductName = cardProductName;
		return this;
	}
}