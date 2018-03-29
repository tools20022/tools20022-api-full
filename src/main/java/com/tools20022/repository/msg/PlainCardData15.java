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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentCard;
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
 * Sensible data associated with the payment card performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmPAN
 * PlainCardData15.mmPAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmCardSequenceNumber
 * PlainCardData15.mmCardSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmEffectiveDate
 * PlainCardData15.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmExpiryDate
 * PlainCardData15.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmServiceCode
 * PlainCardData15.mmServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmTrack1
 * PlainCardData15.mmTrack1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmTrack2
 * PlainCardData15.mmTrack2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmTrack3
 * PlainCardData15.mmTrack3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmCardholderName
 * PlainCardData15.mmCardholderName}</li>
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
 * "PlainCardData15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sensible data associated with the payment card performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PlainCardData7
 * PlainCardData7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PlainCardData15", propOrder = {"pAN", "cardSequenceNumber", "effectiveDate", "expiryDate", "serviceCode", "track1", "track2", "track3", "cardholderName"})
public class PlainCardData15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PAN", required = true)
	protected Min8Max28NumericText pAN;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmNumber
	 * PaymentCard.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * definition} =
	 * "Primary Account Number (PAN) of the card, or surrogate of the PAN by a payment token."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmPAN
	 * PlainCardData7.mmPAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Min8Max28NumericText> mmPAN = new MMMessageAttribute<PlainCardData15, Min8Max28NumericText>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "PAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PAN";
			definition = "Primary Account Number (PAN) of the card, or surrogate of the PAN by a payment token.";
			previousVersion_lazy = () -> PlainCardData7.mmPAN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}

		@Override
		public Min8Max28NumericText getValue(PlainCardData15 obj) {
			return obj.getPAN();
		}

		@Override
		public void setValue(PlainCardData15 obj, Min8Max28NumericText value) {
			obj.setPAN(value);
		}
	};
	@XmlElement(name = "CardSeqNb")
	protected Min2Max3NumericText cardSequenceNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSequenceNumber
	 * PaymentCard.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * "Identify a card or a payment token inside a set of cards with the same PAN or token."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmCardSequenceNumber
	 * PlainCardData7.mmCardSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Optional<Min2Max3NumericText>> mmCardSequenceNumber = new MMMessageAttribute<PlainCardData15, Optional<Min2Max3NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmSequenceNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "CardSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSequenceNumber";
			definition = "Identify a card or a payment token inside a set of cards with the same PAN or token.";
			previousVersion_lazy = () -> PlainCardData7.mmCardSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3NumericText.mmObject();
		}

		@Override
		public Optional<Min2Max3NumericText> getValue(PlainCardData15 obj) {
			return obj.getCardSequenceNumber();
		}

		@Override
		public void setValue(PlainCardData15 obj, Optional<Min2Max3NumericText> value) {
			obj.setCardSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvDt")
	protected Max10Text effectiveDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmEffectiveDate
	 * PlainCardData7.mmEffectiveDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Optional<Max10Text>> mmEffectiveDate = new MMMessageAttribute<PlainCardData15, Optional<Max10Text>>() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date from which the card can be used, expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> PlainCardData7.mmEffectiveDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(PlainCardData15 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(PlainCardData15 obj, Optional<Max10Text> value) {
			obj.setEffectiveDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt", required = true)
	protected Max10Text expiryDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * "Expiry date of the card or the payment token expressed either in the YYYY-MM format, or in the YYYY-MM-DD format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmExpiryDate
	 * PlainCardData7.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Max10Text> mmExpiryDate = new MMMessageAttribute<PlainCardData15, Max10Text>() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Expiry date of the card or the payment token expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> PlainCardData7.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Max10Text getValue(PlainCardData15 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(PlainCardData15 obj, Max10Text value) {
			obj.setExpiryDate(value);
		}
	};
	@XmlElement(name = "SvcCd")
	protected Exact3NumericText serviceCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmServiceCode
	 * PaymentCard.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmServiceCode
	 * PlainCardData7.mmServiceCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Optional<Exact3NumericText>> mmServiceCode = new MMMessageAttribute<PlainCardData15, Optional<Exact3NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmServiceCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "SvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card, as defined in ISO 7813.";
			previousVersion_lazy = () -> PlainCardData7.mmServiceCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(PlainCardData15 obj) {
			return obj.getServiceCode();
		}

		@Override
		public void setValue(PlainCardData15 obj, Optional<Exact3NumericText> value) {
			obj.setServiceCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Trck1")
	protected Max76Text track1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max76Text
	 * Max76Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Optional<Max76Text>> mmTrack1 = new MMMessageAttribute<PlainCardData15, Optional<Max76Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "Trck1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track1";
			definition = "ISO track 1 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The format is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max76Text.mmObject();
		}

		@Override
		public Optional<Max76Text> getValue(PlainCardData15 obj) {
			return obj.getTrack1();
		}

		@Override
		public void setValue(PlainCardData15 obj, Optional<Max76Text> value) {
			obj.setTrack1(value.orElse(null));
		}
	};
	@XmlElement(name = "Trck2")
	protected Max37Text track2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max37Text
	 * Max37Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Optional<Max37Text>> mmTrack2 = new MMMessageAttribute<PlainCardData15, Optional<Max37Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "Trck2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track2";
			definition = "ISO track 2 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max37Text.mmObject();
		}

		@Override
		public Optional<Max37Text> getValue(PlainCardData15 obj) {
			return obj.getTrack2();
		}

		@Override
		public void setValue(PlainCardData15 obj, Optional<Max37Text> value) {
			obj.setTrack2(value.orElse(null));
		}
	};
	@XmlElement(name = "Trck3")
	protected Max104Text track3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max104Text
	 * Max104Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Optional<Max104Text>> mmTrack3 = new MMMessageAttribute<PlainCardData15, Optional<Max104Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "Trck3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track3";
			definition = "ISO track 3 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 4909, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max104Text.mmObject();
		}

		@Override
		public Optional<Max104Text> getValue(PlainCardData15 obj) {
			return obj.getTrack3();
		}

		@Override
		public void setValue(PlainCardData15 obj, Optional<Max104Text> value) {
			obj.setTrack3(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrNm")
	protected Max45Text cardholderName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max45Text
	 * Max45Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmCardholderName
	 * PlainCardData7.mmCardholderName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData15, Optional<Max45Text>> mmCardholderName = new MMMessageAttribute<PlainCardData15, Optional<Max45Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData15.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderName";
			definition = "Name of the cardholder stored on the card.";
			previousVersion_lazy = () -> PlainCardData7.mmCardholderName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max45Text.mmObject();
		}

		@Override
		public Optional<Max45Text> getValue(PlainCardData15 obj) {
			return obj.getCardholderName();
		}

		@Override
		public void setValue(PlainCardData15 obj, Optional<Max45Text> value) {
			obj.setCardholderName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData15.mmPAN, com.tools20022.repository.msg.PlainCardData15.mmCardSequenceNumber,
						com.tools20022.repository.msg.PlainCardData15.mmEffectiveDate, com.tools20022.repository.msg.PlainCardData15.mmExpiryDate, com.tools20022.repository.msg.PlainCardData15.mmServiceCode,
						com.tools20022.repository.msg.PlainCardData15.mmTrack1, com.tools20022.repository.msg.PlainCardData15.mmTrack2, com.tools20022.repository.msg.PlainCardData15.mmTrack3,
						com.tools20022.repository.msg.PlainCardData15.mmCardholderName);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PlainCardData15";
				definition = "Sensible data associated with the payment card performing the transaction.";
				previousVersion_lazy = () -> PlainCardData7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Min8Max28NumericText getPAN() {
		return pAN;
	}

	public PlainCardData15 setPAN(Min8Max28NumericText pAN) {
		this.pAN = Objects.requireNonNull(pAN);
		return this;
	}

	public Optional<Min2Max3NumericText> getCardSequenceNumber() {
		return cardSequenceNumber == null ? Optional.empty() : Optional.of(cardSequenceNumber);
	}

	public PlainCardData15 setCardSequenceNumber(Min2Max3NumericText cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
		return this;
	}

	public Optional<Max10Text> getEffectiveDate() {
		return effectiveDate == null ? Optional.empty() : Optional.of(effectiveDate);
	}

	public PlainCardData15 setEffectiveDate(Max10Text effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Max10Text getExpiryDate() {
		return expiryDate;
	}

	public PlainCardData15 setExpiryDate(Max10Text expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Optional<Exact3NumericText> getServiceCode() {
		return serviceCode == null ? Optional.empty() : Optional.of(serviceCode);
	}

	public PlainCardData15 setServiceCode(Exact3NumericText serviceCode) {
		this.serviceCode = serviceCode;
		return this;
	}

	public Optional<Max76Text> getTrack1() {
		return track1 == null ? Optional.empty() : Optional.of(track1);
	}

	public PlainCardData15 setTrack1(Max76Text track1) {
		this.track1 = track1;
		return this;
	}

	public Optional<Max37Text> getTrack2() {
		return track2 == null ? Optional.empty() : Optional.of(track2);
	}

	public PlainCardData15 setTrack2(Max37Text track2) {
		this.track2 = track2;
		return this;
	}

	public Optional<Max104Text> getTrack3() {
		return track3 == null ? Optional.empty() : Optional.of(track3);
	}

	public PlainCardData15 setTrack3(Max104Text track3) {
		this.track3 = track3;
		return this;
	}

	public Optional<Max45Text> getCardholderName() {
		return cardholderName == null ? Optional.empty() : Optional.of(cardholderName);
	}

	public PlainCardData15 setCardholderName(Max45Text cardholderName) {
		this.cardholderName = cardholderName;
		return this;
	}
}