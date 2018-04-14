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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyConversion14;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion15#mmAcceptedByCardholder
 * CurrencyConversion15.mmAcceptedByCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion15#mmConversion
 * CurrencyConversion15.mmConversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyConversion15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion13
 * CurrencyConversion13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyConversion15", propOrder = {"acceptedByCardholder", "conversion"})
public class CurrencyConversion15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AccptdByCrdhldr")
	protected TrueFalseIndicator acceptedByCardholder;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion15
	 * CurrencyConversion15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdByCrdhldr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedByCardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the cardholder has accepted the currency conversion that the acquirer has proposed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion13#mmAcceptedByCardholder
	 * CurrencyConversion13.mmAcceptedByCardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion15, Optional<TrueFalseIndicator>> mmAcceptedByCardholder = new MMMessageAttribute<CurrencyConversion15, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion15.mmObject();
			isDerived = false;
			xmlTag = "AccptdByCrdhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedByCardholder";
			definition = "True if the cardholder has accepted the currency conversion that the acquirer has proposed.";
			previousVersion_lazy = () -> CurrencyConversion13.mmAcceptedByCardholder;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CurrencyConversion15 obj) {
			return obj.getAcceptedByCardholder();
		}

		@Override
		public void setValue(CurrencyConversion15 obj, Optional<TrueFalseIndicator> value) {
			obj.setAcceptedByCardholder(value.orElse(null));
		}
	};
	@XmlElement(name = "Convs")
	protected CurrencyConversion14 conversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion15
	 * CurrencyConversion15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Convs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conversion between the currency of a card acceptor and the currency of a cardholder, provided by a dedicated service provider."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion13#mmConversion
	 * CurrencyConversion13.mmConversion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion15, Optional<CurrencyConversion14>> mmConversion = new MMMessageAssociationEnd<CurrencyConversion15, Optional<CurrencyConversion14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion15.mmObject();
			isDerived = false;
			xmlTag = "Convs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			definition = "Conversion between the currency of a card acceptor and the currency of a cardholder, provided by a dedicated service provider.";
			previousVersion_lazy = () -> CurrencyConversion13.mmConversion;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyConversion14.mmObject();
		}

		@Override
		public Optional<CurrencyConversion14> getValue(CurrencyConversion15 obj) {
			return obj.getConversion();
		}

		@Override
		public void setValue(CurrencyConversion15 obj, Optional<CurrencyConversion14> value) {
			obj.setConversion(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion15.mmAcceptedByCardholder, com.tools20022.repository.msg.CurrencyConversion15.mmConversion);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion15";
				definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.";
				previousVersion_lazy = () -> CurrencyConversion13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getAcceptedByCardholder() {
		return acceptedByCardholder == null ? Optional.empty() : Optional.of(acceptedByCardholder);
	}

	public CurrencyConversion15 setAcceptedByCardholder(TrueFalseIndicator acceptedByCardholder) {
		this.acceptedByCardholder = acceptedByCardholder;
		return this;
	}

	public Optional<CurrencyConversion14> getConversion() {
		return conversion == null ? Optional.empty() : Optional.of(conversion);
	}

	public CurrencyConversion15 setConversion(CurrencyConversion14 conversion) {
		this.conversion = conversion;
		return this;
	}
}