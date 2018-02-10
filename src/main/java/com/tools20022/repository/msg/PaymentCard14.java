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
import com.tools20022.repository.datatype.Exact3AlphaNumericText;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max3Text;
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
 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmProtectedCardData
 * PaymentCard14.mmProtectedCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard14#mmPlainCardData
 * PaymentCard14.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard14#mmIssuerBIN
 * PaymentCard14.mmIssuerBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCountryCode
 * PaymentCard14.mmCardCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCurrencyCode
 * PaymentCard14.mmCardCurrencyCode}</li>
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
 * "PaymentCard14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard16 PaymentCard16}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCard12
 * PaymentCard12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard14", propOrder = {"protectedCardData", "plainCardData", "issuerBIN", "cardCountryCode", "cardCurrencyCode"})
public class PaymentCard14 {

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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard16#mmProtectedCardData
	 * PaymentCard16.mmProtectedCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmProtectedCardData
	 * PaymentCard12.mmProtectedCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard14.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard16.mmProtectedCardData);
			previousVersion_lazy = () -> PaymentCard12.mmProtectedCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData11 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData11
	 * PlainCardData11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard16#mmPlainCardData
	 * PaymentCard16.mmPlainCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmPlainCardData
	 * PaymentCard12.mmPlainCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlainCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard14.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard16.mmPlainCardData);
			previousVersion_lazy = () -> PaymentCard12.mmPlainCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlainCardData11.mmObject();
		}
	};
	@XmlElement(name = "IssrBIN")
	protected Max15NumericText issuerBIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank identifier number of the issuer for routing purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmIssuerBIN
	 * PaymentCard12.mmIssuerBIN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerBIN = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard14.mmObject();
			isDerived = false;
			xmlTag = "IssrBIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerBIN";
			definition = "Bank identifier number of the issuer for routing purpose.";
			previousVersion_lazy = () -> PaymentCard12.mmIssuerBIN;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code assigned to the card by the card issuer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard16#mmCardCountryCode
	 * PaymentCard16.mmCardCountryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCountryCode
	 * PaymentCard12.mmCardCountryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCountryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardCountryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard14.mmObject();
			isDerived = false;
			xmlTag = "CardCtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCountryCode";
			definition = "Country code assigned to the card by the card issuer.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard16.mmCardCountryCode);
			previousVersion_lazy = () -> PaymentCard12.mmCardCountryCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	@XmlElement(name = "CardCcyCd")
	protected Exact3AlphaNumericText cardCurrencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3AlphaNumericText
	 * Exact3AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCurrencyCode
	 * PaymentCard.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code of the card issuer (ISO 4217 numeric code)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard16#mmCardCurrencyCode
	 * PaymentCard16.mmCardCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCurrencyCode
	 * PaymentCard12.mmCardCurrencyCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCurrencyCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardCurrencyCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard14.mmObject();
			isDerived = false;
			xmlTag = "CardCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer (ISO 4217 numeric code).";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard16.mmCardCurrencyCode);
			previousVersion_lazy = () -> PaymentCard12.mmCardCurrencyCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard14.mmProtectedCardData, com.tools20022.repository.msg.PaymentCard14.mmPlainCardData,
						com.tools20022.repository.msg.PaymentCard14.mmIssuerBIN, com.tools20022.repository.msg.PaymentCard14.mmCardCountryCode, com.tools20022.repository.msg.PaymentCard14.mmCardCurrencyCode);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard14";
				definition = "Payment card performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCard16.mmObject());
				previousVersion_lazy = () -> PaymentCard12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType10> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public PaymentCard14 setProtectedCardData(com.tools20022.repository.msg.ContentInformationType10 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData11> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public PaymentCard14 setPlainCardData(com.tools20022.repository.msg.PlainCardData11 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}

	public Optional<Max15NumericText> getIssuerBIN() {
		return issuerBIN == null ? Optional.empty() : Optional.of(issuerBIN);
	}

	public PaymentCard14 setIssuerBIN(Max15NumericText issuerBIN) {
		this.issuerBIN = issuerBIN;
		return this;
	}

	public Optional<Max3Text> getCardCountryCode() {
		return cardCountryCode == null ? Optional.empty() : Optional.of(cardCountryCode);
	}

	public PaymentCard14 setCardCountryCode(Max3Text cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
		return this;
	}

	public Optional<Exact3AlphaNumericText> getCardCurrencyCode() {
		return cardCurrencyCode == null ? Optional.empty() : Optional.of(cardCurrencyCode);
	}

	public PaymentCard14 setCardCurrencyCode(Exact3AlphaNumericText cardCurrencyCode) {
		this.cardCurrencyCode = cardCurrencyCode;
		return this;
	}
}