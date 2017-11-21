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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmProtectedCardData
 * PaymentCard9.mmProtectedCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard9#mmPlainCardData
 * PaymentCard9.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard9#mmIssuerBIN
 * PaymentCard9.mmIssuerBIN}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardCountryCode
 * PaymentCard9.mmCardCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardCurrencyCode
 * PaymentCard9.mmCardCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardProductProfile
 * PaymentCard9.mmCardProductProfile}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardBrand
 * PaymentCard9.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmAdditionalCardData
 * PaymentCard9.mmAdditionalCardData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
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
 * "PaymentCard9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard11 PaymentCard11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard21 PaymentCard21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCard7
 * PaymentCard7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentCard9", propOrder = {"protectedCardData", "plainCardData", "issuerBIN", "cardCountryCode", "cardCurrencyCode", "cardProductProfile", "cardBrand", "additionalCardData"})
public class PaymentCard9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentInformationType10 protectedCardData;
	/**
	 * Replacement of the message element PlainCardData by a digital envelope
	 * using a cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmProtectedCardData
	 * PaymentCard12.mmProtectedCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#mmProtectedCardData
	 * PaymentCard11.mmProtectedCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#mmProtectedCardData
	 * PaymentCard21.mmProtectedCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmProtectedCardData
	 * PaymentCard7.mmProtectedCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard12.mmProtectedCardData, PaymentCard11.mmProtectedCardData, PaymentCard21.mmProtectedCardData);
			previousVersion_lazy = () -> PaymentCard7.mmProtectedCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected PlainCardData7 plainCardData;
	/**
	 * Sensitive data associated with the card performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData7
	 * PlainCardData7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmPlainCardData
	 * PaymentCard12.mmPlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#mmPlainCardData
	 * PaymentCard11.mmPlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#mmPlainCardData
	 * PaymentCard21.mmPlainCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmPlainCardData
	 * PaymentCard7.mmPlainCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlainCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard12.mmPlainCardData, PaymentCard11.mmPlainCardData, PaymentCard21.mmPlainCardData);
			previousVersion_lazy = () -> PaymentCard7.mmPlainCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlainCardData7.mmObject();
		}
	};
	protected Max15NumericText issuerBIN;
	/**
	 * Bank identifier number of the issuer for routing purpose.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard12#mmIssuerBIN
	 * PaymentCard12.mmIssuerBIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard11#mmIssuerBIN
	 * PaymentCard11.mmIssuerBIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard21#mmIssuerBIN
	 * PaymentCard21.mmIssuerBIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerBIN = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "IssrBIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerBIN";
			definition = "Bank identifier number of the issuer for routing purpose.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard12.mmIssuerBIN, PaymentCard11.mmIssuerBIN, PaymentCard21.mmIssuerBIN);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected Max3Text cardCountryCode;
	/**
	 * Country code assigned to the card by the card issuer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCountryCode
	 * PaymentCard12.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#mmCardCountryCode
	 * PaymentCard11.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#mmCardCountryCode
	 * PaymentCard21.mmCardCountryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmCardCountryCode
	 * PaymentCard7.mmCardCountryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCountryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardCountryCode;
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "CardCtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCountryCode";
			definition = "Country code assigned to the card by the card issuer.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard12.mmCardCountryCode, PaymentCard11.mmCardCountryCode, PaymentCard21.mmCardCountryCode);
			previousVersion_lazy = () -> PaymentCard7.mmCardCountryCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	protected Exact3AlphaNumericText cardCurrencyCode;
	/**
	 * Currency code of the card issuer (ISO 4217 numeric code).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3AlphaNumericText
	 * Exact3AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCurrencyCode
	 * PaymentCard12.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#mmCardCurrencyCode
	 * PaymentCard11.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#mmCardCurrencyCode
	 * PaymentCard21.mmCardCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmCardCurrencyCode
	 * PaymentCard7.mmCardCurrencyCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCurrencyCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "CardCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer (ISO 4217 numeric code).";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard12.mmCardCurrencyCode, PaymentCard11.mmCardCurrencyCode, PaymentCard21.mmCardCurrencyCode);
			previousVersion_lazy = () -> PaymentCard7.mmCardCurrencyCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3AlphaNumericText.mmObject();
		}
	};
	protected Max35Text cardProductProfile;
	/**
	 * Defines a category of cards related to the acceptance processing rules
	 * defined by the acquirer.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a category of cards related to the acceptance processing rules defined by the acquirer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#mmCardProductProfile
	 * PaymentCard11.mmCardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#mmCardProductProfile
	 * PaymentCard21.mmCardProductProfile}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmCardProductProfile
	 * PaymentCard7.mmCardProductProfile}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardProductProfile = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "CardPdctPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductProfile";
			definition = "Defines a category of cards related to the acceptance processing rules defined by the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard11.mmCardProductProfile, PaymentCard21.mmCardProductProfile);
			previousVersion_lazy = () -> PaymentCard7.mmCardProductProfile;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text cardBrand;
	/**
	 * Brand name of the card.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardBrnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brand name of the card."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard11#mmCardBrand
	 * PaymentCard11.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard21#mmCardBrand
	 * PaymentCard21.mmCardBrand}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmCardBrand
	 * PaymentCard7.mmCardBrand}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardBrand = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardBrand;
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "CardBrnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard11.mmCardBrand, PaymentCard21.mmCardBrand);
			previousVersion_lazy = () -> PaymentCard7.mmCardBrand;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max70Text additionalCardData;
	/**
	 * Additional card issuer specific data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional card issuer specific data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmAdditionalCardData
	 * PaymentCard12.mmAdditionalCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#mmAdditionalCardData
	 * PaymentCard11.mmAdditionalCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#mmAdditionalCardData
	 * PaymentCard21.mmAdditionalCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmAdditionalCardData
	 * PaymentCard7.mmAdditionalCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalCardData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentCard9.mmObject();
			isDerived = false;
			xmlTag = "AddtlCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCardData";
			definition = "Additional card issuer specific data.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard12.mmAdditionalCardData, PaymentCard11.mmAdditionalCardData, PaymentCard21.mmAdditionalCardData);
			previousVersion_lazy = () -> PaymentCard7.mmAdditionalCardData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentCard9.mmProtectedCardData, PaymentCard9.mmPlainCardData, PaymentCard9.mmIssuerBIN, PaymentCard9.mmCardCountryCode, PaymentCard9.mmCardCurrencyCode,
						PaymentCard9.mmCardProductProfile, PaymentCard9.mmCardBrand, PaymentCard9.mmAdditionalCardData);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard9";
				definition = "Payment card performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCard12.mmObject(), PaymentCard11.mmObject(), PaymentCard21.mmObject());
				previousVersion_lazy = () -> PaymentCard7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrtctdCardData")
	public ContentInformationType10 getProtectedCardData() {
		return protectedCardData;
	}

	public void setProtectedCardData(com.tools20022.repository.msg.ContentInformationType10 protectedCardData) {
		this.protectedCardData = protectedCardData;
	}

	@XmlElement(name = "PlainCardData")
	public PlainCardData7 getPlainCardData() {
		return plainCardData;
	}

	public void setPlainCardData(com.tools20022.repository.msg.PlainCardData7 plainCardData) {
		this.plainCardData = plainCardData;
	}

	@XmlElement(name = "IssrBIN")
	public Max15NumericText getIssuerBIN() {
		return issuerBIN;
	}

	public void setIssuerBIN(Max15NumericText issuerBIN) {
		this.issuerBIN = issuerBIN;
	}

	@XmlElement(name = "CardCtryCd")
	public Max3Text getCardCountryCode() {
		return cardCountryCode;
	}

	public void setCardCountryCode(Max3Text cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
	}

	@XmlElement(name = "CardCcyCd")
	public Exact3AlphaNumericText getCardCurrencyCode() {
		return cardCurrencyCode;
	}

	public void setCardCurrencyCode(Exact3AlphaNumericText cardCurrencyCode) {
		this.cardCurrencyCode = cardCurrencyCode;
	}

	@XmlElement(name = "CardPdctPrfl")
	public Max35Text getCardProductProfile() {
		return cardProductProfile;
	}

	public void setCardProductProfile(Max35Text cardProductProfile) {
		this.cardProductProfile = cardProductProfile;
	}

	@XmlElement(name = "CardBrnd")
	public Max35Text getCardBrand() {
		return cardBrand;
	}

	public void setCardBrand(Max35Text cardBrand) {
		this.cardBrand = cardBrand;
	}

	@XmlElement(name = "AddtlCardData")
	public Max70Text getAdditionalCardData() {
		return additionalCardData;
	}

	public void setAdditionalCardData(Max70Text additionalCardData) {
		this.additionalCardData = additionalCardData;
	}
}