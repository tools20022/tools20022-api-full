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
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
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
 * Specifies the securities order transmission attributes.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#mmTransmissionIndicator
 * SecuritiesTransactionTransmission2.mmTransmissionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#mmTransmittingBuyer
 * SecuritiesTransactionTransmission2.mmTransmittingBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#mmTransmittingSeller
 * SecuritiesTransactionTransmission2.mmTransmittingSeller}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
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
 * "SecuritiesTransactionTransmission2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the securities order transmission attributes.\r\n"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionTransmission2", propOrder = {"transmissionIndicator", "transmittingBuyer", "transmittingSeller"})
public class SecuritiesTransactionTransmission2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrnsmssnInd", required = true)
	protected TrueFalseIndicator transmissionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2
	 * SecuritiesTransactionTransmission2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsmssnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransmissionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether the transaction results from an order transmitted by the reporting of a client to a third party.\r\n\r\nUsage: Only applicable when the conditions for transmission are not satisfied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTransactionTransmission2, TrueFalseIndicator> mmTransmissionIndicator = new MMMessageAttribute<SecuritiesTransactionTransmission2, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionTransmission2.mmObject();
			isDerived = false;
			xmlTag = "TrnsmssnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransmissionIndicator";
			definition = "Indication as to whether the transaction results from an order transmitted by the reporting of a client to a third party.\r\n\r\nUsage: Only applicable when the conditions for transmission are not satisfied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(SecuritiesTransactionTransmission2 obj) {
			return obj.getTransmissionIndicator();
		}

		@Override
		public void setValue(SecuritiesTransactionTransmission2 obj, TrueFalseIndicator value) {
			obj.setTransmissionIndicator(value);
		}
	};
	@XmlElement(name = "TrnsmttgBuyr")
	protected LEIIdentifier transmittingBuyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2
	 * SecuritiesTransactionTransmission2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsmttgBuyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransmittingBuyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the buyer transmitting the order to the reporting firm. \r\n\r\nUsage: Only required for reporting firms reporting transactions on behalf of order transmitting firm."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTransactionTransmission2, Optional<LEIIdentifier>> mmTransmittingBuyer = new MMMessageAttribute<SecuritiesTransactionTransmission2, Optional<LEIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionTransmission2.mmObject();
			isDerived = false;
			xmlTag = "TrnsmttgBuyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransmittingBuyer";
			definition = "Identifies the buyer transmitting the order to the reporting firm. \r\n\r\nUsage: Only required for reporting firms reporting transactions on behalf of order transmitting firm.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(SecuritiesTransactionTransmission2 obj) {
			return obj.getTransmittingBuyer();
		}

		@Override
		public void setValue(SecuritiesTransactionTransmission2 obj, Optional<LEIIdentifier> value) {
			obj.setTransmittingBuyer(value.orElse(null));
		}
	};
	@XmlElement(name = "TrnsmttgSellr")
	protected LEIIdentifier transmittingSeller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2
	 * SecuritiesTransactionTransmission2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsmttgSellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransmittingSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the seller transmitting the order to the reporting firm. \r\n\r\nUsage: Only required for reporting firms reporting transactions on behalf of order transmitting firm."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTransactionTransmission2, Optional<LEIIdentifier>> mmTransmittingSeller = new MMMessageAttribute<SecuritiesTransactionTransmission2, Optional<LEIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionTransmission2.mmObject();
			isDerived = false;
			xmlTag = "TrnsmttgSellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransmittingSeller";
			definition = "Identifies the seller transmitting the order to the reporting firm. \r\n\r\nUsage: Only required for reporting firms reporting transactions on behalf of order transmitting firm.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(SecuritiesTransactionTransmission2 obj) {
			return obj.getTransmittingSeller();
		}

		@Override
		public void setValue(SecuritiesTransactionTransmission2 obj, Optional<LEIIdentifier> value) {
			obj.setTransmittingSeller(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTransactionTransmission2.mmTransmissionIndicator, com.tools20022.repository.msg.SecuritiesTransactionTransmission2.mmTransmittingBuyer,
						com.tools20022.repository.msg.SecuritiesTransactionTransmission2.mmTransmittingSeller);
				trace_lazy = () -> OrganisationIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionTransmission2";
				definition = "Specifies the securities order transmission attributes.\r\n";
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getTransmissionIndicator() {
		return transmissionIndicator;
	}

	public SecuritiesTransactionTransmission2 setTransmissionIndicator(TrueFalseIndicator transmissionIndicator) {
		this.transmissionIndicator = Objects.requireNonNull(transmissionIndicator);
		return this;
	}

	public Optional<LEIIdentifier> getTransmittingBuyer() {
		return transmittingBuyer == null ? Optional.empty() : Optional.of(transmittingBuyer);
	}

	public SecuritiesTransactionTransmission2 setTransmittingBuyer(LEIIdentifier transmittingBuyer) {
		this.transmittingBuyer = transmittingBuyer;
		return this;
	}

	public Optional<LEIIdentifier> getTransmittingSeller() {
		return transmittingSeller == null ? Optional.empty() : Optional.of(transmittingSeller);
	}

	public SecuritiesTransactionTransmission2 setTransmittingSeller(LEIIdentifier transmittingSeller) {
		this.transmittingSeller = transmittingSeller;
		return this;
	}
}