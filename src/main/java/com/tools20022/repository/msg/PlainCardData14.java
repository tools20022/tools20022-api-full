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
import com.tools20022.repository.datatype.Max10Text;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Min2Max3NumericText;
import com.tools20022.repository.datatype.Min8Max28NumericText;
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
 * Sensible data associated with the payment card performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#mmPAN
 * PlainCardData14.mmPAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData14#mmCardSequenceNumber
 * PlainCardData14.mmCardSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData14#mmEffectiveDate
 * PlainCardData14.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#mmExpiryDate
 * PlainCardData14.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#mmTrack1
 * PlainCardData14.mmTrack1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#mmTrack2
 * PlainCardData14.mmTrack2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#mmTrack3
 * PlainCardData14.mmTrack3}</li>
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
 * "PlainCardData14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sensible data associated with the payment card performing the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PlainCardData13
 * PlainCardData13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PlainCardData14", propOrder = {"pAN", "cardSequenceNumber", "effectiveDate", "expiryDate", "track1", "track2", "track3"})
public class PlainCardData14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PAN")
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PAN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Primary Account Number (PAN) of the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmPAN
	 * PlainCardData13.mmPAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData14, Optional<Min8Max28NumericText>> mmPAN = new MMMessageAttribute<PlainCardData14, Optional<Min8Max28NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "PAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PAN";
			definition = "Primary Account Number (PAN) of the card.";
			previousVersion_lazy = () -> PlainCardData13.mmPAN;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}

		@Override
		public Optional<Min8Max28NumericText> getValue(PlainCardData14 obj) {
			return obj.getPAN();
		}

		@Override
		public void setValue(PlainCardData14 obj, Optional<Min8Max28NumericText> value) {
			obj.setPAN(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify a card or a payment token inside a set of cards with the same PAN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmCardSequenceNumber
	 * PlainCardData13.mmCardSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData14, Optional<Min2Max3NumericText>> mmCardSequenceNumber = new MMMessageAttribute<PlainCardData14, Optional<Min2Max3NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmSequenceNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "CardSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSequenceNumber";
			definition = "Identify a card or a payment token inside a set of cards with the same PAN.";
			previousVersion_lazy = () -> PlainCardData13.mmCardSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3NumericText.mmObject();
		}

		@Override
		public Optional<Min2Max3NumericText> getValue(PlainCardData14 obj) {
			return obj.getCardSequenceNumber();
		}

		@Override
		public void setValue(PlainCardData14 obj, Optional<Min2Max3NumericText> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date from which the card can be used, expressed either in the YYYY-MM format, or in the YYYY-MM-DD format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmEffectiveDate
	 * PlainCardData13.mmEffectiveDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData14, Optional<Max10Text>> mmEffectiveDate = new MMMessageAttribute<PlainCardData14, Optional<Max10Text>>() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date from which the card can be used, expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> PlainCardData13.mmEffectiveDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(PlainCardData14 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(PlainCardData14 obj, Optional<Max10Text> value) {
			obj.setEffectiveDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expiry date of the card expressed either in the YYYY-MM format, or in the YYYY-MM-DD format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmExpiryDate
	 * PlainCardData13.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData14, Optional<Max10Text>> mmExpiryDate = new MMMessageAttribute<PlainCardData14, Optional<Max10Text>>() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Expiry date of the card expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> PlainCardData13.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(PlainCardData14 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(PlainCardData14 obj, Optional<Max10Text> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Trck1")
	protected Max140Text track1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trck1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Track number 1 from magnetic stripe card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmTrack1
	 * PlainCardData13.mmTrack1}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData14, Optional<Max140Text>> mmTrack1 = new MMMessageAttribute<PlainCardData14, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "Trck1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track1";
			definition = "Track number 1 from magnetic stripe card.";
			previousVersion_lazy = () -> PlainCardData13.mmTrack1;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PlainCardData14 obj) {
			return obj.getTrack1();
		}

		@Override
		public void setValue(PlainCardData14 obj, Optional<Max140Text> value) {
			obj.setTrack1(value.orElse(null));
		}
	};
	@XmlElement(name = "Trck2")
	protected Max140Text track2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trck2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Track number 2 without control characters (start /end and LRC)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData14, Optional<Max140Text>> mmTrack2 = new MMMessageAttribute<PlainCardData14, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "Trck2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track2";
			definition = "Track number 2 without control characters (start /end and LRC).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PlainCardData14 obj) {
			return obj.getTrack2();
		}

		@Override
		public void setValue(PlainCardData14 obj, Optional<Max140Text> value) {
			obj.setTrack2(value.orElse(null));
		}
	};
	@XmlElement(name = "Trck3")
	protected Max140Text track3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trck3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Track number 3 from magnetic stripe card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmTrack3
	 * PlainCardData13.mmTrack3}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData14, Optional<Max140Text>> mmTrack3 = new MMMessageAttribute<PlainCardData14, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "Trck3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track3";
			definition = "Track number 3 from magnetic stripe card.";
			previousVersion_lazy = () -> PlainCardData13.mmTrack3;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PlainCardData14 obj) {
			return obj.getTrack3();
		}

		@Override
		public void setValue(PlainCardData14 obj, Optional<Max140Text> value) {
			obj.setTrack3(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData14.mmPAN, com.tools20022.repository.msg.PlainCardData14.mmCardSequenceNumber,
						com.tools20022.repository.msg.PlainCardData14.mmEffectiveDate, com.tools20022.repository.msg.PlainCardData14.mmExpiryDate, com.tools20022.repository.msg.PlainCardData14.mmTrack1,
						com.tools20022.repository.msg.PlainCardData14.mmTrack2, com.tools20022.repository.msg.PlainCardData14.mmTrack3);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PlainCardData14";
				definition = "Sensible data associated with the payment card performing the transaction.";
				previousVersion_lazy = () -> PlainCardData13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Min8Max28NumericText> getPAN() {
		return pAN == null ? Optional.empty() : Optional.of(pAN);
	}

	public PlainCardData14 setPAN(Min8Max28NumericText pAN) {
		this.pAN = pAN;
		return this;
	}

	public Optional<Min2Max3NumericText> getCardSequenceNumber() {
		return cardSequenceNumber == null ? Optional.empty() : Optional.of(cardSequenceNumber);
	}

	public PlainCardData14 setCardSequenceNumber(Min2Max3NumericText cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
		return this;
	}

	public Optional<Max10Text> getEffectiveDate() {
		return effectiveDate == null ? Optional.empty() : Optional.of(effectiveDate);
	}

	public PlainCardData14 setEffectiveDate(Max10Text effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Optional<Max10Text> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public PlainCardData14 setExpiryDate(Max10Text expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<Max140Text> getTrack1() {
		return track1 == null ? Optional.empty() : Optional.of(track1);
	}

	public PlainCardData14 setTrack1(Max140Text track1) {
		this.track1 = track1;
		return this;
	}

	public Optional<Max140Text> getTrack2() {
		return track2 == null ? Optional.empty() : Optional.of(track2);
	}

	public PlainCardData14 setTrack2(Max140Text track2) {
		this.track2 = track2;
		return this;
	}

	public Optional<Max140Text> getTrack3() {
		return track3 == null ? Optional.empty() : Optional.of(track3);
	}

	public PlainCardData14 setTrack3(Max140Text track3) {
		this.track3 = track3;
		return this;
	}
}