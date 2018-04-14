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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max128Text;
import com.tools20022.repository.entity.TradingSession;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The details of a specific trading session.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingSession1#mmTradingSessionIdentification
 * TradingSession1.mmTradingSessionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingSession1#mmTradingSessionSubIdentification
 * TradingSession1.mmTradingSessionSubIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradingSession
 * TradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingSession1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The details of a specific trading session."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradingSession1", propOrder = {"tradingSessionIdentification", "tradingSessionSubIdentification"})
public class TradingSession1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradgSsnId")
	protected Max128Text tradingSessionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTradingSessionName
	 * TradingSession.mmTradingSessionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a specific execution time bracket code through its trading session name or description."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 336</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradingSession1, Optional<Max128Text>> mmTradingSessionIdentification = new MMMessageAttribute<TradingSession1, Optional<Max128Text>>() {
		{
			businessElementTrace_lazy = () -> TradingSession.mmTradingSessionName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradingSession1.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "336"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionIdentification";
			definition = "Identification of a specific execution time bracket code through its trading session name or description.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}

		@Override
		public Optional<Max128Text> getValue(TradingSession1 obj) {
			return obj.getTradingSessionIdentification();
		}

		@Override
		public void setValue(TradingSession1 obj, Optional<Max128Text> value) {
			obj.setTradingSessionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSsnSubId")
	protected Max128Text tradingSessionSubIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTradingSessionName
	 * TradingSession.mmTradingSessionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnSubId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionSubIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Optional market assigned sub identifier for a trading session. Usage is determined by market or counterparties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 625</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradingSession1, Optional<Max128Text>> mmTradingSessionSubIdentification = new MMMessageAttribute<TradingSession1, Optional<Max128Text>>() {
		{
			businessElementTrace_lazy = () -> TradingSession.mmTradingSessionName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradingSession1.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnSubId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "625"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionSubIdentification";
			definition = "Optional market assigned sub identifier for a trading session. Usage is determined by market or counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}

		@Override
		public Optional<Max128Text> getValue(TradingSession1 obj) {
			return obj.getTradingSessionSubIdentification();
		}

		@Override
		public void setValue(TradingSession1 obj, Optional<Max128Text> value) {
			obj.setTradingSessionSubIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradingSession1.mmTradingSessionIdentification, com.tools20022.repository.msg.TradingSession1.mmTradingSessionSubIdentification);
				trace_lazy = () -> TradingSession.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradingSession1";
				definition = "The details of a specific trading session.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max128Text> getTradingSessionIdentification() {
		return tradingSessionIdentification == null ? Optional.empty() : Optional.of(tradingSessionIdentification);
	}

	public TradingSession1 setTradingSessionIdentification(Max128Text tradingSessionIdentification) {
		this.tradingSessionIdentification = tradingSessionIdentification;
		return this;
	}

	public Optional<Max128Text> getTradingSessionSubIdentification() {
		return tradingSessionSubIdentification == null ? Optional.empty() : Optional.of(tradingSessionSubIdentification);
	}

	public TradingSession1 setTradingSessionSubIdentification(Max128Text tradingSessionSubIdentification) {
		this.tradingSessionSubIdentification = tradingSessionSubIdentification;
		return this;
	}
}