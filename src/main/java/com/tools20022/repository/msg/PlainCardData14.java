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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PlainCardData14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sensible data associated with the payment card performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PlainCardData13
 * PlainCardData13}</li>
 * </ul>
 */
public class PlainCardData14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Min8Max28NumericText pAN;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmNumber
	 * PaymentCard.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmPAN
	 * PlainCardData13.mmPAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPAN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmNumber;
			componentContext_lazy = () -> PlainCardData14.mmObject();
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
	};
	protected Min2Max3NumericText cardSequenceNumber;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSequenceNumber
	 * PaymentCard.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmCardSequenceNumber
	 * PlainCardData13.mmCardSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardSequenceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmSequenceNumber;
			componentContext_lazy = () -> PlainCardData14.mmObject();
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
	};
	protected Max10Text effectiveDate;
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmEffectiveDate
	 * PlainCardData13.mmEffectiveDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveDate = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> PlainCardData14.mmObject();
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
	};
	protected Max10Text expiryDate;
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmExpiryDate
	 * PlainCardData13.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> PlainCardData14.mmObject();
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
	};
	protected Max140Text track1;
	/**
	 * Track number 1 from magnetic stripe card.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Track number 1 from magnetic stripe card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmTrack1
	 * PlainCardData13.mmTrack1}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrack1 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData14.mmObject();
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
	};
	protected Max140Text track2;
	/**
	 * Track number 2 without control characters (start /end and LRC).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Track number 2 without control characters (start /end and LRC)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrack2 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData14.mmObject();
			isDerived = false;
			xmlTag = "Trck2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track2";
			definition = "Track number 2 without control characters (start /end and LRC).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text track3;
	/**
	 * Track number 3 from magnetic stripe card.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Track3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Track number 3 from magnetic stripe card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmTrack3
	 * PlainCardData13.mmTrack3}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrack3 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlainCardData14.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PlainCardData14.mmPAN, PlainCardData14.mmCardSequenceNumber, PlainCardData14.mmEffectiveDate, PlainCardData14.mmExpiryDate, PlainCardData14.mmTrack1, PlainCardData14.mmTrack2,
						PlainCardData14.mmTrack3);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PlainCardData14";
				definition = "Sensible data associated with the payment card performing the transaction.";
				previousVersion_lazy = () -> PlainCardData13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Min8Max28NumericText getPAN() {
		return pAN;
	}

	public void setPAN(Min8Max28NumericText pAN) {
		this.pAN = pAN;
	}

	public Min2Max3NumericText getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(Min2Max3NumericText cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public Max10Text getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Max10Text effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Max10Text getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Max10Text expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Max140Text getTrack1() {
		return track1;
	}

	public void setTrack1(Max140Text track1) {
		this.track1 = track1;
	}

	public Max140Text getTrack2() {
		return track2;
	}

	public void setTrack2(Max140Text track2) {
		this.track2 = track2;
	}

	public Max140Text getTrack3() {
		return track3;
	}

	public void setTrack3(Max140Text track3) {
		this.track3 = track3;
	}
}