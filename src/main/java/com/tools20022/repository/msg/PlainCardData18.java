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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentCard;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sensible data associated with the payment card performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#PAN
 * PlainCardData18.PAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData18#CardSequenceNumber
 * PlainCardData18.CardSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#EffectiveDate
 * PlainCardData18.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#ExpiryDate
 * PlainCardData18.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#ServiceCode
 * PlainCardData18.ServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#Track1
 * PlainCardData18.Track1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#Track2
 * PlainCardData18.Track2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#Track3
 * PlainCardData18.Track3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#CardholderName
 * PlainCardData18.CardholderName}</li>
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
 * "PlainCardData18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sensible data associated with the payment card performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PlainCardData13
 * PlainCardData13}</li>
 * </ul>
 */
public class PlainCardData18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Primary Account Number (PAN) of the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min8Max28NumericText
	 * Min8Max28NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#Number
	 * PaymentCard.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Primary Account Number (PAN) of the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#PAN
	 * PlainCardData13.PAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PAN = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.Number;
			isDerived = false;
			xmlTag = "PAN";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PAN";
			definition = "Primary Account Number (PAN) of the card.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.PAN;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}
	};
	/**
	 * Identify a card or a payment token inside a set of cards with the same
	 * PAN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min2Max3NumericText
	 * Min2Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#SequenceNumber
	 * PaymentCard.SequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify a card or a payment token inside a set of cards with the same PAN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#CardSequenceNumber
	 * PlainCardData13.CardSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CardSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.SequenceNumber;
			isDerived = false;
			xmlTag = "CardSeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSequenceNumber";
			definition = "Identify a card or a payment token inside a set of cards with the same PAN.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.CardSequenceNumber;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Min2Max3NumericText.mmObject();
		}
	};
	/**
	 * Date from which the card can be used, expressed either in the YYYY-MM
	 * format, or in the YYYY-MM-DD format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date from which the card can be used, expressed either in the YYYY-MM format, or in the YYYY-MM-DD format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#EffectiveDate
	 * PlainCardData13.EffectiveDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EffectiveDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date from which the card can be used, expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.EffectiveDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	/**
	 * Expiry date of the card expressed either in the YYYY-MM format, or in the
	 * YYYY-MM-DD format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expiry date of the card expressed either in the YYYY-MM format, or in the YYYY-MM-DD format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#ExpiryDate
	 * PlainCardData13.ExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExpiryDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Expiry date of the card expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.ExpiryDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	/**
	 * Services attached to the card, as defined in ISO 7813.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#ServiceCode
	 * PaymentCard.ServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services attached to the card, as defined in ISO 7813."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#ServiceCode
	 * PlainCardData13.ServiceCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.ServiceCode;
			isDerived = false;
			xmlTag = "SvcCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card, as defined in ISO 7813.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.ServiceCode;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	/**
	 * ISO track 1 issued from the magnetic stripe card or from the ICC if the
	 * magnetic stripe was not read. The format is conform to ISO 7813, removing
	 * beginning and ending sentinels and longitudinal redundancy check
	 * characters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max76Text
	 * Max76Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trck1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO track 1 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The format is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#Track1
	 * PlainCardData13.Track1}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Track1 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			isDerived = false;
			xmlTag = "Trck1";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track1";
			definition = "ISO track 1 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The format is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.Track1;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max76Text.mmObject();
		}
	};
	/**
	 * ISO track 2 issued from the magnetic stripe card or from the ICC if the
	 * magnetic stripe was not read. The content is conform to ISO 7813,
	 * removing beginning and ending sentinels and longitudinal redundancy check
	 * characters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max37Text
	 * Max37Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trck2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO track 2 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#Track2
	 * PlainCardData13.Track2}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Track2 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			isDerived = false;
			xmlTag = "Trck2";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track2";
			definition = "ISO track 2 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.Track2;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max37Text.mmObject();
		}
	};
	/**
	 * ISO track 3 issued from the magnetic stripe card or from the ICC if the
	 * magnetic stripe was not read. The content is conform to ISO 4909,
	 * removing beginning and ending sentinels and longitudinal redundancy check
	 * characters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max104Text
	 * Max104Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trck3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO track 3 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 4909, removing beginning and ending sentinels and longitudinal redundancy check characters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#Track3
	 * PlainCardData13.Track3}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Track3 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			isDerived = false;
			xmlTag = "Trck3";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track3";
			definition = "ISO track 3 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 4909, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.Track3;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max104Text.mmObject();
		}
	};
	/**
	 * Name of the cardholder stored on the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max45Text
	 * Max45Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18
	 * PlainCardData18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the cardholder stored on the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#CardholderName
	 * PlainCardData13.CardholderName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CardholderName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData18.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderName";
			definition = "Name of the cardholder stored on the card.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData13.CardholderName;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max45Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData18.PAN, com.tools20022.repository.msg.PlainCardData18.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData18.EffectiveDate,
						com.tools20022.repository.msg.PlainCardData18.ExpiryDate, com.tools20022.repository.msg.PlainCardData18.ServiceCode, com.tools20022.repository.msg.PlainCardData18.Track1,
						com.tools20022.repository.msg.PlainCardData18.Track2, com.tools20022.repository.msg.PlainCardData18.Track3, com.tools20022.repository.msg.PlainCardData18.CardholderName);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PlainCardData18";
				definition = "Sensible data associated with the payment card performing the transaction.";
				previousVersion_lazy = () -> PlainCardData13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}