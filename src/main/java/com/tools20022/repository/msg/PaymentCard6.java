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
import com.tools20022.repository.datatype.Exact4NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType5;
import com.tools20022.repository.msg.PlainCardData2;
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
 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmProtectedCardData
 * PaymentCard6.mmProtectedCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6#mmPlainCardData
 * PaymentCard6.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardCountryCode
 * PaymentCard6.mmCardCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardProductProfile
 * PaymentCard6.mmCardProductProfile}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardBrand
 * PaymentCard6.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmAdditionalCardData
 * PaymentCard6.mmAdditionalCardData}</li>
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
 * "PaymentCard6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCard3
 * PaymentCard3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard6", propOrder = {"protectedCardData", "plainCardData", "cardCountryCode", "cardProductProfile", "cardBrand", "additionalCardData"})
public class PaymentCard6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrtctdCardData")
	protected ContentInformationType5 protectedCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType5
	 * ContentInformationType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6 PaymentCard6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmProtectedCardData
	 * PaymentCard8.mmProtectedCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard6, Optional<ContentInformationType5>> mmProtectedCardData = new MMMessageAssociationEnd<PaymentCard6, Optional<ContentInformationType5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard6.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Sensitive data of the card (PlainCardData1 including the envelope), encrypted with a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard8.mmProtectedCardData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType5.mmObject();
		}

		@Override
		public Optional<ContentInformationType5> getValue(PaymentCard6 obj) {
			return obj.getProtectedCardData();
		}

		@Override
		public void setValue(PaymentCard6 obj, Optional<ContentInformationType5> value) {
			obj.setProtectedCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData2 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData2
	 * PlainCardData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6 PaymentCard6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmPlainCardData
	 * PaymentCard8.mmPlainCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard6, Optional<PlainCardData2>> mmPlainCardData = new MMMessageAssociationEnd<PaymentCard6, Optional<PlainCardData2>>() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard6.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard8.mmPlainCardData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlainCardData2.mmObject();
		}

		@Override
		public Optional<PlainCardData2> getValue(PaymentCard6 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(PaymentCard6 obj, Optional<PlainCardData2> value) {
			obj.setPlainCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "CardCtryCd")
	protected Max3Text cardCountryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
	 * PaymentCard.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6 PaymentCard6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCtryCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code assigned to the card by the card issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardCountryCode
	 * PaymentCard8.mmCardCountryCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard6, Optional<Max3Text>> mmCardCountryCode = new MMMessageAttribute<PaymentCard6, Optional<Max3Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardCountryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard6.mmObject();
			isDerived = false;
			xmlTag = "CardCtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCountryCode";
			definition = "Country code assigned to the card by the card issuer.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard8.mmCardCountryCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(PaymentCard6 obj) {
			return obj.getCardCountryCode();
		}

		@Override
		public void setValue(PaymentCard6 obj, Optional<Max3Text> value) {
			obj.setCardCountryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPdctPrfl")
	protected Exact4NumericText cardProductProfile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4NumericText
	 * Exact4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmProfileNumber
	 * PaymentCard.mmProfileNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6 PaymentCard6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctPrfl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a category of cards related the acceptance processing rules defined by the acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardProductProfile
	 * PaymentCard8.mmCardProductProfile}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard6, Optional<Exact4NumericText>> mmCardProductProfile = new MMMessageAttribute<PaymentCard6, Optional<Exact4NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmProfileNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard6.mmObject();
			isDerived = false;
			xmlTag = "CardPdctPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductProfile";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard8.mmCardProductProfile);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4NumericText.mmObject();
		}

		@Override
		public Optional<Exact4NumericText> getValue(PaymentCard6 obj) {
			return obj.getCardProductProfile();
		}

		@Override
		public void setValue(PaymentCard6 obj, Optional<Exact4NumericText> value) {
			obj.setCardProductProfile(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardBrand
	 * PaymentCard.mmCardBrand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6 PaymentCard6}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardBrand
	 * PaymentCard8.mmCardBrand}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard6, Optional<Max35Text>> mmCardBrand = new MMMessageAttribute<PaymentCard6, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardBrand;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard6.mmObject();
			isDerived = false;
			xmlTag = "CardBrnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard8.mmCardBrand);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard6 obj) {
			return obj.getCardBrand();
		}

		@Override
		public void setValue(PaymentCard6 obj, Optional<Max35Text> value) {
			obj.setCardBrand(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCardData")
	protected Max70Text additionalCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6 PaymentCard6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional card issuer specific data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmAdditionalCardData
	 * PaymentCard8.mmAdditionalCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard6, Optional<Max70Text>> mmAdditionalCardData = new MMMessageAttribute<PaymentCard6, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard6.mmObject();
			isDerived = false;
			xmlTag = "AddtlCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCardData";
			definition = "Additional card issuer specific data.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard8.mmAdditionalCardData);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PaymentCard6 obj) {
			return obj.getAdditionalCardData();
		}

		@Override
		public void setValue(PaymentCard6 obj, Optional<Max70Text> value) {
			obj.setAdditionalCardData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard6.mmProtectedCardData, com.tools20022.repository.msg.PaymentCard6.mmPlainCardData,
						com.tools20022.repository.msg.PaymentCard6.mmCardCountryCode, com.tools20022.repository.msg.PaymentCard6.mmCardProductProfile, com.tools20022.repository.msg.PaymentCard6.mmCardBrand,
						com.tools20022.repository.msg.PaymentCard6.mmAdditionalCardData);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard6";
				definition = "Payment card performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCard8.mmObject());
				previousVersion_lazy = () -> PaymentCard3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType5> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public PaymentCard6 setProtectedCardData(ContentInformationType5 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData2> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public PaymentCard6 setPlainCardData(PlainCardData2 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}

	public Optional<Max3Text> getCardCountryCode() {
		return cardCountryCode == null ? Optional.empty() : Optional.of(cardCountryCode);
	}

	public PaymentCard6 setCardCountryCode(Max3Text cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
		return this;
	}

	public Optional<Exact4NumericText> getCardProductProfile() {
		return cardProductProfile == null ? Optional.empty() : Optional.of(cardProductProfile);
	}

	public PaymentCard6 setCardProductProfile(Exact4NumericText cardProductProfile) {
		this.cardProductProfile = cardProductProfile;
		return this;
	}

	public Optional<Max35Text> getCardBrand() {
		return cardBrand == null ? Optional.empty() : Optional.of(cardBrand);
	}

	public PaymentCard6 setCardBrand(Max35Text cardBrand) {
		this.cardBrand = cardBrand;
		return this;
	}

	public Optional<Max70Text> getAdditionalCardData() {
		return additionalCardData == null ? Optional.empty() : Optional.of(additionalCardData);
	}

	public PaymentCard6 setAdditionalCardData(Max70Text additionalCardData) {
		this.additionalCardData = additionalCardData;
		return this;
	}
}