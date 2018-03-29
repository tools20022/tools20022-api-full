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
import com.tools20022.repository.codeset.CardDataReading5Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Sensitive data associated with a payment card.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#mmPAN
 * PlainCardData17.mmPAN}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#mmTrack1
 * PlainCardData17.mmTrack1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#mmTrack2
 * PlainCardData17.mmTrack2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#mmTrack3
 * PlainCardData17.mmTrack3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData17#mmAdditionalCardData
 * PlainCardData17.mmAdditionalCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#mmEntryMode
 * PlainCardData17.mmEntryMode}</li>
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
 * "PlainCardData17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Sensitive data associated with a payment card."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PlainCardData16
 * PlainCardData16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PlainCardData17", propOrder = {"pAN", "track1", "track2", "track3", "additionalCardData", "entryMode"})
public class PlainCardData17 {

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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData17
	 * PlainCardData17}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#mmPAN
	 * PlainCardData16.mmPAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData17, Optional<Min8Max28NumericText>> mmPAN = new MMMessageAttribute<PlainCardData17, Optional<Min8Max28NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData17.mmObject();
			isDerived = false;
			xmlTag = "PAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PAN";
			definition = "Primary Account Number (PAN) of the card.";
			previousVersion_lazy = () -> PlainCardData16.mmPAN;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}

		@Override
		public Optional<Min8Max28NumericText> getValue(PlainCardData17 obj) {
			return obj.getPAN();
		}

		@Override
		public void setValue(PlainCardData17 obj, Optional<Min8Max28NumericText> value) {
			obj.setPAN(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData17
	 * PlainCardData17}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#mmTrack1
	 * PlainCardData16.mmTrack1}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData17, Optional<Max76Text>> mmTrack1 = new MMMessageAttribute<PlainCardData17, Optional<Max76Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData17.mmObject();
			isDerived = false;
			xmlTag = "Trck1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track1";
			definition = "ISO track 1 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The format is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			previousVersion_lazy = () -> PlainCardData16.mmTrack1;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max76Text.mmObject();
		}

		@Override
		public Optional<Max76Text> getValue(PlainCardData17 obj) {
			return obj.getTrack1();
		}

		@Override
		public void setValue(PlainCardData17 obj, Optional<Max76Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData17
	 * PlainCardData17}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#mmTrack2
	 * PlainCardData16.mmTrack2}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData17, Optional<Max37Text>> mmTrack2 = new MMMessageAttribute<PlainCardData17, Optional<Max37Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData17.mmObject();
			isDerived = false;
			xmlTag = "Trck2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track2";
			definition = "ISO track 2 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 7813, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			previousVersion_lazy = () -> PlainCardData16.mmTrack2;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max37Text.mmObject();
		}

		@Override
		public Optional<Max37Text> getValue(PlainCardData17 obj) {
			return obj.getTrack2();
		}

		@Override
		public void setValue(PlainCardData17 obj, Optional<Max37Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData17
	 * PlainCardData17}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#mmTrack3
	 * PlainCardData16.mmTrack3}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData17, Optional<Max104Text>> mmTrack3 = new MMMessageAttribute<PlainCardData17, Optional<Max104Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData17.mmObject();
			isDerived = false;
			xmlTag = "Trck3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Track3";
			definition = "ISO track 3 issued from the magnetic stripe card or from the ICC if the magnetic stripe was not read. The content is conform to ISO 4909, removing beginning and ending sentinels and longitudinal redundancy check characters.";
			previousVersion_lazy = () -> PlainCardData16.mmTrack3;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max104Text.mmObject();
		}

		@Override
		public Optional<Max104Text> getValue(PlainCardData17 obj) {
			return obj.getTrack3();
		}

		@Override
		public void setValue(PlainCardData17 obj, Optional<Max104Text> value) {
			obj.setTrack3(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCardData")
	protected List<Max35Text> additionalCardData;
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData17
	 * PlainCardData17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData17, List<Max35Text>> mmAdditionalCardData = new MMMessageAttribute<PlainCardData17, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData17.mmObject();
			isDerived = false;
			xmlTag = "AddtlCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCardData";
			definition = "Additional card issuer specific data.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PlainCardData17 obj) {
			return obj.getAdditionalCardData();
		}

		@Override
		public void setValue(PlainCardData17 obj, List<Max35Text> value) {
			obj.setAdditionalCardData(value);
		}
	};
	@XmlElement(name = "NtryMd")
	protected CardDataReading5Code entryMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData17
	 * PlainCardData17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry mode of the card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlainCardData17, Optional<CardDataReading5Code>> mmEntryMode = new MMMessageAttribute<PlainCardData17, Optional<CardDataReading5Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PlainCardData17.mmObject();
			isDerived = false;
			xmlTag = "NtryMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryMode";
			definition = "Entry mode of the card.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading5Code.mmObject();
		}

		@Override
		public Optional<CardDataReading5Code> getValue(PlainCardData17 obj) {
			return obj.getEntryMode();
		}

		@Override
		public void setValue(PlainCardData17 obj, Optional<CardDataReading5Code> value) {
			obj.setEntryMode(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData17.mmPAN, com.tools20022.repository.msg.PlainCardData17.mmTrack1, com.tools20022.repository.msg.PlainCardData17.mmTrack2,
						com.tools20022.repository.msg.PlainCardData17.mmTrack3, com.tools20022.repository.msg.PlainCardData17.mmAdditionalCardData, com.tools20022.repository.msg.PlainCardData17.mmEntryMode);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PlainCardData17";
				definition = "Sensitive data associated with a payment card.";
				previousVersion_lazy = () -> PlainCardData16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Min8Max28NumericText> getPAN() {
		return pAN == null ? Optional.empty() : Optional.of(pAN);
	}

	public PlainCardData17 setPAN(Min8Max28NumericText pAN) {
		this.pAN = pAN;
		return this;
	}

	public Optional<Max76Text> getTrack1() {
		return track1 == null ? Optional.empty() : Optional.of(track1);
	}

	public PlainCardData17 setTrack1(Max76Text track1) {
		this.track1 = track1;
		return this;
	}

	public Optional<Max37Text> getTrack2() {
		return track2 == null ? Optional.empty() : Optional.of(track2);
	}

	public PlainCardData17 setTrack2(Max37Text track2) {
		this.track2 = track2;
		return this;
	}

	public Optional<Max104Text> getTrack3() {
		return track3 == null ? Optional.empty() : Optional.of(track3);
	}

	public PlainCardData17 setTrack3(Max104Text track3) {
		this.track3 = track3;
		return this;
	}

	public List<Max35Text> getAdditionalCardData() {
		return additionalCardData == null ? additionalCardData = new ArrayList<>() : additionalCardData;
	}

	public PlainCardData17 setAdditionalCardData(List<Max35Text> additionalCardData) {
		this.additionalCardData = Objects.requireNonNull(additionalCardData);
		return this;
	}

	public Optional<CardDataReading5Code> getEntryMode() {
		return entryMode == null ? Optional.empty() : Optional.of(entryMode);
	}

	public PlainCardData17 setEntryMode(CardDataReading5Code entryMode) {
		this.entryMode = entryMode;
		return this;
	}
}