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
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.PlainCardData8;
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
 * {@linkplain com.tools20022.repository.msg.PaymentCard10#mmProtectedCardData
 * PaymentCard10.mmProtectedCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard10#mmPlainCardData
 * PaymentCard10.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard10#mmMaskedPAN
 * PaymentCard10.mmMaskedPAN}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard10#mmCardBrand
 * PaymentCard10.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard10#mmCardProductType
 * PaymentCard10.mmCardProductType}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCard10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard19 PaymentCard19}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCard3
 * PaymentCard3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard10", propOrder = {"protectedCardData", "plainCardData", "maskedPAN", "cardBrand", "cardProductType"})
public class PaymentCard10 {

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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard10 PaymentCard10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data of the card (PlainCardData1 including the envelope), encrypted with a cryptographic key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard19#mmProtectedCardData
	 * PaymentCard19.mmProtectedCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard3#mmProtectedCardData
	 * PaymentCard3.mmProtectedCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard10, Optional<ContentInformationType10>> mmProtectedCardData = new MMMessageAssociationEnd<PaymentCard10, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard10.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Sensitive data of the card (PlainCardData1 including the envelope), encrypted with a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard19.mmProtectedCardData);
			previousVersion_lazy = () -> PaymentCard3.mmProtectedCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(PaymentCard10 obj) {
			return obj.getProtectedCardData();
		}

		@Override
		public void setValue(PaymentCard10 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData8 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData8
	 * PlainCardData8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard10 PaymentCard10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data associated with the card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard19#mmPlainCardData
	 * PaymentCard19.mmPlainCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard3#mmPlainCardData
	 * PaymentCard3.mmPlainCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard10, Optional<PlainCardData8>> mmPlainCardData = new MMMessageAssociationEnd<PaymentCard10, Optional<PlainCardData8>>() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard10.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard19.mmPlainCardData);
			previousVersion_lazy = () -> PaymentCard3.mmPlainCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlainCardData8.mmObject();
		}

		@Override
		public Optional<PlainCardData8> getValue(PaymentCard10 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(PaymentCard10 obj, Optional<PlainCardData8> value) {
			obj.setPlainCardData(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard10 PaymentCard10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MskdPAN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaskedPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Masked PAN to be printed on payment receipts or displayed to the cardholder. Masked digits may be absent or replaced by another character as '*'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard19#mmMaskedPAN
	 * PaymentCard19.mmMaskedPAN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard10, Optional<Max30Text>> mmMaskedPAN = new MMMessageAttribute<PaymentCard10, Optional<Max30Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard10.mmObject();
			isDerived = false;
			xmlTag = "MskdPAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaskedPAN";
			definition = "Masked PAN to be printed on payment receipts or displayed to the cardholder. Masked digits may be absent or replaced by another character as '*'.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard19.mmMaskedPAN);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Optional<Max30Text> getValue(PaymentCard10 obj) {
			return obj.getMaskedPAN();
		}

		@Override
		public void setValue(PaymentCard10 obj, Optional<Max30Text> value) {
			obj.setMaskedPAN(value.orElse(null));
		}
	};
	@XmlElement(name = "CardBrnd")
	protected Max35Text cardBrand;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard10 PaymentCard10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardBrnd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brand name of the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard19#mmCardBrand
	 * PaymentCard19.mmCardBrand}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard10, Optional<Max35Text>> mmCardBrand = new MMMessageAttribute<PaymentCard10, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard10.mmObject();
			isDerived = false;
			xmlTag = "CardBrnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard19.mmCardBrand);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard10 obj) {
			return obj.getCardBrand();
		}

		@Override
		public void setValue(PaymentCard10 obj, Optional<Max35Text> value) {
			obj.setCardBrand(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard10 PaymentCard10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of card product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard19#mmCardProductType
	 * PaymentCard19.mmCardProductType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard10, Optional<CardProductType1Code>> mmCardProductType = new MMMessageAttribute<PaymentCard10, Optional<CardProductType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard10.mmObject();
			isDerived = false;
			xmlTag = "CardPdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductType";
			definition = "Type of card product.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard19.mmCardProductType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardProductType1Code.mmObject();
		}

		@Override
		public Optional<CardProductType1Code> getValue(PaymentCard10 obj) {
			return obj.getCardProductType();
		}

		@Override
		public void setValue(PaymentCard10 obj, Optional<CardProductType1Code> value) {
			obj.setCardProductType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard10.mmProtectedCardData, com.tools20022.repository.msg.PaymentCard10.mmPlainCardData,
						com.tools20022.repository.msg.PaymentCard10.mmMaskedPAN, com.tools20022.repository.msg.PaymentCard10.mmCardBrand, com.tools20022.repository.msg.PaymentCard10.mmCardProductType);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard10";
				definition = "Payment card performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCard19.mmObject());
				previousVersion_lazy = () -> PaymentCard3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType10> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public PaymentCard10 setProtectedCardData(ContentInformationType10 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData8> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public PaymentCard10 setPlainCardData(PlainCardData8 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}

	public Optional<Max30Text> getMaskedPAN() {
		return maskedPAN == null ? Optional.empty() : Optional.of(maskedPAN);
	}

	public PaymentCard10 setMaskedPAN(Max30Text maskedPAN) {
		this.maskedPAN = maskedPAN;
		return this;
	}

	public Optional<Max35Text> getCardBrand() {
		return cardBrand == null ? Optional.empty() : Optional.of(cardBrand);
	}

	public PaymentCard10 setCardBrand(Max35Text cardBrand) {
		this.cardBrand = cardBrand;
		return this;
	}

	public Optional<CardProductType1Code> getCardProductType() {
		return cardProductType == null ? Optional.empty() : Optional.of(cardProductType);
	}

	public PaymentCard10 setCardProductType(CardProductType1Code cardProductType) {
		this.cardProductType = cardProductType;
		return this;
	}
}